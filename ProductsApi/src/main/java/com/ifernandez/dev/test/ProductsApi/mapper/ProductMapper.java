package com.ifernandez.dev.test.ProductsApi.mapper;

import com.ifernandez.dev.test.products.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ObjectFactory;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ProductMapper {
   @Mapping(source = "price", target = "prize")
   @Mapping(source = "priceList", target = "rateId")
   @Mapping(source = "productId", target = "id")
   Product toProductDto(com.ifernandez.dev.test.ProductsApi.model.Product product);

}
