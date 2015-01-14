/*
* generated by Xtext
*/
grammar InternalAlisa;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.osate.alisa.workbench.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.osate.alisa.workbench.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.osate.alisa.workbench.services.AlisaGrammarAccess;

}

@parser::members {
 
 	private AlisaGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(AlisaGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleAlisaWorkArea
entryRuleAlisaWorkArea 
:
{ before(grammarAccess.getAlisaWorkAreaRule()); }
	 ruleAlisaWorkArea
{ after(grammarAccess.getAlisaWorkAreaRule()); } 
	 EOF 
;

// Rule AlisaWorkArea
ruleAlisaWorkArea
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getGroup()); }
(rule__AlisaWorkArea__Group__0)
{ after(grammarAccess.getAlisaWorkAreaAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAssuranceCasePlan
entryRuleAssuranceCasePlan 
:
{ before(grammarAccess.getAssuranceCasePlanRule()); }
	 ruleAssuranceCasePlan
{ after(grammarAccess.getAssuranceCasePlanRule()); } 
	 EOF 
;

// Rule AssuranceCasePlan
ruleAssuranceCasePlan
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getGroup()); }
(rule__AssuranceCasePlan__Group__0)
{ after(grammarAccess.getAssuranceCasePlanAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleDescription
entryRuleDescription 
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
(rule__Description__DescriptionAssignment)
{ after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
)
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
(rule__Description__DescriptionAssignment)*
{ after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDescriptionElement
entryRuleDescriptionElement 
:
{ before(grammarAccess.getDescriptionElementRule()); }
	 ruleDescriptionElement
{ after(grammarAccess.getDescriptionElementRule()); } 
	 EOF 
;

// Rule DescriptionElement
ruleDescriptionElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDescriptionElementAccess().getAlternatives()); }
(rule__DescriptionElement__Alternatives)
{ after(grammarAccess.getDescriptionElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReferencePath
entryRuleReferencePath 
:
{ before(grammarAccess.getReferencePathRule()); }
	 ruleReferencePath
{ after(grammarAccess.getReferencePathRule()); } 
	 EOF 
;

// Rule ReferencePath
ruleReferencePath
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReferencePathAccess().getGroup()); }
(rule__ReferencePath__Group__0)
{ after(grammarAccess.getReferencePathAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}









// Entry rule entryRuleMultiLineString
entryRuleMultiLineString 
:
{ before(grammarAccess.getMultiLineStringRule()); }
	 ruleMultiLineString
{ after(grammarAccess.getMultiLineStringRule()); } 
	 EOF 
;

// Rule MultiLineString
ruleMultiLineString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMultiLineStringAccess().getGroup()); }
(rule__MultiLineString__Group__0)
{ after(grammarAccess.getMultiLineStringAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleValueString
entryRuleValueString 
:
{ before(grammarAccess.getValueStringRule()); }
	 ruleValueString
{ after(grammarAccess.getValueStringRule()); } 
	 EOF 
;

// Rule ValueString
ruleValueString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueStringAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getValueStringAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAadlClassifierReference
entryRuleAadlClassifierReference 
:
{ before(grammarAccess.getAadlClassifierReferenceRule()); }
	 ruleAadlClassifierReference
{ after(grammarAccess.getAadlClassifierReferenceRule()); } 
	 EOF 
;

// Rule AadlClassifierReference
ruleAadlClassifierReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getGroup()); }
(rule__AadlClassifierReference__Group__0)
{ after(grammarAccess.getAadlClassifierReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






// Rule IssueType
ruleIssueType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssueTypeAccess().getAlternatives()); }
(rule__IssueType__Alternatives)
{ after(grammarAccess.getIssueTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DescriptionElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getTextAssignment_0()); }
(rule__DescriptionElement__TextAssignment_0)
{ after(grammarAccess.getDescriptionElementAccess().getTextAssignment_0()); }
)

    |(
{ before(grammarAccess.getDescriptionElementAccess().getRefAssignment_1()); }
(rule__DescriptionElement__RefAssignment_1)
{ after(grammarAccess.getDescriptionElementAccess().getRefAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssueType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssueTypeAccess().getERROREnumLiteralDeclaration_0()); }
(	'error' 
)
{ after(grammarAccess.getIssueTypeAccess().getERROREnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getIssueTypeAccess().getWARNINGEnumLiteralDeclaration_1()); }
(	'warning' 
)
{ after(grammarAccess.getIssueTypeAccess().getWARNINGEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getIssueTypeAccess().getINFOEnumLiteralDeclaration_2()); }
(	'info' 
)
{ after(grammarAccess.getIssueTypeAccess().getINFOEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__AlisaWorkArea__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__0__Impl
	rule__AlisaWorkArea__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getAlisaKeyword_0()); }

	'alisa' 

{ after(grammarAccess.getAlisaWorkAreaAccess().getAlisaKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlisaWorkArea__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__1__Impl
	rule__AlisaWorkArea__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getNameAssignment_1()); }
(rule__AlisaWorkArea__NameAssignment_1)
{ after(grammarAccess.getAlisaWorkAreaAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlisaWorkArea__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getCasesAssignment_2()); }
(rule__AlisaWorkArea__CasesAssignment_2)*
{ after(grammarAccess.getAlisaWorkAreaAccess().getCasesAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__AssuranceCasePlan__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__0__Impl
	rule__AssuranceCasePlan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getAssuranceCasePlanAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__1__Impl
	rule__AssuranceCasePlan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getNameAssignment_1()); }
(rule__AssuranceCasePlan__NameAssignment_1)
{ after(grammarAccess.getAssuranceCasePlanAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__2__Impl
	rule__AssuranceCasePlan__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getForKeyword_2()); }

	'for' 

{ after(grammarAccess.getAssuranceCasePlanAccess().getForKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__3__Impl
	rule__AssuranceCasePlan__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getSystemAssignment_3()); }
(rule__AssuranceCasePlan__SystemAssignment_3)
{ after(grammarAccess.getAssuranceCasePlanAccess().getSystemAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__4__Impl
	rule__AssuranceCasePlan__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getLeftSquareBracketKeyword_4()); }

	'[' 

{ after(grammarAccess.getAssuranceCasePlanAccess().getLeftSquareBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__5__Impl
	rule__AssuranceCasePlan__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getPlansAssignment_5()); }
(rule__AssuranceCasePlan__PlansAssignment_5)*
{ after(grammarAccess.getAssuranceCasePlanAccess().getPlansAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceCasePlan__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceCasePlan__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getRightSquareBracketKeyword_6()); }

	']' 

{ after(grammarAccess.getAssuranceCasePlanAccess().getRightSquareBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__ReferencePath__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencePath__Group__0__Impl
	rule__ReferencePath__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getRefAssignment_0()); }
(rule__ReferencePath__RefAssignment_0)
{ after(grammarAccess.getReferencePathAccess().getRefAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReferencePath__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencePath__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getGroup_1()); }
(rule__ReferencePath__Group_1__0)
{ after(grammarAccess.getReferencePathAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReferencePath__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencePath__Group_1__0__Impl
	rule__ReferencePath__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getReferencePathAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReferencePath__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencePath__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1()); }
(rule__ReferencePath__SubpathAssignment_1_1)
{ after(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__MultiLineString__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiLineString__Group__0__Impl
	rule__MultiLineString__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLineString__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiLineStringAccess().getApostropheApostropheApostropheKeyword_0()); }

	'\'\'\'' 

{ after(grammarAccess.getMultiLineStringAccess().getApostropheApostropheApostropheKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiLineString__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiLineString__Group__1__Impl
	rule__MultiLineString__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLineString__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiLineStringAccess().getSTRINGTerminalRuleCall_1()); }
(	RULE_STRING)*
{ after(grammarAccess.getMultiLineStringAccess().getSTRINGTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiLineString__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiLineString__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiLineString__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiLineStringAccess().getApostropheApostropheApostropheKeyword_2()); }

	'\'\'\'' 

{ after(grammarAccess.getMultiLineStringAccess().getApostropheApostropheApostropheKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__AadlClassifierReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__0__Impl
	rule__AadlClassifierReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0()); }
(rule__AadlClassifierReference__Group_0__0)*
{ after(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__1__Impl
	rule__AadlClassifierReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2()); }
(rule__AadlClassifierReference__Group_2__0)?
{ after(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__AadlClassifierReference__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_0__0__Impl
	rule__AadlClassifierReference__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getColonColonKeyword_0_1()); }

	'::' 

{ after(grammarAccess.getAadlClassifierReferenceAccess().getColonColonKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AadlClassifierReference__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_2__0__Impl
	rule__AadlClassifierReference__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getFullStopKeyword_2_0()); }

	'.' 

{ after(grammarAccess.getAadlClassifierReferenceAccess().getFullStopKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__AlisaWorkArea__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAlisaWorkAreaAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__CasesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getCasesAssuranceCasePlanParserRuleCall_2_0()); }
	ruleAssuranceCasePlan{ after(grammarAccess.getAlisaWorkAreaAccess().getCasesAssuranceCasePlanParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAssuranceCasePlanAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__SystemAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getSystemComponentImplementationCrossReference_3_0()); }
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_3_0_1()); }
	ruleAadlClassifierReference{ after(grammarAccess.getAssuranceCasePlanAccess().getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getAssuranceCasePlanAccess().getSystemComponentImplementationCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceCasePlan__PlansAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getPlansVerificationPlanCrossReference_5_0()); }
(
{ before(grammarAccess.getAssuranceCasePlanAccess().getPlansVerificationPlanQualifiedNameParserRuleCall_5_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getAssuranceCasePlanAccess().getPlansVerificationPlanQualifiedNameParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getAssuranceCasePlanAccess().getPlansVerificationPlanCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Description__DescriptionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionDescriptionElementParserRuleCall_0()); }
	ruleDescriptionElement{ after(grammarAccess.getDescriptionAccess().getDescriptionDescriptionElementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionElement__TextAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getTextSTRINGTerminalRuleCall_0_0()); }
	RULE_STRING{ after(grammarAccess.getDescriptionElementAccess().getTextSTRINGTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionElement__RefAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getRefEObjectCrossReference_1_0()); }
(
{ before(grammarAccess.getDescriptionElementAccess().getRefEObjectIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getDescriptionElementAccess().getRefEObjectIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getDescriptionElementAccess().getRefEObjectCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__RefAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getRefEObjectCrossReference_0_0()); }
(
{ before(grammarAccess.getReferencePathAccess().getRefEObjectIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getReferencePathAccess().getRefEObjectIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getReferencePathAccess().getRefEObjectCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencePath__SubpathAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencePathAccess().getSubpathReferencePathParserRuleCall_1_1_0()); }
	ruleReferencePath{ after(grammarAccess.getReferencePathAccess().getSubpathReferencePathParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}







RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


