/*
* generated by Xtext
*/
package org.osate.alisa.workbench.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AlisaGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AlisaWorkAreaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AlisaWorkArea");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlisaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCasesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCasesAssuranceCaseConfigurationParserRuleCall_2_0 = (RuleCall)cCasesAssignment_2.eContents().get(0);
		
		//AlisaWorkArea:
		//	"alisa" name=ID cases+=AssuranceCaseConfiguration*;
		public ParserRule getRule() { return rule; }

		//"alisa" name=ID cases+=AssuranceCaseConfiguration*
		public Group getGroup() { return cGroup; }

		//"alisa"
		public Keyword getAlisaKeyword_0() { return cAlisaKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//cases+=AssuranceCaseConfiguration*
		public Assignment getCasesAssignment_2() { return cCasesAssignment_2; }

		//AssuranceCaseConfiguration
		public RuleCall getCasesAssuranceCaseConfigurationParserRuleCall_2_0() { return cCasesAssuranceCaseConfigurationParserRuleCall_2_0; }
	}

	public class AssuranceCaseConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssuranceCaseConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSystemAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSystemComponentImplementationCrossReference_4_0 = (CrossReference)cSystemAssignment_4.eContents().get(0);
		private final RuleCall cSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1 = (RuleCall)cSystemComponentImplementationCrossReference_4_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final UnorderedGroup cUnorderedGroup_6 = (UnorderedGroup)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cUnorderedGroup_6.eContents().get(0);
		private final Keyword cDescriptionKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final RuleCall cDescriptionDescriptionParserRuleCall_6_0_1_0 = (RuleCall)cDescriptionAssignment_6_0_1.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cUnorderedGroup_6.eContents().get(1);
		private final Keyword cPlansKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cPlansAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final CrossReference cPlansVerificationPlanCrossReference_6_1_1_0 = (CrossReference)cPlansAssignment_6_1_1.eContents().get(0);
		private final RuleCall cPlansVerificationPlanQualifiedNameParserRuleCall_6_1_1_0_1 = (RuleCall)cPlansVerificationPlanCrossReference_6_1_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cUnorderedGroup_6.eContents().get(2);
		private final Keyword cWhenKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cSelectionFilterAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cSelectionFilterSelectionCategoryCrossReference_6_2_1_0 = (CrossReference)cSelectionFilterAssignment_6_2_1.eContents().get(0);
		private final RuleCall cSelectionFilterSelectionCategoryIDTerminalRuleCall_6_2_1_0_1 = (RuleCall)cSelectionFilterSelectionCategoryCrossReference_6_2_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//AssuranceCaseConfiguration:
		//	"case" name=ID (":" title=STRING)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
		//	(("description" description=Description)? //	& (  constants+=XValDeclaration* )
		//	& "plans" plans+=[Verify::VerificationPlan|QualifiedName]+ & ("when"
		//	selectionFilter+=[categories::SelectionCategory]+)?) "]";
		public ParserRule getRule() { return rule; }

		//"case" name=ID (":" title=STRING)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
		//(("description" description=Description)? //	& (  constants+=XValDeclaration* )
		//& "plans" plans+=[Verify::VerificationPlan|QualifiedName]+ & ("when"
		//selectionFilter+=[categories::SelectionCategory]+)?) "]"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(":" title=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=STRING
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_1_0() { return cTitleSTRINGTerminalRuleCall_2_1_0; }

		//"for"
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//system=[aadl2::ComponentImplementation|AadlClassifierReference]
		public Assignment getSystemAssignment_4() { return cSystemAssignment_4; }

		//[aadl2::ComponentImplementation|AadlClassifierReference]
		public CrossReference getSystemComponentImplementationCrossReference_4_0() { return cSystemComponentImplementationCrossReference_4_0; }

		//AadlClassifierReference
		public RuleCall getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1() { return cSystemComponentImplementationAadlClassifierReferenceParserRuleCall_4_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }

		//("description" description=Description)? //	& (  constants+=XValDeclaration* )
		//& "plans" plans+=[Verify::VerificationPlan|QualifiedName]+ & ("when" selectionFilter+=[categories::SelectionCategory]+)?
		public UnorderedGroup getUnorderedGroup_6() { return cUnorderedGroup_6; }

		//("description" description=Description)?
		public Group getGroup_6_0() { return cGroup_6_0; }

		//"description"
		public Keyword getDescriptionKeyword_6_0_0() { return cDescriptionKeyword_6_0_0; }

		//description=Description
		public Assignment getDescriptionAssignment_6_0_1() { return cDescriptionAssignment_6_0_1; }

		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_6_0_1_0() { return cDescriptionDescriptionParserRuleCall_6_0_1_0; }

		//"plans" plans+=[Verify::VerificationPlan|QualifiedName]+
		public Group getGroup_6_1() { return cGroup_6_1; }

		//"plans"
		public Keyword getPlansKeyword_6_1_0() { return cPlansKeyword_6_1_0; }

		//plans+=[Verify::VerificationPlan|QualifiedName]+
		public Assignment getPlansAssignment_6_1_1() { return cPlansAssignment_6_1_1; }

		//[Verify::VerificationPlan|QualifiedName]
		public CrossReference getPlansVerificationPlanCrossReference_6_1_1_0() { return cPlansVerificationPlanCrossReference_6_1_1_0; }

		//QualifiedName
		public RuleCall getPlansVerificationPlanQualifiedNameParserRuleCall_6_1_1_0_1() { return cPlansVerificationPlanQualifiedNameParserRuleCall_6_1_1_0_1; }

		//("when" selectionFilter+=[categories::SelectionCategory]+)?
		public Group getGroup_6_2() { return cGroup_6_2; }

		//"when"
		public Keyword getWhenKeyword_6_2_0() { return cWhenKeyword_6_2_0; }

		//selectionFilter+=[categories::SelectionCategory]+
		public Assignment getSelectionFilterAssignment_6_2_1() { return cSelectionFilterAssignment_6_2_1; }

		//[categories::SelectionCategory]
		public CrossReference getSelectionFilterSelectionCategoryCrossReference_6_2_1_0() { return cSelectionFilterSelectionCategoryCrossReference_6_2_1_0; }

		//ID
		public RuleCall getSelectionFilterSelectionCategoryIDTerminalRuleCall_6_2_1_0_1() { return cSelectionFilterSelectionCategoryIDTerminalRuleCall_6_2_1_0_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}

	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Description");
		private final Assignment cDescriptionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDescriptionDescriptionElementParserRuleCall_0 = (RuleCall)cDescriptionAssignment.eContents().get(0);
		
		//Description:
		//	description+=DescriptionElement+;
		public ParserRule getRule() { return rule; }

		//description+=DescriptionElement+
		public Assignment getDescriptionAssignment() { return cDescriptionAssignment; }

		//DescriptionElement
		public RuleCall getDescriptionDescriptionElementParserRuleCall_0() { return cDescriptionDescriptionElementParserRuleCall_0; }
	}

	public class DescriptionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DescriptionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTextAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTextSTRINGTerminalRuleCall_0_0 = (RuleCall)cTextAssignment_0.eContents().get(0);
		private final Assignment cThisTargetAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cThisTargetThisKeyword_1_0 = (Keyword)cThisTargetAssignment_1.eContents().get(0);
		
		//DescriptionElement:
		//	text=STRING | thisTarget?="this";
		public ParserRule getRule() { return rule; }

		//text=STRING | thisTarget?="this"
		public Alternatives getAlternatives() { return cAlternatives; }

		//text=STRING
		public Assignment getTextAssignment_0() { return cTextAssignment_0; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0_0() { return cTextSTRINGTerminalRuleCall_0_0; }

		//thisTarget?="this"
		public Assignment getThisTargetAssignment_1() { return cThisTargetAssignment_1; }

		//"this"
		public Keyword getThisTargetThisKeyword_1_0() { return cThisTargetThisKeyword_1_0; }
	}

	public class ComputeDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComputeDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComputeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ComputeDeclaration:
		//	"compute" name=ID;
		public ParserRule getRule() { return rule; }

		//"compute" name=ID
		public Group getGroup() { return cGroup; }

		//"compute"
		public Keyword getComputeKeyword_0() { return cComputeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class AadlClassifierReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AadlClassifierReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		
		//// Override XNumberLiteral from XBase
		////Accept unit and have value converter turn it into value scaled to base unit
		//// Qualified classifier reference
		//AadlClassifierReference:
		//	ID "::" ID ("." ID)?;
		public ParserRule getRule() { return rule; }

		//ID "::" ID ("." ID)?
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//"::"
		public Keyword getColonColonKeyword_1() { return cColonColonKeyword_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }

		//("." ID)?
		public Group getGroup_3() { return cGroup_3; }

		//"."
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_3_1() { return cIDTerminalRuleCall_3_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)?;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)?
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class URIIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URIID");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//URIID:
		//	STRING;
		public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final AlisaWorkAreaElements pAlisaWorkArea;
	private final AssuranceCaseConfigurationElements pAssuranceCaseConfiguration;
	private final DescriptionElements pDescription;
	private final DescriptionElementElements pDescriptionElement;
	private final ComputeDeclarationElements pComputeDeclaration;
	private final AadlClassifierReferenceElements pAadlClassifierReference;
	private final QualifiedNameElements pQualifiedName;
	private final URIIDElements pURIID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AlisaGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAlisaWorkArea = new AlisaWorkAreaElements();
		this.pAssuranceCaseConfiguration = new AssuranceCaseConfigurationElements();
		this.pDescription = new DescriptionElements();
		this.pDescriptionElement = new DescriptionElementElements();
		this.pComputeDeclaration = new ComputeDeclarationElements();
		this.pAadlClassifierReference = new AadlClassifierReferenceElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pURIID = new URIIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.alisa.workbench.Alisa".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AlisaWorkArea:
	//	"alisa" name=ID cases+=AssuranceCaseConfiguration*;
	public AlisaWorkAreaElements getAlisaWorkAreaAccess() {
		return pAlisaWorkArea;
	}
	
	public ParserRule getAlisaWorkAreaRule() {
		return getAlisaWorkAreaAccess().getRule();
	}

	//AssuranceCaseConfiguration:
	//	"case" name=ID (":" title=STRING)? "for" system=[aadl2::ComponentImplementation|AadlClassifierReference] "["
	//	(("description" description=Description)? //	& (  constants+=XValDeclaration* )
	//	& "plans" plans+=[Verify::VerificationPlan|QualifiedName]+ & ("when"
	//	selectionFilter+=[categories::SelectionCategory]+)?) "]";
	public AssuranceCaseConfigurationElements getAssuranceCaseConfigurationAccess() {
		return pAssuranceCaseConfiguration;
	}
	
	public ParserRule getAssuranceCaseConfigurationRule() {
		return getAssuranceCaseConfigurationAccess().getRule();
	}

	//Description:
	//	description+=DescriptionElement+;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | thisTarget?="this";
	public DescriptionElementElements getDescriptionElementAccess() {
		return pDescriptionElement;
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//ComputeDeclaration:
	//	"compute" name=ID;
	public ComputeDeclarationElements getComputeDeclarationAccess() {
		return pComputeDeclaration;
	}
	
	public ParserRule getComputeDeclarationRule() {
		return getComputeDeclarationAccess().getRule();
	}

	//// Override XNumberLiteral from XBase
	////Accept unit and have value converter turn it into value scaled to base unit
	//// Qualified classifier reference
	//AadlClassifierReference:
	//	ID "::" ID ("." ID)?;
	public AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return pAadlClassifierReference;
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)?;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//URIID:
	//	STRING;
	public URIIDElements getURIIDAccess() {
		return pURIID;
	}
	
	public ParserRule getURIIDRule() {
		return getURIIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
