package com.ynov.commerce.web;

import com.ynov.commerce.dto.ProductDto;
import com.ynov.commerce.entities.Product;
import com.ynov.commerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductRestController {
  private final ProductService productService;
  private final String PATH_PRODUCTS = "products";

  public ProductRestController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping(value = "/" + PATH_PRODUCTS)
  public List<ProductDto> getAllProducts() {
    return productService.getAllProducts();
  }
}
