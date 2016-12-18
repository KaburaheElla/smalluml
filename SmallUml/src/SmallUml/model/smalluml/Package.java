/**
 */
package SmallUml.model.smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.Package#getClass_ <em>Class</em>}</li>
 *   <li>{@link SmallUml.model.smalluml.Package#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmallUml.model.smalluml.SmallumlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link SmallUml.model.smalluml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see SmallUml.model.smalluml.SmallumlPackage#getPackage_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmallUml.model.smalluml.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link SmallUml.model.smalluml.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see SmallUml.model.smalluml.SmallumlPackage#getPackage_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

} // Package
