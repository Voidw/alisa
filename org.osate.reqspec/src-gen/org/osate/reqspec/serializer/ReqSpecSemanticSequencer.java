/*
 * generated by Xtext
 */
package org.osate.reqspec.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
import org.osate.alisa.common.common.APropertyReference;
import org.osate.alisa.common.common.CommonPackage;
import org.osate.alisa.common.common.ComputeDeclaration;
import org.osate.alisa.common.common.Description;
import org.osate.alisa.common.common.DescriptionElement;
import org.osate.alisa.common.common.ImageReference;
import org.osate.alisa.common.common.PropertyConsistentVariableDeclaration;
import org.osate.alisa.common.common.Rationale;
import org.osate.alisa.common.common.ShowValue;
import org.osate.alisa.common.common.Uncertainty;
import org.osate.alisa.common.common.XNumberLiteralUnit;
import org.osate.alisa.common.serializer.CommonSemanticSequencer;
import org.osate.reqspec.reqSpec.DocumentSection;
import org.osate.reqspec.reqSpec.ExternalDocument;
import org.osate.reqspec.reqSpec.Goal;
import org.osate.reqspec.reqSpec.InformalPredicate;
import org.osate.reqspec.reqSpec.ReqDocument;
import org.osate.reqspec.reqSpec.ReqSpec;
import org.osate.reqspec.reqSpec.ReqSpecPackage;
import org.osate.reqspec.reqSpec.Requirement;
import org.osate.reqspec.reqSpec.StakeholderGoals;
import org.osate.reqspec.reqSpec.SystemRequirements;
import org.osate.reqspec.reqSpec.XPredicate;
import org.osate.reqspec.services.ReqSpecGrammarAccess;

@SuppressWarnings("all")
public class ReqSpecSemanticSequencer extends CommonSemanticSequencer {

	@Inject
	private ReqSpecGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommonPackage.APROPERTY_REFERENCE:
				sequence_APropertyReference(context, (APropertyReference) semanticObject); 
				return; 
			case CommonPackage.COMPUTE_DECLARATION:
				sequence_ComputeDeclaration(context, (ComputeDeclaration) semanticObject); 
				return; 
			case CommonPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case CommonPackage.DESCRIPTION_ELEMENT:
				sequence_DescriptionElement(context, (DescriptionElement) semanticObject); 
				return; 
			case CommonPackage.IMAGE_REFERENCE:
				sequence_ImageReference(context, (ImageReference) semanticObject); 
				return; 
			case CommonPackage.PROPERTY_CONSISTENT_VARIABLE_DECLARATION:
				sequence_XValDeclaration(context, (PropertyConsistentVariableDeclaration) semanticObject); 
				return; 
			case CommonPackage.RATIONALE:
				sequence_Rationale(context, (Rationale) semanticObject); 
				return; 
			case CommonPackage.SHOW_VALUE:
				sequence_ShowValue(context, (ShowValue) semanticObject); 
				return; 
			case CommonPackage.UNCERTAINTY:
				sequence_Uncertainty(context, (Uncertainty) semanticObject); 
				return; 
			case CommonPackage.XNUMBER_LITERAL_UNIT:
				sequence_XNumberLiteral(context, (XNumberLiteralUnit) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == ReqSpecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReqSpecPackage.DOCUMENT_SECTION:
				sequence_DocumentSection(context, (DocumentSection) semanticObject); 
				return; 
			case ReqSpecPackage.EXTERNAL_DOCUMENT:
				sequence_ExternalDocument(context, (ExternalDocument) semanticObject); 
				return; 
			case ReqSpecPackage.GOAL:
				if(context == grammarAccess.getContractualElementRule()) {
					sequence_ContractualElement_DocGoal_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDocGoalRule()) {
					sequence_DocGoal(context, (Goal) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGoalRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case ReqSpecPackage.INFORMAL_PREDICATE:
				sequence_InformalPredicate(context, (InformalPredicate) semanticObject); 
				return; 
			case ReqSpecPackage.REQ_DOCUMENT:
				sequence_ReqDocument(context, (ReqDocument) semanticObject); 
				return; 
			case ReqSpecPackage.REQ_SPEC:
				sequence_ReqSpec(context, (ReqSpec) semanticObject); 
				return; 
			case ReqSpecPackage.REQUIREMENT:
				if(context == grammarAccess.getContractualElementRule()) {
					sequence_ContractualElement_DocRequirement_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDocRequirementRule()) {
					sequence_DocRequirement(context, (Requirement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case ReqSpecPackage.STAKEHOLDER_GOALS:
				sequence_StakeholderGoals(context, (StakeholderGoals) semanticObject); 
				return; 
			case ReqSpecPackage.SYSTEM_REQUIREMENTS:
				sequence_SystemRequirements(context, (SystemRequirements) semanticObject); 
				return; 
			case ReqSpecPackage.XPREDICATE:
				sequence_XPredicate(context, (XPredicate) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             title=STRING? 
	 *             targetElement=[NamedElement|ID]? 
	 *             category+=[RequirementCategory|ID]* 
	 *             description=Description? 
	 *             constants+=XValDeclaration* 
	 *             rationale=Rationale? 
	 *             changeUncertainty=Uncertainty? 
	 *             refinesReference+=[Goal|QualifiedName]* 
	 *             conflictsReference+=[Goal|QualifiedName]* 
	 *             evolvesReference+=[Requirement|QualifiedName]* 
	 *             (dropped?='dropped' dropRationale=STRING?)? 
	 *             stakeholderReference+=[Stakeholder|QualifiedName]* 
	 *             documentRequirement+=[ContractualElement|QualifiedName]* 
	 *             docReference+=ExternalDocument* 
	 *             issues+=STRING*
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             title=STRING? 
	 *             (targetDescription=STRING | (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] targetElement=[NamedElement|ID]?))? 
	 *             category+=[RequirementCategory|ID]* 
	 *             description=Description? 
	 *             constants+=XValDeclaration* 
	 *             rationale=Rationale? 
	 *             changeUncertainty=Uncertainty? 
	 *             refinesReference+=[Goal|QualifiedName]* 
	 *             conflictsReference+=[Goal|QualifiedName]* 
	 *             evolvesReference+=[Requirement|QualifiedName]* 
	 *             (dropped?='dropped' dropRationale=STRING?)? 
	 *             stakeholderReference+=[Stakeholder|QualifiedName]* 
	 *             documentRequirement+=[ContractualElement|QualifiedName]* 
	 *             docReference+=ExternalDocument* 
	 *             issues+=STRING*
	 *         )
	 *     )
	 */
	protected void sequence_ContractualElement_DocGoal_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             title=STRING? 
	 *             targetElement=[NamedElement|ID]? 
	 *             category+=[RequirementCategory|ID]* 
	 *             description=Description? 
	 *             constants+=XValDeclaration* 
	 *             computes+=ComputeDeclaration* 
	 *             predicate=ReqPredicate? 
	 *             rationale=Rationale? 
	 *             changeUncertainty=Uncertainty? 
	 *             (exception=[EObject|ID] | exceptionText=STRING)? 
	 *             refinesReference+=[Requirement|QualifiedName]* 
	 *             decomposesReference+=[Requirement|QualifiedName]* 
	 *             evolvesReference+=[Requirement|QualifiedName]* 
	 *             (dropped?='dropped' dropRationale=STRING?)? 
	 *             goalReference+=[Goal|QualifiedName]* 
	 *             stakeholderRequirementReference+=[Goal|QualifiedName]* 
	 *             documentRequirement+=[ContractualElement|QualifiedName]* 
	 *             docReference+=ExternalDocument* 
	 *             issues+=STRING*
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             title=STRING? 
	 *             (targetDescription=STRING | (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] targetElement=[NamedElement|ID]?))? 
	 *             category+=[RequirementCategory|ID]* 
	 *             description=Description? 
	 *             constants+=XValDeclaration* 
	 *             computes+=ComputeDeclaration* 
	 *             predicate=ReqPredicate? 
	 *             rationale=Rationale? 
	 *             changeUncertainty=Uncertainty? 
	 *             (exception=[EObject|ID] | exceptionText=STRING)? 
	 *             refinesReference+=[Requirement|QualifiedName]* 
	 *             decomposesReference+=[Requirement|QualifiedName]* 
	 *             evolvesReference+=[Requirement|QualifiedName]* 
	 *             (dropped?='dropped' dropRationale=STRING?)? 
	 *             goalReference+=[Goal|QualifiedName]* 
	 *             stakeholderRequirementReference+=[Goal|QualifiedName]* 
	 *             documentRequirement+=[ContractualElement|QualifiedName]* 
	 *             docReference+=ExternalDocument* 
	 *             issues+=STRING*
	 *         )
	 *     )
	 */
	protected void sequence_ContractualElement_DocRequirement_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         (targetDescription=STRING | (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] targetElement=[NamedElement|ID]?))? 
	 *         category+=[RequirementCategory|ID]* 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         rationale=Rationale? 
	 *         changeUncertainty=Uncertainty? 
	 *         refinesReference+=[Goal|QualifiedName]* 
	 *         conflictsReference+=[Goal|QualifiedName]* 
	 *         evolvesReference+=[Requirement|QualifiedName]* 
	 *         (dropped?='dropped' dropRationale=STRING?)? 
	 *         stakeholderReference+=[Stakeholder|QualifiedName]* 
	 *         documentRequirement+=[ContractualElement|QualifiedName]* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_DocGoal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         (targetDescription=STRING | (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] targetElement=[NamedElement|ID]?))? 
	 *         category+=[RequirementCategory|ID]* 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         computes+=ComputeDeclaration* 
	 *         predicate=ReqPredicate? 
	 *         rationale=Rationale? 
	 *         changeUncertainty=Uncertainty? 
	 *         (exception=[EObject|ID] | exceptionText=STRING)? 
	 *         refinesReference+=[Requirement|QualifiedName]* 
	 *         decomposesReference+=[Requirement|QualifiedName]* 
	 *         evolvesReference+=[Requirement|QualifiedName]* 
	 *         (dropped?='dropped' dropRationale=STRING?)? 
	 *         goalReference+=[Goal|QualifiedName]* 
	 *         stakeholderRequirementReference+=[Goal|QualifiedName]* 
	 *         documentRequirement+=[ContractualElement|QualifiedName]* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_DocRequirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID title=STRING? description=Description? (content+=DocGoal | content+=DocRequirement | content+=DocumentSection)*)
	 */
	protected void sequence_DocumentSection(EObject context, DocumentSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (docReference=DOCPATH docFragment=DOCFRAGMENT?)
	 */
	protected void sequence_ExternalDocument(EObject context, ExternalDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         targetElement=[NamedElement|ID]? 
	 *         category+=[RequirementCategory|ID]* 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         rationale=Rationale? 
	 *         changeUncertainty=Uncertainty? 
	 *         refinesReference+=[Goal|QualifiedName]* 
	 *         conflictsReference+=[Goal|QualifiedName]* 
	 *         evolvesReference+=[Requirement|QualifiedName]* 
	 *         (dropped?='dropped' dropRationale=STRING?)? 
	 *         stakeholderReference+=[Stakeholder|QualifiedName]* 
	 *         documentRequirement+=[ContractualElement|QualifiedName]* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 */
	protected void sequence_InformalPredicate(EObject context, InformalPredicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqSpecPackage.Literals.INFORMAL_PREDICATE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqSpecPackage.Literals.INFORMAL_PREDICATE__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInformalPredicateAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         title=STRING? 
	 *         description=Description? 
	 *         (content+=DocGoal | content+=DocRequirement | content+=DocumentSection)* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_ReqDocument(EObject context, ReqDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parts+=SystemRequirements | parts+=StakeholderGoals | parts+=ReqDocument)+
	 */
	protected void sequence_ReqSpec(EObject context, ReqSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=STRING? 
	 *         targetElement=[NamedElement|ID]? 
	 *         category+=[RequirementCategory|ID]* 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         computes+=ComputeDeclaration* 
	 *         predicate=ReqPredicate? 
	 *         rationale=Rationale? 
	 *         changeUncertainty=Uncertainty? 
	 *         (exception=[EObject|ID] | exceptionText=STRING)? 
	 *         refinesReference+=[Requirement|QualifiedName]* 
	 *         decomposesReference+=[Requirement|QualifiedName]* 
	 *         evolvesReference+=[Requirement|QualifiedName]* 
	 *         (dropped?='dropped' dropRationale=STRING?)? 
	 *         goalReference+=[Goal|QualifiedName]* 
	 *         stakeholderRequirementReference+=[Goal|QualifiedName]* 
	 *         documentRequirement+=[ContractualElement|QualifiedName]* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         title=STRING? 
	 *         (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] | global?='all') 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         content+=Goal* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_StakeholderGoals(EObject context, StakeholderGoals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         title=STRING? 
	 *         (target=[ComponentClassifier|AADLCLASSIFIERREFERENCE] | global?='all') 
	 *         description=Description? 
	 *         constants+=XValDeclaration* 
	 *         computes+=ComputeDeclaration* 
	 *         content+=Requirement* 
	 *         docReference+=ExternalDocument* 
	 *         issues+=STRING*
	 *     )
	 */
	protected void sequence_SystemRequirements(EObject context, SystemRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     xpression=XExpression
	 */
	protected void sequence_XPredicate(EObject context, XPredicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqSpecPackage.Literals.XPREDICATE__XPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqSpecPackage.Literals.XPREDICATE__XPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXPredicateAccess().getXpressionXExpressionParserRuleCall_1_0(), semanticObject.getXpression());
		feeder.finish();
	}
}
