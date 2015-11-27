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
grammar InternalAssure;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.osate.assure.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.osate.assure.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.assure.services.AssureGrammarAccess;

}

@parser::members {

 	private AssureGrammarAccess grammarAccess;
 	
    public InternalAssureParser(TokenStream input, AssureGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "AssuranceCase";	
   	}
   	
   	@Override
   	protected AssureGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAssuranceCase
entryRuleAssuranceCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssuranceCaseRule()); }
	 iv_ruleAssuranceCase=ruleAssuranceCase 
	 { $current=$iv_ruleAssuranceCase.current; } 
	 EOF 
;

// Rule AssuranceCase
ruleAssuranceCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAssuranceCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='for' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAssuranceCaseAccess().getForKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getTargetAssurancePlanCrossReference_2_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='system' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAssuranceCaseAccess().getSystemKeyword_3_0());
    }
(
(
		lv_targetSystem_5_0=RULE_ID
		{
			newLeafNode(lv_targetSystem_5_0, grammarAccess.getAssuranceCaseAccess().getTargetSystemIDTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"targetSystem",
        		lv_targetSystem_5_0, 
        		"ID");
	    }

)
))?	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAssuranceCaseAccess().getLeftSquareBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getMetricsMetricsParserRuleCall_5_0()); 
	    }
		lv_metrics_7_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_7_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='message' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAssuranceCaseAccess().getMessageKeyword_6_0());
    }
(
(
		lv_message_9_0=RULE_STRING
		{
			newLeafNode(lv_message_9_0, grammarAccess.getAssuranceCaseAccess().getMessageSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_9_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getClaimResultClaimResultParserRuleCall_7_0()); 
	    }
		lv_claimResult_10_0=ruleClaimResult		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseRule());
	        }
       		add(
       			$current, 
       			"claimResult",
        		lv_claimResult_10_0, 
        		"ClaimResult");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getSubAssuranceCaseAssuranceCaseParserRuleCall_8_0()); 
	    }
		lv_subAssuranceCase_11_0=ruleAssuranceCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseRule());
	        }
       		add(
       			$current, 
       			"subAssuranceCase",
        		lv_subAssuranceCase_11_0, 
        		"AssuranceCase");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_12=']' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getAssuranceCaseAccess().getRightSquareBracketKeyword_9());
    }
)
;





// Entry rule entryRuleClaimResult
entryRuleClaimResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClaimResultRule()); }
	 iv_ruleClaimResult=ruleClaimResult 
	 { $current=$iv_ruleClaimResult.current; } 
	 EOF 
;

// Rule ClaimResult
ruleClaimResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='claim' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClaimResultAccess().getClaimKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClaimResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getClaimResultAccess().getTargetRequirementCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClaimResultAccess().getLeftSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClaimResultAccess().getMetricsMetricsParserRuleCall_3_0()); 
	    }
		lv_metrics_3_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClaimResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_3_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='message' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClaimResultAccess().getMessageKeyword_4_0());
    }
(
(
		lv_message_5_0=RULE_STRING
		{
			newLeafNode(lv_message_5_0, grammarAccess.getClaimResultAccess().getMessageSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClaimResultRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_5_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getClaimResultAccess().getSubClaimResultClaimResultParserRuleCall_5_0()); 
	    }
		lv_subClaimResult_6_0=ruleClaimResult		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClaimResultRule());
	        }
       		add(
       			$current, 
       			"subClaimResult",
        		lv_subClaimResult_6_0, 
        		"ClaimResult");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClaimResultAccess().getVerificationActivityResultVerificationExprParserRuleCall_6_0()); 
	    }
		lv_verificationActivityResult_7_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClaimResultRule());
	        }
       		add(
       			$current, 
       			"verificationActivityResult",
        		lv_verificationActivityResult_7_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8=']' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getClaimResultAccess().getRightSquareBracketKeyword_7());
    }
)
;





// Entry rule entryRulePreconditionResult
entryRulePreconditionResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPreconditionResultRule()); }
	 iv_rulePreconditionResult=rulePreconditionResult 
	 { $current=$iv_rulePreconditionResult.current; } 
	 EOF 
;

// Rule PreconditionResult
rulePreconditionResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='precondition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPreconditionResultAccess().getPreconditionKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getPreconditionResultAccess().getPreconditionResultAction_1(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPreconditionResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getTargetVerificationMethodCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='[' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPreconditionResultAccess().getLeftSquareBracketKeyword_3());
    }
	otherlv_4='executionstate' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPreconditionResultAccess().getExecutionstateKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getExecutionStateVerificationExecutionStateEnumRuleCall_5_0()); 
	    }
		lv_executionState_5_0=ruleVerificationExecutionState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreconditionResultRule());
	        }
       		set(
       			$current, 
       			"executionState",
        		lv_executionState_5_0, 
        		"VerificationExecutionState");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='resultstate' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPreconditionResultAccess().getResultstateKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getResultStateVerificationResultStateEnumRuleCall_7_0()); 
	    }
		lv_resultState_7_0=ruleVerificationResultState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreconditionResultRule());
	        }
       		set(
       			$current, 
       			"resultState",
        		lv_resultState_7_0, 
        		"VerificationResultState");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='issues' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPreconditionResultAccess().getIssuesKeyword_8_0());
    }
	otherlv_9='[' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getPreconditionResultAccess().getLeftSquareBracketKeyword_8_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getIssuesResultIssueParserRuleCall_8_2_0()); 
	    }
		lv_issues_10_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreconditionResultRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_10_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getPreconditionResultAccess().getRightSquareBracketKeyword_8_3());
    }
)?(	otherlv_12='report' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getPreconditionResultAccess().getReportKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPreconditionResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getResultReportResultReportCrossReference_9_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getPreconditionResultAccess().getMetricsMetricsParserRuleCall_10_0()); 
	    }
		lv_metrics_14_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreconditionResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_14_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15='message' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getPreconditionResultAccess().getMessageKeyword_11_0());
    }
(
(
		lv_message_16_0=RULE_STRING
		{
			newLeafNode(lv_message_16_0, grammarAccess.getPreconditionResultAccess().getMessageSTRINGTerminalRuleCall_11_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPreconditionResultRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_16_0, 
        		"STRING");
	    }

)
))?	otherlv_17=']' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getPreconditionResultAccess().getRightSquareBracketKeyword_12());
    }
)
;





// Entry rule entryRuleValidationResult
entryRuleValidationResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValidationResultRule()); }
	 iv_ruleValidationResult=ruleValidationResult 
	 { $current=$iv_ruleValidationResult.current; } 
	 EOF 
;

// Rule ValidationResult
ruleValidationResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='validation' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getValidationResultAccess().getValidationKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getValidationResultAccess().getValidationResultAction_1(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getValidationResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getTargetVerificationMethodCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='[' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getValidationResultAccess().getLeftSquareBracketKeyword_3());
    }
	otherlv_4='executionstate' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getValidationResultAccess().getExecutionstateKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getExecutionStateVerificationExecutionStateEnumRuleCall_5_0()); 
	    }
		lv_executionState_5_0=ruleVerificationExecutionState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValidationResultRule());
	        }
       		set(
       			$current, 
       			"executionState",
        		lv_executionState_5_0, 
        		"VerificationExecutionState");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='resultstate' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getValidationResultAccess().getResultstateKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getResultStateVerificationResultStateEnumRuleCall_7_0()); 
	    }
		lv_resultState_7_0=ruleVerificationResultState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValidationResultRule());
	        }
       		set(
       			$current, 
       			"resultState",
        		lv_resultState_7_0, 
        		"VerificationResultState");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='issues' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getValidationResultAccess().getIssuesKeyword_8_0());
    }
	otherlv_9='[' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getValidationResultAccess().getLeftSquareBracketKeyword_8_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getIssuesResultIssueParserRuleCall_8_2_0()); 
	    }
		lv_issues_10_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValidationResultRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_10_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getValidationResultAccess().getRightSquareBracketKeyword_8_3());
    }
)?(	otherlv_12='report' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getValidationResultAccess().getReportKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getValidationResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getResultReportResultReportCrossReference_9_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getValidationResultAccess().getMetricsMetricsParserRuleCall_10_0()); 
	    }
		lv_metrics_14_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValidationResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_14_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15='message' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getValidationResultAccess().getMessageKeyword_11_0());
    }
(
(
		lv_message_16_0=RULE_STRING
		{
			newLeafNode(lv_message_16_0, grammarAccess.getValidationResultAccess().getMessageSTRINGTerminalRuleCall_11_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getValidationResultRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_16_0, 
        		"STRING");
	    }

)
))?	otherlv_17=']' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getValidationResultAccess().getRightSquareBracketKeyword_12());
    }
)
;





// Entry rule entryRuleVerificationActivityResult
entryRuleVerificationActivityResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVerificationActivityResultRule()); }
	 iv_ruleVerificationActivityResult=ruleVerificationActivityResult 
	 { $current=$iv_ruleVerificationActivityResult.current; } 
	 EOF 
;

// Rule VerificationActivityResult
ruleVerificationActivityResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='verification' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityResultAccess().getVerificationKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getVerificationActivityResultAccess().getVerificationActivityResultAction_1(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVerificationActivityResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getTargetVerificationActivityCrossReference_2_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='[' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityResultAccess().getLeftSquareBracketKeyword_3());
    }
	otherlv_4='executionstate' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getVerificationActivityResultAccess().getExecutionstateKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getExecutionStateVerificationExecutionStateEnumRuleCall_5_0()); 
	    }
		lv_executionState_5_0=ruleVerificationExecutionState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		set(
       			$current, 
       			"executionState",
        		lv_executionState_5_0, 
        		"VerificationExecutionState");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='resultstate' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getVerificationActivityResultAccess().getResultstateKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getResultStateVerificationResultStateEnumRuleCall_7_0()); 
	    }
		lv_resultState_7_0=ruleVerificationResultState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		set(
       			$current, 
       			"resultState",
        		lv_resultState_7_0, 
        		"VerificationResultState");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='issues' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getVerificationActivityResultAccess().getIssuesKeyword_8_0());
    }
	otherlv_9='[' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityResultAccess().getLeftSquareBracketKeyword_8_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getIssuesResultIssueParserRuleCall_8_2_0()); 
	    }
		lv_issues_10_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_10_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getVerificationActivityResultAccess().getRightSquareBracketKeyword_8_3());
    }
)?(	otherlv_12='report' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityResultAccess().getReportKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getVerificationActivityResultRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getResultReportResultReportCrossReference_9_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getMetricsMetricsParserRuleCall_10_0()); 
	    }
		lv_metrics_14_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_14_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15='message' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getVerificationActivityResultAccess().getMessageKeyword_11_0());
    }
(
(
		lv_message_16_0=RULE_STRING
		{
			newLeafNode(lv_message_16_0, grammarAccess.getVerificationActivityResultAccess().getMessageSTRINGTerminalRuleCall_11_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVerificationActivityResultRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_16_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getPreconditionResultPreconditionResultParserRuleCall_12_0()); 
	    }
		lv_preconditionResult_17_0=rulePreconditionResult		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		set(
       			$current, 
       			"preconditionResult",
        		lv_preconditionResult_17_0, 
        		"PreconditionResult");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getVerificationActivityResultAccess().getValidationResultValidationResultParserRuleCall_13_0()); 
	    }
		lv_validationResult_18_0=ruleValidationResult		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerificationActivityResultRule());
	        }
       		set(
       			$current, 
       			"validationResult",
        		lv_validationResult_18_0, 
        		"ValidationResult");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_19=']' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getVerificationActivityResultAccess().getRightSquareBracketKeyword_14());
    }
)
;







// Entry rule entryRuleVerificationExpr
entryRuleVerificationExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVerificationExprRule()); }
	 iv_ruleVerificationExpr=ruleVerificationExpr 
	 { $current=$iv_ruleVerificationExpr.current; } 
	 EOF 
;

// Rule VerificationExpr
ruleVerificationExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getVerificationExprAccess().getVerificationActivityResultParserRuleCall_0()); 
    }
    this_VerificationActivityResult_0=ruleVerificationActivityResult
    { 
        $current = $this_VerificationActivityResult_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getVerificationExprAccess().getElseResultParserRuleCall_1()); 
    }
    this_ElseResult_1=ruleElseResult
    { 
        $current = $this_ElseResult_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getVerificationExprAccess().getThenResultParserRuleCall_2()); 
    }
    this_ThenResult_2=ruleThenResult
    { 
        $current = $this_ThenResult_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleElseResult
entryRuleElseResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElseResultRule()); }
	 iv_ruleElseResult=ruleElseResult 
	 { $current=$iv_ruleElseResult.current; } 
	 EOF 
;

// Rule ElseResult
ruleElseResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='else' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getElseResultAccess().getElseKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getFirstVerificationExprParserRuleCall_1_0()); 
	    }
		lv_first_1_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		add(
       			$current, 
       			"first",
        		lv_first_1_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+(	otherlv_2='error' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getElseResultAccess().getErrorKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getErrorVerificationExprParserRuleCall_2_1_0()); 
	    }
		lv_error_3_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		add(
       			$current, 
       			"error",
        		lv_error_3_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(	otherlv_4='fail' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getElseResultAccess().getFailKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getFailVerificationExprParserRuleCall_3_1_0()); 
	    }
		lv_fail_5_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		add(
       			$current, 
       			"fail",
        		lv_fail_5_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(	otherlv_6='timeout' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getElseResultAccess().getTimeoutKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getTimeoutVerificationExprParserRuleCall_4_1_0()); 
	    }
		lv_timeout_7_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		add(
       			$current, 
       			"timeout",
        		lv_timeout_7_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?	otherlv_8='[' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getElseResultAccess().getLeftSquareBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getDidFailElseTypeEnumRuleCall_6_0()); 
	    }
		lv_didFail_9_0=ruleElseType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		set(
       			$current, 
       			"didFail",
        		lv_didFail_9_0, 
        		"ElseType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getElseResultAccess().getMetricsMetricsParserRuleCall_7_0()); 
	    }
		lv_metrics_10_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElseResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_10_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getElseResultAccess().getRightSquareBracketKeyword_8());
    }
)
;





// Entry rule entryRuleThenResult
entryRuleThenResult returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getThenResultRule()); }
	 iv_ruleThenResult=ruleThenResult 
	 { $current=$iv_ruleThenResult.current; } 
	 EOF 
;

// Rule ThenResult
ruleThenResult returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='then' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getThenResultAccess().getThenKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getThenResultAccess().getFirstVerificationExprParserRuleCall_1_0()); 
	    }
		lv_first_1_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThenResultRule());
	        }
       		add(
       			$current, 
       			"first",
        		lv_first_1_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='do' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getThenResultAccess().getDoKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getThenResultAccess().getSecondVerificationExprParserRuleCall_3_0()); 
	    }
		lv_second_3_0=ruleVerificationExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThenResultRule());
	        }
       		add(
       			$current, 
       			"second",
        		lv_second_3_0, 
        		"VerificationExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='[' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getThenResultAccess().getLeftSquareBracketKeyword_4());
    }
(
(
		lv_didThenFail_5_0=	'thenfailed' 
    {
        newLeafNode(lv_didThenFail_5_0, grammarAccess.getThenResultAccess().getDidThenFailThenfailedKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThenResultRule());
	        }
       		setWithLastConsumed($current, "didThenFail", true, "thenfailed");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getThenResultAccess().getMetricsMetricsParserRuleCall_6_0()); 
	    }
		lv_metrics_6_0=ruleMetrics		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThenResultRule());
	        }
       		set(
       			$current, 
       			"metrics",
        		lv_metrics_6_0, 
        		"Metrics");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getThenResultAccess().getRightSquareBracketKeyword_7());
    }
)
;





// Entry rule entryRuleMetrics
entryRuleMetrics returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetricsRule()); }
	 iv_ruleMetrics=ruleMetrics 
	 { $current=$iv_ruleMetrics.current; } 
	 EOF 
;

// Rule Metrics
ruleMetrics returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='tbdcount' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getTbdcountKeyword_0_0());
    }
(
(
		lv_tbdCount_1_0=RULE_INT
		{
			newLeafNode(lv_tbdCount_1_0, grammarAccess.getMetricsAccess().getTbdCountINTTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"tbdCount",
        		lv_tbdCount_1_0, 
        		"INT");
	    }

)
))?(	otherlv_2='successcount' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMetricsAccess().getSuccesscountKeyword_1_0());
    }
(
(
		lv_successCount_3_0=RULE_INT
		{
			newLeafNode(lv_successCount_3_0, grammarAccess.getMetricsAccess().getSuccessCountINTTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"successCount",
        		lv_successCount_3_0, 
        		"INT");
	    }

)
))?(	otherlv_4='failcount' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMetricsAccess().getFailcountKeyword_2_0());
    }
(
(
		lv_failCount_5_0=RULE_INT
		{
			newLeafNode(lv_failCount_5_0, grammarAccess.getMetricsAccess().getFailCountINTTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"failCount",
        		lv_failCount_5_0, 
        		"INT");
	    }

)
))?(	otherlv_6='timeoutcount' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMetricsAccess().getTimeoutcountKeyword_3_0());
    }
(
(
		lv_timeoutCount_7_0=RULE_INT
		{
			newLeafNode(lv_timeoutCount_7_0, grammarAccess.getMetricsAccess().getTimeoutCountINTTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"timeoutCount",
        		lv_timeoutCount_7_0, 
        		"INT");
	    }

)
))?(	otherlv_8='errorcount' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMetricsAccess().getErrorcountKeyword_4_0());
    }
(
(
		lv_errorCount_9_0=RULE_INT
		{
			newLeafNode(lv_errorCount_9_0, grammarAccess.getMetricsAccess().getErrorCountINTTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"errorCount",
        		lv_errorCount_9_0, 
        		"INT");
	    }

)
))?(	otherlv_10='didelsecount' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMetricsAccess().getDidelsecountKeyword_5_0());
    }
(
(
		lv_didelseCount_11_0=RULE_INT
		{
			newLeafNode(lv_didelseCount_11_0, grammarAccess.getMetricsAccess().getDidelseCountINTTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"didelseCount",
        		lv_didelseCount_11_0, 
        		"INT");
	    }

)
))?(	otherlv_12='thenskipcount' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMetricsAccess().getThenskipcountKeyword_6_0());
    }
(
(
		lv_thenskipCount_13_0=RULE_INT
		{
			newLeafNode(lv_thenskipCount_13_0, grammarAccess.getMetricsAccess().getThenskipCountINTTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"thenskipCount",
        		lv_thenskipCount_13_0, 
        		"INT");
	    }

)
))?(	otherlv_14='prefailcount' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMetricsAccess().getPrefailcountKeyword_7_0());
    }
(
(
		lv_preconditionfailCount_15_0=RULE_INT
		{
			newLeafNode(lv_preconditionfailCount_15_0, grammarAccess.getMetricsAccess().getPreconditionfailCountINTTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"preconditionfailCount",
        		lv_preconditionfailCount_15_0, 
        		"INT");
	    }

)
))?(	otherlv_16='validfailcount' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMetricsAccess().getValidfailcountKeyword_8_0());
    }
(
(
		lv_validationfailCount_17_0=RULE_INT
		{
			newLeafNode(lv_validationfailCount_17_0, grammarAccess.getMetricsAccess().getValidationfailCountINTTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"validationfailCount",
        		lv_validationfailCount_17_0, 
        		"INT");
	    }

)
))?(	otherlv_18='weight' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMetricsAccess().getWeightKeyword_9_0());
    }
(
(
		lv_weight_19_0=RULE_INT
		{
			newLeafNode(lv_weight_19_0, grammarAccess.getMetricsAccess().getWeightINTTerminalRuleCall_9_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"weight",
        		lv_weight_19_0, 
        		"INT");
	    }

)
))?)
;





// Entry rule entryRuleURIID
entryRuleURIID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getURIIDRule()); } 
	 iv_ruleURIID=ruleURIID 
	 { $current=$iv_ruleURIID.current.getText(); }  
	 EOF 
;

// Rule URIID
ruleURIID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getURIIDAccess().getSTRINGTerminalRuleCall()); 
    }

    ;







// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(((
	'.' 
)=>
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
)    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;







// Entry rule entryRuleResultReportCollection
entryRuleResultReportCollection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultReportCollectionRule()); }
	 iv_ruleResultReportCollection=ruleResultReportCollection 
	 { $current=$iv_ruleResultReportCollection.current; } 
	 EOF 
;

// Rule ResultReportCollection
ruleResultReportCollection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='reports' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getResultReportCollectionAccess().getReportsKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getResultReportCollectionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportCollectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getResultReportCollectionAccess().getColonKeyword_2_0());
    }
(
(
		lv_title_3_0=RULE_STRING
		{
			newLeafNode(lv_title_3_0, grammarAccess.getResultReportCollectionAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportCollectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_3_0, 
        		"STRING");
	    }

)
))?	otherlv_4='for' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getResultReportCollectionAccess().getForKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportCollectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResultReportCollectionAccess().getTargetEObjectCrossReference_4_0()); 
	    }
		ruleURIID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getResultReportCollectionAccess().getLeftSquareBracketKeyword_5());
    }
(	otherlv_7='description' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getResultReportCollectionAccess().getDescriptionKeyword_6_0());
    }
(
(
		lv_decription_8_0=RULE_STRING
		{
			newLeafNode(lv_decription_8_0, grammarAccess.getResultReportCollectionAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportCollectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"decription",
        		lv_decription_8_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getResultReportCollectionAccess().getContentResultReportParserRuleCall_7_0()); 
	    }
		lv_content_9_0=ruleResultReport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultReportCollectionRule());
	        }
       		add(
       			$current, 
       			"content",
        		lv_content_9_0, 
        		"ResultReport");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getResultReportCollectionAccess().getIssuesResultIssueParserRuleCall_8_0()); 
	    }
		lv_issues_10_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultReportCollectionRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_10_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getResultReportCollectionAccess().getRightSquareBracketKeyword_9());
    }
)
;





// Entry rule entryRuleResultReport
entryRuleResultReport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultReportRule()); }
	 iv_ruleResultReport=ruleResultReport 
	 { $current=$iv_ruleResultReport.current; } 
	 EOF 
;

// Rule ResultReport
ruleResultReport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='report' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getResultReportAccess().getReportKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getResultReportAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getResultReportAccess().getColonKeyword_2_0());
    }
(
(
		lv_title_3_0=RULE_STRING
		{
			newLeafNode(lv_title_3_0, grammarAccess.getResultReportAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_3_0, 
        		"STRING");
	    }

)
))?	otherlv_4='for' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getResultReportAccess().getForKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResultReportAccess().getTargetEObjectCrossReference_4_0()); 
	    }
		ruleURIID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getResultReportAccess().getLeftSquareBracketKeyword_5());
    }
(	otherlv_7='description' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getResultReportAccess().getDescriptionKeyword_6_0());
    }
(
(
		lv_decription_8_0=RULE_STRING
		{
			newLeafNode(lv_decription_8_0, grammarAccess.getResultReportAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"decription",
        		lv_decription_8_0, 
        		"STRING");
	    }

)
))?(	otherlv_9='heading' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getResultReportAccess().getHeadingKeyword_7_0());
    }
(
(
		lv_heading_10_0=RULE_STRING
		{
			newLeafNode(lv_heading_10_0, grammarAccess.getResultReportAccess().getHeadingSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"heading",
        		lv_heading_10_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getResultReportAccess().getContentResultContributorParserRuleCall_7_2_0()); 
	    }
		lv_content_11_0=ruleResultContributor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultReportRule());
	        }
       		add(
       			$current, 
       			"content",
        		lv_content_11_0, 
        		"ResultContributor");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_12='results' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getResultReportAccess().getResultsKeyword_8_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResultReportAccess().getResultDataResultDataParserRuleCall_8_1_0()); 
	    }
		lv_resultData_13_0=ruleResultData		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultReportRule());
	        }
       		add(
       			$current, 
       			"resultData",
        		lv_resultData_13_0, 
        		"ResultData");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(
(
		{ 
	        newCompositeNode(grammarAccess.getResultReportAccess().getIssuesResultIssueParserRuleCall_9_0()); 
	    }
		lv_issues_14_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultReportRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_14_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_15=']' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getResultReportAccess().getRightSquareBracketKeyword_10());
    }
)
;





// Entry rule entryRuleResultContributor
entryRuleResultContributor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultContributorRule()); }
	 iv_ruleResultContributor=ruleResultContributor 
	 { $current=$iv_ruleResultContributor.current; } 
	 EOF 
;

// Rule ResultContributor
ruleResultContributor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='contributor' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getResultContributorAccess().getContributorKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultContributorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResultContributorAccess().getTargetEObjectCrossReference_1_0()); 
	    }
		ruleURIID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getResultContributorAccess().getLeftSquareBracketKeyword_2());
    }
(	otherlv_3='results' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getResultContributorAccess().getResultsKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResultContributorAccess().getResultDataResultDataParserRuleCall_3_1_0()); 
	    }
		lv_resultData_4_0=ruleResultData		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultContributorRule());
	        }
       		add(
       			$current, 
       			"resultData",
        		lv_resultData_4_0, 
        		"ResultData");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(
(
		{ 
	        newCompositeNode(grammarAccess.getResultContributorAccess().getIssuesResultIssueParserRuleCall_4_0()); 
	    }
		lv_issues_5_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultContributorRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_5_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getResultContributorAccess().getSubcontributorResultContributorParserRuleCall_5_0()); 
	    }
		lv_subcontributor_6_0=ruleResultContributor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultContributorRule());
	        }
       		add(
       			$current, 
       			"subcontributor",
        		lv_subcontributor_6_0, 
        		"ResultContributor");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getResultContributorAccess().getRightSquareBracketKeyword_6());
    }
)
;





// Entry rule entryRuleIssuesReport
entryRuleIssuesReport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIssuesReportRule()); }
	 iv_ruleIssuesReport=ruleIssuesReport 
	 { $current=$iv_ruleIssuesReport.current; } 
	 EOF 
;

// Rule IssuesReport
ruleIssuesReport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='issues' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIssuesReportAccess().getIssuesKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getIssuesReportAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIssuesReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='for' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIssuesReportAccess().getForKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIssuesReportRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getIssuesReportAccess().getTargetEObjectCrossReference_2_1_0()); 
	    }
		ruleURIID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='[' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIssuesReportAccess().getLeftSquareBracketKeyword_3_0());
    }
(	otherlv_5='description' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIssuesReportAccess().getDescriptionKeyword_3_1_0());
    }
(
(
		lv_description_6_0=RULE_STRING
		{
			newLeafNode(lv_description_6_0, grammarAccess.getIssuesReportAccess().getDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIssuesReportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_6_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getIssuesReportAccess().getIssuesResultIssueParserRuleCall_3_2_0()); 
	    }
		lv_issues_7_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIssuesReportRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_7_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8=']' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getIssuesReportAccess().getRightSquareBracketKeyword_3_3());
    }
)?)
;





// Entry rule entryRuleResultIssue
entryRuleResultIssue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultIssueRule()); }
	 iv_ruleResultIssue=ruleResultIssue 
	 { $current=$iv_ruleResultIssue.current; } 
	 EOF 
;

// Rule ResultIssue
ruleResultIssue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='issue' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getResultIssueAccess().getIssueKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResultIssueAccess().getIssueTypeResultIssueTypeEnumRuleCall_1_0()); 
	    }
		lv_issueType_1_0=ruleResultIssueType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultIssueRule());
	        }
       		set(
       			$current, 
       			"issueType",
        		lv_issueType_1_0, 
        		"ResultIssueType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_message_2_0=RULE_STRING
		{
			newLeafNode(lv_message_2_0, grammarAccess.getResultIssueAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultIssueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"message",
        		lv_message_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='target' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getResultIssueAccess().getTargetKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultIssueRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResultIssueAccess().getTargetEObjectCrossReference_3_1_0()); 
	    }
		ruleURIID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='exception' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getResultIssueAccess().getExceptionKeyword_4_0());
    }
(
(
		lv_exceptionType_6_0=RULE_STRING
		{
			newLeafNode(lv_exceptionType_6_0, grammarAccess.getResultIssueAccess().getExceptionTypeSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultIssueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"exceptionType",
        		lv_exceptionType_6_0, 
        		"STRING");
	    }

)
))?(	otherlv_7='[' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getResultIssueAccess().getLeftSquareBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResultIssueAccess().getIssuesResultIssueParserRuleCall_5_1_0()); 
	    }
		lv_issues_8_0=ruleResultIssue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResultIssueRule());
	        }
       		add(
       			$current, 
       			"issues",
        		lv_issues_8_0, 
        		"ResultIssue");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9=']' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getResultIssueAccess().getRightSquareBracketKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleResultData
entryRuleResultData returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResultDataRule()); }
	 iv_ruleResultData=ruleResultData 
	 { $current=$iv_ruleResultData.current; } 
	 EOF 
;

// Rule ResultData
ruleResultData returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getResultDataAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultDataRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getResultDataAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getResultDataAccess().getValueSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResultDataRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"STRING");
	    }

)
))
;





// Rule ElseType
ruleElseType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='ok' 
	{
        $current = grammarAccess.getElseTypeAccess().getOKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getElseTypeAccess().getOKEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='fail' 
	{
        $current = grammarAccess.getElseTypeAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getElseTypeAccess().getFAILEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='timeout' 
	{
        $current = grammarAccess.getElseTypeAccess().getTIMEOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getElseTypeAccess().getTIMEOUTEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='error' 
	{
        $current = grammarAccess.getElseTypeAccess().getERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getElseTypeAccess().getERROREnumLiteralDeclaration_3()); 
    }
));



// Rule VerificationResultState
ruleVerificationResultState returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='tbd' 
	{
        $current = grammarAccess.getVerificationResultStateAccess().getTBDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStateAccess().getTBDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='success' 
	{
        $current = grammarAccess.getVerificationResultStateAccess().getSUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStateAccess().getSUCCESSEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='fail' 
	{
        $current = grammarAccess.getVerificationResultStateAccess().getFAILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getVerificationResultStateAccess().getFAILEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='error' 
	{
        $current = grammarAccess.getVerificationResultStateAccess().getERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getVerificationResultStateAccess().getERROREnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='timeout' 
	{
        $current = grammarAccess.getVerificationResultStateAccess().getTIMEOUTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getVerificationResultStateAccess().getTIMEOUTEnumLiteralDeclaration_4()); 
    }
));



// Rule VerificationExecutionState
ruleVerificationExecutionState returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='todo' 
	{
        $current = grammarAccess.getVerificationExecutionStateAccess().getTODOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getVerificationExecutionStateAccess().getTODOEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='running' 
	{
        $current = grammarAccess.getVerificationExecutionStateAccess().getRUNNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getVerificationExecutionStateAccess().getRUNNINGEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='redo' 
	{
        $current = grammarAccess.getVerificationExecutionStateAccess().getREDOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getVerificationExecutionStateAccess().getREDOEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='completed' 
	{
        $current = grammarAccess.getVerificationExecutionStateAccess().getCOMPLETEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getVerificationExecutionStateAccess().getCOMPLETEDEnumLiteralDeclaration_3()); 
    }
));



// Rule ResultIssueType
ruleResultIssueType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='tbd' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getTBDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getResultIssueTypeAccess().getTBDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='unknown' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getUNKNOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getResultIssueTypeAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='error' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getERROREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getResultIssueTypeAccess().getERROREnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='warning' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getWARNINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getResultIssueTypeAccess().getWARNINGEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='info' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getINFOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getResultIssueTypeAccess().getINFOEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='success' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getSUCCESSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getResultIssueTypeAccess().getSUCCESSEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='fail' 
	{
        $current = grammarAccess.getResultIssueTypeAccess().getFAILEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getResultIssueTypeAccess().getFAILEnumLiteralDeclaration_6()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


