/**
 */
package uml.actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.LoopNode;
import uml.actions.OutputPin;

import uml.activities.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#isIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link uml.actions.impl.LoopNodeImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
	/**
	 * The cached value of the '{@link #getBodyOutput() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> bodyOutput;

	/**
	 * The cached value of the '{@link #getBodyPart() <em>Body Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> bodyPart;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * The default value of the '{@link #isIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TESTED_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean isTestedFirst = IS_TESTED_FIRST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> loopVariable;

	/**
	 * The cached value of the '{@link #getLoopVariableInput() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> loopVariableInput;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * The cached value of the '{@link #getSetupPart() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> setupPart;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.LOOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, ActionsPackage.LOOP_NODE__BODY_OUTPUT);
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBodyPart() {
		if (bodyPart == null) {
			bodyPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, ActionsPackage.LOOP_NODE__BODY_PART);
		}
		return bodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.LOOP_NODE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.LOOP_NODE__DECIDER, oldDecider, decider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTestedFirst() {
		return isTestedFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedFirst(boolean newIsTestedFirst) {
		boolean oldIsTestedFirst = isTestedFirst;
		isTestedFirst = newIsTestedFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst, isTestedFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getLoopVariable() {
		if (loopVariable == null) {
			loopVariable = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getLoopVariableInput() {
		if (loopVariableInput == null) {
			loopVariableInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.LOOP_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getSetupPart() {
		if (setupPart == null) {
			setupPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, ActionsPackage.LOOP_NODE__SETUP_PART);
		}
		return setupPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, ActionsPackage.LOOP_NODE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE:
				return ((InternalEList<?>)getLoopVariable()).basicRemove(otherEnd, msgs);
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return ((InternalEList<?>)getLoopVariableInput()).basicRemove(otherEnd, msgs);
			case ActionsPackage.LOOP_NODE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.LOOP_NODE__BODY_OUTPUT:
				return getBodyOutput();
			case ActionsPackage.LOOP_NODE__BODY_PART:
				return getBodyPart();
			case ActionsPackage.LOOP_NODE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case ActionsPackage.LOOP_NODE__IS_TESTED_FIRST:
				return isIsTestedFirst();
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE:
				return getLoopVariable();
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return getLoopVariableInput();
			case ActionsPackage.LOOP_NODE__RESULT:
				return getResult();
			case ActionsPackage.LOOP_NODE__SETUP_PART:
				return getSetupPart();
			case ActionsPackage.LOOP_NODE__TEST:
				return getTest();
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
			case ActionsPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				getBodyPart().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case ActionsPackage.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst((Boolean)newValue);
				return;
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				getLoopVariable().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				getLoopVariableInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				getSetupPart().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case ActionsPackage.LOOP_NODE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
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
			case ActionsPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case ActionsPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				return;
			case ActionsPackage.LOOP_NODE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case ActionsPackage.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				return;
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				return;
			case ActionsPackage.LOOP_NODE__RESULT:
				getResult().clear();
				return;
			case ActionsPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				return;
			case ActionsPackage.LOOP_NODE__TEST:
				getTest().clear();
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
			case ActionsPackage.LOOP_NODE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
			case ActionsPackage.LOOP_NODE__BODY_PART:
				return bodyPart != null && !bodyPart.isEmpty();
			case ActionsPackage.LOOP_NODE__DECIDER:
				return decider != null;
			case ActionsPackage.LOOP_NODE__IS_TESTED_FIRST:
				return isTestedFirst != IS_TESTED_FIRST_EDEFAULT;
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE:
				return loopVariable != null && !loopVariable.isEmpty();
			case ActionsPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return loopVariableInput != null && !loopVariableInput.isEmpty();
			case ActionsPackage.LOOP_NODE__RESULT:
				return result != null && !result.isEmpty();
			case ActionsPackage.LOOP_NODE__SETUP_PART:
				return setupPart != null && !setupPart.isEmpty();
			case ActionsPackage.LOOP_NODE__TEST:
				return test != null && !test.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTestedFirst: ");
		result.append(isTestedFirst);
		result.append(')');
		return result.toString();
	}

} //LoopNodeImpl
