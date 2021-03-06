/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCLLayer#getLevel <em>Level</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLLayer#getLayer <em>Layer</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLLayer#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLLayer#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCLLayer()
 * @model
 * @generated
 */
public interface DCLLayer extends DCLStructureElement
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLLayer_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLLayer#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer</em>' reference.
   * @see #setLayer(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLLayer_Layer()
   * @model
   * @generated
   */
  DCLStructureElement getLayer();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLLayer#getLayer <em>Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer</em>' reference.
   * @see #getLayer()
   * @generated
   */
  void setLayer(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub System</em>' reference.
   * @see #setSubSystem(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLLayer_SubSystem()
   * @model
   * @generated
   */
  DCLStructureElement getSubSystem();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLLayer#getSubSystem <em>Sub System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub System</em>' reference.
   * @see #getSubSystem()
   * @generated
   */
  void setSubSystem(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLLayer_Component()
   * @model
   * @generated
   */
  DCLStructureElement getComponent();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLLayer#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(DCLStructureElement value);

} // DCLLayer
