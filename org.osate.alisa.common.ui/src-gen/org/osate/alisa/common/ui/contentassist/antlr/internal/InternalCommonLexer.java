<<<<<<< Upstream, based on develop
package org.osate.alisa.common.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommonLexer extends Lexer {
    public static final int RULE_HEX=4;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=7;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCommonLexer() {;} 
    public InternalCommonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCommonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:11:7: ( '||' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:11:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:12:7: ( '&&' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:12:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:13:7: ( '==' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:13:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:14:7: ( '!=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:14:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:15:7: ( '===' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:15:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:16:7: ( '!==' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:16:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:17:7: ( '>=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:17:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:18:7: ( '>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:19:7: ( '<' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:20:7: ( '->' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:20:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:21:7: ( '..<' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:21:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:22:7: ( '..' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:22:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:23:7: ( '=>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:23:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:24:7: ( '<>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:24:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:25:7: ( '?:' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:25:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:26:7: ( '+' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:27:7: ( '-' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:28:7: ( '*' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:28:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:29:7: ( '**' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:29:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:30:7: ( '/' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:30:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:31:7: ( '%' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:31:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:32:7: ( '!' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:32:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:33:7: ( 'false' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:33:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:34:7: ( 'description' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:34:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:35:7: ( 'img' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:35:9: 'img'
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:36:7: ( '.' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:37:7: ( '=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:37:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:38:7: ( '#' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:38:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:39:7: ( '{' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:39:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:40:7: ( '}' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:40:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:41:7: ( ',' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:42:7: ( '[' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:42:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:43:7: ( ']' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:44:7: ( '(' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:44:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:45:7: ( ')' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:45:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:46:7: ( 'null' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:46:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:47:7: ( '::' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:47:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:48:7: ( 'this' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:48:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:49:7: ( 'true' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:49:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5801:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5803:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5803:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5803:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5805:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5807:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5807:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5807:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5807:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5807:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5809:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5811:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5811:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5811:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5811:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5813:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5815:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5815:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5815:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5817:16: ( . )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:5817:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=48;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:244: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 41 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:262: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 43 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:275: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:283: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:295: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:311: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:327: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:335: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\2\43\1\50\1\52\1\54\1\56\1\60\1\62\1\43\1\uffff\1\66\1"+
        "\71\1\uffff\3\74\10\uffff\1\74\1\43\1\74\2\115\1\43\1\uffff\2\43"+
        "\4\uffff\1\122\2\uffff\1\124\7\uffff\1\126\11\uffff\1\74\1\uffff"+
        "\2\74\10\uffff\1\74\1\uffff\2\74\1\uffff\1\115\12\uffff\2\74\1\137"+
        "\5\74\1\uffff\1\145\1\146\1\147\1\150\1\74\4\uffff\5\74\1\157\1"+
        "\uffff";
    static final String DFA19_eofS =
        "\160\uffff";
    static final String DFA19_minS =
        "\1\0\1\174\1\46\3\75\2\76\1\56\1\72\1\uffff\2\52\1\uffff\1\141"+
        "\1\145\1\155\10\uffff\1\165\1\72\1\150\2\60\1\101\1\uffff\2\0\4"+
        "\uffff\1\75\2\uffff\1\75\7\uffff\1\74\11\uffff\1\154\1\uffff\1\163"+
        "\1\147\10\uffff\1\154\1\uffff\1\151\1\165\1\uffff\1\60\12\uffff"+
        "\1\163\1\143\1\60\1\154\1\163\2\145\1\162\1\uffff\4\60\1\151\4\uffff"+
        "\1\160\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\174\1\46\1\76\2\75\2\76\1\56\1\72\1\uffff\1\52\1\57"+
        "\1\uffff\1\141\1\145\1\155\10\uffff\1\165\1\72\1\162\1\170\1\154"+
        "\1\172\1\uffff\2\uffff\4\uffff\1\75\2\uffff\1\75\7\uffff\1\74\11"+
        "\uffff\1\154\1\uffff\1\163\1\147\10\uffff\1\154\1\uffff\1\151\1"+
        "\165\1\uffff\1\154\12\uffff\1\163\1\143\1\172\1\154\1\163\2\145"+
        "\1\162\1\uffff\4\172\1\151\4\uffff\1\160\1\164\1\151\1\157\1\156"+
        "\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\12\uffff\1\20\2\uffff\1\25\3\uffff\1\34\1\35\1\36\1\37\1\40\1"+
        "\41\1\42\1\43\6\uffff\1\53\2\uffff\1\57\1\60\1\1\1\2\1\uffff\1\15"+
        "\1\33\1\uffff\1\26\1\7\1\10\1\16\1\11\1\12\1\21\1\uffff\1\32\1\17"+
        "\1\20\1\23\1\22\1\55\1\56\1\24\1\25\1\uffff\1\53\2\uffff\1\34\1"+
        "\35\1\36\1\37\1\40\1\41\1\42\1\43\1\uffff\1\45\2\uffff\1\50\1\uffff"+
        "\1\51\1\52\1\54\1\57\1\5\1\3\1\6\1\4\1\13\1\14\10\uffff\1\31\5\uffff"+
        "\1\44\1\46\1\47\1\27\6\uffff\1\30";
    static final String DFA19_specialS =
        "\1\2\37\uffff\1\1\1\0\116\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\4\1\40\1\21\1\43\1\15\1"+
            "\2\1\41\1\27\1\30\1\13\1\12\1\24\1\7\1\10\1\14\1\34\11\35\1"+
            "\32\1\43\1\6\1\3\1\5\1\11\1\43\32\37\1\25\1\43\1\26\1\36\1\37"+
            "\1\43\3\37\1\17\1\37\1\16\2\37\1\20\4\37\1\31\5\37\1\33\6\37"+
            "\1\22\1\1\1\23\uff82\43",
            "\1\44",
            "\1\45",
            "\1\46\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "",
            "\1\65",
            "\1\67\4\uffff\1\70",
            "",
            "\1\73",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111\11\uffff\1\112",
            "\12\114\10\uffff\1\116\1\uffff\3\116\5\uffff\1\116\13\uffff"+
            "\1\113\6\uffff\1\114\2\uffff\1\116\1\uffff\3\116\5\uffff\1\116"+
            "\13\uffff\1\113",
            "\12\114\10\uffff\1\116\1\uffff\3\116\5\uffff\1\116\22\uffff"+
            "\1\114\2\uffff\1\116\1\uffff\3\116\5\uffff\1\116",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\0\117",
            "\0\117",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "\12\114\10\uffff\1\116\1\uffff\3\116\5\uffff\1\116\22\uffff"+
            "\1\114\2\uffff\1\116\1\uffff\3\116\5\uffff\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\151",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_33 = input.LA(1);

                        s = -1;
                        if ( ((LA19_33>='\u0000' && LA19_33<='\uFFFF')) ) {s = 79;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_32 = input.LA(1);

                        s = -1;
                        if ( ((LA19_32>='\u0000' && LA19_32<='\uFFFF')) ) {s = 79;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='|') ) {s = 1;}

                        else if ( (LA19_0=='&') ) {s = 2;}

                        else if ( (LA19_0=='=') ) {s = 3;}

                        else if ( (LA19_0=='!') ) {s = 4;}

                        else if ( (LA19_0=='>') ) {s = 5;}

                        else if ( (LA19_0=='<') ) {s = 6;}

                        else if ( (LA19_0=='-') ) {s = 7;}

                        else if ( (LA19_0=='.') ) {s = 8;}

                        else if ( (LA19_0=='?') ) {s = 9;}

                        else if ( (LA19_0=='+') ) {s = 10;}

                        else if ( (LA19_0=='*') ) {s = 11;}

                        else if ( (LA19_0=='/') ) {s = 12;}

                        else if ( (LA19_0=='%') ) {s = 13;}

                        else if ( (LA19_0=='f') ) {s = 14;}

                        else if ( (LA19_0=='d') ) {s = 15;}

                        else if ( (LA19_0=='i') ) {s = 16;}

                        else if ( (LA19_0=='#') ) {s = 17;}

                        else if ( (LA19_0=='{') ) {s = 18;}

                        else if ( (LA19_0=='}') ) {s = 19;}

                        else if ( (LA19_0==',') ) {s = 20;}

                        else if ( (LA19_0=='[') ) {s = 21;}

                        else if ( (LA19_0==']') ) {s = 22;}

                        else if ( (LA19_0=='(') ) {s = 23;}

                        else if ( (LA19_0==')') ) {s = 24;}

                        else if ( (LA19_0=='n') ) {s = 25;}

                        else if ( (LA19_0==':') ) {s = 26;}

                        else if ( (LA19_0=='t') ) {s = 27;}

                        else if ( (LA19_0=='0') ) {s = 28;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 29;}

                        else if ( (LA19_0=='^') ) {s = 30;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='c')||LA19_0=='e'||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='m')||(LA19_0>='o' && LA19_0<='s')||(LA19_0>='u' && LA19_0<='z')) ) {s = 31;}

                        else if ( (LA19_0=='\"') ) {s = 32;}

                        else if ( (LA19_0=='\'') ) {s = 33;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 34;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='$'||LA19_0==';'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

=======
package org.osate.alisa.common.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommonLexer extends Lexer {
    public static final int RULE_HEX=7;
    public static final int T__50=50;
    public static final int RULE_INT_EXPONENT=13;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_BASED_INTEGER=14;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=10;
    public static final int RULE_DIGIT=11;
    public static final int RULE_DECIMAL=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_INTEGER_LIT=4;
    public static final int T__21=21;
    public static final int RULE_REAL_LIT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_EXPONENT=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_EXTENDED_DIGIT=15;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCommonLexer() {;} 
    public InternalCommonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCommonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:11:7: ( '||' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:11:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:12:7: ( '&&' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:12:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:13:7: ( '==' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:13:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:14:7: ( '!=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:14:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:15:7: ( '===' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:15:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:16:7: ( '!==' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:16:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:17:7: ( '>=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:17:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:18:7: ( '>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:19:7: ( '<' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:20:7: ( '->' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:20:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:21:7: ( '..<' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:21:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:22:7: ( '..' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:22:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:23:7: ( '=>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:23:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:24:7: ( '<>' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:24:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:25:7: ( '?:' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:25:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:26:7: ( '+' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:27:7: ( '-' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:28:7: ( '*' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:28:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:29:7: ( '**' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:29:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:30:7: ( '/' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:30:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:31:7: ( '%' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:31:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:32:7: ( '!' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:32:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:33:7: ( 'false' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:33:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:34:7: ( 'description' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:34:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:35:7: ( 'img' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:35:9: 'img'
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:36:7: ( '.' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:37:7: ( '=' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:37:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:38:7: ( '{' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:38:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:39:7: ( '}' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:39:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:40:7: ( ',' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:41:7: ( '#' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:41:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:42:7: ( '[' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:42:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:43:7: ( ']' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:44:7: ( '(' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:44:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:45:7: ( ')' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:45:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:46:7: ( 'null' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:46:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:47:7: ( '::' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:47:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:48:7: ( 'this' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:48:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:49:7: ( 'true' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:49:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6043:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6043:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6043:36: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6043:47: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6043:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:40: ( '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:45: ( RULE_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6045:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:17: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:29: ( '_' ( RULE_DIGIT )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:34: ( RULE_DIGIT )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:52: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:64: ( '_' ( RULE_DIGIT )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:69: ( RULE_DIGIT )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:83: ( RULE_EXPONENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6047:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_INTEGER_LIT"
    public final void mRULE_INTEGER_LIT() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:18: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? ) )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:20: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:20: ( RULE_DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:20: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:32: ( '_' ( RULE_DIGIT )+ )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='_') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:33: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:37: ( RULE_DIGIT )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:37: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:51: ( '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )? | ( RULE_INT_EXPONENT )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='#') ) {
                alt17=1;
            }
            else {
                alt17=2;}
            switch (alt17) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:52: '#' RULE_BASED_INTEGER '#' ( RULE_INT_EXPONENT )?
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER(); 
                    match('#'); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:79: ( RULE_INT_EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:79: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:98: ( RULE_INT_EXPONENT )?
                    {
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:98: ( RULE_INT_EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6049:98: RULE_INT_EXPONENT
                            {
                            mRULE_INT_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6051:21: ( '0' .. '9' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6051:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6053:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6053:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='f')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:52: ( '_' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0=='_') ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6055:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:12: ( '0x' | '0X' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='0') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='x') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='X') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='F')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='f')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='#') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='B'||LA22_0=='b') ) {
                        alt22=1;
                    }
                    else if ( (LA22_0=='L'||LA22_0=='l') ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6057:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6059:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6059:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6059:21: ( '0' .. '9' | '_' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||LA24_0=='_') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='E'||LA26_0=='e') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:36: ( '+' | '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='+'||LA25_0=='-') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='B'||LA27_0=='b') ) {
                alt27=1;
            }
            else if ( (LA27_0=='D'||LA27_0=='F'||LA27_0=='L'||LA27_0=='d'||LA27_0=='f'||LA27_0=='l') ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6061:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6063:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6063:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6063:11: ( '^' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='^') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6063:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6063:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\"') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\'') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\\') ) {
                            alt30=1;
                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6065:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6067:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6067:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6067:24: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1=='/') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_1>='\u0000' && LA33_1<='.')||(LA33_1>='0' && LA33_1<='\uFFFF')) ) {
                        alt33=1;
                    }


                }
                else if ( ((LA33_0>='\u0000' && LA33_0<=')')||(LA33_0>='+' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6067:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:40: ( ( '\\r' )? '\\n' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:41: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\r') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6069:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6071:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6071:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6073:16: ( . )
            // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:6073:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt38=50;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:244: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 41 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:258: RULE_INTEGER_LIT
                {
                mRULE_INTEGER_LIT(); 

                }
                break;
            case 42 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:275: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 43 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:284: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:293: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 45 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:306: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:314: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:326: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:342: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:358: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ../org.osate.alisa.common.ui/src-gen/org/osate/alisa/common/ui/contentassist/antlr/internal/InternalCommon.g:1:366: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA38_eotS =
        "\1\uffff\2\43\1\50\1\52\1\54\1\56\1\60\1\62\1\43\1\uffff\1\66\1"+
        "\71\1\uffff\3\74\10\uffff\1\74\1\43\1\74\2\115\1\43\1\uffff\2\43"+
        "\4\uffff\1\125\2\uffff\1\127\7\uffff\1\131\11\uffff\1\74\1\uffff"+
        "\2\74\10\uffff\1\74\1\uffff\2\74\1\uffff\1\140\3\uffff\1\115\11"+
        "\uffff\2\74\1\147\3\74\1\uffff\1\115\1\140\1\uffff\1\115\2\74\1"+
        "\uffff\1\156\1\157\1\160\1\115\1\161\1\74\4\uffff\5\74\1\170\1\uffff";
    static final String DFA38_eofS =
        "\171\uffff";
    static final String DFA38_minS =
        "\1\0\1\174\1\46\3\75\2\76\1\56\1\72\1\uffff\2\52\1\uffff\1\141"+
        "\1\145\1\155\10\uffff\1\165\1\72\1\150\2\56\1\101\1\uffff\2\0\4"+
        "\uffff\1\75\2\uffff\1\75\7\uffff\1\74\11\uffff\1\154\1\uffff\1\163"+
        "\1\147\10\uffff\1\154\1\uffff\1\151\1\165\1\uffff\1\60\1\uffff\1"+
        "\53\1\uffff\1\56\11\uffff\1\163\1\143\1\60\1\154\1\163\1\145\1\uffff"+
        "\1\56\3\60\1\145\1\162\1\uffff\5\60\1\151\4\uffff\1\160\1\164\1"+
        "\151\1\157\1\156\1\60\1\uffff";
    static final String DFA38_maxS =
        "\1\uffff\1\174\1\46\1\76\2\75\2\76\1\56\1\72\1\uffff\1\52\1\57"+
        "\1\uffff\1\141\1\145\1\155\10\uffff\1\165\1\72\1\162\1\170\1\154"+
        "\1\172\1\uffff\2\uffff\4\uffff\1\75\2\uffff\1\75\7\uffff\1\74\11"+
        "\uffff\1\154\1\uffff\1\163\1\147\10\uffff\1\154\1\uffff\1\151\1"+
        "\165\1\uffff\1\154\1\uffff\1\71\1\uffff\1\154\11\uffff\1\163\1\143"+
        "\1\172\1\154\1\163\1\145\1\uffff\2\154\1\71\1\154\1\145\1\162\1"+
        "\uffff\3\172\1\154\1\172\1\151\4\uffff\1\160\1\164\1\151\1\157\1"+
        "\156\1\172\1\uffff";
    static final String DFA38_acceptS =
        "\12\uffff\1\20\2\uffff\1\25\3\uffff\1\34\1\35\1\36\1\37\1\40\1"+
        "\41\1\42\1\43\6\uffff\1\55\2\uffff\1\61\1\62\1\1\1\2\1\uffff\1\15"+
        "\1\33\1\uffff\1\26\1\7\1\10\1\16\1\11\1\12\1\21\1\uffff\1\32\1\17"+
        "\1\20\1\23\1\22\1\57\1\60\1\24\1\25\1\uffff\1\55\2\uffff\1\34\1"+
        "\35\1\36\1\37\1\40\1\41\1\42\1\43\1\uffff\1\45\2\uffff\1\52\1\uffff"+
        "\1\51\1\uffff\1\54\1\uffff\1\50\1\56\1\61\1\5\1\3\1\6\1\4\1\13\1"+
        "\14\6\uffff\1\53\6\uffff\1\31\6\uffff\1\44\1\46\1\47\1\27\6\uffff"+
        "\1\30";
    static final String DFA38_specialS =
        "\1\0\37\uffff\1\2\1\1\127\uffff}>";
    static final String[] DFA38_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\4\1\40\1\24\1\43\1\15\1"+
            "\2\1\41\1\27\1\30\1\13\1\12\1\23\1\7\1\10\1\14\1\34\11\35\1"+
            "\32\1\43\1\6\1\3\1\5\1\11\1\43\32\37\1\25\1\43\1\26\1\36\1\37"+
            "\1\43\3\37\1\17\1\37\1\16\2\37\1\20\4\37\1\31\5\37\1\33\6\37"+
            "\1\21\1\1\1\22\uff82\43",
            "\1\44",
            "\1\45",
            "\1\46\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "",
            "\1\65",
            "\1\67\4\uffff\1\70",
            "",
            "\1\73",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111\11\uffff\1\112",
            "\1\121\1\uffff\12\120\10\uffff\1\117\1\uffff\1\117\1\116\1"+
            "\117\5\uffff\1\117\13\uffff\1\113\6\uffff\1\114\2\uffff\1\117"+
            "\1\uffff\1\117\1\116\1\117\5\uffff\1\117\13\uffff\1\113",
            "\1\121\1\uffff\12\120\10\uffff\1\117\1\uffff\1\117\1\116\1"+
            "\117\5\uffff\1\117\22\uffff\1\114\2\uffff\1\117\1\uffff\1\117"+
            "\1\116\1\117\5\uffff\1\117",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\0\122",
            "\0\122",
            "",
            "",
            "",
            "",
            "\1\124",
            "",
            "",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "",
            "\12\141\10\uffff\1\117\1\uffff\3\117\5\uffff\1\117\22\uffff"+
            "\1\142\2\uffff\1\117\1\uffff\3\117\5\uffff\1\117",
            "",
            "\1\143\1\uffff\1\117\2\uffff\12\144",
            "",
            "\1\121\1\uffff\12\120\10\uffff\1\117\1\uffff\1\117\1\116\1"+
            "\117\5\uffff\1\117\22\uffff\1\114\2\uffff\1\117\1\uffff\1\117"+
            "\1\116\1\117\5\uffff\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\121\1\uffff\12\141\10\uffff\1\117\1\uffff\1\117\1\116\1"+
            "\117\5\uffff\1\117\22\uffff\1\114\2\uffff\1\117\1\uffff\1\117"+
            "\1\116\1\117\5\uffff\1\117",
            "\12\142\10\uffff\1\117\1\uffff\3\117\5\uffff\1\117\22\uffff"+
            "\1\142\2\uffff\1\117\1\uffff\3\117\5\uffff\1\117",
            "\12\144",
            "\12\153\10\uffff\1\117\1\uffff\1\117\1\uffff\1\117\5\uffff"+
            "\1\117\22\uffff\1\117\2\uffff\1\117\1\uffff\1\117\1\uffff\1"+
            "\117\5\uffff\1\117",
            "\1\154",
            "\1\155",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\153\10\uffff\1\117\1\uffff\1\117\1\uffff\1\117\5\uffff"+
            "\1\117\22\uffff\1\117\2\uffff\1\117\1\uffff\1\117\1\uffff\1"+
            "\117\5\uffff\1\117",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\162",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_REAL_LIT | RULE_INTEGER_LIT | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                        s = -1;
                        if ( (LA38_0=='|') ) {s = 1;}

                        else if ( (LA38_0=='&') ) {s = 2;}

                        else if ( (LA38_0=='=') ) {s = 3;}

                        else if ( (LA38_0=='!') ) {s = 4;}

                        else if ( (LA38_0=='>') ) {s = 5;}

                        else if ( (LA38_0=='<') ) {s = 6;}

                        else if ( (LA38_0=='-') ) {s = 7;}

                        else if ( (LA38_0=='.') ) {s = 8;}

                        else if ( (LA38_0=='?') ) {s = 9;}

                        else if ( (LA38_0=='+') ) {s = 10;}

                        else if ( (LA38_0=='*') ) {s = 11;}

                        else if ( (LA38_0=='/') ) {s = 12;}

                        else if ( (LA38_0=='%') ) {s = 13;}

                        else if ( (LA38_0=='f') ) {s = 14;}

                        else if ( (LA38_0=='d') ) {s = 15;}

                        else if ( (LA38_0=='i') ) {s = 16;}

                        else if ( (LA38_0=='{') ) {s = 17;}

                        else if ( (LA38_0=='}') ) {s = 18;}

                        else if ( (LA38_0==',') ) {s = 19;}

                        else if ( (LA38_0=='#') ) {s = 20;}

                        else if ( (LA38_0=='[') ) {s = 21;}

                        else if ( (LA38_0==']') ) {s = 22;}

                        else if ( (LA38_0=='(') ) {s = 23;}

                        else if ( (LA38_0==')') ) {s = 24;}

                        else if ( (LA38_0=='n') ) {s = 25;}

                        else if ( (LA38_0==':') ) {s = 26;}

                        else if ( (LA38_0=='t') ) {s = 27;}

                        else if ( (LA38_0=='0') ) {s = 28;}

                        else if ( ((LA38_0>='1' && LA38_0<='9')) ) {s = 29;}

                        else if ( (LA38_0=='^') ) {s = 30;}

                        else if ( ((LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='c')||LA38_0=='e'||(LA38_0>='g' && LA38_0<='h')||(LA38_0>='j' && LA38_0<='m')||(LA38_0>='o' && LA38_0<='s')||(LA38_0>='u' && LA38_0<='z')) ) {s = 31;}

                        else if ( (LA38_0=='\"') ) {s = 32;}

                        else if ( (LA38_0=='\'') ) {s = 33;}

                        else if ( ((LA38_0>='\t' && LA38_0<='\n')||LA38_0=='\r'||LA38_0==' ') ) {s = 34;}

                        else if ( ((LA38_0>='\u0000' && LA38_0<='\b')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\u001F')||LA38_0=='$'||LA38_0==';'||LA38_0=='@'||LA38_0=='\\'||LA38_0=='`'||(LA38_0>='~' && LA38_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_33 = input.LA(1);

                        s = -1;
                        if ( ((LA38_33>='\u0000' && LA38_33<='\uFFFF')) ) {s = 82;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_32 = input.LA(1);

                        s = -1;
                        if ( ((LA38_32>='\u0000' && LA38_32<='\uFFFF')) ) {s = 82;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

>>>>>>> d17345d completed resolving val and compute variables.
}