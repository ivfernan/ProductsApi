package com.ifernandez.dev.test.ProductsApi.service;


import java.time.LocalDateTime;
import com.ifernandez.dev.test.products.model.Product;
public interface IProductService {

    public Product getProductByIdBrandDate(long id, long brandId, LocalDateTime date);

}
