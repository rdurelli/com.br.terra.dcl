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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "';'", "'component'", "'subSystem'", "'architectureView'", "'softwareSystem'", "'Only'", "'can-'", "'cannot-'", "'-only'", "'must-'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'annotated'"
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_modDecl_2_0= ruleModDecl ) )* otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_modDecl_2_0 = null;

        EObject lv_dCDecl_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:79:28: ( (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_modDecl_2_0= ruleModDecl ) )* otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_modDecl_2_0= ruleModDecl ) )* otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:1: (otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_modDecl_2_0= ruleModDecl ) )* otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}' )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:80:3: otherlv_0= 'architeturalElements' otherlv_1= '{' ( (lv_modDecl_2_0= ruleModDecl ) )* otherlv_3= '}' otherlv_4= 'restrictions' otherlv_5= '{' ( (lv_dCDecl_6_0= ruleDCDecl ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:88:1: ( (lv_modDecl_2_0= ruleModDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_modDecl_2_0= ruleModDecl )
            	    {
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:89:1: (lv_modDecl_2_0= ruleModDecl )
            	    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:90:3: lv_modDecl_2_0= ruleModDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getModDeclModDeclParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModDecl_in_ruleModel155);
            	    lv_modDecl_2_0=ruleModDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modDecl",
            	            		lv_modDecl_2_0, 
            	            		"ModDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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


    // $ANTLR start "entryRuleModDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:148:1: entryRuleModDecl returns [EObject current=null] : iv_ruleModDecl= ruleModDecl EOF ;
    public final EObject entryRuleModDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModDecl = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:149:2: (iv_ruleModDecl= ruleModDecl EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:150:2: iv_ruleModDecl= ruleModDecl EOF
            {
             newCompositeNode(grammarAccess.getModDeclRule()); 
            pushFollow(FOLLOW_ruleModDecl_in_entryRuleModDecl262);
            iv_ruleModDecl=ruleModDecl();

            state._fsp--;

             current =iv_ruleModDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModDecl272); 

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
    // $ANTLR end "entryRuleModDecl"


    // $ANTLR start "ruleModDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:157:1: ruleModDecl returns [EObject current=null] : ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) | (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' ) ) ;
    public final EObject ruleModDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:160:28: ( ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) | (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) | (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:1: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) | (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) | (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' ) )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:161:4: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModDecl310); 

                        	newLeafNode(otherlv_0, grammarAccess.getModDeclAccess().getLayerKeyword_0_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:165:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:166:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:166:1: (lv_name_1_0= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:167:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModDecl327); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleModDecl344); 

                        	newLeafNode(otherlv_2, grammarAccess.getModDeclAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:188:6: (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:188:6: (otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:188:8: otherlv_3= 'component' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleModDecl364); 

                        	newLeafNode(otherlv_3, grammarAccess.getModDeclAccess().getComponentKeyword_1_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:192:1: ( (lv_name_4_0= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:193:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:193:1: (lv_name_4_0= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:194:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModDecl381); 

                    			newLeafNode(lv_name_4_0, grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleModDecl398); 

                        	newLeafNode(otherlv_5, grammarAccess.getModDeclAccess().getSemicolonKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:215:6: (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:215:6: (otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:215:8: otherlv_6= 'subSystem' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleModDecl418); 

                        	newLeafNode(otherlv_6, grammarAccess.getModDeclAccess().getSubSystemKeyword_2_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:219:1: ( (lv_name_7_0= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:220:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:220:1: (lv_name_7_0= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:221:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModDecl435); 

                    			newLeafNode(lv_name_7_0, grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleModDecl452); 

                        	newLeafNode(otherlv_8, grammarAccess.getModDeclAccess().getSemicolonKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:242:6: (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:242:6: (otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:242:8: otherlv_9= 'architectureView' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleModDecl472); 

                        	newLeafNode(otherlv_9, grammarAccess.getModDeclAccess().getArchitectureViewKeyword_3_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:246:1: ( (lv_name_10_0= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:247:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:247:1: (lv_name_10_0= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:248:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModDecl489); 

                    			newLeafNode(lv_name_10_0, grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleModDecl506); 

                        	newLeafNode(otherlv_11, grammarAccess.getModDeclAccess().getSemicolonKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:269:6: (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:269:6: (otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:269:8: otherlv_12= 'softwareSystem' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ';'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleModDecl526); 

                        	newLeafNode(otherlv_12, grammarAccess.getModDeclAccess().getSoftwareSystemKeyword_4_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:273:1: ( (lv_name_13_0= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:274:1: (lv_name_13_0= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:274:1: (lv_name_13_0= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:275:3: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModDecl543); 

                    			newLeafNode(lv_name_13_0, grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_13_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleModDecl560); 

                        	newLeafNode(otherlv_14, grammarAccess.getModDeclAccess().getSemicolonKeyword_4_2());
                        

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
    // $ANTLR end "ruleModDecl"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:303:1: entryRuleDCDecl returns [EObject current=null] : iv_ruleDCDecl= ruleDCDecl EOF ;
    public final EObject entryRuleDCDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCDecl = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:304:2: (iv_ruleDCDecl= ruleDCDecl EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:305:2: iv_ruleDCDecl= ruleDCDecl EOF
            {
             newCompositeNode(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl597);
            iv_ruleDCDecl=ruleDCDecl();

            state._fsp--;

             current =iv_ruleDCDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl607); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:312:1: ruleDCDecl returns [EObject current=null] : ( (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ;
    public final EObject ruleDCDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_elementType_3_0 = null;

        EObject lv_elementType_8_0 = null;

        EObject lv_elementType_13_0 = null;

        EObject lv_entityType_19_0 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:315:28: ( ( (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:316:1: ( (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:316:1: ( (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' ) | ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' ) | ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:316:2: (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:316:2: (otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:316:4: otherlv_0= 'Only' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'can-' ( (lv_elementType_3_0= ruleElementType ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDCDecl645); 

                        	newLeafNode(otherlv_0, grammarAccess.getDCDeclAccess().getOnlyKeyword_0_0());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:320:1: ( (otherlv_1= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:321:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:321:1: (otherlv_1= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:322:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl665); 

                    		newLeafNode(otherlv_1, grammarAccess.getDCDeclAccess().getTModDeclCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleDCDecl677); 

                        	newLeafNode(otherlv_2, grammarAccess.getDCDeclAccess().getCanKeyword_0_2());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:337:1: ( (lv_elementType_3_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:338:1: (lv_elementType_3_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:338:1: (lv_elementType_3_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:339:3: lv_elementType_3_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl698);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:355:2: ( (otherlv_4= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:356:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:356:1: (otherlv_4= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:357:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl718); 

                    		newLeafNode(otherlv_4, grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_0_4_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl730); 

                        	newLeafNode(otherlv_5, grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:373:6: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:373:6: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:373:7: ( (otherlv_6= RULE_ID ) ) otherlv_7= 'cannot-' ( (lv_elementType_8_0= ruleElementType ) ) ( (otherlv_9= RULE_ID ) ) otherlv_10= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:373:7: ( (otherlv_6= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:374:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:374:1: (otherlv_6= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:375:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl758); 

                    		newLeafNode(otherlv_6, grammarAccess.getDCDeclAccess().getTModDeclCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleDCDecl770); 

                        	newLeafNode(otherlv_7, grammarAccess.getDCDeclAccess().getCannotKeyword_1_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:390:1: ( (lv_elementType_8_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:1: (lv_elementType_8_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:391:1: (lv_elementType_8_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:392:3: lv_elementType_8_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl791);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:408:2: ( (otherlv_9= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:409:1: (otherlv_9= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:409:1: (otherlv_9= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:410:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl811); 

                    		newLeafNode(otherlv_9, grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl823); 

                        	newLeafNode(otherlv_10, grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:426:6: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:426:6: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:426:7: ( (otherlv_11= RULE_ID ) ) otherlv_12= 'can-' ( (lv_elementType_13_0= ruleElementType ) ) otherlv_14= '-only' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:426:7: ( (otherlv_11= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:427:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:427:1: (otherlv_11= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:428:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl851); 

                    		newLeafNode(otherlv_11, grammarAccess.getDCDeclAccess().getTModDeclCrossReference_2_0_0()); 
                    	

                    }


                    }

                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleDCDecl863); 

                        	newLeafNode(otherlv_12, grammarAccess.getDCDeclAccess().getCanKeyword_2_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:443:1: ( (lv_elementType_13_0= ruleElementType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:444:1: (lv_elementType_13_0= ruleElementType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:444:1: (lv_elementType_13_0= ruleElementType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:445:3: lv_elementType_13_0= ruleElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementType_in_ruleDCDecl884);
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

                    otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleDCDecl896); 

                        	newLeafNode(otherlv_14, grammarAccess.getDCDeclAccess().getOnlyKeyword_2_3());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:465:1: ( (otherlv_15= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:1: (otherlv_15= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:466:1: (otherlv_15= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:467:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl916); 

                    		newLeafNode(otherlv_15, grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_2_4_0()); 
                    	

                    }


                    }

                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl928); 

                        	newLeafNode(otherlv_16, grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:483:6: ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:483:6: ( ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:483:7: ( (otherlv_17= RULE_ID ) ) otherlv_18= 'must-' ( (lv_entityType_19_0= ruleEntityType ) ) ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:483:7: ( (otherlv_17= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:484:1: (otherlv_17= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:484:1: (otherlv_17= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:485:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl956); 

                    		newLeafNode(otherlv_17, grammarAccess.getDCDeclAccess().getTModDeclCrossReference_3_0_0()); 
                    	

                    }


                    }

                    otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleDCDecl968); 

                        	newLeafNode(otherlv_18, grammarAccess.getDCDeclAccess().getMustKeyword_3_1());
                        
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:500:1: ( (lv_entityType_19_0= ruleEntityType ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:501:1: (lv_entityType_19_0= ruleEntityType )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:501:1: (lv_entityType_19_0= ruleEntityType )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:502:3: lv_entityType_19_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleDCDecl989);
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

                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:518:2: ( (otherlv_20= RULE_ID ) )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:519:1: (otherlv_20= RULE_ID )
                    {
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:519:1: (otherlv_20= RULE_ID )
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:520:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDCDeclRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDCDecl1009); 

                    		newLeafNode(otherlv_20, grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_3_3_0()); 
                    	

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleDCDecl1021); 

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


    // $ANTLR start "entryRuleElementType"
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:543:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:544:2: (iv_ruleElementType= ruleElementType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:545:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType1058);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType1068); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:552:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:555:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:556:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:556:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:557:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleElementType1115);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:567:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleElementType1142);
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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:583:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:584:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:585:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1177);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1187); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:592:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:595:28: ( ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:596:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:596:1: ( ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:597:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:597:1: ( (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:598:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:598:1: (lv_typeName_0_1= 'access' | lv_typeName_0_2= 'declare' | lv_typeName_0_3= 'handle' | lv_typeName_0_4= 'create' | lv_typeName_0_5= 'depend' )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:599:3: lv_typeName_0_1= 'access'
                    {
                    lv_typeName_0_1=(Token)match(input,26,FOLLOW_26_in_ruleBasicType1231); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:611:8: lv_typeName_0_2= 'declare'
                    {
                    lv_typeName_0_2=(Token)match(input,27,FOLLOW_27_in_ruleBasicType1260); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:623:8: lv_typeName_0_3= 'handle'
                    {
                    lv_typeName_0_3=(Token)match(input,28,FOLLOW_28_in_ruleBasicType1289); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:635:8: lv_typeName_0_4= 'create'
                    {
                    lv_typeName_0_4=(Token)match(input,29,FOLLOW_29_in_ruleBasicType1318); 

                            newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:647:8: lv_typeName_0_5= 'depend'
                    {
                    lv_typeName_0_5=(Token)match(input,30,FOLLOW_30_in_ruleBasicType1347); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:670:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:671:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:672:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1398);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1408); 

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
    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:679:1: ruleEntityType returns [EObject current=null] : ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_1=null;
        Token lv_entity_0_2=null;
        Token lv_entity_0_3=null;
        Token lv_entity_0_4=null;
        Token lv_entity_0_5=null;

         enterRule(); 
            
        try {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:682:28: ( ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:683:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:683:1: ( ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:684:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:684:1: ( (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' ) )
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:685:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' )
            {
            // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:685:1: (lv_entity_0_1= 'extend' | lv_entity_0_2= 'implement' | lv_entity_0_3= 'derive' | lv_entity_0_4= 'throw' | lv_entity_0_5= 'annotated' )
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
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:686:3: lv_entity_0_1= 'extend'
                    {
                    lv_entity_0_1=(Token)match(input,31,FOLLOW_31_in_ruleEntityType1452); 

                            newLeafNode(lv_entity_0_1, grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:698:8: lv_entity_0_2= 'implement'
                    {
                    lv_entity_0_2=(Token)match(input,32,FOLLOW_32_in_ruleEntityType1481); 

                            newLeafNode(lv_entity_0_2, grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:710:8: lv_entity_0_3= 'derive'
                    {
                    lv_entity_0_3=(Token)match(input,33,FOLLOW_33_in_ruleEntityType1510); 

                            newLeafNode(lv_entity_0_3, grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:722:8: lv_entity_0_4= 'throw'
                    {
                    lv_entity_0_4=(Token)match(input,34,FOLLOW_34_in_ruleEntityType1539); 

                            newLeafNode(lv_entity_0_4, grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "entity", lv_entity_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl/src-gen/com/br/terra/dcl/parser/antlr/internal/InternalDCL.g:734:8: lv_entity_0_5= 'annotated'
                    {
                    lv_entity_0_5=(Token)match(input,35,FOLLOW_35_in_ruleEntityType1568); 

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
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x00000000001EA000L});
    public static final BitSet FOLLOW_ruleModDecl_in_ruleModel155 = new BitSet(new long[]{0x00000000001EA000L});
    public static final BitSet FOLLOW_13_in_ruleModel168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel192 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_ruleDCDecl_in_ruleModel213 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_13_in_ruleModel226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModDecl_in_entryRuleModDecl262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModDecl272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModDecl310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModDecl327 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModDecl344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModDecl364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModDecl381 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModDecl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModDecl418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModDecl435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModDecl452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModDecl472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModDecl489 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModDecl506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModDecl526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModDecl543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModDecl560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDCDecl645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDCDecl677 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl758 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDCDecl770 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl811 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDCDecl863 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDCDecl884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDCDecl896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl916 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl956 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDCDecl968 = new BitSet(new long[]{0x0000000FFC000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleDCDecl989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDCDecl1009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDCDecl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleElementType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBasicType1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBasicType1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBasicType1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBasicType1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBasicType1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntityType1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEntityType1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEntityType1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEntityType1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntityType1568 = new BitSet(new long[]{0x0000000000000002L});

}