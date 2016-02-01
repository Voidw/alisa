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
package org.osate.verify.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.verify.services.VerifyGrammarAccess;

@SuppressWarnings("all")
public class VerifySyntacticSequencer extends AbstractSyntacticSequencer {

	protected VerifyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_AParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_Claim_ActivitiesKeyword_5_0_0_a;
	protected AbstractElementAlias match_Claim_ActivitiesKeyword_5_0_0_p;
	protected AbstractElementAlias match_Claim___ActivitiesKeyword_5_0_0_a_IssuesKeyword_5_5_0__q;
	protected AbstractElementAlias match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_ResultIssue___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q;
	protected AbstractElementAlias match_VerificationActivity_CategoryKeyword_9_1_1_0_q;
	protected AbstractElementAlias match_VerificationActivity_PhaseKeyword_9_1_0_0_q;
	protected AbstractElementAlias match_VerificationActivity___LeftSquareBracketKeyword_9_0_RightSquareBracketKeyword_9_2__q;
	protected AbstractElementAlias match_VerificationActivity___PropertyKeyword_8_0_ValuesKeyword_8_1_LeftParenthesisKeyword_8_2_RightParenthesisKeyword_8_4__q;
	protected AbstractElementAlias match_VerificationMethod_CategoryKeyword_6_5_0_q;
	protected AbstractElementAlias match_VerificationMethod_QualityKeyword_6_4_0_q;
	protected AbstractElementAlias match_VerificationMethod___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q__q;
	protected AbstractElementAlias match_VerificationMethod___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q;
	protected AbstractElementAlias match_VerificationMethod___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q;
	protected AbstractElementAlias match_VerificationPlan_IssuesKeyword_7_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VerifyGrammarAccess) access;
		match_AParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_AParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_Claim_ActivitiesKeyword_5_0_0_a = new TokenAlias(true, true, grammarAccess.getClaimAccess().getActivitiesKeyword_5_0_0());
		match_Claim_ActivitiesKeyword_5_0_0_p = new TokenAlias(true, false, grammarAccess.getClaimAccess().getActivitiesKeyword_5_0_0());
		match_Claim___ActivitiesKeyword_5_0_0_a_IssuesKeyword_5_5_0__q = new GroupAlias(false, true, new TokenAlias(true, true, grammarAccess.getClaimAccess().getActivitiesKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getClaimAccess().getIssuesKeyword_5_5_0()));
		match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getCompositeEvidenceExprAccess().getLeftParenthesisKeyword_0_0());
		match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getCompositeEvidenceExprAccess().getLeftParenthesisKeyword_0_0());
		match_ResultIssue___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getResultIssueAccess().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getResultIssueAccess().getRightSquareBracketKeyword_4_2()));
		match_VerificationActivity_CategoryKeyword_9_1_1_0_q = new TokenAlias(false, true, grammarAccess.getVerificationActivityAccess().getCategoryKeyword_9_1_1_0());
		match_VerificationActivity_PhaseKeyword_9_1_0_0_q = new TokenAlias(false, true, grammarAccess.getVerificationActivityAccess().getPhaseKeyword_9_1_0_0());
		match_VerificationActivity___LeftSquareBracketKeyword_9_0_RightSquareBracketKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getLeftSquareBracketKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getRightSquareBracketKeyword_9_2()));
		match_VerificationActivity___PropertyKeyword_8_0_ValuesKeyword_8_1_LeftParenthesisKeyword_8_2_RightParenthesisKeyword_8_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getPropertyKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getValuesKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getLeftParenthesisKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getRightParenthesisKeyword_8_4()));
		match_VerificationMethod_CategoryKeyword_6_5_0_q = new TokenAlias(false, true, grammarAccess.getVerificationMethodAccess().getCategoryKeyword_6_5_0());
		match_VerificationMethod_QualityKeyword_6_4_0_q = new TokenAlias(false, true, grammarAccess.getVerificationMethodAccess().getQualityKeyword_6_4_0());
		match_VerificationMethod___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getRightParenthesisKeyword_2_2()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getPropertiesKeyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getLeftParenthesisKeyword_2_3_1()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getRightParenthesisKeyword_2_3_3())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getReturnsKeyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getLeftParenthesisKeyword_2_4_1()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getRightParenthesisKeyword_2_4_3())));
		match_VerificationMethod___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getPropertiesKeyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getLeftParenthesisKeyword_2_3_1()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getRightParenthesisKeyword_2_3_3()));
		match_VerificationMethod___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getReturnsKeyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getLeftParenthesisKeyword_2_4_1()), new TokenAlias(false, false, grammarAccess.getVerificationMethodAccess().getRightParenthesisKeyword_2_4_3()));
		match_VerificationPlan_IssuesKeyword_7_3_0_q = new TokenAlias(false, true, grammarAccess.getVerificationPlanAccess().getIssuesKeyword_7_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_AParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_AParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Claim_ActivitiesKeyword_5_0_0_a.equals(syntax))
				emit_Claim_ActivitiesKeyword_5_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Claim_ActivitiesKeyword_5_0_0_p.equals(syntax))
				emit_Claim_ActivitiesKeyword_5_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Claim___ActivitiesKeyword_5_0_0_a_IssuesKeyword_5_5_0__q.equals(syntax))
				emit_Claim___ActivitiesKeyword_5_0_0_a_IssuesKeyword_5_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResultIssue___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q.equals(syntax))
				emit_ResultIssue___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity_CategoryKeyword_9_1_1_0_q.equals(syntax))
				emit_VerificationActivity_CategoryKeyword_9_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity_PhaseKeyword_9_1_0_0_q.equals(syntax))
				emit_VerificationActivity_PhaseKeyword_9_1_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___LeftSquareBracketKeyword_9_0_RightSquareBracketKeyword_9_2__q.equals(syntax))
				emit_VerificationActivity___LeftSquareBracketKeyword_9_0_RightSquareBracketKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___PropertyKeyword_8_0_ValuesKeyword_8_1_LeftParenthesisKeyword_8_2_RightParenthesisKeyword_8_4__q.equals(syntax))
				emit_VerificationActivity___PropertyKeyword_8_0_ValuesKeyword_8_1_LeftParenthesisKeyword_8_2_RightParenthesisKeyword_8_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationMethod_CategoryKeyword_6_5_0_q.equals(syntax))
				emit_VerificationMethod_CategoryKeyword_6_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationMethod_QualityKeyword_6_4_0_q.equals(syntax))
				emit_VerificationMethod_QualityKeyword_6_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationMethod___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q__q.equals(syntax))
				emit_VerificationMethod___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationMethod___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q.equals(syntax))
				emit_VerificationMethod___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationMethod___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q.equals(syntax))
				emit_VerificationMethod___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationPlan_IssuesKeyword_7_3_0_q.equals(syntax))
				emit_VerificationPlan_IssuesKeyword_7_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=AExpression
	 *     (rule start) (ambiguity) '@' property=[AbstractNamedValue|AADLPROPERTYREFERENCE]
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=AExpression
	 *     (rule start) (ambiguity) feature=OpUnary
	 *     (rule start) (ambiguity) value=AInt
	 *     (rule start) (ambiguity) value=AReal
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) variable=[AVariableDeclaration|ID]
	 *     (rule start) (ambiguity) {ABinaryOperation.leftOperand=}
	 */
	protected void emit_AParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=AExpression
	 *     (rule start) (ambiguity) '@' property=[AbstractNamedValue|AADLPROPERTYREFERENCE]
	 *     (rule start) (ambiguity) 'false' ')' (rule start)
	 *     (rule start) (ambiguity) 'null' ')' (rule start)
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=AExpression
	 *     (rule start) (ambiguity) feature=OpUnary
	 *     (rule start) (ambiguity) value=AInt
	 *     (rule start) (ambiguity) value=AReal
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) variable=[AVariableDeclaration|ID]
	 *     (rule start) (ambiguity) {ABinaryOperation.leftOperand=}
	 */
	protected void emit_AParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'activities'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'claim' '[' (ambiguity) ']' (rule start)
	 *     (rule start) 'claim' '[' (ambiguity) 'assert' assert=ArgumentExpr
	 *     (rule start) 'claim' '[' (ambiguity) 'issues' issues+=STRING
	 *     (rule start) 'claim' '[' (ambiguity) 'weight' weight=INT
	 *     (rule start) 'claim' '[' (ambiguity) rationale=Rationale
	 *     (rule start) 'claim' '[' (ambiguity) subclaim+=Claim
	 *     activities+=VerificationActivity (ambiguity) ']' (rule end)
	 *     activities+=VerificationActivity (ambiguity) 'assert' assert=ArgumentExpr
	 *     activities+=VerificationActivity (ambiguity) 'issues' issues+=STRING
	 *     activities+=VerificationActivity (ambiguity) 'weight' weight=INT
	 *     activities+=VerificationActivity (ambiguity) activities+=VerificationActivity
	 *     activities+=VerificationActivity (ambiguity) rationale=Rationale
	 *     activities+=VerificationActivity (ambiguity) subclaim+=Claim
	 *     assert=ArgumentExpr (ambiguity) ']' (rule end)
	 *     assert=ArgumentExpr (ambiguity) 'assert' assert=ArgumentExpr
	 *     assert=ArgumentExpr (ambiguity) 'issues' issues+=STRING
	 *     assert=ArgumentExpr (ambiguity) 'weight' weight=INT
	 *     assert=ArgumentExpr (ambiguity) rationale=Rationale
	 *     assert=ArgumentExpr (ambiguity) subclaim+=Claim
	 *     issues+=STRING (ambiguity) ']' (rule end)
	 *     issues+=STRING (ambiguity) 'assert' assert=ArgumentExpr
	 *     issues+=STRING (ambiguity) 'weight' weight=INT
	 *     issues+=STRING (ambiguity) rationale=Rationale
	 *     issues+=STRING (ambiguity) subclaim+=Claim
	 *     rationale=Rationale (ambiguity) ']' (rule end)
	 *     rationale=Rationale (ambiguity) 'assert' assert=ArgumentExpr
	 *     rationale=Rationale (ambiguity) 'issues' issues+=STRING
	 *     rationale=Rationale (ambiguity) 'weight' weight=INT
	 *     rationale=Rationale (ambiguity) rationale=Rationale
	 *     rationale=Rationale (ambiguity) subclaim+=Claim
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) ']' (rule end)
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) 'assert' assert=ArgumentExpr
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) 'issues' issues+=STRING
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) 'weight' weight=INT
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) rationale=Rationale
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) subclaim+=Claim
	 *     subclaim+=Claim (ambiguity) ']' (rule end)
	 *     subclaim+=Claim (ambiguity) 'assert' assert=ArgumentExpr
	 *     subclaim+=Claim (ambiguity) 'issues' issues+=STRING
	 *     subclaim+=Claim (ambiguity) 'weight' weight=INT
	 *     subclaim+=Claim (ambiguity) rationale=Rationale
	 *     subclaim+=Claim (ambiguity) subclaim+=Claim
	 *     title=STRING '[' (ambiguity) ']' (rule end)
	 *     title=STRING '[' (ambiguity) 'assert' assert=ArgumentExpr
	 *     title=STRING '[' (ambiguity) 'issues' issues+=STRING
	 *     title=STRING '[' (ambiguity) 'weight' weight=INT
	 *     title=STRING '[' (ambiguity) rationale=Rationale
	 *     title=STRING '[' (ambiguity) subclaim+=Claim
	 *     weight=INT (ambiguity) ']' (rule end)
	 *     weight=INT (ambiguity) 'assert' assert=ArgumentExpr
	 *     weight=INT (ambiguity) 'issues' issues+=STRING
	 *     weight=INT (ambiguity) 'weight' weight=INT
	 *     weight=INT (ambiguity) rationale=Rationale
	 *     weight=INT (ambiguity) subclaim+=Claim
	 */
	protected void emit_Claim_ActivitiesKeyword_5_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'activities'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'claim' '[' (ambiguity) activities+=VerificationActivity
	 *     assert=ArgumentExpr (ambiguity) activities+=VerificationActivity
	 *     issues+=STRING (ambiguity) activities+=VerificationActivity
	 *     rationale=Rationale (ambiguity) activities+=VerificationActivity
	 *     requirement=[Requirement|QualifiedName] '[' (ambiguity) activities+=VerificationActivity
	 *     subclaim+=Claim (ambiguity) activities+=VerificationActivity
	 *     title=STRING '[' (ambiguity) activities+=VerificationActivity
	 *     weight=INT (ambiguity) activities+=VerificationActivity
	 */
	protected void emit_Claim_ActivitiesKeyword_5_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('activities'* 'issues')?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_Claim___ActivitiesKeyword_5_0_0_a_IssuesKeyword_5_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'all' '[' elements+=ThenEvidenceExpr
	 *     (rule start) (ambiguity) verification=[VerificationActivity|ID]
	 *     (rule start) (ambiguity) {ElseExpr.left=}
	 *     (rule start) (ambiguity) {ThenExpr.left=}
	 */
	protected void emit_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) verification=[VerificationActivity|ID]
	 *     (rule start) (ambiguity) {ElseExpr.left=}
	 *     (rule start) (ambiguity) {ThenExpr.left=}
	 */
	protected void emit_CompositeEvidenceExpr_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     exceptionType=STRING (ambiguity) (rule end)
	 *     message=STRING (ambiguity) (rule end)
	 *     target=[EObject|URIID] (ambiguity) (rule end)
	 */
	protected void emit_ResultIssue___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'category'?
	 *
	 * This ambiguous syntax occurs at:
	 *     userCategory+=[UserCategory|ID] (ambiguity) userCategory+=[UserCategory|ID]
	 */
	protected void emit_VerificationActivity_CategoryKeyword_9_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'phase'?
	 *
	 * This ambiguous syntax occurs at:
	 *     phaseCategory+=[PhaseCategory|ID] (ambiguity) phaseCategory+=[PhaseCategory|ID]
	 */
	protected void emit_VerificationActivity_PhaseKeyword_9_1_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     method=[VerificationMethod|QualifiedName] '(' ')' ('property' 'values' '(' ')')? (ambiguity) (rule end)
	 *     parameters+=AExpression ')' ('property' 'values' '(' ')')? (ambiguity) (rule end)
	 *     propertyValues+=[ValDeclaration|ID] ')' (ambiguity) (rule end)
	 */
	protected void emit_VerificationActivity___LeftSquareBracketKeyword_9_0_RightSquareBracketKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('property' 'values' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     method=[VerificationMethod|QualifiedName] '(' ')' (ambiguity) '[' 'category' userCategory+=[UserCategory|ID]
	 *     method=[VerificationMethod|QualifiedName] '(' ')' (ambiguity) '[' 'phase' phaseCategory+=[PhaseCategory|ID]
	 *     method=[VerificationMethod|QualifiedName] '(' ')' (ambiguity) '[' 'timeout' timeout=AIntegerTerm
	 *     method=[VerificationMethod|QualifiedName] '(' ')' (ambiguity) '[' 'weight' weight=INT
	 *     method=[VerificationMethod|QualifiedName] '(' ')' (ambiguity) ('[' ']')? (rule end)
	 *     parameters+=AExpression ')' (ambiguity) '[' 'category' userCategory+=[UserCategory|ID]
	 *     parameters+=AExpression ')' (ambiguity) '[' 'phase' phaseCategory+=[PhaseCategory|ID]
	 *     parameters+=AExpression ')' (ambiguity) '[' 'timeout' timeout=AIntegerTerm
	 *     parameters+=AExpression ')' (ambiguity) '[' 'weight' weight=INT
	 *     parameters+=AExpression ')' (ambiguity) ('[' ']')? (rule end)
	 */
	protected void emit_VerificationActivity___PropertyKeyword_8_0_ValuesKeyword_8_1_LeftParenthesisKeyword_8_2_RightParenthesisKeyword_8_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'category'?
	 *
	 * This ambiguous syntax occurs at:
	 *     userCategory+=[UserCategory|ID] (ambiguity) userCategory+=[UserCategory|ID]
	 */
	protected void emit_VerificationMethod_CategoryKeyword_6_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'quality'?
	 *
	 * This ambiguous syntax occurs at:
	 *     qualityCategory+=[QualityCategory|ID] (ambiguity) qualityCategory+=[QualityCategory|ID]
	 */
	protected void emit_VerificationMethod_QualityKeyword_6_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')' ('properties' '(' ')')? ('returns' '(' ')')?)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ':' title=STRING
	 *     name=ID (ambiguity) '[' ']' (rule end)
	 *     name=ID (ambiguity) '[' 'category' userCategory+=[UserCategory|ID]
	 *     name=ID (ambiguity) '[' 'quality' qualityCategory+=[QualityCategory|ID]
	 *     name=ID (ambiguity) '[' description=Description
	 *     name=ID (ambiguity) '[' methodKind=MethodKind
	 *     name=ID (ambiguity) '[' precondition=VerificationPrecondition
	 *     name=ID (ambiguity) '[' validation=VerificationValidation
	 *     name=ID (ambiguity) 'for' componentCategory+=ComponentCategory
	 *     name=ID (ambiguity) 'for' target=[ComponentClassifier|AadlClassifierReference]
	 */
	protected void emit_VerificationMethod___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('properties' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '(' ')' (ambiguity) 'returns' '(' resultValues+=FormalParameter
	 *     name=ID '(' ')' (ambiguity) ('returns' '(' ')')? isPredicate?='boolean'
	 *     name=ID '(' ')' (ambiguity) ('returns' '(' ')')? isResultReport?='report'
	 *     params+=FormalParameter ')' (ambiguity) 'returns' '(' resultValues+=FormalParameter
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? ':' title=STRING
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' ']' (rule end)
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' 'category' userCategory+=[UserCategory|ID]
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' 'quality' qualityCategory+=[QualityCategory|ID]
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' description=Description
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' methodKind=MethodKind
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' precondition=VerificationPrecondition
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? '[' validation=VerificationValidation
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? 'for' componentCategory+=ComponentCategory
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? 'for' target=[ComponentClassifier|AadlClassifierReference]
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? isPredicate?='boolean'
	 *     params+=FormalParameter ')' (ambiguity) ('returns' '(' ')')? isResultReport?='report'
	 */
	protected void emit_VerificationMethod___PropertiesKeyword_2_3_0_LeftParenthesisKeyword_2_3_1_RightParenthesisKeyword_2_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('returns' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '(' ')' ('properties' '(' ')')? (ambiguity) isPredicate?='boolean'
	 *     name=ID '(' ')' ('properties' '(' ')')? (ambiguity) isResultReport?='report'
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) ':' title=STRING
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' ']' (rule end)
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' 'category' userCategory+=[UserCategory|ID]
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' 'quality' qualityCategory+=[QualityCategory|ID]
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' description=Description
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' methodKind=MethodKind
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' precondition=VerificationPrecondition
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) '[' validation=VerificationValidation
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) 'for' componentCategory+=ComponentCategory
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) 'for' target=[ComponentClassifier|AadlClassifierReference]
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) isPredicate?='boolean'
	 *     params+=FormalParameter ')' ('properties' '(' ')')? (ambiguity) isResultReport?='report'
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) ':' title=STRING
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' ']' (rule end)
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' 'category' userCategory+=[UserCategory|ID]
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' 'quality' qualityCategory+=[QualityCategory|ID]
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' description=Description
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' methodKind=MethodKind
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' precondition=VerificationPrecondition
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) '[' validation=VerificationValidation
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) 'for' componentCategory+=ComponentCategory
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) 'for' target=[ComponentClassifier|AadlClassifierReference]
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) isPredicate?='boolean'
	 *     properties+=[Property|AADLPROPERTYREFERENCE] ')' (ambiguity) isResultReport?='report'
	 */
	protected void emit_VerificationMethod___ReturnsKeyword_2_4_0_LeftParenthesisKeyword_2_4_1_RightParenthesisKeyword_2_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_VerificationPlan_IssuesKeyword_7_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
