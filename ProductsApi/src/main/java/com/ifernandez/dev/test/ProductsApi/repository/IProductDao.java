package com.ifernandez.dev.test.ProductsApi.repository;

import com.ifernandez.dev.test.ProductsApi.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface IProductDao extends CrudRepository<Product, Long> {

    @Query("select p from PRODUCT p where p.productId = :productId and p.brandId= :brandId and p.startDate<= :date and p.endDate>=:date order by p.priority desc")
    List<Product> findByBrandDateId(@Param("productId") long productId, @Param("brandId") long brandId, @Param("date") LocalDateTime date);

}
