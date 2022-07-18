package com.ifernandez.dev.test.ProductsApi.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.ifernandez.dev.test.ProductsApi.service.IProductService;
import com.ifernandez.dev.test.products.api.ProductApi;
import com.ifernandez.dev.test.products.model.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController implements ProductApi{

    private static final Logger logger = LogManager.getLogger(ProductsController.class);

    @Autowired
    private IProductService productService;


    @Override
    public ResponseEntity<Product> getProductBy(Long id, Long idBrand, String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        logger.debug("Controller getProductBy--> productService.getProductByIdBrandDate(id,idBrand,dateTime):" + id +"," + idBrand +","  + date);
        return ResponseEntity.ok(productService.getProductByIdBrandDate(id,idBrand,dateTime));

    }
}
