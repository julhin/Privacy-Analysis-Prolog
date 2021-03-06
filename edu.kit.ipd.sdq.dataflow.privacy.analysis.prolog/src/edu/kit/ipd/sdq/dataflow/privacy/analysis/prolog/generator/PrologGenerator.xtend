package edu.kit.ipd.sdq.dataflow.privacy.analysis.prolog.generator

import com.google.inject.Inject
import edu.kit.ipd.sdq.commons.util.java.lang.StringUtil
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.IdHavingElement
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.Characteristic
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicValue
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicsHavingElement
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumCharacteristicValue
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.Data
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.DataFlowDiagram
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.Flow
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.FlowNode
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.FlowStart
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.NodeContainer
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperation
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperationExecution
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperation
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperationExecution
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.Operation
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationExecution
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperation
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperationExecution
import edu.kit.ipd.sdq.dataflow.privacy.analysis.prolog.generator.contributors.IPrologGeneratorContributor
import java.util.Iterator
import java.util.List
import java.util.Map
import java.util.function.Function
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

class PrologGenerator implements IEcore2TxtGenerator {

	@Inject
	var IPrologGeneratorContributorRegistry contributorRegistry;

	override generateContentsFromResource(Resource inputResource) '''
		�FOR diagram : inputResource.contents.filter(DataFlowDiagram)�
			�diagram.generate�
		�ENDFOR�
	'''

	protected def generate(DataFlowDiagram diag) '''
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	%                  Facts                 %
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	% Data definitions
	�FOR data : diag.data�
		�data.generate�
	�ENDFOR�
	
	% Flow starts
	�FOR flowStart : diag.nodecontainer.map[nodes].flatten.filter(FlowStart)�
		�flowStart.generate�
	�ENDFOR�
	
	% Flow nodes
	�FOR flowNode : diag.nodecontainer.map[nodes].flatten.filter(FlowNode)�
		�flowNode.generate�
	�ENDFOR�
	
	% Node containers
	�FOR nodeContainer : diag.nodecontainer�
		�nodeContainer.generate�
	�ENDFOR�
	
	% Flows
	�FOR flow : diag.flow�
		�flow.generate�
	�ENDFOR�
	
	% Characteristic values
	
	�diag.calculateCharacteristicValues.generateCharacteristicValues�
	
	% Node operations
	
	�diag.calculateNodeOperations.generateNodeOperations�
	
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	%            Contributed Facts           %
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	�FOR contributor : contributorRegistry.contributors�
		% �contributor.identifier�
		�contributor.getContributorFacts(diag)�
		
	�ENDFOR�
	
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	%                  Rules                 %
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	predecessor(S, T) :-
	  flow(_, S, T, _).
	
	transitivePredecessor(S, T) :-
	  flow(_, X, T, _),
	  predecessor(S, X).
	
	
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	%            Contributed Rules           %
	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	�FOR contributor : contributorRegistry.contributors�
		% �contributor.identifier�
		�contributor.getContributorRules(diag)�
		
	�ENDFOR�
		'''
		
	protected def generate(Data data) '''
		data(�data.id�, '�data.name�').
	'''

	protected def generate(FlowStart flowStart) '''
		flowStart(�flowStart.id�, '�flowStart.name�').
	'''
	
	protected def generate(FlowNode flowNode) '''
		flowNode(�flowNode.id�, '�flowNode.name�').
	'''
	
	protected def generate(NodeContainer nodeContainer) '''
		flowNodeContainer(�nodeContainer.id�, [�nodeContainer.nodes.map[id].csv�]).
	'''
	
	protected def generate(Flow flow) '''
		flow(�flow.id�, �flow.startNode.id�, �flow.endNode.id�, [�flow.data.map[id].csv�]).
	'''
	
	protected def generateCharacteristicValues(Map<Characteristic, List<CharacteristicValue<Characteristic>>> characteristicValues) '''
		�FOR characteristic : characteristicValues.keySet�
			%% �characteristic.name� (�characteristic.id�)
			�IF characteristicValues.get(characteristic).isEmpty�
				�characteristic.generateCharacteristicDummy�
			�ENDIF�
			�FOR value : characteristicValues.get(characteristic)�
				�value.generate�
			�ENDFOR�
			
		�ENDFOR�
	'''
	
	protected def generateCharacteristicDummy(Characteristic characteristic)  '''
		�characteristic.name.toFirstLower�(_, _) :-
		  fail.
	'''
	
	protected def generate(CharacteristicValue<Characteristic> value) {
		if (value.eContainer instanceof IdHavingElement) {
			return value.generateCharacteristicValue(value.eContainer as IdHavingElement)
		}
		throw new IllegalStateException("The value " + value + " does not have a parent that has a ID.")
	}
	
	protected def generateCharacteristicValue(CharacteristicValue<Characteristic> value, IdHavingElement parent) '''
		�value.characteristic.name.toFirstLower�(�parent.id�, �value.generateValues�).
	'''
	
	protected def dispatch generateValues(EnumCharacteristicValue value) '''
		[�value.enumliterals.map[id].csv�]'''
	
	protected def dispatch generateValues(CharacteristicValue<?> value) {
		throw new IllegalStateException("There is no handling for the characteristic value " + value + " .")
	}
	
	protected def generateNodeOperations(Map<Operation, List<OperationExecution<Operation>>> executions) '''
		�FOR operation : executions.keySet�
			%% �operation.operationName� (�operation.id�)
			�IF executions.get(operation).empty�
				�operation.generateOperationDummy�
			�ENDIF�
			�FOR execution : executions.get(operation)�
				�execution.generate�
			�ENDFOR�
			
		�ENDFOR�
	'''
	
	protected def dispatch generateOperationDummy(DataTransformingOperation operation) '''
		�operation.operationName�(_, _, _) :-
		  fail.
	'''
	
	protected def dispatch generateOperationDummy(EnumCharacteristicChangingOperation operation) '''
		�operation.operationName�(_, _, _) :-
		  fail.
	'''
	
	protected def dispatch generateOperationDummy(ParameterizedDataTransformingOperation operation) '''
		�operation.operationName�(_, _, _, _) :-
		  fail.
	'''
	
	protected def generate(OperationExecution<Operation> execution) {
		if (execution.eContainer instanceof IdHavingElement) {
			return execution.generateOperationExecution(execution.eContainer as IdHavingElement)
		}
		throw new IllegalStateException("The execution " + execution + " does not have a parent that has a ID.")
	}
	
	protected def dispatch generateOperationExecution(EnumCharacteristicChangingOperationExecution execution, IdHavingElement parent) '''
		�execution.operation.operationName�(�parent.id�, �execution.data.id�, [�execution.enumcharacteristicvalue.enumliterals.map[id].csv�]).
	'''
	
	protected def dispatch generateOperationExecution(DataTransformingOperationExecution<DataTransformingOperation> execution, IdHavingElement parent) '''
		�execution.operation.operationName�(�parent.id�, �execution.input.id�, �execution.output.id�).
	'''
	
	protected def dispatch generateOperationExecution(ParameterizedDataTransformingOperationExecution<ParameterizedDataTransformingOperation> execution, IdHavingElement parent) '''
		�execution.operation.operationName�(�parent.id�, �execution.input.id�, �execution.parameter.id�, �execution.output.id�).
	'''
	
	protected def dispatch generateOperationExecution(OperationExecution<?> execution, IdHavingElement parent) {
		throw new IllegalStateException("There is no handling for the operation execution " + execution + " .")
	}
	
	protected def calculateCharacteristicValues(DataFlowDiagram diag) {
		val characteristics = diag.getAllContentsInResourceSet([ c | c.characteristicModels], Characteristic)
		val appliedCharacteristics = diag.eAllContents.filter(CharacteristicsHavingElement).toList.map[characteristic].flatten.groupBy[characteristic]
		characteristics.forEach[c | appliedCharacteristics.putIfAbsent(c, #[])]
		return appliedCharacteristics
	}
	
	protected def calculateNodeOperations(DataFlowDiagram diag) {
		val operations = diag.getAllContentsInResourceSet([ c | c.operationModels], Operation)
		val nodeOperations = diag.nodecontainer.map[nodes].flatten.filter(FlowNode).map[operationExecution].filter[o | o !== null].groupBy[operation]
		operations.forEach[op | nodeOperations.putIfAbsent(op, #[])]
		return nodeOperations
	}

	protected def <T extends EObject> getAllContentsInResourceSet(DataFlowDiagram diag, Function<IPrologGeneratorContributor, Iterable<URI>> uriSupplier, Class<T> type) {
		contributorRegistry.contributors.map(c | uriSupplier.apply(c)).flatten.forEach[u | diag.eResource.resourceSet.getResource(u, true)]
		return diag.eResource.resourceSet.resources.map[contents].flatten.map[eAllContents.filter(type)].map[toIterable].flatten
	}
	
	protected static def csv(Iterable<?> elements) {
		elements.join(", ")
	}
	
	protected static def getContributorFacts(IPrologGeneratorContributor contributor, DataFlowDiagram diag) {
		val text = contributor.getFacts(diag);
		if (StringUtil.isEmpty(text)) {
			return "% no facts contributed"
		}
		return text
	}
	
	protected static def getContributorRules(IPrologGeneratorContributor contributor, DataFlowDiagram diag) {
		val text = contributor.getRules(diag);
		if (StringUtil.isEmpty(text)) {
			return "% no rules contributed"
		}
		return text
	}
	
	protected static def getOperationName(Operation operation) {
		"op" + operation.name.toFirstUpper.replace(" ", "")
	}
	
	protected static def <T> Iterable<T> toIterable(Iterator<T> iterator) {
		[iterator]
	}

}
