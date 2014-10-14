/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.ElementType;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.dCL.ModDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getT <em>T</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCDeclImpl extends MinimalEObjectImpl.Container implements DCDecl
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected ModDecl t;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ElementType elementType;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ModDecl type;

  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected EntityType entityType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCDeclImpl()
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
    return DCLPackage.Literals.DC_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModDecl getT()
  {
    if (t != null && t.eIsProxy())
    {
      InternalEObject oldT = (InternalEObject)t;
      t = (ModDecl)eResolveProxy(oldT);
      if (t != oldT)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DC_DECL__T, oldT, t));
      }
    }
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModDecl basicGetT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(ModDecl newT)
  {
    ModDecl oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__T, oldT, t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(ElementType newElementType, NotificationChain msgs)
  {
    ElementType oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(ElementType newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModDecl getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ModDecl)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DC_DECL__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModDecl basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ModDecl newType)
  {
    ModDecl oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityType(EntityType newEntityType, NotificationChain msgs)
  {
    EntityType oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ENTITY_TYPE, oldEntityType, newEntityType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityType(EntityType newEntityType)
  {
    if (newEntityType != entityType)
    {
      NotificationChain msgs = null;
      if (entityType != null)
        msgs = ((InternalEObject)entityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ENTITY_TYPE, null, msgs);
      if (newEntityType != null)
        msgs = ((InternalEObject)newEntityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ENTITY_TYPE, null, msgs);
      msgs = basicSetEntityType(newEntityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ENTITY_TYPE, newEntityType, newEntityType));
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
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return basicSetEntityType(null, msgs);
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
      case DCLPackage.DC_DECL__T:
        if (resolve) return getT();
        return basicGetT();
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return getElementType();
      case DCLPackage.DC_DECL__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return getEntityType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DCLPackage.DC_DECL__T:
        setT((ModDecl)newValue);
        return;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        setElementType((ElementType)newValue);
        return;
      case DCLPackage.DC_DECL__TYPE:
        setType((ModDecl)newValue);
        return;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        setEntityType((EntityType)newValue);
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
      case DCLPackage.DC_DECL__T:
        setT((ModDecl)null);
        return;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        setElementType((ElementType)null);
        return;
      case DCLPackage.DC_DECL__TYPE:
        setType((ModDecl)null);
        return;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        setEntityType((EntityType)null);
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
      case DCLPackage.DC_DECL__T:
        return t != null;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return elementType != null;
      case DCLPackage.DC_DECL__TYPE:
        return type != null;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return entityType != null;
    }
    return super.eIsSet(featureID);
  }

} //DCDeclImpl
