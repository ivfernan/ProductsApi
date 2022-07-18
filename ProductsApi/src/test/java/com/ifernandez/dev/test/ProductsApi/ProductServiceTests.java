package com.ifernandez.dev.test.ProductsApi;

import com.ifernandez.dev.test.ProductsApi.mapper.ProductMapper;
import com.ifernandez.dev.test.ProductsApi.repository.IProductDao;
import com.ifernandez.dev.test.ProductsApi.service.ProductService;
import com.ifernandez.dev.test.products.model.Product;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTests {


    @Mock
    private IProductDao productDao;

    @Mock
    private ProductMapper productMapper;

    @InjectMocks
    private ProductService productService;

    com.ifernandez.dev.test.ProductsApi.model.Product pDB= new com.ifernandez.dev.test.ProductsApi.model.Product();
    Product expected = new Product();

    @Before
    public void init() {
        pDB.setBrandId(1L);
        pDB.setProductId(1L);
        pDB.setId(1L);
        pDB.setPrice(25.5);
        pDB.setCurrency("EUR");
        pDB.setPriceList(1L);
        pDB.setPriority(1L);

        Date today = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(today.toInstant(), ZoneId.systemDefault());
        pDB.setEndDate(ldt);
        pDB.setStartDate(ldt);

        expected.setBrandId(pDB.getBrandId());
        expected.setId(pDB.getProductId());
        expected.setEndDate(ldt.toString());
        expected.setStartDate(ldt.toString());
        expected.setCurrency("EUR");
        expected.setPrize(25.5);
    }

    @Test
    public void findByBrandDateIdReturnsProduct() {

        ArrayList<com.ifernandez.dev.test.ProductsApi.model.Product> rList = new ArrayList<com.ifernandez.dev.test.ProductsApi.model.Product>();
        com.ifernandez.dev.test.ProductsApi.model.Product pDB = new com.ifernandez.dev.test.ProductsApi.model.Product();
        rList.add(pDB);

        //when
        Mockito.when(productDao.findByBrandDateId(1L, 1L, pDB.getStartDate())).thenReturn(rList);
        Mockito.when(productMapper.toProductDto(rList.get(0))).thenReturn(expected);

        Product pResult = this.productService.getProductByIdBrandDate(1L, 1L, pDB.getStartDate());

        Assertions.assertNotNull(pResult);
        Assertions.assertEquals(pResult.getBrandId(), expected.getBrandId());
        Assertions.assertEquals(pResult.getPrize(), expected.getPrize());
    }

}
