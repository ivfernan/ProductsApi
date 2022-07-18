package com.ifernandez.dev.test.ProductsApi.mapper;

import com.ifernandez.dev.test.products.model.Product;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductTransformer {

  private final ProductMapper productMapper;

  public Product toProductDto(com.ifernandez.dev.test.ProductsApi.model.Product product) {
    return productMapper.toProductDto(product);
  }
}
