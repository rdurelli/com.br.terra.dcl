/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.br.terra.dcl.dCL.DCLFactory
 * @model kind="package"
 * @generated
 */
public interface DCLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dCL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.br.com/terra/dcl/DCL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dCL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DCLPackage eINSTANCE = com.br.terra.dcl.dCL.impl.DCLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ModelImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Mod Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MOD_DECL = 0;

  /**
   * The feature id for the '<em><b>DC Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DC_DECL = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ModDeclImpl <em>Mod Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ModDeclImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModDecl()
   * @generated
   */
  int MOD_DECL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Mod Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCDeclImpl <em>DC Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCDeclImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCDecl()
   * @generated
   */
  int DC_DECL = 2;

  /**
   * The feature id for the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__T = 0;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ELEMENT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__TYPE = 2;

  /**
   * The feature id for the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ENTITY_TYPE = 3;

  /**
   * The number of structural features of the '<em>DC Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ElementTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 3;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.BasicTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 4;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPE_NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.EntityTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 5;

  /**
   * The feature id for the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__ENTITY = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.br.terra.dcl.dCL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.br.terra.dcl.dCL.Model#getModDecl <em>Mod Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mod Decl</em>'.
   * @see com.br.terra.dcl.dCL.Model#getModDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ModDecl();

  /**
   * Returns the meta object for the containment reference list '{@link com.br.terra.dcl.dCL.Model#getDCDecl <em>DC Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DC Decl</em>'.
   * @see com.br.terra.dcl.dCL.Model#getDCDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DCDecl();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.ModDecl <em>Mod Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Decl</em>'.
   * @see com.br.terra.dcl.dCL.ModDecl
   * @generated
   */
  EClass getModDecl();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.ModDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.br.terra.dcl.dCL.ModDecl#getName()
   * @see #getModDecl()
   * @generated
   */
  EAttribute getModDecl_Name();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCDecl <em>DC Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DC Decl</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl
   * @generated
   */
  EClass getDCDecl();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>T</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getT()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_T();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getElementType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_ElementType();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getEntityType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_EntityType();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see com.br.terra.dcl.dCL.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see com.br.terra.dcl.dCL.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.BasicType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see com.br.terra.dcl.dCL.BasicType#getTypeName()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_TypeName();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see com.br.terra.dcl.dCL.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.EntityType#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entity</em>'.
   * @see com.br.terra.dcl.dCL.EntityType#getEntity()
   * @see #getEntityType()
   * @generated
   */
  EAttribute getEntityType_Entity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DCLFactory getDCLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ModelImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Mod Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MOD_DECL = eINSTANCE.getModel_ModDecl();

    /**
     * The meta object literal for the '<em><b>DC Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DC_DECL = eINSTANCE.getModel_DCDecl();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ModDeclImpl <em>Mod Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ModDeclImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModDecl()
     * @generated
     */
    EClass MOD_DECL = eINSTANCE.getModDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_DECL__NAME = eINSTANCE.getModDecl_Name();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCDeclImpl <em>DC Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCDeclImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCDecl()
     * @generated
     */
    EClass DC_DECL = eINSTANCE.getDCDecl();

    /**
     * The meta object literal for the '<em><b>T</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__T = eINSTANCE.getDCDecl_T();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ELEMENT_TYPE = eINSTANCE.getDCDecl_ElementType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__TYPE = eINSTANCE.getDCDecl_Type();

    /**
     * The meta object literal for the '<em><b>Entity Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ENTITY_TYPE = eINSTANCE.getDCDecl_EntityType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ElementTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.BasicTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__TYPE_NAME = eINSTANCE.getBasicType_TypeName();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.EntityTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_TYPE__ENTITY = eINSTANCE.getEntityType_Entity();

  }

} //DCLPackage
