package com.ifernandez.dev.test.ProductsApi;

import com.ifernandez.dev.test.ProductsApi.model.Product;
import com.ifernandez.dev.test.ProductsApi.repository.IProductDao;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@DataJpaTest
public class ProductRepositoryTests {

    @Autowired
    private IProductDao pRepository;

    @Test
    public void should_retry_product_prize() {

        Iterable<Product> users = pRepository.findAll();

        String date = "2020-06-15-10.00.00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);


        List<Product> lResult = pRepository.findByBrandDateId(35455L,1L, dateTime);
        Product pRes = lResult.get(0);
        Assertions.assertNotNull(lResult);

        Assertions.assertEquals(pRes.getBrandId(), 1L);
        Assertions.assertEquals(pRes.getPrice(), 30.5);


    }
}
