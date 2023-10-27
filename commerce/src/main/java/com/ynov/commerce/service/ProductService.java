package com.ynov.commerce.service;

import com.ynov.commerce.dto.ProductDto;
import com.ynov.commerce.entities.Product;

import java.util.List;

public interface ProductService {
  /**
   * Create a new {@link Product}
   *
   * @param product the product to create
   *
   * @return the created product
   */
  public Product createProduct(Product product);

  /**
   * Update a {@link Product}
   *
   * @param product the product to update
   *
   * @return the updated product
   */
  public Product updateProduct(Product product);

  /**
   * Delete a {@link Product}
   *
   * @param id the {@link Product#id} of the product to delete
   */
  public void deleteProduct(Long id);

  /**
   * Get all {@link Product}
   *
   * @return the list of all {@link Product} mapped in {@link ProductDto}
   */
  public List<ProductDto> getAllProducts();
}
