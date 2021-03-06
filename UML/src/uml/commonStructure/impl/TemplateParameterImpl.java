/**
 */
package uml.commonStructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterImpl extends ElementImpl implements TemplateParameter {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement default_;

	/**
	 * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedDefault;

	/**
	 * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement parameteredElement;

	/**
	 * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedParameteredElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonStructurePackage.Literals.TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (ParameterableElement)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(ParameterableElement newDefault) {
		ParameterableElement oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedDefault() {
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(ParameterableElement newOwnedDefault, NotificationChain msgs) {
		ParameterableElement oldOwnedDefault = ownedDefault;
		ownedDefault = newOwnedDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, oldOwnedDefault, newOwnedDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefault(ParameterableElement newOwnedDefault) {
		if (newOwnedDefault != ownedDefault) {
			NotificationChain msgs = null;
			if (ownedDefault != null)
				msgs = ((InternalEObject)ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject)newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getParameteredElement() {
		if (parameteredElement != null && parameteredElement.eIsProxy()) {
			InternalEObject oldParameteredElement = (InternalEObject)parameteredElement;
			parameteredElement = (ParameterableElement)eResolveProxy(oldParameteredElement);
			if (parameteredElement != oldParameteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, parameteredElement));
			}
		}
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement basicGetParameteredElement() {
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameteredElement(ParameterableElement newParameteredElement, NotificationChain msgs) {
		ParameterableElement oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, newParameteredElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement(ParameterableElement newParameteredElement) {
		if (newParameteredElement != parameteredElement) {
			NotificationChain msgs = null;
			if (parameteredElement != null)
				msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			if (newParameteredElement != null)
				msgs = ((InternalEObject)newParameteredElement).eInverseAdd(this, CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			msgs = basicSetParameteredElement(newParameteredElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		if (eContainerFeatureID() != CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE) return null;
		return (TemplateSignature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSignature, CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		if (newSignature != eInternalContainer() || (eContainerFeatureID() != CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null)) {
			if (EcoreUtil.isAncestor(this, newSignature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedParameteredElement() {
		return ownedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedParameteredElement(ParameterableElement newOwnedParameteredElement, NotificationChain msgs) {
		ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
		ownedParameteredElement = newOwnedParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, oldOwnedParameteredElement, newOwnedParameteredElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedParameteredElement(ParameterableElement newOwnedParameteredElement) {
		if (newOwnedParameteredElement != ownedParameteredElement) {
			NotificationChain msgs = null;
			if (ownedParameteredElement != null)
				msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			if (newOwnedParameteredElement != null)
				msgs = ((InternalEObject)newOwnedParameteredElement).eInverseAdd(this, CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
			msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (parameteredElement != null)
					msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
				return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSignature((TemplateSignature)otherEnd, msgs);
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				if (ownedParameteredElement != null)
					msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
				return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return basicSetOwnedDefault(null, msgs);
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return basicSetParameteredElement(null, msgs);
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				return basicSetSignature(null, msgs);
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return basicSetOwnedParameteredElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				return eInternalContainer().eInverseRemove(this, CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				if (resolve) return getParameteredElement();
				return basicGetParameteredElement();
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature();
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)newValue);
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
			case CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((ParameterableElement)null);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)null);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((ParameterableElement)null);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((TemplateSignature)null);
				return;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)null);
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
			case CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT:
				return default_ != null;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return ownedDefault != null;
			case CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return parameteredElement != null;
			case CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature() != null;
			case CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return ownedParameteredElement != null;
		}
		return super.eIsSet(featureID);
	}

} //TemplateParameterImpl
