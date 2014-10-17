/**
 */
package com.br.terra.dcl.dCL.util;

import com.br.terra.dcl.dCL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.br.terra.dcl.dCL.DCLPackage
 * @generated
 */
public class DCLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DCLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DCLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLSwitch<Adapter> modelSwitch =
    new DCLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStructureElement(StructureElement object)
      {
        return createStructureElementAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseSubSystem(SubSystem object)
      {
        return createSubSystemAdapter();
      }
      @Override
      public Adapter caseArchitectureView(ArchitectureView object)
      {
        return createArchitectureViewAdapter();
      }
      @Override
      public Adapter caseSoftwareSystem(SoftwareSystem object)
      {
        return createSoftwareSystemAdapter();
      }
      @Override
      public Adapter caseDCDecl(DCDecl object)
      {
        return createDCDeclAdapter();
      }
      @Override
      public Adapter caseOnly(Only object)
      {
        return createOnlyAdapter();
      }
      @Override
      public Adapter caseCan(Can object)
      {
        return createCanAdapter();
      }
      @Override
      public Adapter caseCannot(Cannot object)
      {
        return createCannotAdapter();
      }
      @Override
      public Adapter caseOnly2(Only2 object)
      {
        return createOnly2Adapter();
      }
      @Override
      public Adapter caseMust(Must object)
      {
        return createMustAdapter();
      }
      @Override
      public Adapter caseElementType(ElementType object)
      {
        return createElementTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.StructureElement <em>Structure Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.StructureElement
   * @generated
   */
  public Adapter createStructureElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.SubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.SubSystem
   * @generated
   */
  public Adapter createSubSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.ArchitectureView <em>Architecture View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.ArchitectureView
   * @generated
   */
  public Adapter createArchitectureViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.SoftwareSystem <em>Software System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.SoftwareSystem
   * @generated
   */
  public Adapter createSoftwareSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.DCDecl <em>DC Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.DCDecl
   * @generated
   */
  public Adapter createDCDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Only <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Only
   * @generated
   */
  public Adapter createOnlyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Can <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Can
   * @generated
   */
  public Adapter createCanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Cannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Cannot
   * @generated
   */
  public Adapter createCannotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Only2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Only2
   * @generated
   */
  public Adapter createOnly2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.Must <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.Must
   * @generated
   */
  public Adapter createMustAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.ElementType
   * @generated
   */
  public Adapter createElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.br.terra.dcl.dCL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.br.terra.dcl.dCL.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DCLAdapterFactory
