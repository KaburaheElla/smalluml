/**
 */
package SmallUml.model.smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.Attribute#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmallUml.model.smalluml.SmallumlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Typename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typename</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typename</em>' containment reference.
	 * @see #setTypename(Type)
	 * @see SmallUml.model.smalluml.SmallumlPackage#getAttribute_Typename()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getTypename();

	/**
	 * Sets the value of the '{@link SmallUml.model.smalluml.Attribute#getTypename <em>Typename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typename</em>' containment reference.
	 * @see #getTypename()
	 * @generated
	 */
	void setTypename(Type value);

} // Attribute
