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
package org.osate.results.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.results.services.ResultsGrammarAccess;

public class ResultsParser extends AbstractContentAssistParser {
	
	@Inject
	private ResultsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser createParser() {
		org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser result = new org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getResultReportAccess().getAlternatives(), "rule__ResultReport__Alternatives");
					put(grammarAccess.getResultDataAccess().getAlternatives_2(), "rule__ResultData__Alternatives_2");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getTypeRefAccess().getAlternatives(), "rule__TypeRef__Alternatives");
					put(grammarAccess.getValDeclarationAccess().getAlternatives_3_1(), "rule__ValDeclaration__Alternatives_3_1");
					put(grammarAccess.getValDeclarationAccess().getAlternatives_3_1_2_1(), "rule__ValDeclaration__Alternatives_3_1_2_1");
					put(grammarAccess.getComputeDeclarationAccess().getAlternatives_4(), "rule__ComputeDeclaration__Alternatives_4");
					put(grammarAccess.getComputeDeclarationAccess().getAlternatives_4_2_1(), "rule__ComputeDeclaration__Alternatives_4_2_1");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getAlternatives(), "rule__AModelOrPropertyReference__Alternatives");
					put(grammarAccess.getShowValueAccess().getAlternatives_1(), "rule__ShowValue__Alternatives_1");
					put(grammarAccess.getOpOrAccess().getAlternatives(), "rule__OpOr__Alternatives");
					put(grammarAccess.getOpAndAccess().getAlternatives(), "rule__OpAnd__Alternatives");
					put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
					put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
					put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
					put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
					put(grammarAccess.getAUnaryOperationAccess().getAlternatives(), "rule__AUnaryOperation__Alternatives");
					put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
					put(grammarAccess.getAUnitExpressionAccess().getAlternatives_1_1(), "rule__AUnitExpression__Alternatives_1_1");
					put(grammarAccess.getAPrimaryExpressionAccess().getAlternatives(), "rule__APrimaryExpression__Alternatives");
					put(grammarAccess.getALiteralAccess().getAlternatives(), "rule__ALiteral__Alternatives");
					put(grammarAccess.getABooleanLiteralAccess().getAlternatives_1(), "rule__ABooleanLiteral__Alternatives_1");
					put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
					put(grammarAccess.getResultIssueTypeAccess().getAlternatives(), "rule__ResultIssueType__Alternatives");
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getResultReportCollectionAccess().getGroup(), "rule__ResultReportCollection__Group__0");
					put(grammarAccess.getResultReportCollectionAccess().getGroup_2(), "rule__ResultReportCollection__Group_2__0");
					put(grammarAccess.getResultReportCollectionAccess().getGroup_6(), "rule__ResultReportCollection__Group_6__0");
					put(grammarAccess.getResultDataReportAccess().getGroup(), "rule__ResultDataReport__Group__0");
					put(grammarAccess.getResultDataReportAccess().getGroup_2(), "rule__ResultDataReport__Group_2__0");
					put(grammarAccess.getResultDataReportAccess().getGroup_6(), "rule__ResultDataReport__Group_6__0");
					put(grammarAccess.getResultDataReportAccess().getGroup_7(), "rule__ResultDataReport__Group_7__0");
					put(grammarAccess.getResultDataReportAccess().getGroup_8(), "rule__ResultDataReport__Group_8__0");
					put(grammarAccess.getResultContributorAccess().getGroup(), "rule__ResultContributor__Group__0");
					put(grammarAccess.getResultContributorAccess().getGroup_3(), "rule__ResultContributor__Group_3__0");
					put(grammarAccess.getResultDataAccess().getGroup(), "rule__ResultData__Group__0");
					put(grammarAccess.getIssuesReportAccess().getGroup(), "rule__IssuesReport__Group__0");
					put(grammarAccess.getIssuesReportAccess().getGroup_2(), "rule__IssuesReport__Group_2__0");
					put(grammarAccess.getIssuesReportAccess().getGroup_3(), "rule__IssuesReport__Group_3__0");
					put(grammarAccess.getIssuesReportAccess().getGroup_3_1(), "rule__IssuesReport__Group_3_1__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getRationaleAccess().getGroup(), "rule__Rationale__Group__0");
					put(grammarAccess.getUncertaintyAccess().getGroup(), "rule__Uncertainty__Group__0");
					put(grammarAccess.getUncertaintyAccess().getGroup_2_0(), "rule__Uncertainty__Group_2_0__0");
					put(grammarAccess.getUncertaintyAccess().getGroup_2_1(), "rule__Uncertainty__Group_2_1__0");
					put(grammarAccess.getUncertaintyAccess().getGroup_2_2(), "rule__Uncertainty__Group_2_2__0");
					put(grammarAccess.getResultIssueAccess().getGroup(), "rule__ResultIssue__Group__0");
					put(grammarAccess.getResultIssueAccess().getGroup_2(), "rule__ResultIssue__Group_2__0");
					put(grammarAccess.getResultIssueAccess().getGroup_3(), "rule__ResultIssue__Group_3__0");
					put(grammarAccess.getResultIssueAccess().getGroup_4(), "rule__ResultIssue__Group_4__0");
					put(grammarAccess.getResultIssueAccess().getGroup_5(), "rule__ResultIssue__Group_5__0");
					put(grammarAccess.getTypeRefAccess().getGroup_0(), "rule__TypeRef__Group_0__0");
					put(grammarAccess.getTypeRefAccess().getGroup_1(), "rule__TypeRef__Group_1__0");
					put(grammarAccess.getTypeRefAccess().getGroup_1_2(), "rule__TypeRef__Group_1_2__0");
					put(grammarAccess.getTypeRefAccess().getGroup_2(), "rule__TypeRef__Group_2__0");
					put(grammarAccess.getTypeRefAccess().getGroup_2_2(), "rule__TypeRef__Group_2_2__0");
					put(grammarAccess.getTypeRefAccess().getGroup_3(), "rule__TypeRef__Group_3__0");
					put(grammarAccess.getTypeRefAccess().getGroup_4(), "rule__TypeRef__Group_4__0");
					put(grammarAccess.getTypeRefAccess().getGroup_5(), "rule__TypeRef__Group_5__0");
					put(grammarAccess.getPropertyRefAccess().getGroup(), "rule__PropertyRef__Group__0");
					put(grammarAccess.getValDeclarationAccess().getGroup(), "rule__ValDeclaration__Group__0");
					put(grammarAccess.getValDeclarationAccess().getGroup_3(), "rule__ValDeclaration__Group_3__0");
					put(grammarAccess.getValDeclarationAccess().getGroup_3_1_1(), "rule__ValDeclaration__Group_3_1_1__0");
					put(grammarAccess.getValDeclarationAccess().getGroup_3_1_2(), "rule__ValDeclaration__Group_3_1_2__0");
					put(grammarAccess.getValDeclarationAccess().getGroup_3_1_2_1_1(), "rule__ValDeclaration__Group_3_1_2_1_1__0");
					put(grammarAccess.getComputeDeclarationAccess().getGroup(), "rule__ComputeDeclaration__Group__0");
					put(grammarAccess.getComputeDeclarationAccess().getGroup_4_1(), "rule__ComputeDeclaration__Group_4_1__0");
					put(grammarAccess.getComputeDeclarationAccess().getGroup_4_2(), "rule__ComputeDeclaration__Group_4_2__0");
					put(grammarAccess.getComputeDeclarationAccess().getGroup_4_2_1_1(), "rule__ComputeDeclaration__Group_4_2_1_1__0");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getGroup_0(), "rule__AModelOrPropertyReference__Group_0__0");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getGroup_0_1(), "rule__AModelOrPropertyReference__Group_0_1__0");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getGroup_0_1_0(), "rule__AModelOrPropertyReference__Group_0_1_0__0");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getGroup_0_1_0_0(), "rule__AModelOrPropertyReference__Group_0_1_0_0__0");
					put(grammarAccess.getAModelReferenceAccess().getGroup(), "rule__AModelReference__Group__0");
					put(grammarAccess.getAModelReferenceAccess().getGroup_1(), "rule__AModelReference__Group_1__0");
					put(grammarAccess.getAPropertyReferenceAccess().getGroup(), "rule__APropertyReference__Group__0");
					put(grammarAccess.getAVariableReferenceAccess().getGroup(), "rule__AVariableReference__Group__0");
					put(grammarAccess.getShowValueAccess().getGroup(), "rule__ShowValue__Group__0");
					put(grammarAccess.getShowValueAccess().getGroup_1_1(), "rule__ShowValue__Group_1_1__0");
					put(grammarAccess.getImageReferenceAccess().getGroup(), "rule__ImageReference__Group__0");
					put(grammarAccess.getIMGREFAccess().getGroup(), "rule__IMGREF__Group__0");
					put(grammarAccess.getIMGREFAccess().getGroup_0(), "rule__IMGREF__Group_0__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup(), "rule__AOrExpression__Group__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup_1(), "rule__AOrExpression__Group_1__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup_1_0(), "rule__AOrExpression__Group_1_0__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup_1_0_0(), "rule__AOrExpression__Group_1_0_0__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup(), "rule__AAndExpression__Group__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup_1(), "rule__AAndExpression__Group_1__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup_1_0(), "rule__AAndExpression__Group_1_0__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup_1_0_0(), "rule__AAndExpression__Group_1_0_0__0");
					put(grammarAccess.getAEqualityExpressionAccess().getGroup(), "rule__AEqualityExpression__Group__0");
					put(grammarAccess.getAEqualityExpressionAccess().getGroup_1(), "rule__AEqualityExpression__Group_1__0");
					put(grammarAccess.getAEqualityExpressionAccess().getGroup_1_0(), "rule__AEqualityExpression__Group_1_0__0");
					put(grammarAccess.getAEqualityExpressionAccess().getGroup_1_0_0(), "rule__AEqualityExpression__Group_1_0_0__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup(), "rule__ARelationalExpression__Group__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup_1(), "rule__ARelationalExpression__Group_1__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup_1_0(), "rule__ARelationalExpression__Group_1_0__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup_1_0_0(), "rule__ARelationalExpression__Group_1_0_0__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup(), "rule__AAdditiveExpression__Group__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup_1(), "rule__AAdditiveExpression__Group_1__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup_1_0(), "rule__AAdditiveExpression__Group_1_0__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup_1_0_0(), "rule__AAdditiveExpression__Group_1_0_0__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup(), "rule__AMultiplicativeExpression__Group__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup_1(), "rule__AMultiplicativeExpression__Group_1__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup_1_0(), "rule__AMultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__AMultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getAUnaryOperationAccess().getGroup_0(), "rule__AUnaryOperation__Group_0__0");
					put(grammarAccess.getAUnitExpressionAccess().getGroup(), "rule__AUnitExpression__Group__0");
					put(grammarAccess.getAUnitExpressionAccess().getGroup_1(), "rule__AUnitExpression__Group_1__0");
					put(grammarAccess.getAFunctionCallAccess().getGroup(), "rule__AFunctionCall__Group__0");
					put(grammarAccess.getAFunctionCallAccess().getGroup_4(), "rule__AFunctionCall__Group_4__0");
					put(grammarAccess.getARangeExpressionAccess().getGroup(), "rule__ARangeExpression__Group__0");
					put(grammarAccess.getARangeExpressionAccess().getGroup_5(), "rule__ARangeExpression__Group_5__0");
					put(grammarAccess.getAIfExpressionAccess().getGroup(), "rule__AIfExpression__Group__0");
					put(grammarAccess.getAIfExpressionAccess().getGroup_5(), "rule__AIfExpression__Group_5__0");
					put(grammarAccess.getABooleanLiteralAccess().getGroup(), "rule__ABooleanLiteral__Group__0");
					put(grammarAccess.getAParenthesizedExpressionAccess().getGroup(), "rule__AParenthesizedExpression__Group__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_8(), "rule__ComponentCategory__Group_8__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_10(), "rule__ComponentCategory__Group_10__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_12(), "rule__ComponentCategory__Group_12__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_13(), "rule__ComponentCategory__Group_13__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup(), "rule__AadlClassifierReference__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_1(), "rule__AadlClassifierReference__Group_1__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2(), "rule__AadlClassifierReference__Group_2__0");
					put(grammarAccess.getAADLPROPERTYREFERENCEAccess().getGroup(), "rule__AADLPROPERTYREFERENCE__Group__0");
					put(grammarAccess.getAADLPROPERTYREFERENCEAccess().getGroup_1(), "rule__AADLPROPERTYREFERENCE__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getResultReportCollectionAccess().getNameAssignment_1(), "rule__ResultReportCollection__NameAssignment_1");
					put(grammarAccess.getResultReportCollectionAccess().getTitleAssignment_2_1(), "rule__ResultReportCollection__TitleAssignment_2_1");
					put(grammarAccess.getResultReportCollectionAccess().getTargetAssignment_4(), "rule__ResultReportCollection__TargetAssignment_4");
					put(grammarAccess.getResultReportCollectionAccess().getDescriptionAssignment_6_1(), "rule__ResultReportCollection__DescriptionAssignment_6_1");
					put(grammarAccess.getResultReportCollectionAccess().getContentAssignment_7(), "rule__ResultReportCollection__ContentAssignment_7");
					put(grammarAccess.getResultReportCollectionAccess().getIssuesAssignment_8(), "rule__ResultReportCollection__IssuesAssignment_8");
					put(grammarAccess.getResultDataReportAccess().getNameAssignment_1(), "rule__ResultDataReport__NameAssignment_1");
					put(grammarAccess.getResultDataReportAccess().getTitleAssignment_2_1(), "rule__ResultDataReport__TitleAssignment_2_1");
					put(grammarAccess.getResultDataReportAccess().getTargetAssignment_4(), "rule__ResultDataReport__TargetAssignment_4");
					put(grammarAccess.getResultDataReportAccess().getDescriptionAssignment_6_1(), "rule__ResultDataReport__DescriptionAssignment_6_1");
					put(grammarAccess.getResultDataReportAccess().getHeadingAssignment_7_1(), "rule__ResultDataReport__HeadingAssignment_7_1");
					put(grammarAccess.getResultDataReportAccess().getContentAssignment_7_2(), "rule__ResultDataReport__ContentAssignment_7_2");
					put(grammarAccess.getResultDataReportAccess().getResultDataAssignment_8_1(), "rule__ResultDataReport__ResultDataAssignment_8_1");
					put(grammarAccess.getResultDataReportAccess().getIssuesAssignment_9(), "rule__ResultDataReport__IssuesAssignment_9");
					put(grammarAccess.getResultContributorAccess().getTargetAssignment_1(), "rule__ResultContributor__TargetAssignment_1");
					put(grammarAccess.getResultContributorAccess().getResultDataAssignment_3_1(), "rule__ResultContributor__ResultDataAssignment_3_1");
					put(grammarAccess.getResultContributorAccess().getIssuesAssignment_4(), "rule__ResultContributor__IssuesAssignment_4");
					put(grammarAccess.getResultContributorAccess().getSubcontributorAssignment_5(), "rule__ResultContributor__SubcontributorAssignment_5");
					put(grammarAccess.getResultDataAccess().getNameAssignment_0(), "rule__ResultData__NameAssignment_0");
					put(grammarAccess.getResultDataAccess().getValueAssignment_2_0(), "rule__ResultData__ValueAssignment_2_0");
					put(grammarAccess.getResultDataAccess().getIntegerValueAssignment_2_1(), "rule__ResultData__IntegerValueAssignment_2_1");
					put(grammarAccess.getIssuesReportAccess().getNameAssignment_1(), "rule__IssuesReport__NameAssignment_1");
					put(grammarAccess.getIssuesReportAccess().getTargetAssignment_2_1(), "rule__IssuesReport__TargetAssignment_2_1");
					put(grammarAccess.getIssuesReportAccess().getDescriptionAssignment_3_1_1(), "rule__IssuesReport__DescriptionAssignment_3_1_1");
					put(grammarAccess.getIssuesReportAccess().getIssuesAssignment_3_2(), "rule__IssuesReport__IssuesAssignment_3_2");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1(), "rule__Description__DescriptionAssignment_1");
					put(grammarAccess.getDescriptionElementAccess().getTextAssignment_0(), "rule__DescriptionElement__TextAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getShowValueAssignment_1(), "rule__DescriptionElement__ShowValueAssignment_1");
					put(grammarAccess.getDescriptionElementAccess().getThisTargetAssignment_2(), "rule__DescriptionElement__ThisTargetAssignment_2");
					put(grammarAccess.getDescriptionElementAccess().getImageAssignment_3(), "rule__DescriptionElement__ImageAssignment_3");
					put(grammarAccess.getRationaleAccess().getTextAssignment_1(), "rule__Rationale__TextAssignment_1");
					put(grammarAccess.getUncertaintyAccess().getVolatilityAssignment_2_0_1(), "rule__Uncertainty__VolatilityAssignment_2_0_1");
					put(grammarAccess.getUncertaintyAccess().getPrecedenceAssignment_2_1_1(), "rule__Uncertainty__PrecedenceAssignment_2_1_1");
					put(grammarAccess.getUncertaintyAccess().getImpactAssignment_2_2_1(), "rule__Uncertainty__ImpactAssignment_2_2_1");
					put(grammarAccess.getResultIssueAccess().getIssueTypeAssignment_0(), "rule__ResultIssue__IssueTypeAssignment_0");
					put(grammarAccess.getResultIssueAccess().getMessageAssignment_1(), "rule__ResultIssue__MessageAssignment_1");
					put(grammarAccess.getResultIssueAccess().getTargetAssignment_2_1(), "rule__ResultIssue__TargetAssignment_2_1");
					put(grammarAccess.getResultIssueAccess().getExceptionTypeAssignment_3_1(), "rule__ResultIssue__ExceptionTypeAssignment_3_1");
					put(grammarAccess.getResultIssueAccess().getDiagnosticIdAssignment_4_1(), "rule__ResultIssue__DiagnosticIdAssignment_4_1");
					put(grammarAccess.getResultIssueAccess().getIssuesAssignment_5_1(), "rule__ResultIssue__IssuesAssignment_5_1");
					put(grammarAccess.getTypeRefAccess().getReferencedUnitsTypeAssignment_1_2_1(), "rule__TypeRef__ReferencedUnitsTypeAssignment_1_2_1");
					put(grammarAccess.getTypeRefAccess().getReferencedUnitsTypeAssignment_2_2_1(), "rule__TypeRef__ReferencedUnitsTypeAssignment_2_2_1");
					put(grammarAccess.getTypeRefAccess().getRefAssignment_5_1(), "rule__TypeRef__RefAssignment_5_1");
					put(grammarAccess.getPropertyRefAccess().getRefAssignment_1(), "rule__PropertyRef__RefAssignment_1");
					put(grammarAccess.getValDeclarationAccess().getNameAssignment_2(), "rule__ValDeclaration__NameAssignment_2");
					put(grammarAccess.getValDeclarationAccess().getTypeAssignment_3_1_0(), "rule__ValDeclaration__TypeAssignment_3_1_0");
					put(grammarAccess.getValDeclarationAccess().getTypeAssignment_3_1_1_1(), "rule__ValDeclaration__TypeAssignment_3_1_1_1");
					put(grammarAccess.getValDeclarationAccess().getRangeAssignment_3_1_2_0(), "rule__ValDeclaration__RangeAssignment_3_1_2_0");
					put(grammarAccess.getValDeclarationAccess().getTypeAssignment_3_1_2_1_0(), "rule__ValDeclaration__TypeAssignment_3_1_2_1_0");
					put(grammarAccess.getValDeclarationAccess().getTypeAssignment_3_1_2_1_1_1(), "rule__ValDeclaration__TypeAssignment_3_1_2_1_1_1");
					put(grammarAccess.getValDeclarationAccess().getValueAssignment_5(), "rule__ValDeclaration__ValueAssignment_5");
					put(grammarAccess.getComputeDeclarationAccess().getNameAssignment_2(), "rule__ComputeDeclaration__NameAssignment_2");
					put(grammarAccess.getComputeDeclarationAccess().getTypeAssignment_4_0(), "rule__ComputeDeclaration__TypeAssignment_4_0");
					put(grammarAccess.getComputeDeclarationAccess().getTypeAssignment_4_1_1(), "rule__ComputeDeclaration__TypeAssignment_4_1_1");
					put(grammarAccess.getComputeDeclarationAccess().getRangeAssignment_4_2_0(), "rule__ComputeDeclaration__RangeAssignment_4_2_0");
					put(grammarAccess.getComputeDeclarationAccess().getTypeAssignment_4_2_1_0(), "rule__ComputeDeclaration__TypeAssignment_4_2_1_0");
					put(grammarAccess.getComputeDeclarationAccess().getTypeAssignment_4_2_1_1_1(), "rule__ComputeDeclaration__TypeAssignment_4_2_1_1_1");
					put(grammarAccess.getAModelOrPropertyReferenceAccess().getPropertyAssignment_0_1_1(), "rule__AModelOrPropertyReference__PropertyAssignment_0_1_1");
					put(grammarAccess.getAModelReferenceAccess().getModelElementAssignment_0(), "rule__AModelReference__ModelElementAssignment_0");
					put(grammarAccess.getAModelReferenceAccess().getModelElementAssignment_1_2(), "rule__AModelReference__ModelElementAssignment_1_2");
					put(grammarAccess.getAPropertyReferenceAccess().getPropertyAssignment_2(), "rule__APropertyReference__PropertyAssignment_2");
					put(grammarAccess.getAVariableReferenceAccess().getVariableAssignment_1(), "rule__AVariableReference__VariableAssignment_1");
					put(grammarAccess.getShowValueAccess().getRefAssignment_0(), "rule__ShowValue__RefAssignment_0");
					put(grammarAccess.getShowValueAccess().getUnitAssignment_1_1_1(), "rule__ShowValue__UnitAssignment_1_1_1");
					put(grammarAccess.getImageReferenceAccess().getImgfileAssignment_1(), "rule__ImageReference__ImgfileAssignment_1");
					put(grammarAccess.getAOrExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AOrExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAOrExpressionAccess().getRightAssignment_1_1(), "rule__AOrExpression__RightAssignment_1_1");
					put(grammarAccess.getAAndExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AAndExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAAndExpressionAccess().getRightAssignment_1_1(), "rule__AAndExpression__RightAssignment_1_1");
					put(grammarAccess.getAEqualityExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AEqualityExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAEqualityExpressionAccess().getRightAssignment_1_1(), "rule__AEqualityExpression__RightAssignment_1_1");
					put(grammarAccess.getARelationalExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__ARelationalExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getARelationalExpressionAccess().getRightAssignment_1_1(), "rule__ARelationalExpression__RightAssignment_1_1");
					put(grammarAccess.getAAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AAdditiveExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAAdditiveExpressionAccess().getRightAssignment_1_1(), "rule__AAdditiveExpression__RightAssignment_1_1");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AMultiplicativeExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getRightAssignment_1_1(), "rule__AMultiplicativeExpression__RightAssignment_1_1");
					put(grammarAccess.getAUnaryOperationAccess().getOperatorAssignment_0_1(), "rule__AUnaryOperation__OperatorAssignment_0_1");
					put(grammarAccess.getAUnaryOperationAccess().getOperandAssignment_0_2(), "rule__AUnaryOperation__OperandAssignment_0_2");
					put(grammarAccess.getAUnitExpressionAccess().getConvertAssignment_1_1_0(), "rule__AUnitExpression__ConvertAssignment_1_1_0");
					put(grammarAccess.getAUnitExpressionAccess().getDropAssignment_1_1_1(), "rule__AUnitExpression__DropAssignment_1_1_1");
					put(grammarAccess.getAUnitExpressionAccess().getUnitAssignment_1_2(), "rule__AUnitExpression__UnitAssignment_1_2");
					put(grammarAccess.getAFunctionCallAccess().getFunctionAssignment_1(), "rule__AFunctionCall__FunctionAssignment_1");
					put(grammarAccess.getAFunctionCallAccess().getArgumentsAssignment_3(), "rule__AFunctionCall__ArgumentsAssignment_3");
					put(grammarAccess.getAFunctionCallAccess().getArgumentsAssignment_4_1(), "rule__AFunctionCall__ArgumentsAssignment_4_1");
					put(grammarAccess.getARangeExpressionAccess().getMinimumAssignment_2(), "rule__ARangeExpression__MinimumAssignment_2");
					put(grammarAccess.getARangeExpressionAccess().getMaximumAssignment_4(), "rule__ARangeExpression__MaximumAssignment_4");
					put(grammarAccess.getARangeExpressionAccess().getDeltaAssignment_5_1(), "rule__ARangeExpression__DeltaAssignment_5_1");
					put(grammarAccess.getAIfExpressionAccess().getIfAssignment_2(), "rule__AIfExpression__IfAssignment_2");
					put(grammarAccess.getAIfExpressionAccess().getThenAssignment_4(), "rule__AIfExpression__ThenAssignment_4");
					put(grammarAccess.getAIfExpressionAccess().getElseAssignment_5_1(), "rule__AIfExpression__ElseAssignment_5_1");
					put(grammarAccess.getAIntegerTermAccess().getValueAssignment(), "rule__AIntegerTerm__ValueAssignment");
					put(grammarAccess.getARealTermAccess().getValueAssignment(), "rule__ARealTerm__ValueAssignment");
					put(grammarAccess.getABooleanLiteralAccess().getValueAssignment_1_0(), "rule__ABooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
					put(grammarAccess.getUncertaintyAccess().getUnorderedGroup_2(), "rule__Uncertainty__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser typedParser = (org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser) parser;
			typedParser.entryRuleResultReport();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ResultsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ResultsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
