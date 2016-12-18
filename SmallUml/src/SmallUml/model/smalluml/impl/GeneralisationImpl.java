/**
 */
package SmallUml.model.smalluml.impl;

import SmallUml.model.smalluml.Generalisation;
import SmallUml.model.smalluml.SmallumlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.impl.GeneralisationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link SmallUml.model.smalluml.impl.GeneralisationImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralisationImpl extends NamedElementImpl implements Generalisation {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<SmallUml.model.smalluml.Class> parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<SmallUml.model.smalluml.Class> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.GENERALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallUml.model.smalluml.Class> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<SmallUml.model.smalluml.Class>(SmallUml.model.smalluml.Class.class, this, SmallumlPackage.GENERALISATION__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallUml.model.smalluml.Class> getChild() {
		if (child == null) {
			child = new EObjectResolvingEList<SmallUml.model.smalluml.Class>(SmallUml.model.smalluml.Class.class, this, SmallumlPackage.GENERALISATION__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.GENERALISATION__PARENT:
				return getParent();
			case SmallumlPackage.GENERALISATION__CHILD:
				return getChild();
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
			case SmallumlPackage.GENERALISATION__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends SmallUml.model.smalluml.Class>)newValue);
				return;
			case SmallumlPackage.GENERALISATION__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends SmallUml.model.smalluml.Class>)newValue);
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
			case SmallumlPackage.GENERALISATION__PARENT:
				getParent().clear();
				return;
			case SmallumlPackage.GENERALISATION__CHILD:
				getChild().clear();
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
			case SmallumlPackage.GENERALISATION__PARENT:
				return parent != null && !parent.isEmpty();
			case SmallumlPackage.GENERALISATION__CHILD:
				return child != null && !child.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralisationImpl
