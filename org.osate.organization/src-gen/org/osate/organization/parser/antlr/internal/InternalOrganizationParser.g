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
parser grammar InternalOrganizationParser;

options {
	tokenVocab=InternalOrganizationLexer;
	superClass=AbstractInternalAntlrParser;
	
}

@header {
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

}

@members {


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
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleOrganization
entryRuleOrganization returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOrganizationRule()); }
	 iv_ruleOrganization=ruleOrganization 
	 { $current=$iv_ruleOrganization.current; } 
	 EOF 
;

// Rule Organization
ruleOrganization returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Organization
    {
    	newLeafNode(otherlv_0, grammarAccess.getOrganizationAccess().getOrganizationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOrganizationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); 
	    }
		lv_stakeholder_2_0=ruleStakeholder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrganizationRule());
	        }
       		add(
       			$current, 
       			"stakeholder",
        		lv_stakeholder_2_0, 
        		"Stakeholder");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleStakeholder
entryRuleStakeholder returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getStakeholderRule()); }
	 iv_ruleStakeholder=ruleStakeholder 
	 { $current=$iv_ruleStakeholder.current; } 
	 EOF 
;

// Rule Stakeholder
ruleStakeholder returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>(
	otherlv_1=Stakeholder
    {
    	newLeafNode(otherlv_1, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0_0());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)
	otherlv_3=LeftSquareBracket
    {
    	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getLeftSquareBracketKeyword_0_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0);
	 				}
					({true}?=>(
	otherlv_5=Full
    {
    	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getFullKeyword_0_3_0_0());
    }

	otherlv_6=Name
    {
    	newLeafNode(otherlv_6, grammarAccess.getStakeholderAccess().getNameKeyword_0_3_0_1());
    }
(
(
		lv_fullname_7_0=RULE_STRING
		{
			newLeafNode(lv_fullname_7_0, grammarAccess.getStakeholderAccess().getFullnameSTRINGTerminalRuleCall_0_3_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"fullname",
        		lv_fullname_7_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 1);
	 				}
					({true}?=>(
	otherlv_8=Title
    {
    	newLeafNode(otherlv_8, grammarAccess.getStakeholderAccess().getTitleKeyword_0_3_1_0());
    }
(
(
		lv_title_9_0=RULE_STRING
		{
			newLeafNode(lv_title_9_0, grammarAccess.getStakeholderAccess().getTitleSTRINGTerminalRuleCall_0_3_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_9_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 2);
	 				}
					({true}?=>(
	otherlv_10=Description
    {
    	newLeafNode(otherlv_10, grammarAccess.getStakeholderAccess().getDescriptionKeyword_0_3_2_0());
    }
(
(
		lv_description_11_0=RULE_STRING
		{
			newLeafNode(lv_description_11_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_0_3_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_11_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 3);
	 				}
					({true}?=>(
	otherlv_12=Role
    {
    	newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getRoleKeyword_0_3_3_0());
    }
(
(
		lv_role_13_0=RULE_STRING
		{
			newLeafNode(lv_role_13_0, grammarAccess.getStakeholderAccess().getRoleSTRINGTerminalRuleCall_0_3_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"role",
        		lv_role_13_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 4);
	 				}
					({true}?=>(
	otherlv_14=Email
    {
    	newLeafNode(otherlv_14, grammarAccess.getStakeholderAccess().getEmailKeyword_0_3_4_0());
    }
(
(
		lv_email_15_0=RULE_STRING
		{
			newLeafNode(lv_email_15_0, grammarAccess.getStakeholderAccess().getEmailSTRINGTerminalRuleCall_0_3_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"email",
        		lv_email_15_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 5);
	 				}
					({true}?=>(
	otherlv_16=Phone
    {
    	newLeafNode(otherlv_16, grammarAccess.getStakeholderAccess().getPhoneKeyword_0_3_5_0());
    }
(
(
		lv_phone_17_0=RULE_STRING
		{
			newLeafNode(lv_phone_17_0, grammarAccess.getStakeholderAccess().getPhoneSTRINGTerminalRuleCall_0_3_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"phone",
        		lv_phone_17_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	}

)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>((
	otherlv_18=Supervisor
    {
    	newLeafNode(otherlv_18, grammarAccess.getStakeholderAccess().getSupervisorKeyword_1_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStakeholderRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getStakeholderAccess().getSupervisorStakeholderCrossReference_1_0_1_0()); 
	    }
		ruleQID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?
	otherlv_20=RightSquareBracket
    {
    	newLeafNode(otherlv_20, grammarAccess.getStakeholderAccess().getRightSquareBracketKeyword_1_1());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	}

)
;





// Entry rule entryRuleQID
entryRuleQID returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getQIDRule()); } 
	 iv_ruleQID=ruleQID 
	 { $current=$iv_ruleQID.current.getText(); }  
	 EOF 
;

// Rule QID
ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw=FullStop 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
    }
)?)
    ;





