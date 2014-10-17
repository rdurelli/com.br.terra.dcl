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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "';'", "'component'", "'subSystem'", "'architectureView'", "'softwareSystem'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'annotated'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:79:28: ( (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:3: otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_structureElements_2_0= ruleStructureElement ) )+ otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:88:1: ( (lv_structureElements_2_0= ruleStructureElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleStructureElement )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_structureElements_2_0= ruleStructureElement )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:90:3: lv_structureElements_2_0= ruleStructureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStructureElementsStructureElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureElement_in_ruleModel155);
            	    lv_structureElements_2_0=ruleStructureElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structureElements",
            	            		lv_structureElements_2_0, 
            	            		"StructureElement");
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

                if ( (LA2_0==RULE_ID||LA2_0==21) ) {
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


    // $ANTLR start "entryRuleStructureElement"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:148:1: entryRuleStructureElement returns [EObject current=null] : iv_ruleStructureElement= ruleStructureElement EOF ;
    public final EObject entryRuleStructureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureElement = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:149:2: (iv_ruleStructureElement= ruleStructureElement EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:150:2: iv_ruleStructureElement= ruleStructureElement EOF
            {
             newCompositeNode(grammarAccess.getStructureElementRule()); 
            pushFollow(FOLLOW_ruleStructureElement_in_entryRuleStructureElement262);
            iv_ruleStructureElement=ruleStructureElement();

            state._fsp--;

             current =iv_ruleStructureElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureElement272); 

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
    // $ANTLR end "entryRuleStructureElement"


    // $ANTLR start "ruleStructureElement"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:157:1: ruleStructureElement returns [EObject current=null] : (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_SubSystem_2= ruleSubSystem | this_ArchitectureView_3= ruleArchitectureView | this_SoftwareSystem_4= ruleSoftwareSystem ) ;
    public final EObject ruleStructureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Layer_0 = null;

        EObject this_Component_1 = null;

        EObject this_SubSystem_2 = null;

        EObject this_ArchitectureView_3 = null;

        EObject this_SoftwareSystem_4 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:160:28: ( (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_SubSystem_2= ruleSubSystem | this_ArchitectureView_3= ruleArchitectureView | this_SoftwareSystem_4= ruleSoftwareSystem ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_SubSystem_2= ruleSubSystem | this_ArchitectureView_3= ruleArchitectureView | this_SoftwareSystem_4= ruleSoftwareSystem )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_SubSystem_2= ruleSubSystem | this_ArchitectureView_3= ruleArchitectureView | this_SoftwareSystem_4= ruleSoftwareSystem )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:162:5: this_Layer_0= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getStructureElementAccess().getLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLayer_in_ruleStructureElement319);
                    this_Layer_0=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:172:5: this_Component_1= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getStructureElementAccess().getComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleStructureElement346);
                    this_Component_1=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:182:5: this_SubSystem_2= ruleSubSystem
                    {
                     
                            newCompositeNode(grammarAccess.getStructureElementAccess().getSubSystemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSubSystem_in_ruleStructureElement373);
                    this_SubSystem_2=ruleSubSystem();

                    state._fsp--;

                     
                            current = this_SubSystem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:192:5: this_ArchitectureView_3= ruleArchitectureView
                    {
                     
                            newCompositeNode(grammarAccess.getStructureElementAccess().getArchitectureViewParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArchitectureView_in_ruleStructureElement400);
                    this_ArchitectureView_3=ruleArchitectureView();

                    state._fsp--;

                     
                            current = this_ArchitectureView_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:202:5: this_SoftwareSystem_4= ruleSoftwareSystem
                    {
                     
                            newCompositeNode(grammarAccess.getStructureElementAccess().getSoftwareSystemParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSoftwareSystem_in_ruleStructureElement427);
                    this_SoftwareSystem_4=ruleSoftwareSystem();

                    state._fsp--;

                     
                            current = this_SoftwareSystem_4; 
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
    // $ANTLR end "ruleStructureElement"


    // $ANTLR start "entryRuleLayer"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:218:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:219:2: (iv_ruleLayer= ruleLayer EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:220:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer462);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer472); 

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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:227:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:230:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:231:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleLayer509); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:235:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:236:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:237:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer526); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleLayer543); 

                	newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleComponent"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:265:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:266:2: (iv_ruleComponent= ruleComponent EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:267:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent579);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent589); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:274:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:277:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:278:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:278:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:278:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleComponent626); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:282:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:283:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:283:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:284:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent643); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleComponent660); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSubSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:312:1: entryRuleSubSystem returns [EObject current=null] : iv_ruleSubSystem= ruleSubSystem EOF ;
    public final EObject entryRuleSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSystem = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:313:2: (iv_ruleSubSystem= ruleSubSystem EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:314:2: iv_ruleSubSystem= ruleSubSystem EOF
            {
             newCompositeNode(grammarAccess.getSubSystemRule()); 
            pushFollow(FOLLOW_ruleSubSystem_in_entryRuleSubSystem696);
            iv_ruleSubSystem=ruleSubSystem();

            state._fsp--;

             current =iv_ruleSubSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSystem706); 

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
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:321:1: ruleSubSystem returns [EObject current=null] : (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleSubSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:324:28: ( (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:1: (otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:325:3: otherlv_0= 'subSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSubSystem743); 

                	newLeafNode(otherlv_0, grammarAccess.getSubSystemAccess().getSubSystemKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:330:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSystem760); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSubSystem777); 

                	newLeafNode(otherlv_2, grammarAccess.getSubSystemAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleArchitectureView"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:359:1: entryRuleArchitectureView returns [EObject current=null] : iv_ruleArchitectureView= ruleArchitectureView EOF ;
    public final EObject entryRuleArchitectureView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureView = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:360:2: (iv_ruleArchitectureView= ruleArchitectureView EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:361:2: iv_ruleArchitectureView= ruleArchitectureView EOF
            {
             newCompositeNode(grammarAccess.getArchitectureViewRule()); 
            pushFollow(FOLLOW_ruleArchitectureView_in_entryRuleArchitectureView813);
            iv_ruleArchitectureView=ruleArchitectureView();

            state._fsp--;

             current =iv_ruleArchitectureView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureView823); 

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
    // $ANTLR end "entryRuleArchitectureView"


    // $ANTLR start "ruleArchitectureView"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:368:1: ruleArchitectureView returns [EObject current=null] : (otherlv_0= 'architectureView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleArchitectureView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:371:28: ( (otherlv_0= 'architectureView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:372:1: (otherlv_0= 'architectureView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:372:1: (otherlv_0= 'architectureView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:372:3: otherlv_0= 'architectureView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleArchitectureView860); 

                	newLeafNode(otherlv_0, grammarAccess.getArchitectureViewAccess().getArchitectureViewKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:376:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:377:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:377:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:378:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArchitectureView877); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArchitectureViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArchitectureViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleArchitectureView894); 

                	newLeafNode(otherlv_2, grammarAccess.getArchitectureViewAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleArchitectureView"


    // $ANTLR start "entryRuleSoftwareSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:406:1: entryRuleSoftwareSystem returns [EObject current=null] : iv_ruleSoftwareSystem= ruleSoftwareSystem EOF ;
    public final EObject entryRuleSoftwareSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareSystem = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:407:2: (iv_ruleSoftwareSystem= ruleSoftwareSystem EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:408:2: iv_ruleSoftwareSystem= ruleSoftwareSystem EOF
            {
             newCompositeNode(grammarAccess.getSoftwareSystemRule()); 
            pushFollow(FOLLOW_ruleSoftwareSystem_in_entryRuleSoftwareSystem930);
            iv_ruleSoftwareSystem=ruleSoftwareSystem();

            state._fsp--;

             current =iv_ruleSoftwareSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftwareSystem940); 

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
    // $ANTLR end "entryRuleSoftwareSystem"


    // $ANTLR start "ruleSoftwareSystem"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:415:1: ruleSoftwareSystem returns [EObject current=null] : (otherlv_0= 'softwareSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleSoftwareSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:418:28: ( (otherlv_0= 'softwareSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:419:1: (otherlv_0= 'softwareSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:419:1: (otherlv_0= 'softwareSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:419:3: otherlv_0= 'softwareSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSoftwareSystem977); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftwareSystemAccess().getSoftwareSystemKeyword_0());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:424:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:424:1: (lv_name_1_0= RULE_ID )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftwareSystem994); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSoftwareSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSoftwareSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSoftwareSystem1011); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftwareSystemAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleSoftwareSystem"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:453:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:454:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:455:2: iv_ruleDCDecl= ruleDCDecl EOF
            {
             newCompositeNode(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl1047);
            iv_ruleDCDecl=ruleDCDecl();

            state._fsp--;

             current =iv_ruleDCDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl1057); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:462:1: ruleDCDecl returns [EObject current=null] : ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ;
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
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:465:28: ( ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:1: ( ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=4;
                    }
                    break;
                case 23:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:2: ( ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:3: ( (lv_only_0_0= ruleOnly ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_can_2_0= ruleCan ) ) ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:3: ( (lv_only_0_0= ruleOnly ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:467:1: (lv_only_0_0= ruleOnly )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:467:1: (lv_only_0_0= ruleOnly )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:468:3: lv_only_0_0= ruleOnly
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly_in_ruleDCDecl1104);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:484:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:485:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:485:1: (otherlv_1= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:486:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1124); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTStructureElementCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:497:2: ( (lv_can_2_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:498:1: (lv_can_2_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:498:1: (lv_can_2_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:499:3: lv_can_2_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1145);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:515:2: ( (lv_elementType_3_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:516:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:516:1: (lv_elementType_3_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:517:3: lv_elementType_3_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1166);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:533:2: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:534:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:534:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:535:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1186); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeStructureElementCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl1198); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:6: ( ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:7: ( (otherlv_6= RULE_ID ) ) ( (lv_cannot_7_0= ruleCannot ) ) ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:551:7: ( (otherlv_6= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:552:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:552:1: (otherlv_6= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:553:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1226); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTStructureElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:564:2: ( (lv_cannot_7_0= ruleCannot ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:565:1: (lv_cannot_7_0= ruleCannot )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:565:1: (lv_cannot_7_0= ruleCannot )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:566:3: lv_cannot_7_0= ruleCannot
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCannot_in_ruleDCDecl1247);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:582:2: ( (lv_elementType_8_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:583:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:583:1: (lv_elementType_8_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:584:3: lv_elementType_8_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1268);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:600:2: ( (otherlv_9= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:601:1: (otherlv_9= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:601:1: (otherlv_9= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:602:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1288); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeStructureElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl1300); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:618:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:618:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:618:7: ( (otherlv_11= RULE_ID ) ) ( (lv_can_12_0= ruleCan ) ) ( (lv_elementType_13_0= ruleElementType ) ) ( (lv_only2_14_0= ruleOnly2 ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:618:7: ( (otherlv_11= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:619:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:619:1: (otherlv_11= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:620:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1328); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTStructureElementCrossReference_2_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:631:2: ( (lv_can_12_0= ruleCan ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:632:1: (lv_can_12_0= ruleCan )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:632:1: (lv_can_12_0= ruleCan )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:633:3: lv_can_12_0= ruleCan
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCan_in_ruleDCDecl1349);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:649:2: ( (lv_elementType_13_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:650:1: (lv_elementType_13_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:651:3: lv_elementType_13_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl1370);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:667:2: ( (lv_only2_14_0= ruleOnly2 ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:1: (lv_only2_14_0= ruleOnly2 )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:668:1: (lv_only2_14_0= ruleOnly2 )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:669:3: lv_only2_14_0= ruleOnly2
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnly2_in_ruleDCDecl1391);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:685:2: ( (otherlv_15= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:686:1: (otherlv_15= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:686:1: (otherlv_15= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:687:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1411); 

                    		newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getTypeStructureElementCrossReference_2_4_0()); 
                    	

                    }


                    }

                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl1423); 

                        	newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:703:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:703:6: ( ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:703:7: ( (otherlv_17= RULE_ID ) ) ( (lv_must_18_0= ruleMust ) ) ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:703:7: ( (otherlv_17= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:704:1: (otherlv_17= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:704:1: (otherlv_17= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:705:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1451); 

                    		newLeafNode(otherlv_17, grammarAccess.getDCDeclAccess().getTStructureElementCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:716:2: ( (lv_must_18_0= ruleMust ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:717:1: (lv_must_18_0= ruleMust )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:717:1: (lv_must_18_0= ruleMust )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:718:3: lv_must_18_0= ruleMust
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMust_in_ruleDCDecl1472);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:734:2: ( (lv_entityType_19_0= ruleEntityType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:1: (lv_entityType_19_0= ruleEntityType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:735:1: (lv_entityType_19_0= ruleEntityType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:736:3: lv_entityType_19_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleDCDecl1493);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:752:2: ( (otherlv_20= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:753:1: (otherlv_20= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:753:1: (otherlv_20= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:754:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1513); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeStructureElementCrossReference_3_3_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl1525); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:777:1: entryRuleOnly returns [EObject current=null] : iv_ruleOnly= ruleOnly EOF ;
    public final EObject entryRuleOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:778:2: (iv_ruleOnly= ruleOnly EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:779:2: iv_ruleOnly= ruleOnly EOF
            {
             newCompositeNode(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly1562);
            iv_ruleOnly=ruleOnly();

            state._fsp--;

             current =iv_ruleOnly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly1572); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:786:1: ruleOnly returns [EObject current=null] : ( (lv_only_0_0= 'only' ) ) ;
    public final EObject ruleOnly() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:789:28: ( ( (lv_only_0_0= 'only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:790:1: ( (lv_only_0_0= 'only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:790:1: ( (lv_only_0_0= 'only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:791:1: (lv_only_0_0= 'only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:791:1: (lv_only_0_0= 'only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:792:3: lv_only_0_0= 'only'
            {
            lv_only_0_0=(Token)match(input,21,FOLLOW_21_in_ruleOnly1614); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:813:1: entryRuleCan returns [EObject current=null] : iv_ruleCan= ruleCan EOF ;
    public final EObject entryRuleCan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCan = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:814:2: (iv_ruleCan= ruleCan EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:815:2: iv_ruleCan= ruleCan EOF
            {
             newCompositeNode(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan1662);
            iv_ruleCan=ruleCan();

            state._fsp--;

             current =iv_ruleCan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan1672); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:822:1: ruleCan returns [EObject current=null] : ( (lv_can_0_0= 'can-' ) ) ;
    public final EObject ruleCan() throws RecognitionException {
        EObject current = null;

        Token lv_can_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:825:28: ( ( (lv_can_0_0= 'can-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:826:1: ( (lv_can_0_0= 'can-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:826:1: ( (lv_can_0_0= 'can-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:827:1: (lv_can_0_0= 'can-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:827:1: (lv_can_0_0= 'can-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:828:3: lv_can_0_0= 'can-'
            {
            lv_can_0_0=(Token)match(input,22,FOLLOW_22_in_ruleCan1714); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:849:1: entryRuleCannot returns [EObject current=null] : iv_ruleCannot= ruleCannot EOF ;
    public final EObject entryRuleCannot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCannot = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:850:2: (iv_ruleCannot= ruleCannot EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:851:2: iv_ruleCannot= ruleCannot EOF
            {
             newCompositeNode(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot1762);
            iv_ruleCannot=ruleCannot();

            state._fsp--;

             current =iv_ruleCannot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot1772); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:858:1: ruleCannot returns [EObject current=null] : ( (lv_cannot_0_0= 'cannot-' ) ) ;
    public final EObject ruleCannot() throws RecognitionException {
        EObject current = null;

        Token lv_cannot_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:861:28: ( ( (lv_cannot_0_0= 'cannot-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:862:1: ( (lv_cannot_0_0= 'cannot-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:862:1: ( (lv_cannot_0_0= 'cannot-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:863:1: (lv_cannot_0_0= 'cannot-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:863:1: (lv_cannot_0_0= 'cannot-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:864:3: lv_cannot_0_0= 'cannot-'
            {
            lv_cannot_0_0=(Token)match(input,23,FOLLOW_23_in_ruleCannot1814); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:885:1: entryRuleOnly2 returns [EObject current=null] : iv_ruleOnly2= ruleOnly2 EOF ;
    public final EObject entryRuleOnly2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnly2 = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:886:2: (iv_ruleOnly2= ruleOnly2 EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:887:2: iv_ruleOnly2= ruleOnly2 EOF
            {
             newCompositeNode(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly21862);
            iv_ruleOnly2=ruleOnly2();

            state._fsp--;

             current =iv_ruleOnly2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly21872); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:894:1: ruleOnly2 returns [EObject current=null] : ( (lv_only2_0_0= '-only' ) ) ;
    public final EObject ruleOnly2() throws RecognitionException {
        EObject current = null;

        Token lv_only2_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:897:28: ( ( (lv_only2_0_0= '-only' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:898:1: ( (lv_only2_0_0= '-only' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:898:1: ( (lv_only2_0_0= '-only' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:899:1: (lv_only2_0_0= '-only' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:899:1: (lv_only2_0_0= '-only' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:900:3: lv_only2_0_0= '-only'
            {
            lv_only2_0_0=(Token)match(input,24,FOLLOW_24_in_ruleOnly21914); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:921:1: entryRuleMust returns [EObject current=null] : iv_ruleMust= ruleMust EOF ;
    public final EObject entryRuleMust() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMust = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:922:2: (iv_ruleMust= ruleMust EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:923:2: iv_ruleMust= ruleMust EOF
            {
             newCompositeNode(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust1962);
            iv_ruleMust=ruleMust();

            state._fsp--;

             current =iv_ruleMust; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust1972); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:930:1: ruleMust returns [EObject current=null] : ( (lv_must_0_0= 'must-' ) ) ;
    public final EObject ruleMust() throws RecognitionException {
        EObject current = null;

        Token lv_must_0_0=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:933:28: ( ( (lv_must_0_0= 'must-' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:934:1: ( (lv_must_0_0= 'must-' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:934:1: ( (lv_must_0_0= 'must-' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:935:1: (lv_must_0_0= 'must-' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:935:1: (lv_must_0_0= 'must-' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:936:3: lv_must_0_0= 'must-'
            {
            lv_must_0_0=(Token)match(input,25,FOLLOW_25_in_ruleMust2014); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:957:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:958:2: (iv_ruleElementType= ruleElementType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:959:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType2062);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType2072); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:966:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:969:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:970:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:970:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=30)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=31 && LA5_0<=35)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:971:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleElementType2119);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:981:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleElementType2146);
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:997:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:998:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:999:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType2181);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType2191); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1006:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1009:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1010:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1010:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1011:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1011:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1012:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1012:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1013:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,26,FOLLOW_26_in_ruleBasicType2235); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1025:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,27,FOLLOW_27_in_ruleBasicType2264); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1037:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,28,FOLLOW_28_in_ruleBasicType2293); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1049:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,29,FOLLOW_29_in_ruleBasicType2322); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1061:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,30,FOLLOW_30_in_ruleBasicType2351); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1084:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1085:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1086:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType2402);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType2412); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1093:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1096:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1097:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1097:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1098:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1098:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1099:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1099:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1100:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,31,FOLLOW_31_in_ruleEntityType2456); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1112:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,32,FOLLOW_32_in_ruleEntityType2485); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1124:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,33,FOLLOW_33_in_ruleEntityType2514); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1136:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,34,FOLLOW_34_in_ruleEntityType2543); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:1148:8: lv_entity_0_5= 'annotated'
                    {
                    lv_entity_0_5=(Token)match(input,35,FOLLOW_35_in_ruleEntityType2572); 

                            newLeafNode(lv_entity_0_5, grammarAccess.getEntityTypeAccess().getEntityAnnotatedKeyword_0_4());
                        

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
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_ruleStructureElement_in_ruleModel155 = new BitSet(new long[]{0x00000000001EA000L});
    public static final BitSet FOLLOW_13_in_ruleModel168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel192 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_ruleDCDecl_in_ruleModel213 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_13_in_ruleModel226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElement_in_entryRuleStructureElement262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureElement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleStructureElement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleStructureElement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_ruleStructureElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureView_in_ruleStructureElement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftwareSystem_in_ruleStructureElement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLayer509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLayer543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponent626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent643 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponent660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_entryRuleSubSystem696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSystem706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSubSystem743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSystem760 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubSystem777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureView_in_entryRuleArchitectureView813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureView823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleArchitectureView860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArchitectureView877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArchitectureView894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftwareSystem_in_entryRuleSoftwareSystem930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftwareSystem940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSoftwareSystem977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftwareSystem994 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSoftwareSystem1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_ruleDCDecl1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1124 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1145 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1186 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleCannot_in_ruleDCDecl1247 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1288 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1328 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleCan_in_ruleDCDecl1349 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl1370 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOnly2_in_ruleDCDecl1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1411 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1451 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleMust_in_ruleDCDecl1472 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleDCDecl1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOnly1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCan1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCannot1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly21862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly21872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOnly21914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMust2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleElementType2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBasicType2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBasicType2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBasicType2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBasicType2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBasicType2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntityType2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEntityType2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEntityType2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEntityType2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntityType2572 = new BitSet(new long[]{0x0000000000000002L});

}