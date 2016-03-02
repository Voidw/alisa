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

/*
 * generated by Xtext
 */
package org.osate.reqspec.ui.contentassist

import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.BasicInternalEList
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentImplementation
import org.osate.alisa.common.scoping.ICommonGlobalReferenceFinder
import org.osate.reqspec.reqSpec.GlobalRequirements
import org.osate.reqspec.reqSpec.ReqSpecPackage
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.StakeholderGoals
import org.osate.reqspec.reqSpec.SystemRequirements

import static org.osate.alisa.common.util.CommonUtilExtension.*

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class ReqSpecProposalProvider extends AbstractReqSpecProposalProvider {
	@Inject var ICommonGlobalReferenceFinder commonRefFinder

	override void completeStakeholderGoals_Target(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(
			assignment.getTerminal() as CrossReference,
			context,
			acceptor,
			[description|!description.EObjectURI.toString.contains("Plugin_Resources")]
		);
	}

	override void completeSystemRequirements_Target(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(
			assignment.getTerminal() as CrossReference,
			context,
			acceptor,
			[description|!description.EObjectURI.toString.contains("Plugin_Resources")]
		);
	}

	override void completeGlobalRequirement_GoalReference(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		// System.out.println("completeRequirement_GoalReference0000" + model.toString);
		val sysRequirements = model.eContainer as SystemRequirements

		// if stakeHolderGoals.target is equal to any of the parent and self of sysRequirements.target
		val targetComponentClassifier = sysRequirements.target
		val allAncestors = targetComponentClassifier.getSelfPlusAncestors

		lookupCrossReference(assignment.getTerminal() as CrossReference, context, acceptor, [
			val proposedObj = EcoreUtil.resolve(EObjectOrProxy, model) // Gets all Goals from Loose Scope
			val stakeHolderGoals = proposedObj.eContainer as StakeholderGoals

			allAncestors.contains(stakeHolderGoals.target)

		]);
	}

	override void completeGlobalRequirement_RefinesReference(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		val targetComponentClassifier = (model.eContainer as SystemRequirements).target
		val Iterable<SystemRequirements> listAccessibleSystemRequirements = commonRefFinder.getEObjectDescriptions(
			targetComponentClassifier, ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS, "reqspec").map [ eod |
			EcoreUtil.resolve(eod.EObjectOrProxy, model) as SystemRequirements
		].filter[sysreqs|isSameorExtends(targetComponentClassifier, sysreqs.target)]

		val ArrayList<EObject> nameList = newArrayList();
		lookupCrossReference(assignment.getTerminal() as CrossReference, context, acceptor, [
			val proposedObj = EcoreUtil.resolve(EObjectOrProxy, model) // Gets Requirements from Scope
			// no duplicates. Seems like duplicates with full qualified names are check later so that we get the short one.
			if (nameList.contains(proposedObj)) {
				return false
			} else {
				nameList.add(proposedObj)
			}

			// predicate for not itself and whether proposed requirement exists in any of the accessible system requirements
			model != proposedObj && listAccessibleSystemRequirements.filter [
				content.contains(proposedObj)
			].size > 0
		]);
	}

	override void completeGlobalRequirement_DecomposesReference(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeGlobalRequirement_RefinesReference(model, assignment, context, acceptor)
	}

	override void completeGlobalRequirement_EvolvesReference(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeGlobalRequirement_RefinesReference(model, assignment, context, acceptor)
	}

	// mnam: Later refine this to customize content assist String
//    override getStyledDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
//    	if (element instanceof XXXX) {
//    		val member = element as XXXX
//    		new StyledString(member.memberAsStringWithType).
//			append(new StyledString(" - " + member.containingClass.name,
//			StyledString::QUALIFIER_STYLER))
//    	} else {
//    		super.getStyledDisplayString(element, qualifiedNameAsString, shortName)
//    	}
//    	  
//    }
	// Brought from Aadl2JavaValidator
	def EList<Classifier> getSelfPlusAncestors(Classifier cl) {
		val cls = new BasicInternalEList<Classifier>(typeof(Classifier));
		cls.add(cl);

		var temp = cl
		while (temp.getExtended() != null) {
			if (cls.contains(temp.getExtended())) {
				return cls;
			}
			temp = temp.getExtended() as Classifier;
			cls.add(temp);
		}

		// If implementation collect for type
		if (cl instanceof ComponentImplementation) {
			var temp2 = cl.type
			cls.add(temp2);
			while (temp2.getExtended() != null) {
				if (cls.contains(temp2.getExtended())) {
					return cls;
				}
				temp2 = temp2.getExtended();
				cls.add(temp2);
			}

		}
		return cls;
	}



	override void completeGlobalRequirement_Category(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(
			assignment.getTerminal() as CrossReference,
			context,
			acceptor,
			[description|val match = description.qualifiedName.toString; 
				 ! (model as Requirement).category.exists[c|c.name.equals(match)]
			]
		);
	}


	override void completeGoal_Category(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(
			assignment.getTerminal() as CrossReference,
			context,
			acceptor,
			[description|val match = description.qualifiedName.toString; 
				 ! (model as Requirement).category.exists[c|c.name.equals(match)]
			]
		);
	}

	override void completeIncludeGlobalRequirement_Include(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(
			assignment.getTerminal() as CrossReference,
			context,
			acceptor,
			[description| model instanceof GlobalRequirements || (model instanceof Requirement && model.eContainer instanceof GlobalRequirements)
			]
		);
	}

}
