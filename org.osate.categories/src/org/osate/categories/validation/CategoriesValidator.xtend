/*
 * generated by Xtext
 */
package org.osate.categories.validation

import org.eclipse.xtext.validation.Check
import org.osate.categories.categories.CategoriesPackage
import org.osate.categories.categories.RequirementCategory
import org.osate.categories.categories.HazardCategory
import org.osate.categories.categories.VerificationCategory
import org.osate.categories.categories.Category
import org.osate.alisa.common.scoping.AlisaGlobalScopeProvider
import com.google.inject.Inject
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.osate.categories.util.CategoriesUtil

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class CategoriesValidator extends AbstractCategoriesValidator {
	extension CategoriesUtil cu = new CategoriesUtil
	@Inject
	private IGlobalScopeProvider scopeProvider;

	public static val DUPLICATE_CATEGORY = "org.osate.organization.DuplicateCategory"
	public static val CYCLES_CATEGORY = "org.osate.organization.CyclesCategory"

	/**
 * Check that Category are globally unique
 */
	@Check
	def void checkDuplicatesCategory(Category cat) {
		val dups = ( scopeProvider as AlisaGlobalScopeProvider).getDuplicates(cat)
		if (!dups.empty) {

			// the original is in the set
			for (dup : dups) {
				error(
					"Duplicate category '" + dup.name + "'",
					CategoriesPackage::eINSTANCE.category_Name,
					DUPLICATE_CATEGORY,
					dup.name.toString
				)
			}
		}
	}

/**
 * check that there are no cycles in Category extends hierarchy
 */
	@Check
	def void checkNoCycleCategoryHierarchy(Category cat) {
		val supertype = cat.superType
		if(supertype == null) return
		val visitedCategory = <Category>newHashSet()
		visitedCategory.add(cat)
		var current = supertype
		while (current != null){
			if (visitedCategory.contains(current)){
				error("Cycle in extends hierarchy of Category '"+current.name+"'",
					CategoriesPackage::eINSTANCE.category_Name,
					CYCLES_CATEGORY, supertype.name.toString
				)
				return
			}
			visitedCategory.add(current)
			current = current.superType
		}
	}

}
