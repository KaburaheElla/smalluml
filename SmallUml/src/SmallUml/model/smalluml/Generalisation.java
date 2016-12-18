/**
 */
package SmallUml.model.smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.Generalisation#getParent <em>Parent</em>}</li>
 *   <li>{@link SmallUml.model.smalluml.Generalisation#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmallUml.model.smalluml.SmallumlPackage#getGeneralisation()
 * @model
 * @generated
 */
public interface Generalisation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link SmallUml.model.smalluml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see SmallUml.model.smalluml.SmallumlPackage#getGeneralisation_Parent()
	 * @model
	 * @generated
	 */
	EList<SmallUml.model.smalluml.Class> getParent();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link SmallUml.model.smalluml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see SmallUml.model.smalluml.SmallumlPackage#getGeneralisation_Child()
	 * @model
	 * @generated
	 */
	EList<SmallUml.model.smalluml.Class> getChild();

} // Generalisation
