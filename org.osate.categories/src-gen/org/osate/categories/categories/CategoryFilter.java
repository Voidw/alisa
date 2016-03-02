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
package org.osate.categories.categories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.categories.categories.CategoryFilter#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.categories.categories.CategoryFilter#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.categories.categories.CategoryFilter#isAnyCategory <em>Any Category</em>}</li>
 * </ul>
 *
 * @see org.osate.categories.categories.CategoriesPackage#getCategoryFilter()
 * @model
 * @generated
 */
public interface CategoryFilter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.categories.categories.CategoriesPackage#getCategoryFilter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.categories.categories.CategoryFilter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference list.
   * The list contents are of type {@link org.osate.categories.categories.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference list.
   * @see org.osate.categories.categories.CategoriesPackage#getCategoryFilter_Category()
   * @model
   * @generated
   */
  EList<Category> getCategory();

  /**
   * Returns the value of the '<em><b>Any Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Category</em>' attribute.
   * @see #setAnyCategory(boolean)
   * @see org.osate.categories.categories.CategoriesPackage#getCategoryFilter_AnyCategory()
   * @model
   * @generated
   */
  boolean isAnyCategory();

  /**
   * Sets the value of the '{@link org.osate.categories.categories.CategoryFilter#isAnyCategory <em>Any Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any Category</em>' attribute.
   * @see #isAnyCategory()
   * @generated
   */
  void setAnyCategory(boolean value);

} // CategoryFilter
