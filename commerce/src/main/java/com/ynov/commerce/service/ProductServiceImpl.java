package com.ynov.commerce.service;

import com.ynov.commerce.dao.ProductRepository;
import com.ynov.commerce.dto.CategoryDto;
import com.ynov.commerce.dto.ProductDto;
import com.ynov.commerce.entities.Category;
import com.ynov.commerce.entities.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
  private final ProductRepository productRepository;

  ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product updateProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }

  @Override
  public List<ProductDto> getAllProducts() {
    List<ProductDto> result = new ArrayList<>();
    productRepository.findAll().forEach(product -> {
      Category category = product.getCategory();
      result.add(ProductDto.builder()
                           .id(product.getId())
                           .name(product.getName())
                           .description(product.getDescription())
                           .price(product.getPrice())
                           .quantity(product.getQuantity())
                           .image(product.getImage())
                           .category(CategoryDto.builder()
                                                .id(category.getId())
                                                .name(category.getName())
                                                .description(category.getDescription())
                                                .build())
                           .build());
    });
    return result;
  }
}
