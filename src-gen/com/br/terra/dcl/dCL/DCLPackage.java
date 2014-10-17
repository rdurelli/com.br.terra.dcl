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
   * The feature id for the '<em><b>Structure Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STRUCTURE_ELEMENTS = 0;

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
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.StructureElementImpl <em>Structure Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.StructureElementImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getStructureElement()
   * @generated
   */
  int STRUCTURE_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Structure Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.LayerImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ComponentImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.SubSystemImpl <em>Sub System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.SubSystemImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getSubSystem()
   * @generated
   */
  int SUB_SYSTEM = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__NAME = STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Sub System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ArchitectureViewImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getArchitectureView()
   * @generated
   */
  int ARCHITECTURE_VIEW = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_VIEW__NAME = STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Architecture View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_VIEW_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.SoftwareSystemImpl <em>Software System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.SoftwareSystemImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getSoftwareSystem()
   * @generated
   */
  int SOFTWARE_SYSTEM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTWARE_SYSTEM__NAME = STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Software System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTWARE_SYSTEM_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCDeclImpl <em>DC Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCDeclImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCDecl()
   * @generated
   */
  int DC_DECL = 7;

  /**
   * The feature id for the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ONLY = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__T = 1;

  /**
   * The feature id for the '<em><b>Can</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__CAN = 2;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ELEMENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__TYPE = 4;

  /**
   * The feature id for the '<em><b>Cannot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__CANNOT = 5;

  /**
   * The feature id for the '<em><b>Only2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ONLY2 = 6;

  /**
   * The feature id for the '<em><b>Must</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__MUST = 7;

  /**
   * The feature id for the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ENTITY_TYPE = 8;

  /**
   * The number of structural features of the '<em>DC Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.OnlyImpl <em>Only</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.OnlyImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly()
   * @generated
   */
  int ONLY = 8;

  /**
   * The feature id for the '<em><b>Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY__ONLY = 0;

  /**
   * The number of structural features of the '<em>Only</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.CanImpl <em>Can</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.CanImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCan()
   * @generated
   */
  int CAN = 9;

  /**
   * The feature id for the '<em><b>Can</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAN__CAN = 0;

  /**
   * The number of structural features of the '<em>Can</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.CannotImpl <em>Cannot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.CannotImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCannot()
   * @generated
   */
  int CANNOT = 10;

  /**
   * The feature id for the '<em><b>Cannot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANNOT__CANNOT = 0;

  /**
   * The number of structural features of the '<em>Cannot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANNOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.Only2Impl <em>Only2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.Only2Impl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly2()
   * @generated
   */
  int ONLY2 = 11;

  /**
   * The feature id for the '<em><b>Only2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY2__ONLY2 = 0;

  /**
   * The number of structural features of the '<em>Only2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.MustImpl <em>Must</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.MustImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getMust()
   * @generated
   */
  int MUST = 12;

  /**
   * The feature id for the '<em><b>Must</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST__MUST = 0;

  /**
   * The number of structural features of the '<em>Must</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ElementTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 13;

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
  int BASIC_TYPE = 14;

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
  int ENTITY_TYPE = 15;

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
   * Returns the meta object for the containment reference list '{@link com.br.terra.dcl.dCL.Model#getStructureElements <em>Structure Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structure Elements</em>'.
   * @see com.br.terra.dcl.dCL.Model#getStructureElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_StructureElements();

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
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.StructureElement <em>Structure Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Element</em>'.
   * @see com.br.terra.dcl.dCL.StructureElement
   * @generated
   */
  EClass getStructureElement();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.StructureElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.br.terra.dcl.dCL.StructureElement#getName()
   * @see #getStructureElement()
   * @generated
   */
  EAttribute getStructureElement_Name();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see com.br.terra.dcl.dCL.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.br.terra.dcl.dCL.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.SubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub System</em>'.
   * @see com.br.terra.dcl.dCL.SubSystem
   * @generated
   */
  EClass getSubSystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.ArchitectureView <em>Architecture View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture View</em>'.
   * @see com.br.terra.dcl.dCL.ArchitectureView
   * @generated
   */
  EClass getArchitectureView();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.SoftwareSystem <em>Software System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Software System</em>'.
   * @see com.br.terra.dcl.dCL.SoftwareSystem
   * @generated
   */
  EClass getSoftwareSystem();

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
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getOnly()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Only();

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
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getCan <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getCan()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Can();

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
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getCannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getCannot()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Cannot();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getOnly2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getOnly2()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Only2();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getMust <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getMust()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Must();

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
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Only <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.Only
   * @generated
   */
  EClass getOnly();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Only#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.Only#getOnly()
   * @see #getOnly()
   * @generated
   */
  EAttribute getOnly_Only();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Can <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.Can
   * @generated
   */
  EClass getCan();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Can#getCan <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.Can#getCan()
   * @see #getCan()
   * @generated
   */
  EAttribute getCan_Can();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Cannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.Cannot
   * @generated
   */
  EClass getCannot();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Cannot#getCannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.Cannot#getCannot()
   * @see #getCannot()
   * @generated
   */
  EAttribute getCannot_Cannot();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Only2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.Only2
   * @generated
   */
  EClass getOnly2();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Only2#getOnly2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.Only2#getOnly2()
   * @see #getOnly2()
   * @generated
   */
  EAttribute getOnly2_Only2();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Must <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.Must
   * @generated
   */
  EClass getMust();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Must#getMust <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.Must#getMust()
   * @see #getMust()
   * @generated
   */
  EAttribute getMust_Must();

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
     * The meta object literal for the '<em><b>Structure Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STRUCTURE_ELEMENTS = eINSTANCE.getModel_StructureElements();

    /**
     * The meta object literal for the '<em><b>DC Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DC_DECL = eINSTANCE.getModel_DCDecl();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.StructureElementImpl <em>Structure Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.StructureElementImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getStructureElement()
     * @generated
     */
    EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_ELEMENT__NAME = eINSTANCE.getStructureElement_Name();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.LayerImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ComponentImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.SubSystemImpl <em>Sub System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.SubSystemImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getSubSystem()
     * @generated
     */
    EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ArchitectureViewImpl <em>Architecture View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ArchitectureViewImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getArchitectureView()
     * @generated
     */
    EClass ARCHITECTURE_VIEW = eINSTANCE.getArchitectureView();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.SoftwareSystemImpl <em>Software System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.SoftwareSystemImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getSoftwareSystem()
     * @generated
     */
    EClass SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystem();

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
     * The meta object literal for the '<em><b>Only</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ONLY = eINSTANCE.getDCDecl_Only();

    /**
     * The meta object literal for the '<em><b>T</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__T = eINSTANCE.getDCDecl_T();

    /**
     * The meta object literal for the '<em><b>Can</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__CAN = eINSTANCE.getDCDecl_Can();

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
     * The meta object literal for the '<em><b>Cannot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__CANNOT = eINSTANCE.getDCDecl_Cannot();

    /**
     * The meta object literal for the '<em><b>Only2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ONLY2 = eINSTANCE.getDCDecl_Only2();

    /**
     * The meta object literal for the '<em><b>Must</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__MUST = eINSTANCE.getDCDecl_Must();

    /**
     * The meta object literal for the '<em><b>Entity Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ENTITY_TYPE = eINSTANCE.getDCDecl_EntityType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.OnlyImpl <em>Only</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.OnlyImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly()
     * @generated
     */
    EClass ONLY = eINSTANCE.getOnly();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY__ONLY = eINSTANCE.getOnly_Only();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.CanImpl <em>Can</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.CanImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCan()
     * @generated
     */
    EClass CAN = eINSTANCE.getCan();

    /**
     * The meta object literal for the '<em><b>Can</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAN__CAN = eINSTANCE.getCan_Can();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.CannotImpl <em>Cannot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.CannotImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCannot()
     * @generated
     */
    EClass CANNOT = eINSTANCE.getCannot();

    /**
     * The meta object literal for the '<em><b>Cannot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANNOT__CANNOT = eINSTANCE.getCannot_Cannot();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.Only2Impl <em>Only2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.Only2Impl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly2()
     * @generated
     */
    EClass ONLY2 = eINSTANCE.getOnly2();

    /**
     * The meta object literal for the '<em><b>Only2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY2__ONLY2 = eINSTANCE.getOnly2_Only2();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.MustImpl <em>Must</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.MustImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getMust()
     * @generated
     */
    EClass MUST = eINSTANCE.getMust();

    /**
     * The meta object literal for the '<em><b>Must</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUST__MUST = eINSTANCE.getMust_Must();

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
