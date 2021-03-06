/**
 */
package uml.interactions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.interactions.GeneralOrdering;
import uml.interactions.InteractionsPackage;
import uml.interactions.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.impl.OccurrenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link uml.interactions.impl.OccurrenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceSpecificationImpl extends InteractionFragmentImpl implements OccurrenceSpecification {
	/**
	 * The cached value of the '{@link #getToAfter() <em>To After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toAfter;

	/**
	 * The cached value of the '{@link #getToBefore() <em>To Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toBefore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionsPackage.Literals.OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToAfter() {
		if (toAfter == null) {
			toAfter = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, InteractionsPackage.GENERAL_ORDERING__BEFORE);
		}
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToBefore() {
		if (toBefore == null) {
			toBefore = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, InteractionsPackage.GENERAL_ORDERING__AFTER);
		}
		return toBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToAfter()).basicAdd(otherEnd, msgs);
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToBefore()).basicAdd(otherEnd, msgs);
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
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return ((InternalEList<?>)getToAfter()).basicRemove(otherEnd, msgs);
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return ((InternalEList<?>)getToBefore()).basicRemove(otherEnd, msgs);
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
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return getToAfter();
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return getToBefore();
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
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				getToAfter().clear();
				getToAfter().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				getToBefore().clear();
				getToBefore().addAll((Collection<? extends GeneralOrdering>)newValue);
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
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				getToAfter().clear();
				return;
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				getToBefore().clear();
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
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
				return toAfter != null && !toAfter.isEmpty();
			case InteractionsPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
				return toBefore != null && !toBefore.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OccurrenceSpecificationImpl
