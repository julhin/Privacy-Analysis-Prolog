/**
 */
package edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.provider;

import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.util.OperationsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationsItemProviderAdapterFactory extends OperationsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationCatalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCatalogueItemProvider operationCatalogueItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.OperationCatalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationCatalogueAdapter() {
		if (operationCatalogueItemProvider == null) {
			operationCatalogueItemProvider = new OperationCatalogueItemProvider(this);
		}

		return operationCatalogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicChangingOperationItemProvider enumCharacteristicChangingOperationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicChangingOperationAdapter() {
		if (enumCharacteristicChangingOperationItemProvider == null) {
			enumCharacteristicChangingOperationItemProvider = new EnumCharacteristicChangingOperationItemProvider(this);
		}

		return enumCharacteristicChangingOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransformingOperationItemProvider dataTransformingOperationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTransformingOperationAdapter() {
		if (dataTransformingOperationItemProvider == null) {
			dataTransformingOperationItemProvider = new DataTransformingOperationItemProvider(this);
		}

		return dataTransformingOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedDataTransformingOperationItemProvider parameterizedDataTransformingOperationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterizedDataTransformingOperationAdapter() {
		if (parameterizedDataTransformingOperationItemProvider == null) {
			parameterizedDataTransformingOperationItemProvider = new ParameterizedDataTransformingOperationItemProvider(
					this);
		}

		return parameterizedDataTransformingOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperationExecution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicChangingOperationExecutionItemProvider enumCharacteristicChangingOperationExecutionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.EnumCharacteristicChangingOperationExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicChangingOperationExecutionAdapter() {
		if (enumCharacteristicChangingOperationExecutionItemProvider == null) {
			enumCharacteristicChangingOperationExecutionItemProvider = new EnumCharacteristicChangingOperationExecutionItemProvider(
					this);
		}

		return enumCharacteristicChangingOperationExecutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperationExecution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransformingOperationExecutionItemProvider dataTransformingOperationExecutionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.DataTransformingOperationExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTransformingOperationExecutionAdapter() {
		if (dataTransformingOperationExecutionItemProvider == null) {
			dataTransformingOperationExecutionItemProvider = new DataTransformingOperationExecutionItemProvider(this);
		}

		return dataTransformingOperationExecutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperationExecution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedDataTransformingOperationExecutionItemProvider parameterizedDataTransformingOperationExecutionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.operations.ParameterizedDataTransformingOperationExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterizedDataTransformingOperationExecutionAdapter() {
		if (parameterizedDataTransformingOperationExecutionItemProvider == null) {
			parameterizedDataTransformingOperationExecutionItemProvider = new ParameterizedDataTransformingOperationExecutionItemProvider(
					this);
		}

		return parameterizedDataTransformingOperationExecutionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (operationCatalogueItemProvider != null)
			operationCatalogueItemProvider.dispose();
		if (enumCharacteristicChangingOperationItemProvider != null)
			enumCharacteristicChangingOperationItemProvider.dispose();
		if (dataTransformingOperationItemProvider != null)
			dataTransformingOperationItemProvider.dispose();
		if (parameterizedDataTransformingOperationItemProvider != null)
			parameterizedDataTransformingOperationItemProvider.dispose();
		if (enumCharacteristicChangingOperationExecutionItemProvider != null)
			enumCharacteristicChangingOperationExecutionItemProvider.dispose();
		if (dataTransformingOperationExecutionItemProvider != null)
			dataTransformingOperationExecutionItemProvider.dispose();
		if (parameterizedDataTransformingOperationExecutionItemProvider != null)
			parameterizedDataTransformingOperationExecutionItemProvider.dispose();
	}

}
