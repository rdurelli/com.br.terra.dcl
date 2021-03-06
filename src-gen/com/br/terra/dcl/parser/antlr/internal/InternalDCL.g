/*
* generated by Xtext
*/
grammar InternalDCL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.br.terra.dcl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.br.terra.dcl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.br.terra.dcl.services.DCLGrammarAccess;

}

@parser::members {

 	private DCLGrammarAccess grammarAccess;
 	
    public InternalDCLParser(TokenStream input, DCLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected DCLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='architeturalElements' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
	    }
		lv_structureElements_2_0=ruleDCLStructureElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"structureElements",
        		lv_structureElements_2_0, 
        		"DCLStructureElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
    }
	otherlv_4='restrictions' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRestrictionsKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
	    }
		lv_dCDecl_6_0=ruleDCDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"dCDecl",
        		lv_dCDecl_6_0, 
        		"DCDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleDCLStructureElement
entryRuleDCLStructureElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLStructureElementRule()); }
	 iv_ruleDCLStructureElement=ruleDCLStructureElement 
	 { $current=$iv_ruleDCLStructureElement.current; } 
	 EOF 
;

// Rule DCLStructureElement
ruleDCLStructureElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
    }
    this_DCLLayer_0=ruleDCLLayer
    { 
        $current = $this_DCLLayer_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
    }
    this_DCLComponent_1=ruleDCLComponent
    { 
        $current = $this_DCLComponent_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
    }
    this_DCLSubSystem_2=ruleDCLSubSystem
    { 
        $current = $this_DCLSubSystem_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
    }
    this_DCLModule_3=ruleDCLModule
    { 
        $current = $this_DCLModule_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
    }
    this_DCLComponentInterface_4=ruleDCLComponentInterface
    { 
        $current = $this_DCLComponentInterface_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDCLLayer
entryRuleDCLLayer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLLayerRule()); }
	 iv_ruleDCLLayer=ruleDCLLayer 
	 { $current=$iv_ruleDCLLayer.current; } 
	 EOF 
;

// Rule DCLLayer
ruleDCLLayer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='layer' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDCLLayerAccess().getLayerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLLayerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDCLLayerAccess().getCommaKeyword_2());
    }
	otherlv_3='level' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDCLLayerAccess().getLevelKeyword_3());
    }
(
(
		lv_level_4_0=RULE_INT
		{
			newLeafNode(lv_level_4_0, grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLLayerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"level",
        		lv_level_4_0, 
        		"INT");
	    }

)
)((	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0_0());
    }
	otherlv_6='inLayer: ' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDCLLayerAccess().getInLayerKeyword_5_0_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLLayerRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getDCLLayerAccess().getLayerDCLStructureElementCrossReference_5_0_2_0()); 
	}

)
))
    |(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_1_0());
    }
	otherlv_9='inSubSystem: ' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLLayerRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_1_2_0()); 
	}

)
))
    |(	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_2_0());
    }
	otherlv_12='inComponent: ' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getDCLLayerAccess().getInComponentKeyword_5_2_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLLayerRule());
	        }
        }
	otherlv_13=RULE_ID
	{
		newLeafNode(otherlv_13, grammarAccess.getDCLLayerAccess().getComponentDCLStructureElementCrossReference_5_2_2_0()); 
	}

)
)))?	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleDCLComponent
entryRuleDCLComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLComponentRule()); }
	 iv_ruleDCLComponent=ruleDCLComponent 
	 { $current=$iv_ruleDCLComponent.current; } 
	 EOF 
;

// Rule DCLComponent
ruleDCLComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDCLComponentAccess().getComponentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)((	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0());
    }
	otherlv_3='inLayer: ' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLComponentRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
	}

)
))
    |(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0());
    }
	otherlv_6='inSubSystem: ' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLComponentRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
	}

)
)))?	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleDCLComponentInterface
entryRuleDCLComponentInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLComponentInterfaceRule()); }
	 iv_ruleDCLComponentInterface=ruleDCLComponentInterface 
	 { $current=$iv_ruleDCLComponentInterface.current; } 
	 EOF 
;

// Rule DCLComponentInterface
ruleDCLComponentInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='interface' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='ofComponent ' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
	}

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0());
    }
	otherlv_5='type: ' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
	    }
		lv_interfaceType_6_0=ruleInterfaceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCLComponentInterfaceRule());
	        }
       		set(
       			$current, 
       			"interfaceType",
        		lv_interfaceType_6_0, 
        		"InterfaceType");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleInterfaceType
entryRuleInterfaceType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInterfaceTypeRule()); }
	 iv_ruleInterfaceType=ruleInterfaceType 
	 { $current=$iv_ruleInterfaceType.current; } 
	 EOF 
;

// Rule InterfaceType
ruleInterfaceType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_interfaceTypeName_0_1=	'provided' 
    {
        newLeafNode(lv_interfaceTypeName_0_1, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInterfaceTypeRule());
	        }
       		setWithLastConsumed($current, "interfaceTypeName", lv_interfaceTypeName_0_1, null);
	    }

    |		lv_interfaceTypeName_0_2=	'required' 
    {
        newLeafNode(lv_interfaceTypeName_0_2, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInterfaceTypeRule());
	        }
       		setWithLastConsumed($current, "interfaceTypeName", lv_interfaceTypeName_0_2, null);
	    }

)

)
)
;





// Entry rule entryRuleDCLSubSystem
entryRuleDCLSubSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLSubSystemRule()); }
	 iv_ruleDCLSubSystem=ruleDCLSubSystem 
	 { $current=$iv_ruleDCLSubSystem.current; } 
	 EOF 
;

// Rule DCLSubSystem
ruleDCLSubSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='subSystem' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLSubSystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDCLSubSystemAccess().getCommaKeyword_2_0());
    }
	otherlv_3='inSubSystem: ' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDCLSubSystemAccess().getInSubSystemKeyword_2_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLSubSystemRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getDCLSubSystemAccess().getSubSystemDCLStructureElementCrossReference_2_2_0()); 
	}

)
))?	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleDCLModule
entryRuleDCLModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCLModuleRule()); }
	 iv_ruleDCLModule=ruleDCLModule 
	 { $current=$iv_ruleDCLModule.current; } 
	 EOF 
;

// Rule DCLModule
ruleDCLModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='module' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDCLModuleAccess().getModuleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCLModuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleDCDecl
entryRuleDCDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDCDeclRule()); }
	 iv_ruleDCDecl=ruleDCDecl 
	 { $current=$iv_ruleDCDecl.current; } 
	 EOF 
;

// Rule DCDecl
ruleDCDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
	    }
		lv_only_0_0=ruleOnly		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"only",
        		lv_only_0_0, 
        		"Only");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
	    }
		lv_can_2_0=ruleCan		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"can",
        		lv_can_2_0, 
        		"Can");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
	    }
		lv_elementType_3_0=ruleElementType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"elementType",
        		lv_elementType_3_0, 
        		"ElementType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
	}

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
    }
)
    |((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
	    }
		lv_cannot_7_0=ruleCannot		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"cannot",
        		lv_cannot_7_0, 
        		"Cannot");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
	    }
		lv_elementType_8_0=ruleElementType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"elementType",
        		lv_elementType_8_0, 
        		"ElementType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_9=RULE_ID
	{
		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
	}

)
)	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
    }
)
    |((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
	    }
		lv_can_12_0=ruleCan		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"can",
        		lv_can_12_0, 
        		"Can");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
	    }
		lv_elementType_13_0=ruleElementType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"elementType",
        		lv_elementType_13_0, 
        		"ElementType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
	    }
		lv_only2_14_0=ruleOnly2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"only2",
        		lv_only2_14_0, 
        		"Only2");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_15=RULE_ID
	{
		newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
	}

)
)	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5());
    }
)
    |((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_17=RULE_ID
	{
		newLeafNode(otherlv_17, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
	    }
		lv_must_18_0=ruleMust		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"must",
        		lv_must_18_0, 
        		"Must");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
	    }
		lv_entityType_19_0=ruleEntityType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDCDeclRule());
	        }
       		set(
       			$current, 
       			"entityType",
        		lv_entityType_19_0, 
        		"EntityType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDCDeclRule());
	        }
        }
	otherlv_20=RULE_ID
	{
		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
	}

)
)	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4());
    }
))
;





// Entry rule entryRuleOnly
entryRuleOnly returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOnlyRule()); }
	 iv_ruleOnly=ruleOnly 
	 { $current=$iv_ruleOnly.current; } 
	 EOF 
;

// Rule Only
ruleOnly returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_only_0_0=	'only' 
    {
        newLeafNode(lv_only_0_0, grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOnlyRule());
	        }
       		setWithLastConsumed($current, "only", lv_only_0_0, "only");
	    }

)
)
;





// Entry rule entryRuleCan
entryRuleCan returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCanRule()); }
	 iv_ruleCan=ruleCan 
	 { $current=$iv_ruleCan.current; } 
	 EOF 
;

// Rule Can
ruleCan returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_can_0_0=	'can-' 
    {
        newLeafNode(lv_can_0_0, grammarAccess.getCanAccess().getCanCanKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCanRule());
	        }
       		setWithLastConsumed($current, "can", lv_can_0_0, "can-");
	    }

)
)
;





// Entry rule entryRuleCannot
entryRuleCannot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCannotRule()); }
	 iv_ruleCannot=ruleCannot 
	 { $current=$iv_ruleCannot.current; } 
	 EOF 
;

// Rule Cannot
ruleCannot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_cannot_0_0=	'cannot-' 
    {
        newLeafNode(lv_cannot_0_0, grammarAccess.getCannotAccess().getCannotCannotKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCannotRule());
	        }
       		setWithLastConsumed($current, "cannot", lv_cannot_0_0, "cannot-");
	    }

)
)
;





// Entry rule entryRuleOnly2
entryRuleOnly2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOnly2Rule()); }
	 iv_ruleOnly2=ruleOnly2 
	 { $current=$iv_ruleOnly2.current; } 
	 EOF 
;

// Rule Only2
ruleOnly2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_only2_0_0=	'-only' 
    {
        newLeafNode(lv_only2_0_0, grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOnly2Rule());
	        }
       		setWithLastConsumed($current, "only2", lv_only2_0_0, "-only");
	    }

)
)
;





// Entry rule entryRuleMust
entryRuleMust returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMustRule()); }
	 iv_ruleMust=ruleMust 
	 { $current=$iv_ruleMust.current; } 
	 EOF 
;

// Rule Must
ruleMust returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_must_0_0=	'must-' 
    {
        newLeafNode(lv_must_0_0, grammarAccess.getMustAccess().getMustMustKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMustRule());
	        }
       		setWithLastConsumed($current, "must", lv_must_0_0, "must-");
	    }

)
)
;





// Entry rule entryRuleElementType
entryRuleElementType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementTypeRule()); }
	 iv_ruleElementType=ruleElementType 
	 { $current=$iv_ruleElementType.current; } 
	 EOF 
;

// Rule ElementType
ruleElementType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
    }
    this_BasicType_0=ruleBasicType
    { 
        $current = $this_BasicType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
    }
    this_EntityType_1=ruleEntityType
    { 
        $current = $this_EntityType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBasicType
entryRuleBasicType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	 iv_ruleBasicType=ruleBasicType 
	 { $current=$iv_ruleBasicType.current; } 
	 EOF 
;

// Rule BasicType
ruleBasicType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_typeName_0_1=	'access' 
    {
        newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicTypeRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_1, null);
	    }

    |		lv_typeName_0_2=	'declare' 
    {
        newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicTypeRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_2, null);
	    }

    |		lv_typeName_0_3=	'handle' 
    {
        newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicTypeRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_3, null);
	    }

    |		lv_typeName_0_4=	'create' 
    {
        newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicTypeRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_4, null);
	    }

    |		lv_typeName_0_5=	'depend' 
    {
        newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicTypeRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_5, null);
	    }

)

)
)
;





// Entry rule entryRuleEntityType
entryRuleEntityType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityTypeRule()); }
	 iv_ruleEntityType=ruleEntityType 
	 { $current=$iv_ruleEntityType.current; } 
	 EOF 
;

// Rule EntityType
ruleEntityType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_entity_0_1=	'extend' 
    {
        newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed($current, "entity", lv_entity_0_1, null);
	    }

    |		lv_entity_0_2=	'implement' 
    {
        newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed($current, "entity", lv_entity_0_2, null);
	    }

    |		lv_entity_0_3=	'derive' 
    {
        newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed($current, "entity", lv_entity_0_3, null);
	    }

    |		lv_entity_0_4=	'throw' 
    {
        newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed($current, "entity", lv_entity_0_4, null);
	    }

    |		lv_entity_0_5=	'useannotation' 
    {
        newLeafNode(lv_entity_0_5, grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityTypeRule());
	        }
       		setWithLastConsumed($current, "entity", lv_entity_0_5, null);
	    }

)

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


