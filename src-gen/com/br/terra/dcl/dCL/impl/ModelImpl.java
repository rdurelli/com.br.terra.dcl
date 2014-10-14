/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.ModDecl;
import com.br.terra.dcl.dCL.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.ModelImpl#getModDecl <em>Mod Decl</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.ModelImpl#getDCDecl <em>DC Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getModDecl() <em>Mod Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModDecl()
   * @generated
   * @ordered
   */
  protected EList<ModDecl> modDecl;

  /**
   * The cached value of the '{@link #getDCDecl() <em>DC Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDCDecl()
   * @generated
   * @ordered
   */
  protected EList<DCDecl> dCDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DCLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModDecl> getModDecl()
  {
    if (modDecl == null)
    {
      modDecl = new EObjectContainmentEList<ModDecl>(ModDecl.class, this, DCLPackage.MODEL__MOD_DECL);
    }
    return modDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DCDecl> getDCDecl()
  {
    if (dCDecl == null)
    {
      dCDecl = new EObjectContainmentEList<DCDecl>(DCDecl.class, this, DCLPackage.MODEL__DC_DECL);
    }
    return dCDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DCLPackage.MODEL__MOD_DECL:
        return ((InternalEList<?>)getModDecl()).basicRemove(otherEnd, msgs);
      case DCLPackage.MODEL__DC_DECL:
        return ((InternalEList<?>)getDCDecl()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DCLPackage.MODEL__MOD_DECL:
        return getModDecl();
      case DCLPackage.MODEL__DC_DECL:
        return getDCDecl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DCLPackage.MODEL__MOD_DECL:
        getModDecl().clear();
        getModDecl().addAll((Collection<? extends ModDecl>)newValue);
        return;
      case DCLPackage.MODEL__DC_DECL:
        getDCDecl().clear();
        getDCDecl().addAll((Collection<? extends DCDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DCLPackage.MODEL__MOD_DECL:
        getModDecl().clear();
        return;
      case DCLPackage.MODEL__DC_DECL:
        getDCDecl().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DCLPackage.MODEL__MOD_DECL:
        return modDecl != null && !modDecl.isEmpty();
      case DCLPackage.MODEL__DC_DECL:
        return dCDecl != null && !dCDecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
