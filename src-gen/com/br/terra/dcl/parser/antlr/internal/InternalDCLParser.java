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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "','", "'level'", "'inSubSystem: '", "';'", "'component'", "'inLayer: '", "'interface'", "'ofComponent '", "'type: '", "'provided'", "'required'", "'subSystem'", "'module'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDCLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_structureElements_2_0 = null;

        EObject lv_dCDecl_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:79:28: ( (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:3: otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:88:1: ( (lv_structureElements_2_0= ruleDCLStructureElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==20||LA1_0==22||(LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleDCLStructureElement )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:90:3: lv_structureElements_2_0= ruleDCLStructureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDCLStructureElement_in_ruleModel155);
            	    lv_structureElements_2_0=ruleDCLStructureElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structureElements",
            	            		lv_structureElements_2_0, 
            	            		"DCLStructureElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleModel168); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel180); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRestrictionsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleModel192); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:118:1: ( (lv_dCDecl_6_0= ruleDCDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:119:1: (lv_dCDecl_6_0= ruleDCDecl )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:120:3: lv_dCDecl_6_0= ruleDCDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDCDecl_in_ruleModel213);
            	    lv_dCDecl_6_0=ruleDCDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dCDecl",
            	            		lv_dCDecl_6_0, 
            	            		"DCDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleModel226); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDCLStructureElement"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:148:1: entryRuleDCLStructureElement returns [EObject current=null] : iv_ruleDCLStructureElement= ruleDCLStructureElement EOF ;
    public final EObject entryRuleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLStructureElement = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:149:2: (iv_ruleDCLStructureElement= ruleDCLStructureElement EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:150:2: iv_ruleDCLStructureElement= ruleDCLStructureElement EOF
            {
             newCompositeNode(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement262);
            iv_ruleDCLStructureElement=ruleDCLStructureElement();

            state._fsp--;

             current =iv_ruleDCLStructureElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLStructureElement272); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLStructureElement"


    // $ANTLR start "ruleDCLStructureElement"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:157:1: ruleDCLStructureElement returns [EObject current=null] : (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) ;
    public final EObject ruleDCLStructureElement() throws RecognitionException {
        EObject current = null;

        EObject this_DCLLayer_0 = null;

        EObject this_DCLComponent_1 = null;

        EObject this_DCLSubSystem_2 = null;

        EObject this_DCLModule_3 = null;

        EObject this_DCLComponentInterface_4 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:160:28: ( (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_DCLLayer_0= ruleDCLLayer | this_DCLComponent_1= ruleDCLComponent | this_DCLSubSystem_2= ruleDCLSubSystem | this_DCLModule_3= ruleDCLModule | this_DCLComponentInterface_4= ruleDCLComponentInterface )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:162:5: this_DCLLayer_0= ruleDCLLayer
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDCLLayer_in_ruleDCLStructureElement319);
                    this_DCLLayer_0=ruleDCLLayer();

                    state._fsp--;

                     
                            current = this_DCLLayer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:172:5: this_DCLComponent_1= ruleDCLComponent
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDCLComponent_in_ruleDCLStructureElement346);
                    this_DCLComponent_1=ruleDCLComponent();

                    state._fsp--;

                     
                            current = this_DCLComponent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:182:5: this_DCLSubSystem_2= ruleDCLSubSystem
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDCLSubSystem_in_ruleDCLStructureElement373);
                    this_DCLSubSystem_2=ruleDCLSubSystem();

                    state._fsp--;

                     
                            current = this_DCLSubSystem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:192:5: this_DCLModule_3= ruleDCLModule
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDCLModule_in_ruleDCLStructureElement400);
                    this_DCLModule_3=ruleDCLModule();

                    state._fsp--;

                     
                            current = this_DCLModule_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:202:5: this_DCLComponentInterface_4= ruleDCLComponentInterface
                    {
                     
                            newCompositeNode(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDCLComponentInterface_in_ruleDCLStructureElement427);
                    this_DCLComponentInterface_4=ruleDCLComponentInterface();

                    state._fsp--;

                     
                            current = this_DCLComponentInterface_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLStructureElement"


    // $ANTLR start "entryRuleDCLLayer"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:218:1: entryRuleDCLLayer returns [EObject current=null] : iv_ruleDCLLayer= ruleDCLLayer EOF ;
    public final EObject entryRuleDCLLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLLayer = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:219:2: (iv_ruleDCLLayer= ruleDCLLayer EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:220:2: iv_ruleDCLLayer= ruleDCLLayer EOF
            {
             newCompositeNode(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer462);
            iv_ruleDCLLayer=ruleDCLLayer();

            state._fsp--;

             current =iv_ruleDCLLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLLayer472); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLLayer"


    // $ANTLR start "ruleDCLLayer"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:227:1: ruleDCLLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleDCLLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_level_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:230:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'level' ( (lv_level_4_0= RULE_INT ) ) (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDCLLayer509); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLLayerAccess().getLayerKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:235:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:237:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer526); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer543); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLLayerAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDCLLayer555); 

                	newLeafNode(otherlv_3, grammarAccess.getDCLLayerAccess().getLevelKeyword_3());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:261:1: ( (lv_level_4_0= RULE_INT ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:262:1: (lv_level_4_0= RULE_INT )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:263:3: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDCLLayer572); 

            			newLeafNode(lv_level_4_0, grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"level",
                    		lv_level_4_0, 
                    		"INT");
            	    

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:2: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:279:4: otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCLLayer590); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDCLLayer602); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:287:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:288:1: (otherlv_7= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:289:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLLayerRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLLayer622); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDCLLayer636); 

                	newLeafNode(otherlv_8, grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLLayer"


    // $ANTLR start "entryRuleDCLComponent"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:312:1: entryRuleDCLComponent returns [EObject current=null] : iv_ruleDCLComponent= ruleDCLComponent EOF ;
    public final EObject entryRuleDCLComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponent = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:313:2: (iv_ruleDCLComponent= ruleDCLComponent EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:314:2: iv_ruleDCLComponent= ruleDCLComponent EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent672);
            iv_ruleDCLComponent=ruleDCLComponent();

            state._fsp--;

             current =iv_ruleDCLComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponent682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLComponent"


    // $ANTLR start "ruleDCLComponent"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:321:1: ruleDCLComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleDCLComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:324:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDCLComponent719); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentAccess().getComponentKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:330:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent736); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:347:2: ( (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18) ) {
                    alt5=2;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:347:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:347:3: (otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:347:5: otherlv_2= ',' otherlv_3= 'inLayer: ' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponent755); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDCLComponent767); 

                        	newLeafNode(otherlv_3, grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:355:1: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:356:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:356:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:357:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent787); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:6: (otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:369:8: otherlv_5= ',' otherlv_6= 'inSubSystem: ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponent807); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDCLComponent819); 

                        	newLeafNode(otherlv_6, grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:377:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:378:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:378:1: (otherlv_7= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:379:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCLComponentRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponent839); 

                    		newLeafNode(otherlv_7, grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDCLComponent854); 

                	newLeafNode(otherlv_8, grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLComponent"


    // $ANTLR start "entryRuleDCLComponentInterface"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:402:1: entryRuleDCLComponentInterface returns [EObject current=null] : iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF ;
    public final EObject entryRuleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLComponentInterface = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:403:2: (iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:404:2: iv_ruleDCLComponentInterface= ruleDCLComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface890);
            iv_ruleDCLComponentInterface=ruleDCLComponentInterface();

            state._fsp--;

             current =iv_ruleDCLComponentInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponentInterface900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLComponentInterface"


    // $ANTLR start "ruleDCLComponentInterface"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:411:1: ruleDCLComponentInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleDCLComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_interfaceType_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:414:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:415:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:415:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:415:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ofComponent ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDCLComponentInterface937); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:420:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:420:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponentInterface954); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDCLComponentInterface971); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:441:1: ( (otherlv_3= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:442:1: (otherlv_3= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:442:1: (otherlv_3= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:443:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLComponentInterface991); 

            		newLeafNode(otherlv_3, grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            	

            }


            }

            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:454:2: (otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:454:4: otherlv_4= ',' otherlv_5= 'type: ' ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            {
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDCLComponentInterface1004); 

                	newLeafNode(otherlv_4, grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleDCLComponentInterface1016); 

                	newLeafNode(otherlv_5, grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:462:1: ( (lv_interfaceType_6_0= ruleInterfaceType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:463:1: (lv_interfaceType_6_0= ruleInterfaceType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:463:1: (lv_interfaceType_6_0= ruleInterfaceType )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:464:3: lv_interfaceType_6_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceType_in_ruleDCLComponentInterface1037);
            lv_interfaceType_6_0=ruleInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDCLComponentInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"interfaceType",
                    		lv_interfaceType_6_0, 
                    		"InterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleDCLComponentInterface1050); 

                	newLeafNode(otherlv_7, grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLComponentInterface"


    // $ANTLR start "entryRuleInterfaceType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:492:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:493:2: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:494:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType1086);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;

             current =iv_ruleInterfaceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceType1096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:501:1: ruleInterfaceType returns [EObject current=null] : ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_interfaceTypeName_0_1=null;
        Token lv_interfaceTypeName_0_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:504:28: ( ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:505:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:505:1: ( ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:506:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:506:1: ( (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:507:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:507:1: (lv_interfaceTypeName_0_1= 'provided' | lv_interfaceTypeName_0_2= 'required' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:508:3: lv_interfaceTypeName_0_1= 'provided'
                    {
                    lv_interfaceTypeName_0_1=(Token)match(input,25,FOLLOW_25_in_ruleInterfaceType1140); 

                            newLeafNode(lv_interfaceTypeName_0_1, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:520:8: lv_interfaceTypeName_0_2= 'required'
                    {
                    lv_interfaceTypeName_0_2=(Token)match(input,26,FOLLOW_26_in_ruleInterfaceType1169); 

                            newLeafNode(lv_interfaceTypeName_0_2, grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceTypeRule());
                    	        }
                           		setWithLastConsumed(current, "interfaceTypeName", lv_interfaceTypeName_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleDCLSubSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:543:1: entryRuleDCLSubSystem returns [EObject current=null] : iv_ruleDCLSubSystem= ruleDCLSubSystem EOF ;
    public final EObject entryRuleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLSubSystem = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:544:2: (iv_ruleDCLSubSystem= ruleDCLSubSystem EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:545:2: iv_ruleDCLSubSystem= ruleDCLSubSystem EOF
            {
             newCompositeNode(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem1220);
            iv_ruleDCLSubSystem=ruleDCLSubSystem();

            state._fsp--;

             current =iv_ruleDCLSubSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSubSystem1230); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLSubSystem"


    // $ANTLR start "ruleDCLSubSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:552:1: ruleDCLSubSystem returns [EObject current=null] : (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDCLSubSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:555:28: ( (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:556:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:556:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:556:3: otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDCLSubSystem1267); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:560:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:561:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:561:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:562:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLSubSystem1284); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLSubSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDCLSubSystem1301); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLSubSystem"


    // $ANTLR start "entryRuleDCLModule"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:590:1: entryRuleDCLModule returns [EObject current=null] : iv_ruleDCLModule= ruleDCLModule EOF ;
    public final EObject entryRuleDCLModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCLModule = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:591:2: (iv_ruleDCLModule= ruleDCLModule EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:592:2: iv_ruleDCLModule= ruleDCLModule EOF
            {
             newCompositeNode(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_ruleDCLModule_in_entryRuleDCLModule1337);
            iv_ruleDCLModule=ruleDCLModule();

            state._fsp--;

             current =iv_ruleDCLModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLModule1347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCLModule"


    // $ANTLR start "ruleDCLModule"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:599:1: ruleDCLModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDCLModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:602:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:603:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:603:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:603:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDCLModule1384); 

                	newLeafNode(otherlv_0, grammarAccess.getDCLModuleAccess().getModuleKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:607:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:608:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:608:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCLModule1401); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDCLModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDCLModule1418); 

                	newLeafNode(otherlv_2, grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCLModule"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:637:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:638:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:639:2: iv_ruleDCDecl= ruleDCDecl EOF
            {
             newCompositeNode(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl1454);
            iv_ruleDCDecl=ruleDCDecl();

            state._fsp--;

             current =iv_ruleDCDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl1464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCDecl"


    // $ANTLR start "ruleDCDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:646:1: ruleDCDecl returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ;
    public final EObject ruleDCDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_only_0_0 = null;

        EObject lv_can_2_0 = null;

        EObject lv_elementType_3_0 = null;

        EObject lv_cannot_7_0 = null;

        EObject lv_elementType_8_0 = null;

        EObject lv_can_12_0 = null;

        EObject lv_elementType_13_0 = null;

        EObject lv_only2_14_0 = null;

        EObject lv_must_18_0 = null;

        EObject lv_entityType_19_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:649:28: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt7=3;
                    }
                    break;
                case 31:
                    {
                    alt7=2;
                    }
                    break;
                case 33:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:3: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:3: ( (lv_only_0_0= ruleOnly ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:651:1: (lv_only_0_0= ruleOnly )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:651:1: (lv_only_0_0= ruleOnly )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:652:3: lv_only_0_0= ruleOnly
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly_in_ruleDCDecl1511);
                    lv_only_0_0=ruleOnly();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only",
                            		lv_only_0_0, 
                            		"Only");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:669:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:669:1: (otherlv_1= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:670:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1531); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:681:2: ( (lv_can_2_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:682:1: (lv_can_2_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:682:1: (lv_can_2_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:683:3: lv_can_2_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1552);
                    lv_can_2_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_2_0, 
                            		"Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:699:2: ( (lv_elementType_3_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:700:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:700:1: (lv_elementType_3_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:701:3: lv_elementType_3_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1573);
                    lv_elementType_3_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_3_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:717:2: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:718:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:718:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:719:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1593); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDCDecl1605); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:7: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:7: ( (otherlv_6= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:736:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:736:1: (otherlv_6= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:737:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1633); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:748:2: ( (lv_cannot_7_0= ruleCannot ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:749:1: (lv_cannot_7_0= ruleCannot )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:749:1: (lv_cannot_7_0= ruleCannot )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:750:3: lv_cannot_7_0= ruleCannot
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCannot_in_ruleDCDecl1654);
                    lv_cannot_7_0=ruleCannot();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"cannot",
                            		lv_cannot_7_0, 
                            		"Cannot");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:766:2: ( (lv_elementType_8_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:767:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:767:1: (lv_elementType_8_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:768:3: lv_elementType_8_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1675);
                    lv_elementType_8_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_8_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:784:2: ( (otherlv_9= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:785:1: (otherlv_9= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:785:1: (otherlv_9= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:786:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1695); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleDCDecl1707); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:802:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:802:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:802:7: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:802:7: ( (otherlv_11= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:803:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:803:1: (otherlv_11= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:804:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1735); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:815:2: ( (lv_can_12_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:816:1: (lv_can_12_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:816:1: (lv_can_12_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:817:3: lv_can_12_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1756);
                    lv_can_12_0=ruleCan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"can",
                            		lv_can_12_0, 
                            		"Can");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:833:2: ( (lv_elementType_13_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:834:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:834:1: (lv_elementType_13_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:835:3: lv_elementType_13_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1777);
                    lv_elementType_13_0=ruleElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_13_0, 
                            		"ElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:851:2: ( (lv_only2_14_0= ruleOnly2 ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:852:1: (lv_only2_14_0= ruleOnly2 )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:852:1: (lv_only2_14_0= ruleOnly2 )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:853:3: lv_only2_14_0= ruleOnly2
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly2_in_ruleDCDecl1798);
                    lv_only2_14_0=ruleOnly2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"only2",
                            		lv_only2_14_0, 
                            		"Only2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:869:2: ( (otherlv_15= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:870:1: (otherlv_15= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:870:1: (otherlv_15= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:871:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1818); 

                    		newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
                    	

                    }


                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleDCDecl1830); 

                        	newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:887:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:887:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:887:7: ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:887:7: ( (otherlv_17= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:888:1: (otherlv_17= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:888:1: (otherlv_17= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:889:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1858); 

                    		newLeafNode(otherlv_17, grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:900:2: ( (lv_must_18_0= ruleMust ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:901:1: (lv_must_18_0= ruleMust )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:901:1: (lv_must_18_0= ruleMust )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:902:3: lv_must_18_0= ruleMust
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMust_in_ruleDCDecl1879);
                    lv_must_18_0=ruleMust();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"must",
                            		lv_must_18_0, 
                            		"Must");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:918:2: ( (lv_entityType_19_0= ruleEntityType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:919:1: (lv_entityType_19_0= ruleEntityType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:919:1: (lv_entityType_19_0= ruleEntityType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:920:3: lv_entityType_19_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleDCDecl1900);
                    lv_entityType_19_0=ruleEntityType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDCDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"entityType",
                            		lv_entityType_19_0, 
                            		"EntityType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:936:2: ( (otherlv_20= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:937:1: (otherlv_20= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:937:1: (otherlv_20= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:938:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1920); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleDCDecl1932); 

                        	newLeafNode(otherlv_21, grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCDecl"


    // $ANTLR start "entryRuleOnly"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:961:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:962:2: (iv_ruleOnly= ruleOnly EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:963:2: iv_ruleOnly= ruleOnly EOF
            {
             newCompositeNode(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly1969);
            iv_ruleOnly=ruleOnly();

            state._fsp--;

             current =iv_ruleOnly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly1979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:970:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:973:28: ( ( (lv_only_0_0= 'only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:974:1: ( (lv_only_0_0= 'only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:974:1: ( (lv_only_0_0= 'only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:975:1: (lv_only_0_0= 'only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:975:1: (lv_only_0_0= 'only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:976:3: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,29,FOLLOW_29_in_ruleOnly2021); 

                    newLeafNode(lv_only_0_0, grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnlyRule());
            	        }
                   		setWithLastConsumed(current, "only", lv_only_0_0, "only");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:997:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:998:2: (iv_ruleCan= ruleCan EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:999:2: iv_ruleCan= ruleCan EOF
            {
             newCompositeNode(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan2069);
            iv_ruleCan=ruleCan();

            state._fsp--;

             current =iv_ruleCan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan2079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1006:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1009:28: ( ( (lv_can_0_0= 'can-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1010:1: ( (lv_can_0_0= 'can-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1010:1: ( (lv_can_0_0= 'can-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1011:1: (lv_can_0_0= 'can-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1011:1: (lv_can_0_0= 'can-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1012:3: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,30,FOLLOW_30_in_ruleCan2121); 

                    newLeafNode(lv_can_0_0, grammarAccess.getCanAccess().getCanCanKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCanRule());
            	        }
                   		setWithLastConsumed(current, "can", lv_can_0_0, "can-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1033:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1034:2: (iv_ruleCannot= ruleCannot EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1035:2: iv_ruleCannot= ruleCannot EOF
            {
             newCompositeNode(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot2169);
            iv_ruleCannot=ruleCannot();

            state._fsp--;

             current =iv_ruleCannot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot2179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1042:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1045:28: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1046:1: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1046:1: ( (lv_cannot_0_0= 'cannot-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1047:1: (lv_cannot_0_0= 'cannot-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1047:1: (lv_cannot_0_0= 'cannot-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1048:3: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,31,FOLLOW_31_in_ruleCannot2221); 

                    newLeafNode(lv_cannot_0_0, grammarAccess.getCannotAccess().getCannotCannotKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCannotRule());
            	        }
                   		setWithLastConsumed(current, "cannot", lv_cannot_0_0, "cannot-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1069:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1070:2: (iv_ruleOnly2= ruleOnly2 EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1071:2: iv_ruleOnly2= ruleOnly2 EOF
            {
             newCompositeNode(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly22269);
            iv_ruleOnly2=ruleOnly2();

            state._fsp--;

             current =iv_ruleOnly2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly22279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1078:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1081:28: ( ( (lv_only2_0_0= '-only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1082:1: ( (lv_only2_0_0= '-only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1082:1: ( (lv_only2_0_0= '-only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1083:1: (lv_only2_0_0= '-only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1083:1: (lv_only2_0_0= '-only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1084:3: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,32,FOLLOW_32_in_ruleOnly22321); 

                    newLeafNode(lv_only2_0_0, grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnly2Rule());
            	        }
                   		setWithLastConsumed(current, "only2", lv_only2_0_0, "-only");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1105:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1106:2: (iv_ruleMust= ruleMust EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1107:2: iv_ruleMust= ruleMust EOF
            {
             newCompositeNode(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust2369);
            iv_ruleMust=ruleMust();

            state._fsp--;

             current =iv_ruleMust; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust2379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1114:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1117:28: ( ( (lv_must_0_0= 'must-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1118:1: ( (lv_must_0_0= 'must-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1118:1: ( (lv_must_0_0= 'must-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1119:1: (lv_must_0_0= 'must-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1119:1: (lv_must_0_0= 'must-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1120:3: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,33,FOLLOW_33_in_ruleMust2421); 

                    newLeafNode(lv_must_0_0, grammarAccess.getMustAccess().getMustMustKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMustRule());
            	        }
                   		setWithLastConsumed(current, "must", lv_must_0_0, "must-");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1141:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1142:2: (iv_ruleElementType= ruleElementType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1143:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType2469);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType2479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1150:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1153:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1154:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1154:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=34 && LA8_0<=38)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=39 && LA8_0<=43)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1155:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleElementType2526);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1165:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleElementType2553);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1181:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1182:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1183:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2588);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1190:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1193:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1194:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1194:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1195:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1195:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1196:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1196:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 37:
                {
                alt9=4;
                }
                break;
            case 38:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1197:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicType2642); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1209:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,35,FOLLOW_35_in_ruleBasicType2671); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1221:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,36,FOLLOW_36_in_ruleBasicType2700); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1233:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,37,FOLLOW_37_in_ruleBasicType2729); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1245:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,38,FOLLOW_38_in_ruleBasicType2758); 

                            newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1268:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1269:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1270:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType2809);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType2819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1277:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1280:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1281:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1281:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1282:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1282:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1283:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1283:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'useannotation' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1284:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,39,FOLLOW_39_in_ruleEntityType2863); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1296:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,40,FOLLOW_40_in_ruleEntityType2892); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1308:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,41,FOLLOW_41_in_ruleEntityType2921); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1320:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,42,FOLLOW_42_in_ruleEntityType2950); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1332:8: lv_entity_0_5= 'useannotation'
                    {
                    lv_entity_0_5=(Token)match(input,43,FOLLOW_43_in_ruleEntityType2979); 

                            newLeafNode(lv_entity_0_5, grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000018508000L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_ruleModel155 = new BitSet(new long[]{0x000000001850A000L});
    public static final BitSet FOLLOW_13_in_ruleModel168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel192 = new BitSet(new long[]{0x0000000020002010L});
    public static final BitSet FOLLOW_ruleDCDecl_in_ruleModel213 = new BitSet(new long[]{0x0000000020002010L});
    public static final BitSet FOLLOW_13_in_ruleModel226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLStructureElement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_ruleDCLStructureElement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_ruleDCLStructureElement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_ruleDCLStructureElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_ruleDCLStructureElement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_ruleDCLStructureElement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLLayer472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDCLLayer509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDCLLayer555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDCLLayer572 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleDCLLayer590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDCLLayer602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLLayer622 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLLayer636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponent682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDCLComponent719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent736 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponent755 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDCLComponent767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent787 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponent807 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDCLComponent819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponent839 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLComponent854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponentInterface900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDCLComponentInterface937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponentInterface954 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDCLComponentInterface971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLComponentInterface991 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCLComponentInterface1004 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDCLComponentInterface1016 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleDCLComponentInterface1037 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLComponentInterface1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceType1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInterfaceType1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInterfaceType1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSubSystem1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDCLSubSystem1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLSubSystem1284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLSubSystem1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_entryRuleDCLModule1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLModule1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDCLModule1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCLModule1401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCLModule1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_ruleDCDecl1511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1531 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1552 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1593 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCDecl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1633 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleCannot_in_ruleDCDecl1654 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1695 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCDecl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1735 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1756 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1777 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOnly2_in_ruleDCDecl1798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCDecl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1858 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleMust_in_ruleDCDecl1879 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleDCDecl1900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1920 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDCDecl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOnly2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan2069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCan2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCannot2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly22269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly22279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOnly22321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust2369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMust2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleElementType2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBasicType2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBasicType2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBasicType2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBasicType2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntityType2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntityType2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEntityType2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntityType2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntityType2979 = new BitSet(new long[]{0x0000000000000002L});

}