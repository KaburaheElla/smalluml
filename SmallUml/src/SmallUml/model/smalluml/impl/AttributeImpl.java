/**
 */
package SmallUml.model.smalluml.impl;

import SmallUml.model.smalluml.Attribute;
import SmallUml.model.smalluml.SmallumlPackage;
import SmallUml.model.smalluml.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.impl.AttributeImpl#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getTypename() <em>Typename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypename()
	 * @generated
	 * @ordered
	 */
	protected Type typename;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypename() {
		return typename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypename(Type newTypename, NotificationChain msgs) {
		Type oldTypename = typename;
		typename = newTypename;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ATTRIBUTE__TYPENAME, oldTypename, newTypename);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypename(Type newTypename) {
		if (newTypename != typename) {
			NotificationChain msgs = null;
			if (typename != null)
				msgs = ((InternalEObject)typename).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ATTRIBUTE__TYPENAME, null, msgs);
			if (newTypename != null)
				msgs = ((InternalEObject)newTypename).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ATTRIBUTE__TYPENAME, null, msgs);
			msgs = basicSetTypename(newTypename, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ATTRIBUTE__TYPENAME, newTypename, newTypename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ATTRIBUTE__TYPENAME:
				return basicSetTypename(null, msgs);
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
			case SmallumlPackage.ATTRIBUTE__TYPENAME:
				return getTypename();
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
			case SmallumlPackage.ATTRIBUTE__TYPENAME:
				setTypename((Type)newValue);
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
			case SmallumlPackage.ATTRIBUTE__TYPENAME:
				setTypename((Type)null);
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
			case SmallumlPackage.ATTRIBUTE__TYPENAME:
				return typename != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
