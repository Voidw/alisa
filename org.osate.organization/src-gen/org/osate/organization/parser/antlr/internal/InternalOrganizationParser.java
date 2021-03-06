package org.osate.organization.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.organization.services.OrganizationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */
@SuppressWarnings("all")
public class InternalOrganizationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Organization", "Description", "Stakeholder", "Supervisor", "Email", "Phone", "Title", "Full", "Name", "Role", "FullStop", "LeftSquareBracket", "RightSquareBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Organization=4;
    public static final int Description=5;
    public static final int Email=8;
    public static final int RULE_STRING=19;
    public static final int Full=11;
    public static final int Name=12;
    public static final int RULE_SL_COMMENT=21;
    public static final int Stakeholder=6;
    public static final int Phone=9;
    public static final int EOF=-1;
    public static final int RightSquareBracket=16;
    public static final int Supervisor=7;
    public static final int FullStop=14;
    public static final int RULE_ID=17;
    public static final int RULE_WS=22;
    public static final int Title=10;
    public static final int RULE_ANY_OTHER=23;
    public static final int Role=13;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=20;
    public static final int LeftSquareBracket=15;

    // delegates
    // delegators


        public InternalOrganizationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOrganizationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOrganizationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g"; }




    	private OrganizationGrammarAccess grammarAccess;
    	 	
    	public InternalOrganizationParser(TokenStream input, OrganizationGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Organization";	
    	} 
    	   	   	
    	@Override
    	protected OrganizationGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleOrganization"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:73:1: entryRuleOrganization returns [EObject current=null] : iv_ruleOrganization= ruleOrganization EOF ;
    public final EObject entryRuleOrganization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganization = null;


        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:74:2: (iv_ruleOrganization= ruleOrganization EOF )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:75:2: iv_ruleOrganization= ruleOrganization EOF
            {
             newCompositeNode(grammarAccess.getOrganizationRule()); 
            pushFollow(FOLLOW_ruleOrganization_in_entryRuleOrganization67);
            iv_ruleOrganization=ruleOrganization();

            state._fsp--;

             current =iv_ruleOrganization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganization77); 

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
    // $ANTLR end "entryRuleOrganization"


    // $ANTLR start "ruleOrganization"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:82:1: ruleOrganization returns [EObject current=null] : (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ ) ;
    public final EObject ruleOrganization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_stakeholder_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:85:28: ( (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:86:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:86:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:87:2: otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+
            {
            otherlv_0=(Token)match(input,Organization,FOLLOW_Organization_in_ruleOrganization115); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationAccess().getOrganizationKeyword_0());
                
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:91:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:92:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:92:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:93:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrganization131); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:109:2: ( (lv_stakeholder_2_0= ruleStakeholder ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Stakeholder && LA1_0<=Supervisor)||LA1_0==RightSquareBracket) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:110:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:110:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:111:3: lv_stakeholder_2_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleOrganization157);
            	    lv_stakeholder_2_0=ruleStakeholder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganizationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stakeholder",
            	            		lv_stakeholder_2_0, 
            	            		"Stakeholder");
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
    // $ANTLR end "ruleOrganization"


    // $ANTLR start "entryRuleStakeholder"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:135:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:136:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:137:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder193);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder203); 

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
    // $ANTLR end "entryRuleStakeholder"


    // $ANTLR start "ruleStakeholder"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:144:1: ruleStakeholder returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_fullname_7_0=null;
        Token otherlv_8=null;
        Token lv_title_9_0=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token lv_role_13_0=null;
        Token otherlv_14=null;
        Token lv_email_15_0=null;
        Token otherlv_16=null;
        Token lv_phone_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:147:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:148:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:148:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:150:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:150:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:151:2: ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup());
            	
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:154:2: ( ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?)
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:155:3: ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:155:3: ( ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                switch ( input.LA(1) ) {
                case Stakeholder:
                    {
                    int LA4_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0) ) {
                        alt4=1;
                    }


                    }
                    break;
                case Supervisor:
                    {
                    int LA4_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                    }
                    break;
                case RightSquareBracket:
                    {
                    int LA4_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:157:4: ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) )
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:157:4: ({...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:158:5: {...}? => ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:158:106: ( ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:159:6: ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:162:6: ({...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:162:7: {...}? => (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:162:16: (otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:163:2: otherlv_1= Stakeholder ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftSquareBracket ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            	    {
            	    otherlv_1=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleStakeholder286); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0_0());
            	        
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:167:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:168:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:168:1: (lv_name_2_0= RULE_ID )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:169:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder302); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleStakeholder320); 

            	        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getLeftSquareBracketKeyword_0_2());
            	        
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:190:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:192:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:192:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:193:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* )
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:196:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )* )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:197:3: ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )*
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:197:3: ( ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) ) )*
            	    loop2:
            	    do {
            	        int alt2=7;
            	        int LA2_0 = input.LA(1);

            	        if ( LA2_0 ==Full && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0) ) {
            	            alt2=1;
            	        }
            	        else if ( LA2_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1) ) {
            	            alt2=2;
            	        }
            	        else if ( LA2_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2) ) {
            	            alt2=3;
            	        }
            	        else if ( LA2_0 ==Role && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3) ) {
            	            alt2=4;
            	        }
            	        else if ( LA2_0 ==Email && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4) ) {
            	            alt2=5;
            	        }
            	        else if ( LA2_0 ==Phone && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5) ) {
            	            alt2=6;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:199:4: ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:199:4: ({...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:200:5: {...}? => ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:200:110: ( ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:201:6: ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:204:6: ({...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:204:7: {...}? => (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:204:16: (otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:205:2: otherlv_5= Full otherlv_6= Name ( (lv_fullname_7_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,Full,FOLLOW_Full_in_ruleStakeholder378); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getFullKeyword_0_3_0_0());
            	    	        
            	    	    otherlv_6=(Token)match(input,Name,FOLLOW_Name_in_ruleStakeholder390); 

            	    	        	newLeafNode(otherlv_6, grammarAccess.getStakeholderAccess().getNameKeyword_0_3_0_1());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:214:1: ( (lv_fullname_7_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:215:1: (lv_fullname_7_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:215:1: (lv_fullname_7_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:216:3: lv_fullname_7_0= RULE_STRING
            	    	    {
            	    	    lv_fullname_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder406); 

            	    	    			newLeafNode(lv_fullname_7_0, grammarAccess.getStakeholderAccess().getFullnameSTRINGTerminalRuleCall_0_3_0_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"fullname",
            	    	            		lv_fullname_7_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:239:4: ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:239:4: ({...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:240:5: {...}? => ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:240:110: ( ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:241:6: ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:244:6: ({...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:244:7: {...}? => (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:244:16: (otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:245:2: otherlv_8= Title ( (lv_title_9_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,Title,FOLLOW_Title_in_ruleStakeholder480); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getStakeholderAccess().getTitleKeyword_0_3_1_0());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:249:1: ( (lv_title_9_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:250:1: (lv_title_9_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:250:1: (lv_title_9_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:251:3: lv_title_9_0= RULE_STRING
            	    	    {
            	    	    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder496); 

            	    	    			newLeafNode(lv_title_9_0, grammarAccess.getStakeholderAccess().getTitleSTRINGTerminalRuleCall_0_3_1_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"title",
            	    	            		lv_title_9_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:274:4: ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:274:4: ({...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:275:5: {...}? => ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:275:110: ( ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:276:6: ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:279:6: ({...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:279:7: {...}? => (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:279:16: (otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:280:2: otherlv_10= Description ( (lv_description_11_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,Description,FOLLOW_Description_in_ruleStakeholder570); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getStakeholderAccess().getDescriptionKeyword_0_3_2_0());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:284:1: ( (lv_description_11_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:285:1: (lv_description_11_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:285:1: (lv_description_11_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:286:3: lv_description_11_0= RULE_STRING
            	    	    {
            	    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder586); 

            	    	    			newLeafNode(lv_description_11_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_0_3_2_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"description",
            	    	            		lv_description_11_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:309:4: ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:309:4: ({...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:310:5: {...}? => ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:310:110: ( ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:311:6: ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:314:6: ({...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:314:7: {...}? => (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:314:16: (otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:315:2: otherlv_12= Role ( (lv_role_13_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,Role,FOLLOW_Role_in_ruleStakeholder660); 

            	    	        	newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getRoleKeyword_0_3_3_0());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:319:1: ( (lv_role_13_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:320:1: (lv_role_13_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:320:1: (lv_role_13_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:321:3: lv_role_13_0= RULE_STRING
            	    	    {
            	    	    lv_role_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder676); 

            	    	    			newLeafNode(lv_role_13_0, grammarAccess.getStakeholderAccess().getRoleSTRINGTerminalRuleCall_0_3_3_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"role",
            	    	            		lv_role_13_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:344:4: ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:344:4: ({...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:345:5: {...}? => ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:345:110: ( ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:346:6: ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:349:6: ({...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:349:7: {...}? => (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:349:16: (otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:350:2: otherlv_14= Email ( (lv_email_15_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,Email,FOLLOW_Email_in_ruleStakeholder750); 

            	    	        	newLeafNode(otherlv_14, grammarAccess.getStakeholderAccess().getEmailKeyword_0_3_4_0());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:354:1: ( (lv_email_15_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:355:1: (lv_email_15_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:355:1: (lv_email_15_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:356:3: lv_email_15_0= RULE_STRING
            	    	    {
            	    	    lv_email_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder766); 

            	    	    			newLeafNode(lv_email_15_0, grammarAccess.getStakeholderAccess().getEmailSTRINGTerminalRuleCall_0_3_4_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"email",
            	    	            		lv_email_15_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:379:4: ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:379:4: ({...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:380:5: {...}? => ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5)");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:380:110: ( ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:381:6: ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5);
            	    	    	 				
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:384:6: ({...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:384:7: {...}? => (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    	    }
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:384:16: (otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:385:2: otherlv_16= Phone ( (lv_phone_17_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,Phone,FOLLOW_Phone_in_ruleStakeholder840); 

            	    	        	newLeafNode(otherlv_16, grammarAccess.getStakeholderAccess().getPhoneKeyword_0_3_5_0());
            	    	        
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:389:1: ( (lv_phone_17_0= RULE_STRING ) )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:390:1: (lv_phone_17_0= RULE_STRING )
            	    	    {
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:390:1: (lv_phone_17_0= RULE_STRING )
            	    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:391:3: lv_phone_17_0= RULE_STRING
            	    	    {
            	    	    lv_phone_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder856); 

            	    	    			newLeafNode(lv_phone_17_0, grammarAccess.getStakeholderAccess().getPhoneSTRINGTerminalRuleCall_0_3_5_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStakeholderRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"phone",
            	    	            		lv_phone_17_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
            	    	

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:428:4: ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) )
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:428:4: ({...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:429:5: {...}? => ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:429:106: ( ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:430:6: ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:433:6: ({...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket ) )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:433:7: {...}? => ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:433:16: ( (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket )
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:433:17: (otherlv_18= Supervisor ( ( ruleQID ) ) )? otherlv_20= RightSquareBracket
            	    {
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:433:17: (otherlv_18= Supervisor ( ( ruleQID ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==Supervisor) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:434:2: otherlv_18= Supervisor ( ( ruleQID ) )
            	            {
            	            otherlv_18=(Token)match(input,Supervisor,FOLLOW_Supervisor_in_ruleStakeholder972); 

            	                	newLeafNode(otherlv_18, grammarAccess.getStakeholderAccess().getSupervisorKeyword_1_0_0());
            	                
            	            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:438:1: ( ( ruleQID ) )
            	            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:439:1: ( ruleQID )
            	            {
            	            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:439:1: ( ruleQID )
            	            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:440:3: ruleQID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getStakeholderAccess().getSupervisorStakeholderCrossReference_1_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQID_in_ruleStakeholder994);
            	            ruleQID();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleStakeholder1009); 

            	        	newLeafNode(otherlv_20, grammarAccess.getStakeholderAccess().getRightSquareBracketKeyword_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleQID"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:481:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:482:1: (iv_ruleQID= ruleQID EOF )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:483:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID1090);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID1101); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:490:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:494:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )? ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:495:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )? )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:495:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )? )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:495:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID1141); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:502:1: (kw= FullStop this_ID_2= RULE_ID )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FullStop) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/internal/InternalOrganizationParser.g:503:2: kw= FullStop this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQID1160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID1175); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOrganization_in_entryRuleOrganization67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganization77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Organization_in_ruleOrganization115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganization131 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleOrganization157 = new BitSet(new long[]{0x00000000000100C2L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleStakeholder286 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleStakeholder320 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Full_in_ruleStakeholder378 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Name_in_ruleStakeholder390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder406 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Title_in_ruleStakeholder480 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder496 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Description_in_ruleStakeholder570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder586 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Role_in_ruleStakeholder660 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder676 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Email_in_ruleStakeholder750 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder766 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Phone_in_ruleStakeholder840 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder856 = new BitSet(new long[]{0x0000000000012FE2L});
    public static final BitSet FOLLOW_Supervisor_in_ruleStakeholder972 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQID_in_ruleStakeholder994 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleStakeholder1009 = new BitSet(new long[]{0x00000000000100C2L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID1141 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_FullStop_in_ruleQID1160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID1175 = new BitSet(new long[]{0x0000000000000002L});

}
