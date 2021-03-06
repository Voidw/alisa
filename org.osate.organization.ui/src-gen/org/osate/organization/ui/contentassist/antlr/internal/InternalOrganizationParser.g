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
	superClass=AbstractInternalContentAssistParser;
	
}

@header {
package org.osate.organization.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

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
import org.osate.organization.services.OrganizationGrammarAccess;

}

@members {
 
 	private OrganizationGrammarAccess grammarAccess;
 	
 	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
 	
 	{
		tokenNameToValue.put("FullStop", "'.'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("Full", "'full'");
		tokenNameToValue.put("Name", "'name'");
		tokenNameToValue.put("Role", "'role'");
		tokenNameToValue.put("Email", "'email'");
		tokenNameToValue.put("Phone", "'phone'");
		tokenNameToValue.put("Title", "'title'");
		tokenNameToValue.put("Supervisor", "'supervisor'");
		tokenNameToValue.put("Description", "'description'");
		tokenNameToValue.put("Stakeholder", "'stakeholder'");
		tokenNameToValue.put("Organization", "'organization'");
 	}
 	
    public void setGrammarAccess(OrganizationGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }

	@Override
    protected String getValueForTokenName(String tokenName) {
    	String result = tokenNameToValue.get(tokenName);
    	if (result == null)
    		result = tokenName;
    	return result;
    }
}




// Entry rule entryRuleOrganization
entryRuleOrganization 
:
{ before(grammarAccess.getOrganizationRule()); }
	 ruleOrganization
{ after(grammarAccess.getOrganizationRule()); } 
	 EOF 
;

// Rule Organization
ruleOrganization 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getOrganizationAccess().getGroup()); }
(rule__Organization__Group__0)
{ after(grammarAccess.getOrganizationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStakeholder
entryRuleStakeholder 
:
{ before(grammarAccess.getStakeholderRule()); }
	 ruleStakeholder
{ after(grammarAccess.getStakeholderRule()); } 
	 EOF 
;

// Rule Stakeholder
ruleStakeholder 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getStakeholderAccess().getUnorderedGroup()); }
(rule__Stakeholder__UnorderedGroup)
{ after(grammarAccess.getStakeholderAccess().getUnorderedGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQID
entryRuleQID 
:
{ before(grammarAccess.getQIDRule()); }
	 ruleQID
{ after(grammarAccess.getQIDRule()); } 
	 EOF 
;

// Rule QID
ruleQID 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getQIDAccess().getGroup()); }
(rule__QID__Group__0)
{ after(grammarAccess.getQIDAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Organization__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Organization__Group__0__Impl
	rule__Organization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Organization__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrganizationAccess().getOrganizationKeyword_0()); }

	Organization 

{ after(grammarAccess.getOrganizationAccess().getOrganizationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Organization__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Organization__Group__1__Impl
	rule__Organization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Organization__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrganizationAccess().getNameAssignment_1()); }
(rule__Organization__NameAssignment_1)
{ after(grammarAccess.getOrganizationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Organization__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Organization__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Organization__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2()); }
(rule__Organization__StakeholderAssignment_2)
{ after(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2()); }
)
(
{ before(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2()); }
(rule__Organization__StakeholderAssignment_2)*
{ after(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Stakeholder__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0__0__Impl
	rule__Stakeholder__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getStakeholderKeyword_0_0()); }

	Stakeholder 

{ after(grammarAccess.getStakeholderAccess().getStakeholderKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0__1__Impl
	rule__Stakeholder__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getNameAssignment_0_1()); }
(rule__Stakeholder__NameAssignment_0_1)
{ after(grammarAccess.getStakeholderAccess().getNameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0__2__Impl
	rule__Stakeholder__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getLeftSquareBracketKeyword_0_2()); }

	LeftSquareBracket 

{ after(grammarAccess.getStakeholderAccess().getLeftSquareBracketKeyword_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3()); }
(rule__Stakeholder__UnorderedGroup_0_3)
{ after(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Stakeholder__Group_0_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_0__0__Impl
	rule__Stakeholder__Group_0_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getFullKeyword_0_3_0_0()); }

	Full 

{ after(grammarAccess.getStakeholderAccess().getFullKeyword_0_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_0__1__Impl
	rule__Stakeholder__Group_0_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getNameKeyword_0_3_0_1()); }

	Name 

{ after(grammarAccess.getStakeholderAccess().getNameKeyword_0_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getFullnameAssignment_0_3_0_2()); }
(rule__Stakeholder__FullnameAssignment_0_3_0_2)
{ after(grammarAccess.getStakeholderAccess().getFullnameAssignment_0_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Stakeholder__Group_0_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_1__0__Impl
	rule__Stakeholder__Group_0_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getTitleKeyword_0_3_1_0()); }

	Title 

{ after(grammarAccess.getStakeholderAccess().getTitleKeyword_0_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getTitleAssignment_0_3_1_1()); }
(rule__Stakeholder__TitleAssignment_0_3_1_1)
{ after(grammarAccess.getStakeholderAccess().getTitleAssignment_0_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_0_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_2__0__Impl
	rule__Stakeholder__Group_0_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getDescriptionKeyword_0_3_2_0()); }

	Description 

{ after(grammarAccess.getStakeholderAccess().getDescriptionKeyword_0_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getDescriptionAssignment_0_3_2_1()); }
(rule__Stakeholder__DescriptionAssignment_0_3_2_1)
{ after(grammarAccess.getStakeholderAccess().getDescriptionAssignment_0_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_0_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_3__0__Impl
	rule__Stakeholder__Group_0_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getRoleKeyword_0_3_3_0()); }

	Role 

{ after(grammarAccess.getStakeholderAccess().getRoleKeyword_0_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getRoleAssignment_0_3_3_1()); }
(rule__Stakeholder__RoleAssignment_0_3_3_1)
{ after(grammarAccess.getStakeholderAccess().getRoleAssignment_0_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_0_3_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_4__0__Impl
	rule__Stakeholder__Group_0_3_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getEmailKeyword_0_3_4_0()); }

	Email 

{ after(grammarAccess.getStakeholderAccess().getEmailKeyword_0_3_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getEmailAssignment_0_3_4_1()); }
(rule__Stakeholder__EmailAssignment_0_3_4_1)
{ after(grammarAccess.getStakeholderAccess().getEmailAssignment_0_3_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_0_3_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_5__0__Impl
	rule__Stakeholder__Group_0_3_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getPhoneKeyword_0_3_5_0()); }

	Phone 

{ after(grammarAccess.getStakeholderAccess().getPhoneKeyword_0_3_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_0_3_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_0_3_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_0_3_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getPhoneAssignment_0_3_5_1()); }
(rule__Stakeholder__PhoneAssignment_0_3_5_1)
{ after(grammarAccess.getStakeholderAccess().getPhoneAssignment_0_3_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_1__0__Impl
	rule__Stakeholder__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getGroup_1_0()); }
(rule__Stakeholder__Group_1_0__0)?
{ after(grammarAccess.getStakeholderAccess().getGroup_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getRightSquareBracketKeyword_1_1()); }

	RightSquareBracket 

{ after(grammarAccess.getStakeholderAccess().getRightSquareBracketKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__Group_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_1_0__0__Impl
	rule__Stakeholder__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getSupervisorKeyword_1_0_0()); }

	Supervisor 

{ after(grammarAccess.getStakeholderAccess().getSupervisorKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__Group_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__Group_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getSupervisorAssignment_1_0_1()); }
(rule__Stakeholder__SupervisorAssignment_1_0_1)
{ after(grammarAccess.getStakeholderAccess().getSupervisorAssignment_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QID__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QID__Group__0__Impl
	rule__QID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QID__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQIDAccess().getGroup_1()); }
(rule__QID__Group_1__0)?
{ after(grammarAccess.getQIDAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QID__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QID__Group_1__0__Impl
	rule__QID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); }

	FullStop 

{ after(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QID__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Stakeholder__UnorderedGroup
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup());
    }
:
	rule__Stakeholder__UnorderedGroup__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0()); }
						(rule__Stakeholder__Group_0__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_1()); }
						(rule__Stakeholder__Group_1__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_1()); }
					)
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup__Impl
	rule__Stakeholder__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__Stakeholder__UnorderedGroup_0_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_0()); }
						(rule__Stakeholder__Group_0_3_0__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_0()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_1()); }
						(rule__Stakeholder__Group_0_3_1__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_1()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_2()); }
						(rule__Stakeholder__Group_0_3_2__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_2()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_3()); }
						(rule__Stakeholder__Group_0_3_3__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_3()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_4()); }
						(rule__Stakeholder__Group_0_3_4__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_4()); }
					)
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
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getStakeholderAccess().getGroup_0_3_5()); }
						(rule__Stakeholder__Group_0_3_5__0)
						{ after(grammarAccess.getStakeholderAccess().getGroup_0_3_5()); }
					)
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	 				}
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_0_3());
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
	rule__Stakeholder__UnorderedGroup_0_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
	rule__Stakeholder__UnorderedGroup_0_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
	rule__Stakeholder__UnorderedGroup_0_3__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
	rule__Stakeholder__UnorderedGroup_0_3__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
	rule__Stakeholder__UnorderedGroup_0_3__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__Stakeholder__UnorderedGroup_0_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stakeholder__UnorderedGroup_0_3__Impl
;
finally {
	restoreStackSize(stackSize);
}














rule__Organization__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Organization__StakeholderAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); }
	ruleStakeholder{ after(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__NameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_0_1_0()); }
	RULE_ID{ after(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__FullnameAssignment_0_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getFullnameSTRINGTerminalRuleCall_0_3_0_2_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getFullnameSTRINGTerminalRuleCall_0_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__TitleAssignment_0_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getTitleSTRINGTerminalRuleCall_0_3_1_1_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getTitleSTRINGTerminalRuleCall_0_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__DescriptionAssignment_0_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_0_3_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_0_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__RoleAssignment_0_3_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getRoleSTRINGTerminalRuleCall_0_3_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getRoleSTRINGTerminalRuleCall_0_3_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__EmailAssignment_0_3_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getEmailSTRINGTerminalRuleCall_0_3_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getEmailSTRINGTerminalRuleCall_0_3_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__PhoneAssignment_0_3_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getPhoneSTRINGTerminalRuleCall_0_3_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getStakeholderAccess().getPhoneSTRINGTerminalRuleCall_0_3_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stakeholder__SupervisorAssignment_1_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStakeholderAccess().getSupervisorStakeholderCrossReference_1_0_1_0()); }
(
{ before(grammarAccess.getStakeholderAccess().getSupervisorStakeholderQIDParserRuleCall_1_0_1_0_1()); }
	ruleQID{ after(grammarAccess.getStakeholderAccess().getSupervisorStakeholderQIDParserRuleCall_1_0_1_0_1()); }
)
{ after(grammarAccess.getStakeholderAccess().getSupervisorStakeholderCrossReference_1_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


