package com.ifernandez.dev.test.ProductsApi.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;
    @Column(name="PRICE_LIST")
    private Long priceList;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "BRAND_ID")
    private Long brandId;
    @Column(name = "PRIORITY")
    private Long priority;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "CURRENCY")
    private String currency;
}
