package com.br.terra.dcl.serializer;

import com.br.terra.dcl.dCL.BasicType;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.dCL.ModDecl;
import com.br.terra.dcl.dCL.Model;
import com.br.terra.dcl.services.DCLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DCLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DCLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DCLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DCLPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getElementTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.DC_DECL:
				if(context == grammarAccess.getDCDeclRule()) {
					sequence_DCDecl(context, (DCDecl) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.ENTITY_TYPE:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getEntityTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.MOD_DECL:
				if(context == grammarAccess.getModDeclRule()) {
					sequence_ModDecl(context, (ModDecl) semanticObject); 
					return; 
				}
				else break;
			case DCLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (typeName='access' | typeName='declare' | typeName='handle' | typeName='create' | typeName='depend')
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (t=[ModDecl|ID] elementType=ElementType type=[ModDecl|ID]) | 
	 *         (t=[ModDecl|ID] elementType=ElementType type=[ModDecl|ID]) | 
	 *         (t=[ModDecl|ID] elementType=ElementType type=[ModDecl|ID]) | 
	 *         (t=[ModDecl|ID] entityType=EntityType type=[ModDecl|ID])
	 *     )
	 */
	protected void sequence_DCDecl(EObject context, DCDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity='extend' | entity='implement' | entity='derive' | entity='throw' | entity='annotated')
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=ID | name=ID | name=ID | name=ID)
	 */
	protected void sequence_ModDecl(EObject context, ModDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modDecl+=ModDecl* dCDecl+=DCDecl*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
