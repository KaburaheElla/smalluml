package org.smalluml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.smalluml.services.SmallUmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUmlParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(SmallUmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUml.g:53:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUml.g:54:1: ( ruleAttribute EOF )
            // InternalSmallUml.g:55:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUml.g:62:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:66:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUml.g:67:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUml.g:67:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUml.g:68:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUml.g:69:3: ( rule__Attribute__Group__0 )
            // InternalSmallUml.g:69:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalSmallUml.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUml.g:79:1: ( ruleType EOF )
            // InternalSmallUml.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUml.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmallUml.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmallUml.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSmallUml.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmallUml.g:94:3: ( rule__Type__Alternatives )
            // InternalSmallUml.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUml.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUml.g:104:1: ( ruleEString EOF )
            // InternalSmallUml.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUml.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUml.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUml.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUml.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUml.g:119:3: ( rule__EString__Alternatives )
            // InternalSmallUml.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUml.g:128:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalSmallUml.g:129:1: ( ruleType_Impl EOF )
            // InternalSmallUml.g:130:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSmallUml.g:137:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:141:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalSmallUml.g:142:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalSmallUml.g:142:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalSmallUml.g:143:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalSmallUml.g:144:3: ( rule__Type_Impl__Group__0 )
            // InternalSmallUml.g:144:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleReal"
    // InternalSmallUml.g:153:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalSmallUml.g:154:1: ( ruleReal EOF )
            // InternalSmallUml.g:155:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSmallUml.g:162:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:166:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalSmallUml.g:167:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalSmallUml.g:167:2: ( ( rule__Real__Group__0 ) )
            // InternalSmallUml.g:168:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalSmallUml.g:169:3: ( rule__Real__Group__0 )
            // InternalSmallUml.g:169:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUml.g:178:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUml.g:179:1: ( ruleInteger EOF )
            // InternalSmallUml.g:180:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUml.g:187:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:191:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUml.g:192:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUml.g:192:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUml.g:193:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUml.g:194:3: ( rule__Integer__Group__0 )
            // InternalSmallUml.g:194:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUml.g:203:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUml.g:204:1: ( ruleString0 EOF )
            // InternalSmallUml.g:205:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUml.g:212:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:216:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUml.g:217:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUml.g:217:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUml.g:218:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUml.g:219:3: ( rule__String0__Group__0 )
            // InternalSmallUml.g:219:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInfinity"
    // InternalSmallUml.g:228:1: entryRuleInfinity : ruleInfinity EOF ;
    public final void entryRuleInfinity() throws RecognitionException {
        try {
            // InternalSmallUml.g:229:1: ( ruleInfinity EOF )
            // InternalSmallUml.g:230:1: ruleInfinity EOF
            {
             before(grammarAccess.getInfinityRule()); 
            pushFollow(FOLLOW_1);
            ruleInfinity();

            state._fsp--;

             after(grammarAccess.getInfinityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfinity"


    // $ANTLR start "ruleInfinity"
    // InternalSmallUml.g:237:1: ruleInfinity : ( ( rule__Infinity__Group__0 ) ) ;
    public final void ruleInfinity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:241:2: ( ( ( rule__Infinity__Group__0 ) ) )
            // InternalSmallUml.g:242:2: ( ( rule__Infinity__Group__0 ) )
            {
            // InternalSmallUml.g:242:2: ( ( rule__Infinity__Group__0 ) )
            // InternalSmallUml.g:243:3: ( rule__Infinity__Group__0 )
            {
             before(grammarAccess.getInfinityAccess().getGroup()); 
            // InternalSmallUml.g:244:3: ( rule__Infinity__Group__0 )
            // InternalSmallUml.g:244:4: rule__Infinity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infinity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfinityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfinity"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUml.g:253:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUml.g:254:1: ( ruleEnumeration EOF )
            // InternalSmallUml.g:255:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUml.g:262:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:266:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUml.g:267:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUml.g:267:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUml.g:268:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUml.g:269:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUml.g:269:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmallUml.g:277:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleInfinity ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:281:1: ( ( ruleType_Impl ) | ( ruleReal ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleInfinity ) | ( ruleEnumeration ) )
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
                    // InternalSmallUml.g:282:2: ( ruleType_Impl )
                    {
                    // InternalSmallUml.g:282:2: ( ruleType_Impl )
                    // InternalSmallUml.g:283:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:288:2: ( ruleReal )
                    {
                    // InternalSmallUml.g:288:2: ( ruleReal )
                    // InternalSmallUml.g:289:3: ruleReal
                    {
                     before(grammarAccess.getTypeAccess().getRealParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUml.g:294:2: ( ruleInteger )
                    {
                    // InternalSmallUml.g:294:2: ( ruleInteger )
                    // InternalSmallUml.g:295:3: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUml.g:300:2: ( ruleString0 )
                    {
                    // InternalSmallUml.g:300:2: ( ruleString0 )
                    // InternalSmallUml.g:301:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallUml.g:306:2: ( ruleInfinity )
                    {
                    // InternalSmallUml.g:306:2: ( ruleInfinity )
                    // InternalSmallUml.g:307:3: ruleInfinity
                    {
                     before(grammarAccess.getTypeAccess().getInfinityParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInfinity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getInfinityParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallUml.g:312:2: ( ruleEnumeration )
                    {
                    // InternalSmallUml.g:312:2: ( ruleEnumeration )
                    // InternalSmallUml.g:313:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUml.g:322:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:326:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUml.g:327:2: ( RULE_STRING )
                    {
                    // InternalSmallUml.g:327:2: ( RULE_STRING )
                    // InternalSmallUml.g:328:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUml.g:333:2: ( RULE_ID )
                    {
                    // InternalSmallUml.g:333:2: ( RULE_ID )
                    // InternalSmallUml.g:334:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUml.g:343:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:347:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUml.g:348:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSmallUml.g:355:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:359:1: ( ( 'Attribute' ) )
            // InternalSmallUml.g:360:1: ( 'Attribute' )
            {
            // InternalSmallUml.g:360:1: ( 'Attribute' )
            // InternalSmallUml.g:361:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSmallUml.g:370:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:374:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUml.g:375:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSmallUml.g:382:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:386:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUml.g:387:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUml.g:387:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUml.g:388:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUml.g:389:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUml.g:389:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSmallUml.g:397:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:401:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUml.g:402:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSmallUml.g:409:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:413:1: ( ( '{' ) )
            // InternalSmallUml.g:414:1: ( '{' )
            {
            // InternalSmallUml.g:414:1: ( '{' )
            // InternalSmallUml.g:415:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSmallUml.g:424:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:428:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSmallUml.g:429:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSmallUml.g:436:1: rule__Attribute__Group__3__Impl : ( 'typename' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:440:1: ( ( 'typename' ) )
            // InternalSmallUml.g:441:1: ( 'typename' )
            {
            // InternalSmallUml.g:441:1: ( 'typename' )
            // InternalSmallUml.g:442:2: 'typename'
            {
             before(grammarAccess.getAttributeAccess().getTypenameKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypenameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSmallUml.g:451:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:455:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSmallUml.g:456:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSmallUml.g:463:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypenameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:467:1: ( ( ( rule__Attribute__TypenameAssignment_4 ) ) )
            // InternalSmallUml.g:468:1: ( ( rule__Attribute__TypenameAssignment_4 ) )
            {
            // InternalSmallUml.g:468:1: ( ( rule__Attribute__TypenameAssignment_4 ) )
            // InternalSmallUml.g:469:2: ( rule__Attribute__TypenameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypenameAssignment_4()); 
            // InternalSmallUml.g:470:2: ( rule__Attribute__TypenameAssignment_4 )
            // InternalSmallUml.g:470:3: rule__Attribute__TypenameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypenameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypenameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSmallUml.g:478:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:482:1: ( rule__Attribute__Group__5__Impl )
            // InternalSmallUml.g:483:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSmallUml.g:489:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:493:1: ( ( '}' ) )
            // InternalSmallUml.g:494:1: ( '}' )
            {
            // InternalSmallUml.g:494:1: ( '}' )
            // InternalSmallUml.g:495:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalSmallUml.g:505:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:509:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalSmallUml.g:510:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalSmallUml.g:517:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:521:1: ( ( () ) )
            // InternalSmallUml.g:522:1: ( () )
            {
            // InternalSmallUml.g:522:1: ( () )
            // InternalSmallUml.g:523:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalSmallUml.g:524:2: ()
            // InternalSmallUml.g:524:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalSmallUml.g:532:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:536:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalSmallUml.g:537:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalSmallUml.g:544:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:548:1: ( ( 'Type' ) )
            // InternalSmallUml.g:549:1: ( 'Type' )
            {
            // InternalSmallUml.g:549:1: ( 'Type' )
            // InternalSmallUml.g:550:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__2"
    // InternalSmallUml.g:559:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:563:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalSmallUml.g:564:2: rule__Type_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2"


    // $ANTLR start "rule__Type_Impl__Group__2__Impl"
    // InternalSmallUml.g:570:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:574:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalSmallUml.g:575:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:575:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalSmallUml.g:576:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:577:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalSmallUml.g:577:3: rule__Type_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalSmallUml.g:586:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:590:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalSmallUml.g:591:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalSmallUml.g:598:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:602:1: ( ( () ) )
            // InternalSmallUml.g:603:1: ( () )
            {
            // InternalSmallUml.g:603:1: ( () )
            // InternalSmallUml.g:604:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalSmallUml.g:605:2: ()
            // InternalSmallUml.g:605:3: 
            {
            }

             after(grammarAccess.getRealAccess().getRealAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalSmallUml.g:613:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:617:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalSmallUml.g:618:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalSmallUml.g:625:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:629:1: ( ( 'Real' ) )
            // InternalSmallUml.g:630:1: ( 'Real' )
            {
            // InternalSmallUml.g:630:1: ( 'Real' )
            // InternalSmallUml.g:631:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__2"
    // InternalSmallUml.g:640:1: rule__Real__Group__2 : rule__Real__Group__2__Impl ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:644:1: ( rule__Real__Group__2__Impl )
            // InternalSmallUml.g:645:2: rule__Real__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // InternalSmallUml.g:651:1: rule__Real__Group__2__Impl : ( ( rule__Real__NameAssignment_2 ) ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:655:1: ( ( ( rule__Real__NameAssignment_2 ) ) )
            // InternalSmallUml.g:656:1: ( ( rule__Real__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:656:1: ( ( rule__Real__NameAssignment_2 ) )
            // InternalSmallUml.g:657:2: ( rule__Real__NameAssignment_2 )
            {
             before(grammarAccess.getRealAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:658:2: ( rule__Real__NameAssignment_2 )
            // InternalSmallUml.g:658:3: rule__Real__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Real__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalSmallUml.g:667:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:671:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUml.g:672:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalSmallUml.g:679:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:683:1: ( ( () ) )
            // InternalSmallUml.g:684:1: ( () )
            {
            // InternalSmallUml.g:684:1: ( () )
            // InternalSmallUml.g:685:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUml.g:686:2: ()
            // InternalSmallUml.g:686:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalSmallUml.g:694:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl rule__Integer__Group__2 ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:698:1: ( rule__Integer__Group__1__Impl rule__Integer__Group__2 )
            // InternalSmallUml.g:699:2: rule__Integer__Group__1__Impl rule__Integer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Integer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalSmallUml.g:706:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:710:1: ( ( 'Integer' ) )
            // InternalSmallUml.g:711:1: ( 'Integer' )
            {
            // InternalSmallUml.g:711:1: ( 'Integer' )
            // InternalSmallUml.g:712:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__2"
    // InternalSmallUml.g:721:1: rule__Integer__Group__2 : rule__Integer__Group__2__Impl ;
    public final void rule__Integer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:725:1: ( rule__Integer__Group__2__Impl )
            // InternalSmallUml.g:726:2: rule__Integer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__2"


    // $ANTLR start "rule__Integer__Group__2__Impl"
    // InternalSmallUml.g:732:1: rule__Integer__Group__2__Impl : ( ( rule__Integer__NameAssignment_2 ) ) ;
    public final void rule__Integer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:736:1: ( ( ( rule__Integer__NameAssignment_2 ) ) )
            // InternalSmallUml.g:737:1: ( ( rule__Integer__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:737:1: ( ( rule__Integer__NameAssignment_2 ) )
            // InternalSmallUml.g:738:2: ( rule__Integer__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:739:2: ( rule__Integer__NameAssignment_2 )
            // InternalSmallUml.g:739:3: rule__Integer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Integer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__2__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalSmallUml.g:748:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:752:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUml.g:753:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalSmallUml.g:760:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:764:1: ( ( () ) )
            // InternalSmallUml.g:765:1: ( () )
            {
            // InternalSmallUml.g:765:1: ( () )
            // InternalSmallUml.g:766:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUml.g:767:2: ()
            // InternalSmallUml.g:767:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalSmallUml.g:775:1: rule__String0__Group__1 : rule__String0__Group__1__Impl rule__String0__Group__2 ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:779:1: ( rule__String0__Group__1__Impl rule__String0__Group__2 )
            // InternalSmallUml.g:780:2: rule__String0__Group__1__Impl rule__String0__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__String0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalSmallUml.g:787:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:791:1: ( ( 'String' ) )
            // InternalSmallUml.g:792:1: ( 'String' )
            {
            // InternalSmallUml.g:792:1: ( 'String' )
            // InternalSmallUml.g:793:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__2"
    // InternalSmallUml.g:802:1: rule__String0__Group__2 : rule__String0__Group__2__Impl ;
    public final void rule__String0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:806:1: ( rule__String0__Group__2__Impl )
            // InternalSmallUml.g:807:2: rule__String0__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__2"


    // $ANTLR start "rule__String0__Group__2__Impl"
    // InternalSmallUml.g:813:1: rule__String0__Group__2__Impl : ( ( rule__String0__NameAssignment_2 ) ) ;
    public final void rule__String0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:817:1: ( ( ( rule__String0__NameAssignment_2 ) ) )
            // InternalSmallUml.g:818:1: ( ( rule__String0__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:818:1: ( ( rule__String0__NameAssignment_2 ) )
            // InternalSmallUml.g:819:2: ( rule__String0__NameAssignment_2 )
            {
             before(grammarAccess.getString0Access().getNameAssignment_2()); 
            // InternalSmallUml.g:820:2: ( rule__String0__NameAssignment_2 )
            // InternalSmallUml.g:820:3: rule__String0__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__String0__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__2__Impl"


    // $ANTLR start "rule__Infinity__Group__0"
    // InternalSmallUml.g:829:1: rule__Infinity__Group__0 : rule__Infinity__Group__0__Impl rule__Infinity__Group__1 ;
    public final void rule__Infinity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:833:1: ( rule__Infinity__Group__0__Impl rule__Infinity__Group__1 )
            // InternalSmallUml.g:834:2: rule__Infinity__Group__0__Impl rule__Infinity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Infinity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infinity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__0"


    // $ANTLR start "rule__Infinity__Group__0__Impl"
    // InternalSmallUml.g:841:1: rule__Infinity__Group__0__Impl : ( () ) ;
    public final void rule__Infinity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:845:1: ( ( () ) )
            // InternalSmallUml.g:846:1: ( () )
            {
            // InternalSmallUml.g:846:1: ( () )
            // InternalSmallUml.g:847:2: ()
            {
             before(grammarAccess.getInfinityAccess().getInfinityAction_0()); 
            // InternalSmallUml.g:848:2: ()
            // InternalSmallUml.g:848:3: 
            {
            }

             after(grammarAccess.getInfinityAccess().getInfinityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__0__Impl"


    // $ANTLR start "rule__Infinity__Group__1"
    // InternalSmallUml.g:856:1: rule__Infinity__Group__1 : rule__Infinity__Group__1__Impl rule__Infinity__Group__2 ;
    public final void rule__Infinity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:860:1: ( rule__Infinity__Group__1__Impl rule__Infinity__Group__2 )
            // InternalSmallUml.g:861:2: rule__Infinity__Group__1__Impl rule__Infinity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Infinity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infinity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__1"


    // $ANTLR start "rule__Infinity__Group__1__Impl"
    // InternalSmallUml.g:868:1: rule__Infinity__Group__1__Impl : ( 'Infinity' ) ;
    public final void rule__Infinity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:872:1: ( ( 'Infinity' ) )
            // InternalSmallUml.g:873:1: ( 'Infinity' )
            {
            // InternalSmallUml.g:873:1: ( 'Infinity' )
            // InternalSmallUml.g:874:2: 'Infinity'
            {
             before(grammarAccess.getInfinityAccess().getInfinityKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInfinityAccess().getInfinityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__1__Impl"


    // $ANTLR start "rule__Infinity__Group__2"
    // InternalSmallUml.g:883:1: rule__Infinity__Group__2 : rule__Infinity__Group__2__Impl ;
    public final void rule__Infinity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:887:1: ( rule__Infinity__Group__2__Impl )
            // InternalSmallUml.g:888:2: rule__Infinity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infinity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__2"


    // $ANTLR start "rule__Infinity__Group__2__Impl"
    // InternalSmallUml.g:894:1: rule__Infinity__Group__2__Impl : ( ( rule__Infinity__NameAssignment_2 ) ) ;
    public final void rule__Infinity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:898:1: ( ( ( rule__Infinity__NameAssignment_2 ) ) )
            // InternalSmallUml.g:899:1: ( ( rule__Infinity__NameAssignment_2 ) )
            {
            // InternalSmallUml.g:899:1: ( ( rule__Infinity__NameAssignment_2 ) )
            // InternalSmallUml.g:900:2: ( rule__Infinity__NameAssignment_2 )
            {
             before(grammarAccess.getInfinityAccess().getNameAssignment_2()); 
            // InternalSmallUml.g:901:2: ( rule__Infinity__NameAssignment_2 )
            // InternalSmallUml.g:901:3: rule__Infinity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Infinity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInfinityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUml.g:910:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:914:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUml.g:915:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSmallUml.g:922:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:926:1: ( ( 'Enumeration' ) )
            // InternalSmallUml.g:927:1: ( 'Enumeration' )
            {
            // InternalSmallUml.g:927:1: ( 'Enumeration' )
            // InternalSmallUml.g:928:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUml.g:937:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:941:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUml.g:942:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSmallUml.g:949:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:953:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalSmallUml.g:954:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalSmallUml.g:954:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalSmallUml.g:955:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalSmallUml.g:956:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalSmallUml.g:956:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSmallUml.g:964:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:968:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUml.g:969:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSmallUml.g:976:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:980:1: ( ( '{' ) )
            // InternalSmallUml.g:981:1: ( '{' )
            {
            // InternalSmallUml.g:981:1: ( '{' )
            // InternalSmallUml.g:982:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSmallUml.g:991:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:995:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUml.g:996:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSmallUml.g:1003:1: rule__Enumeration__Group__3__Impl : ( 'value' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1007:1: ( ( 'value' ) )
            // InternalSmallUml.g:1008:1: ( 'value' )
            {
            // InternalSmallUml.g:1008:1: ( 'value' )
            // InternalSmallUml.g:1009:2: 'value'
            {
             before(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSmallUml.g:1018:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1022:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUml.g:1023:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSmallUml.g:1030:1: rule__Enumeration__Group__4__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1034:1: ( ( '{' ) )
            // InternalSmallUml.g:1035:1: ( '{' )
            {
            // InternalSmallUml.g:1035:1: ( '{' )
            // InternalSmallUml.g:1036:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSmallUml.g:1045:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1049:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUml.g:1050:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSmallUml.g:1057:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__ValueAssignment_5 ) ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1061:1: ( ( ( rule__Enumeration__ValueAssignment_5 ) ) )
            // InternalSmallUml.g:1062:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            {
            // InternalSmallUml.g:1062:1: ( ( rule__Enumeration__ValueAssignment_5 ) )
            // InternalSmallUml.g:1063:2: ( rule__Enumeration__ValueAssignment_5 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 
            // InternalSmallUml.g:1064:2: ( rule__Enumeration__ValueAssignment_5 )
            // InternalSmallUml.g:1064:3: rule__Enumeration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalSmallUml.g:1072:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1076:1: ( rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7 )
            // InternalSmallUml.g:1077:2: rule__Enumeration__Group__6__Impl rule__Enumeration__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalSmallUml.g:1084:1: rule__Enumeration__Group__6__Impl : ( ( rule__Enumeration__Group_6__0 )* ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1088:1: ( ( ( rule__Enumeration__Group_6__0 )* ) )
            // InternalSmallUml.g:1089:1: ( ( rule__Enumeration__Group_6__0 )* )
            {
            // InternalSmallUml.g:1089:1: ( ( rule__Enumeration__Group_6__0 )* )
            // InternalSmallUml.g:1090:2: ( rule__Enumeration__Group_6__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_6()); 
            // InternalSmallUml.g:1091:2: ( rule__Enumeration__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUml.g:1091:3: rule__Enumeration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Enumeration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group__7"
    // InternalSmallUml.g:1099:1: rule__Enumeration__Group__7 : rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 ;
    public final void rule__Enumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1103:1: ( rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8 )
            // InternalSmallUml.g:1104:2: rule__Enumeration__Group__7__Impl rule__Enumeration__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Enumeration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7"


    // $ANTLR start "rule__Enumeration__Group__7__Impl"
    // InternalSmallUml.g:1111:1: rule__Enumeration__Group__7__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1115:1: ( ( '}' ) )
            // InternalSmallUml.g:1116:1: ( '}' )
            {
            // InternalSmallUml.g:1116:1: ( '}' )
            // InternalSmallUml.g:1117:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__7__Impl"


    // $ANTLR start "rule__Enumeration__Group__8"
    // InternalSmallUml.g:1126:1: rule__Enumeration__Group__8 : rule__Enumeration__Group__8__Impl ;
    public final void rule__Enumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1130:1: ( rule__Enumeration__Group__8__Impl )
            // InternalSmallUml.g:1131:2: rule__Enumeration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__8"


    // $ANTLR start "rule__Enumeration__Group__8__Impl"
    // InternalSmallUml.g:1137:1: rule__Enumeration__Group__8__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1141:1: ( ( '}' ) )
            // InternalSmallUml.g:1142:1: ( '}' )
            {
            // InternalSmallUml.g:1142:1: ( '}' )
            // InternalSmallUml.g:1143:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__8__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__0"
    // InternalSmallUml.g:1153:1: rule__Enumeration__Group_6__0 : rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 ;
    public final void rule__Enumeration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1157:1: ( rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1 )
            // InternalSmallUml.g:1158:2: rule__Enumeration__Group_6__0__Impl rule__Enumeration__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__0"


    // $ANTLR start "rule__Enumeration__Group_6__0__Impl"
    // InternalSmallUml.g:1165:1: rule__Enumeration__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1169:1: ( ( ',' ) )
            // InternalSmallUml.g:1170:1: ( ',' )
            {
            // InternalSmallUml.g:1170:1: ( ',' )
            // InternalSmallUml.g:1171:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_6__1"
    // InternalSmallUml.g:1180:1: rule__Enumeration__Group_6__1 : rule__Enumeration__Group_6__1__Impl ;
    public final void rule__Enumeration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1184:1: ( rule__Enumeration__Group_6__1__Impl )
            // InternalSmallUml.g:1185:2: rule__Enumeration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__1"


    // $ANTLR start "rule__Enumeration__Group_6__1__Impl"
    // InternalSmallUml.g:1191:1: rule__Enumeration__Group_6__1__Impl : ( ( rule__Enumeration__ValueAssignment_6_1 ) ) ;
    public final void rule__Enumeration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1195:1: ( ( ( rule__Enumeration__ValueAssignment_6_1 ) ) )
            // InternalSmallUml.g:1196:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            {
            // InternalSmallUml.g:1196:1: ( ( rule__Enumeration__ValueAssignment_6_1 ) )
            // InternalSmallUml.g:1197:2: ( rule__Enumeration__ValueAssignment_6_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 
            // InternalSmallUml.g:1198:2: ( rule__Enumeration__ValueAssignment_6_1 )
            // InternalSmallUml.g:1198:3: rule__Enumeration__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValueAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_6__1__Impl"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUml.g:1207:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1211:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1212:2: ( ruleEString )
            {
            // InternalSmallUml.g:1212:2: ( ruleEString )
            // InternalSmallUml.g:1213:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypenameAssignment_4"
    // InternalSmallUml.g:1222:1: rule__Attribute__TypenameAssignment_4 : ( ruleType ) ;
    public final void rule__Attribute__TypenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1226:1: ( ( ruleType ) )
            // InternalSmallUml.g:1227:2: ( ruleType )
            {
            // InternalSmallUml.g:1227:2: ( ruleType )
            // InternalSmallUml.g:1228:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypenameTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypenameTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypenameAssignment_4"


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalSmallUml.g:1237:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1241:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1242:2: ( ruleEString )
            {
            // InternalSmallUml.g:1242:2: ( ruleEString )
            // InternalSmallUml.g:1243:3: ruleEString
            {
             before(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__NameAssignment_2"


    // $ANTLR start "rule__Real__NameAssignment_2"
    // InternalSmallUml.g:1252:1: rule__Real__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Real__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1256:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1257:2: ( ruleEString )
            {
            // InternalSmallUml.g:1257:2: ( ruleEString )
            // InternalSmallUml.g:1258:3: ruleEString
            {
             before(grammarAccess.getRealAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRealAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__NameAssignment_2"


    // $ANTLR start "rule__Integer__NameAssignment_2"
    // InternalSmallUml.g:1267:1: rule__Integer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Integer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1271:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1272:2: ( ruleEString )
            {
            // InternalSmallUml.g:1272:2: ( ruleEString )
            // InternalSmallUml.g:1273:3: ruleEString
            {
             before(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__NameAssignment_2"


    // $ANTLR start "rule__String0__NameAssignment_2"
    // InternalSmallUml.g:1282:1: rule__String0__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__String0__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1286:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1287:2: ( ruleEString )
            {
            // InternalSmallUml.g:1287:2: ( ruleEString )
            // InternalSmallUml.g:1288:3: ruleEString
            {
             before(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__NameAssignment_2"


    // $ANTLR start "rule__Infinity__NameAssignment_2"
    // InternalSmallUml.g:1297:1: rule__Infinity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Infinity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1301:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1302:2: ( ruleEString )
            {
            // InternalSmallUml.g:1302:2: ( ruleEString )
            // InternalSmallUml.g:1303:3: ruleEString
            {
             before(grammarAccess.getInfinityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfinityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinity__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalSmallUml.g:1312:1: rule__Enumeration__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1316:1: ( ( ruleEString ) )
            // InternalSmallUml.g:1317:2: ( ruleEString )
            {
            // InternalSmallUml.g:1317:2: ( ruleEString )
            // InternalSmallUml.g:1318:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__ValueAssignment_5"
    // InternalSmallUml.g:1327:1: rule__Enumeration__ValueAssignment_5 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1331:1: ( ( ruleString0 ) )
            // InternalSmallUml.g:1332:2: ( ruleString0 )
            {
            // InternalSmallUml.g:1332:2: ( ruleString0 )
            // InternalSmallUml.g:1333:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_5"


    // $ANTLR start "rule__Enumeration__ValueAssignment_6_1"
    // InternalSmallUml.g:1342:1: rule__Enumeration__ValueAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__Enumeration__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUml.g:1346:1: ( ( ruleString0 ) )
            // InternalSmallUml.g:1347:2: ( ruleString0 )
            {
            // InternalSmallUml.g:1347:2: ( ruleString0 )
            // InternalSmallUml.g:1348:3: ruleString0
            {
             before(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValueAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});

}