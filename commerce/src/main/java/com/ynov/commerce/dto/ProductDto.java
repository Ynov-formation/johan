package com.ynov.commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
  long id;
  String name;
  String description;
  double price;
  int quantity;
  String image;
  CategoryDto category;
}
