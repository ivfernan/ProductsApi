package com.ifernandez.dev.test.ProductsApi;

import com.ifernandez.dev.test.ProductsApi.mapper.ProductMapper;
import com.ifernandez.dev.test.ProductsApi.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductMapperTests {

        private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

        @Test
        void entityToDto() {

            Product prod = new Product();
            prod.setProductId(1L);
            prod.setCurrency("CUR");
            prod.setPrice(14.5);


            com.ifernandez.dev.test.products.model.Product dto = mapper.toProductDto(prod);

            Assertions.assertEquals(prod.getProductId(), dto.getId());
            Assertions.assertEquals(prod.getPrice(), dto.getPrize());
            Assertions.assertEquals(prod.getCurrency(), dto.getCurrency());

        }



}
