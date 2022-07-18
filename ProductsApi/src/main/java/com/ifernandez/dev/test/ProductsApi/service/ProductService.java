package com.ifernandez.dev.test.ProductsApi.service;

import com.ifernandez.dev.test.ProductsApi.mapper.ProductMapper;
import com.ifernandez.dev.test.ProductsApi.repository.IProductDao;
import com.ifernandez.dev.test.products.model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private static final Logger logger = LogManager.getLogger(ProductService.class);
    @Autowired
    private IProductDao productDao;
    @Autowired
    private ProductMapper productMapper;

    public Product getProductByIdBrandDate(long id, long brandId, LocalDateTime date) {

        List<com.ifernandez.dev.test.ProductsApi.model.Product> productList = productDao.findByBrandDateId(id,brandId, date);
        logger.info("Retrieved from DB producList size:" + productList.size());
        return productMapper.toProductDto(productList.get(0));

    }

}
