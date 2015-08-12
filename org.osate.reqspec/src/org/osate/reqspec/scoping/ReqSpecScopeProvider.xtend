/*
 * generated by Xtext
 */
package org.osate.reqspec.scoping

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.BasicInternalEList
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipse.xtext.xbase.XExpression
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.alisa.common.scoping.AlisaAbstractDeclarativeScopeProvider
import org.osate.reqspec.reqSpec.ContractualElement
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.SystemRequirements
import org.osate.reqspec.util.IReqspecGlobalReferenceFinder

import static org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.reqspec.reqSpec.ReqSpecPackage
import org.osate.alisa.common.scoping.ICommonGlobalReferenceFinder
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.reqspec.reqSpec.Goal
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.xtext.scoping.IGlobalScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * 
 */
class ReqSpecScopeProvider extends AlisaAbstractDeclarativeScopeProvider {
	@Inject var ICommonGlobalReferenceFinder commonRefFinder
	@Inject var IReqspecGlobalReferenceFinder refFinder

	// For Reference is from Goal, Requirement 
	def scope_NamedElement(ContractualElement context, EReference reference) {
		val targetClassifier = targetClassifier(context)
		if (targetClassifier != null) {
//			targetClassifier.getAllFeatures.scopeFor
			val thescope = new SimpleScope(IScope::NULLSCOPE,
				Scopes::scopedElementsFor(targetClassifier.getAllFeatures,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
			if (targetClassifier instanceof ComponentImplementation) {
				new SimpleScope(thescope,
					Scopes::scopedElementsFor(targetClassifier.allSubcomponents,
						QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
			} else {
				return thescope
			}
		} else {
			IScope.NULLSCOPE
		}
	}

//	Offer property definitions via scope. Here we can add filter to allow only those properties that actually apply to the target object
//	def scope_Property(PropertyConsistentVariableDeclaration context, EReference reference){
//			val props = (scopeProvider as CommonGlobalScopeProvider).getGlobalEObjectDescriptions(context,
//				Aadl2Package.eINSTANCE.property, null)
//		new SimpleScope(IScope::NULLSCOPE, props,true)
//	}
	def scope_XExpression(Requirement context, EReference reference) {
		val result = scopeForGlobalVal(context,IScope.NULLSCOPE)
		return scopeForValCompute(context, result )
	}

	def scope_XVariableDeclaration(Requirement context, EReference reference) {
		val result = scopeForGlobalVal(context,IScope.NULLSCOPE)
		return scopeForValCompute(context, result)
		
	}

	def scope_XVariableDeclaration(Goal context, EReference reference) {
		val result = scopeForGlobalVal(context,IScope.NULLSCOPE)
		return scopeForVal(context, result)
	}
		
	def IScope scopeForGlobalVal(EObject context,IScope parentScope){
		var result = parentScope
		val projectconstants = getImportedGlobals(context) //refFinder.getAllGlobalConstants(context)
		var Iterable<XVariableDeclaration> constants = new BasicEList
		for (pc : projectconstants) {
			constants = constants +  pc.constants
		}
		if (!constants.empty) {
			result = new SimpleScope(result,
				Scopes::scopedElementsFor(constants,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
		}
		return result
	}
	
	def getImportedGlobals(EObject context){
		val sr = containingSystemRequirements(context)
		val sg =containingStakeholderGoals(context)
		val res = sr?.importConstants?:sg?.importConstants
		res
	}

	// TODO: probably want validation to take care of Refining itself. Need to take care of inheritance
	def scope_Requirement_refinesReference(Requirement context, EReference reference) {
//		println("scope_Requirement_RefinesReference: " + context.toString)
// use delegate to get other scopes including the global scope
		var result = delegateGetScope(context,reference)//IScope.NULLSCOPE

		// TODO: when target is all
		val targetComponentClassifier = containingSystemRequirements(context).target
//		val allAncestors = targetComponentClassifier.getSelfPlusAncestors
//		val listAccessibleSystemRequirements = newArrayList();
//
//		// This works best
//		for (cc : allAncestors) {
////			//ReqSpecReferenceFinder
//			// System.out.println("     scope_Requirement_RefinesReference FOR: " + cc);
//			val temp1 = (scopeProvider as CommonGlobalScopeProvider).getGlobalEObjectDescriptions(cc,
//				ReqSpecPackage.eINSTANCE.systemRequirements, null)
//			// System.out.println("     scope_Requirement_RefinesReference temp1: " + temp1);
//			for (objDis : temp1) {
//				val EObject obj = EcoreUtil.resolve(objDis.EObjectOrProxy, context.eResource().getResourceSet())
//				if (isSame((obj as SystemRequirements).target, cc)) {
//					listAccessibleSystemRequirements.add(obj as SystemRequirements)
//				}
//			}
//		}
//		listAccessibleSystemRequirements.addAll(commonRefFinder.getEObjectDescriptions(targetComponentClassifier, ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS,"reqspec")
//			.map[eod| EcoreUtil.resolve(eod.EObjectOrProxy, context) as SystemRequirements]
//						.filter[sysreqs| isSameorExtends(targetComponentClassifier, sysreqs.target)])
		val Iterable<SystemRequirements> listAccessibleSystemRequirements = commonRefFinder.getEObjectDescriptions(
			targetComponentClassifier, ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS, "reqspec").map [ eod |
			EcoreUtil.resolve(eod.EObjectOrProxy, context) as SystemRequirements
		].filter[sysreqs|isSameorExtends(targetComponentClassifier, sysreqs.target)]
// indicates not resolved although it returns the systemrequirements object
//		val listAccessibleSystemRequirements = refFinder.getSystemRequirements(targetComponentClassifier)
		// Need to go through all system requirements and see if target is in allAncestor
		// and if it is, then add content to the Scope
		
		// TODO sort in extends hierarchy order
		for (sr : listAccessibleSystemRequirements) {
			if (!sr.content.empty) {
				result = new SimpleScope(result,
					Scopes::scopedElementsFor(sr.content,
						QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
			}
		}
		result
	}

	def scope_Requirement_decomposesReference(Requirement context, EReference reference) {
		scope_Requirement_refinesReference(context, reference)
	}

	def scope_Requirement_evolvesReference(Requirement context, EReference reference) {
		scope_Requirement_refinesReference(context, reference)
	}

	// Brought from Aadl2JavaValidator
	def EList<ComponentClassifier> getSelfPlusAncestors(ComponentClassifier cl) {
		val cls = new BasicInternalEList<ComponentClassifier>(typeof(ComponentClassifier));
		cls.add(cl);

		var temp = cl
		while (temp.getExtended() != null) {
			if (cls.contains(temp.getExtended())) {
				return cls;
			}
			temp = temp.getExtended() as ComponentClassifier;
			cls.add(temp);
		}

		// If implementation collect for type
		if (cl instanceof ComponentImplementation) {
			temp = (cl as ComponentImplementation).type
			cls.add(temp);
			while (temp.getExtended() != null) {
				if (cls.contains(temp.getExtended())) {
					return cls;
				}
				temp = temp.getExtended() as ComponentClassifier;
				cls.add(temp);
			}

		}
		cls
	}

	// From AlisaWorkbenchUtilsExtension
	def static isSame(ComponentClassifier cl1, ComponentClassifier cl2) {
		// println("     isSame 1: " + cl1.toString + "   2:" + cl2.toString);
		if(cl1 == null || cl2 == null) return false;
		var lcl1 = cl1
		var lcl2 = cl2
		if (cl1 instanceof ComponentType && cl2 instanceof ComponentImplementation)
			lcl2 = (cl2 as ComponentImplementation).type
		if (cl2 instanceof ComponentType && cl1 instanceof ComponentImplementation)
			lcl1 = (cl1 as ComponentImplementation).type

		// System.out.println("     isSame result: " + lcl1.name.equalsIgnoreCase(lcl2.name))
		lcl1.name.equalsIgnoreCase(lcl2.name)
	}

	def static boolean isSameorExtends(ComponentClassifier target, ComponentClassifier ancestor) {
		var Classifier ext = target
		if (target instanceof ComponentImplementation && ancestor instanceof ComponentType) {
			ext = (target as ComponentImplementation).getType();
		}
		while (ext != null) {
			if (ancestor.name.equalsIgnoreCase(ext.name)) {
				return true;
			}
			ext = ext.getExtended();
		}

		return false;
	}

}
