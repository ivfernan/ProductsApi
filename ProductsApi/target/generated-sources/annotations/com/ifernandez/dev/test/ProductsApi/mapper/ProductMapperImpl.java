package com.ifernandez.dev.test.ProductsApi.mapper;

import com.ifernandez.dev.test.products.model.Product;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-18T11:14:07+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15 (Homebrew)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProductDto(com.ifernandez.dev.test.ProductsApi.model.Product product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setPrize( product.getPrice() );
        product1.setRateId( product.getPriceList() );
        product1.setId( product.getProductId() );
        product1.setBrandId( product.getBrandId() );
        product1.setCurrency( product.getCurrency() );
        if ( product.getStartDate() != null ) {
            product1.setStartDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( product.getStartDate() ) );
        }
        if ( product.getEndDate() != null ) {
            product1.setEndDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( product.getEndDate() ) );
        }

        return product1;
    }
}
