package com.ynov.commerce.service;

import com.ynov.commerce.dto.CategoryDto;
import com.ynov.commerce.entities.Category;

import java.util.List;

public interface CategoryService {
  /**
   * Create a new {@link Category}
   *
   * @param category the category to create
   *
   * @return the created category
   */
  Category createCategory(Category category);

  /**
   * Update a {@link Category}
   *
   * @param category the category to update
   *
   * @return the updated category
   */
  Category updateCategory(Category category);

  /**
   * Delete a {@link Category}
   *
   * @param id the {@link Category#id} of the category to delete
   */
  void deleteCategory(Long id);

  /**
   * Get all {@link Category}
   *
   * @return the list of all categories
   */
  List<CategoryDto> getAllCategories();
}
