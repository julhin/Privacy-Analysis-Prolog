/**
 */
package edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.provider;

import edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.util.CharacteristicsAdapterFactory;

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
public class CharacteristicsItemProviderAdapterFactory extends CharacteristicsAdapterFactory
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
	public CharacteristicsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicsHavingElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicsHavingElementItemProvider characteristicsHavingElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicsHavingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicsHavingElementAdapter() {
		if (characteristicsHavingElementItemProvider == null) {
			characteristicsHavingElementItemProvider = new CharacteristicsHavingElementItemProvider(this);
		}

		return characteristicsHavingElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicCatalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicCatalogueItemProvider characteristicCatalogueItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.CharacteristicCatalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicCatalogueAdapter() {
		if (characteristicCatalogueItemProvider == null) {
			characteristicCatalogueItemProvider = new CharacteristicCatalogueItemProvider(this);
		}

		return characteristicCatalogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumCharacteristic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicItemProvider enumCharacteristicItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicAdapter() {
		if (enumCharacteristicItemProvider == null) {
			enumCharacteristicItemProvider = new EnumCharacteristicItemProvider(this);
		}

		return enumCharacteristicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumLiterals} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralsItemProvider enumLiteralsItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumLiterals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumLiteralsAdapter() {
		if (enumLiteralsItemProvider == null) {
			enumLiteralsItemProvider = new EnumLiteralsItemProvider(this);
		}

		return enumLiteralsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumCharacteristicValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicValueItemProvider enumCharacteristicValueItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.dataflow.privacy.analysis.metamodel.characteristics.EnumCharacteristicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicValueAdapter() {
		if (enumCharacteristicValueItemProvider == null) {
			enumCharacteristicValueItemProvider = new EnumCharacteristicValueItemProvider(this);
		}

		return enumCharacteristicValueItemProvider;
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
		if (characteristicsHavingElementItemProvider != null)
			characteristicsHavingElementItemProvider.dispose();
		if (characteristicCatalogueItemProvider != null)
			characteristicCatalogueItemProvider.dispose();
		if (enumCharacteristicItemProvider != null)
			enumCharacteristicItemProvider.dispose();
		if (enumLiteralsItemProvider != null)
			enumLiteralsItemProvider.dispose();
		if (enumCharacteristicValueItemProvider != null)
			enumCharacteristicValueItemProvider.dispose();
	}

}
