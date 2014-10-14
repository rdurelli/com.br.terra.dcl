/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl()
 * @model
 * @generated
 */
public interface DCDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' reference.
   * @see #setT(ModDecl)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_T()
   * @model
   * @generated
   */
  ModDecl getT();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' reference.
   * @see #getT()
   * @generated
   */
  void setT(ModDecl value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(ElementType)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_ElementType()
   * @model containment="true"
   * @generated
   */
  ElementType getElementType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ModDecl)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Type()
   * @model
   * @generated
   */
  ModDecl getType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ModDecl value);

  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' containment reference.
   * @see #setEntityType(EntityType)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_EntityType()
   * @model containment="true"
   * @generated
   */
  EntityType getEntityType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' containment reference.
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(EntityType value);

} // DCDecl
