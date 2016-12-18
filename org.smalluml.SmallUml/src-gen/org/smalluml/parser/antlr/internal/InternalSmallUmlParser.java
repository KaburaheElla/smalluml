package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Attribute'", "'{'", "'typename'", "'}'", "'Type'", "'Real'", "'Integer'", "'String'", "'Infinity'", "'Enumeration'", "'value'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUml.g"; }



     	private SmallUmlGrammarAccess grammarAccess;

        public InternalSmallUmlParser(TokenStream input, SmallUmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Attribute";
       	}

       	@Override
       	protected SmallUmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUml.g:64:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUml.g:64:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUml.g:65:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUml.g:71:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typename' ( (lv_typename_4_0= ruleType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_typename_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:77:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typename' ( (lv_typename_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSmallUml.g:78:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typename' ( (lv_typename_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSmallUml.g:78:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typename' ( (lv_typename_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSmallUml.g:79:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'typename' ( (lv_typename_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUml.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUml.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUml.g:84:4: (lv_name_1_0= ruleEString )
            // InternalSmallUml.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypenameKeyword_3());
            		
            // InternalSmallUml.g:110:3: ( (lv_typename_4_0= ruleType ) )
            // InternalSmallUml.g:111:4: (lv_typename_4_0= ruleType )
            {
            // InternalSmallUml.g:111:4: (lv_typename_4_0= ruleType )
            // InternalSmallUml.g:112:5: lv_typename_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypenameTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_typename_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"typename",
            						lv_typename_4_0,
            						"org.smalluml.SmallUml.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalSmallUml.g:137:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUml.g:137:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUml.g:138:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUml.g:144:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_Infinity_4= ruleInfinity | this_Enumeration_5= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Real_1 = null;

        EObject this_Integer_2 = null;

        EObject this_String0_3 = null;

        EObject this_Infinity_4 = null;

        EObject this_Enumeration_5 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:150:2: ( (this_Type_Impl_0= ruleType_Impl | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_Infinity_4= ruleInfinity | this_Enumeration_5= ruleEnumeration ) )
            // InternalSmallUml.g:151:2: (this_Type_Impl_0= ruleType_Impl | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_Infinity_4= ruleInfinity | this_Enumeration_5= ruleEnumeration )
            {
            // InternalSmallUml.g:151:2: (this_Type_Impl_0= ruleType_Impl | this_Real_1= ruleReal | this_Integer_2= ruleInteger | this_String0_3= ruleString0 | this_Infinity_4= ruleInfinity | this_Enumeration_5= ruleEnumeration )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 20:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUml.g:152:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:161:3: this_Real_1= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_1=ruleReal();

                    state._fsp--;


                    			current = this_Real_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUml.g:170:3: this_Integer_2= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_2=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUml.g:179:3: this_String0_3= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_3=ruleString0();

                    state._fsp--;


                    			current = this_String0_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUml.g:188:3: this_Infinity_4= ruleInfinity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInfinityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Infinity_4=ruleInfinity();

                    state._fsp--;


                    			current = this_Infinity_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUml.g:197:3: this_Enumeration_5= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_5=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_5;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUml.g:209:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUml.g:209:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUml.g:210:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUml.g:216:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUml.g:222:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUml.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUml.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUml.g:224:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:232:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUml.g:243:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSmallUml.g:243:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSmallUml.g:244:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSmallUml.g:250:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:256:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:257:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:257:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:258:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:258:3: ()
            // InternalSmallUml.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalSmallUml.g:269:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:270:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:270:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:271:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUml.g:292:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalSmallUml.g:292:45: (iv_ruleReal= ruleReal EOF )
            // InternalSmallUml.g:293:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUml.g:299:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:305:2: ( ( () otherlv_1= 'Real' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:306:2: ( () otherlv_1= 'Real' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:306:2: ( () otherlv_1= 'Real' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:307:3: () otherlv_1= 'Real' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:307:3: ()
            // InternalSmallUml.g:308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		
            // InternalSmallUml.g:318:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:319:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:319:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:320:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRealAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUml.g:341:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUml.g:341:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUml.g:342:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUml.g:348:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:354:2: ( ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:355:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:355:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:356:3: () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:356:3: ()
            // InternalSmallUml.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		
            // InternalSmallUml.g:367:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:368:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:368:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:369:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUml.g:390:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUml.g:390:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUml.g:391:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUml.g:397:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:403:2: ( ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:404:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:404:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:405:3: () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:405:3: ()
            // InternalSmallUml.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		
            // InternalSmallUml.g:416:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:417:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:417:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:418:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInfinity"
    // InternalSmallUml.g:439:1: entryRuleInfinity returns [EObject current=null] : iv_ruleInfinity= ruleInfinity EOF ;
    public final EObject entryRuleInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinity = null;


        try {
            // InternalSmallUml.g:439:49: (iv_ruleInfinity= ruleInfinity EOF )
            // InternalSmallUml.g:440:2: iv_ruleInfinity= ruleInfinity EOF
            {
             newCompositeNode(grammarAccess.getInfinityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfinity=ruleInfinity();

            state._fsp--;

             current =iv_ruleInfinity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfinity"


    // $ANTLR start "ruleInfinity"
    // InternalSmallUml.g:446:1: ruleInfinity returns [EObject current=null] : ( () otherlv_1= 'Infinity' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInfinity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:452:2: ( ( () otherlv_1= 'Infinity' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUml.g:453:2: ( () otherlv_1= 'Infinity' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUml.g:453:2: ( () otherlv_1= 'Infinity' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUml.g:454:3: () otherlv_1= 'Infinity' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUml.g:454:3: ()
            // InternalSmallUml.g:455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfinityAccess().getInfinityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInfinityAccess().getInfinityKeyword_1());
            		
            // InternalSmallUml.g:465:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUml.g:466:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUml.g:466:4: (lv_name_2_0= ruleEString )
            // InternalSmallUml.g:467:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfinityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfinityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleInfinity"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUml.g:488:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUml.g:488:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUml.g:489:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUml.g:495:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUml.g:501:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUml.g:502:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUml.g:502:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUml.g:503:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUml.g:507:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUml.g:508:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUml.g:508:4: (lv_name_1_0= ruleEString )
            // InternalSmallUml.g:509:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUml.g:538:3: ( (lv_value_5_0= ruleString0 ) )
            // InternalSmallUml.g:539:4: (lv_value_5_0= ruleString0 )
            {
            // InternalSmallUml.g:539:4: (lv_value_5_0= ruleString0 )
            // InternalSmallUml.g:540:5: lv_value_5_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_5_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.smalluml.SmallUml.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUml.g:557:3: (otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUml.g:558:4: otherlv_6= ',' ( (lv_value_7_0= ruleString0 ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUml.g:562:4: ( (lv_value_7_0= ruleString0 ) )
            	    // InternalSmallUml.g:563:5: (lv_value_7_0= ruleString0 )
            	    {
            	    // InternalSmallUml.g:563:5: (lv_value_7_0= ruleString0 )
            	    // InternalSmallUml.g:564:6: lv_value_7_0= ruleString0
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_value_7_0=ruleString0();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_7_0,
            	    							"org.smalluml.SmallUml.String0");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnumeration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000404000L});

}