/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCLFactoryImpl extends EFactoryImpl implements DCLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DCLFactory init()
  {
    try
    {
      DCLFactory theDCLFactory = (DCLFactory)EPackage.Registry.INSTANCE.getEFactory(DCLPackage.eNS_URI);
      if (theDCLFactory != null)
      {
        return theDCLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DCLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DCLPackage.MODEL: return createModel();
      case DCLPackage.STRUCTURE_ELEMENT: return createStructureElement();
      case DCLPackage.LAYER: return createLayer();
      case DCLPackage.COMPONENT: return createComponent();
      case DCLPackage.SUB_SYSTEM: return createSubSystem();
      case DCLPackage.ARCHITECTURE_VIEW: return createArchitectureView();
      case DCLPackage.SOFTWARE_SYSTEM: return createSoftwareSystem();
      case DCLPackage.DC_DECL: return createDCDecl();
      case DCLPackage.ONLY: return createOnly();
      case DCLPackage.CAN: return createCan();
      case DCLPackage.CANNOT: return createCannot();
      case DCLPackage.ONLY2: return createOnly2();
      case DCLPackage.MUST: return createMust();
      case DCLPackage.ELEMENT_TYPE: return createElementType();
      case DCLPackage.BASIC_TYPE: return createBasicType();
      case DCLPackage.ENTITY_TYPE: return createEntityType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureElement createStructureElement()
  {
    StructureElementImpl structureElement = new StructureElementImpl();
    return structureElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSystem createSubSystem()
  {
    SubSystemImpl subSystem = new SubSystemImpl();
    return subSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureView createArchitectureView()
  {
    ArchitectureViewImpl architectureView = new ArchitectureViewImpl();
    return architectureView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftwareSystem createSoftwareSystem()
  {
    SoftwareSystemImpl softwareSystem = new SoftwareSystemImpl();
    return softwareSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCDecl createDCDecl()
  {
    DCDeclImpl dcDecl = new DCDeclImpl();
    return dcDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only createOnly()
  {
    OnlyImpl only = new OnlyImpl();
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Can createCan()
  {
    CanImpl can = new CanImpl();
    return can;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cannot createCannot()
  {
    CannotImpl cannot = new CannotImpl();
    return cannot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only2 createOnly2()
  {
    Only2Impl only2 = new Only2Impl();
    return only2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Must createMust()
  {
    MustImpl must = new MustImpl();
    return must;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLPackage getDCLPackage()
  {
    return (DCLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DCLPackage getPackage()
  {
    return DCLPackage.eINSTANCE;
  }

} //DCLFactoryImpl
