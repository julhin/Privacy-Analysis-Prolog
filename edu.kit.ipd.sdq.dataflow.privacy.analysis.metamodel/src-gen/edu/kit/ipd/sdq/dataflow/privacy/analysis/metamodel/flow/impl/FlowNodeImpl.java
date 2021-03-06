/**
 */
package edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.impl;

import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.FlowNode;
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.FlowPackage;

import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.Operation;
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationExecutingElement;
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationExecution;
import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.flow.impl.FlowNodeImpl#getOperationExecution <em>Operation Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowNodeImpl extends NodeImpl implements FlowNode {
	/**
	 * The cached value of the '{@link #getOperationExecution() <em>Operation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationExecution()
	 * @generated
	 * @ordered
	 */
	protected OperationExecution<Operation> operationExecution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationExecution<Operation> getOperationExecution() {
		return operationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationExecution(OperationExecution<Operation> newOperationExecution,
			NotificationChain msgs) {
		OperationExecution<Operation> oldOperationExecution = operationExecution;
		operationExecution = newOperationExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FlowPackage.FLOW_NODE__OPERATION_EXECUTION, oldOperationExecution, newOperationExecution);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationExecution(OperationExecution<Operation> newOperationExecution) {
		if (newOperationExecution != operationExecution) {
			NotificationChain msgs = null;
			if (operationExecution != null)
				msgs = ((InternalEObject) operationExecution).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FlowPackage.FLOW_NODE__OPERATION_EXECUTION, null, msgs);
			if (newOperationExecution != null)
				msgs = ((InternalEObject) newOperationExecution).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FlowPackage.FLOW_NODE__OPERATION_EXECUTION, null, msgs);
			msgs = basicSetOperationExecution(newOperationExecution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FLOW_NODE__OPERATION_EXECUTION,
					newOperationExecution, newOperationExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
			return basicSetOperationExecution(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
			return getOperationExecution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
			setOperationExecution((OperationExecution<Operation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
			setOperationExecution((OperationExecution<Operation>) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
			return operationExecution != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationExecutingElement.class) {
			switch (derivedFeatureID) {
			case FlowPackage.FLOW_NODE__OPERATION_EXECUTION:
				return OperationsPackage.OPERATION_EXECUTING_ELEMENT__OPERATION_EXECUTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationExecutingElement.class) {
			switch (baseFeatureID) {
			case OperationsPackage.OPERATION_EXECUTING_ELEMENT__OPERATION_EXECUTION:
				return FlowPackage.FLOW_NODE__OPERATION_EXECUTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FlowNodeImpl
