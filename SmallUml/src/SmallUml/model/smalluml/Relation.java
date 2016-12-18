/**
 */
package SmallUml.model.smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmallUml.model.smalluml.Relation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link SmallUml.model.smalluml.Relation#getFrom <em>From</em>}</li>
 *   <li>{@link SmallUml.model.smalluml.Relation#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmallUml.model.smalluml.SmallumlPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see SmallUml.model.smalluml.SmallumlPackage#getRelation_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link SmallUml.model.smalluml.Relation#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SmallUml.model.smalluml.Class)
	 * @see SmallUml.model.smalluml.SmallumlPackage#getRelation_From()
	 * @model required="true"
	 * @generated
	 */
	SmallUml.model.smalluml.Class getFrom();

	/**
	 * Sets the value of the '{@link SmallUml.model.smalluml.Relation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SmallUml.model.smalluml.Class value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SmallUml.model.smalluml.Class)
	 * @see SmallUml.model.smalluml.SmallumlPackage#getRelation_To()
	 * @model required="true"
	 * @generated
	 */
	SmallUml.model.smalluml.Class getTo();

	/**
	 * Sets the value of the '{@link SmallUml.model.smalluml.Relation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SmallUml.model.smalluml.Class value);

} // Relation
