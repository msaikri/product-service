package com.codemindsinfo.productservice.model;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Setter
@Getter
public class ProductRequest {
    private String id;
    private String productName;
    private BigDecimal price;
    private String description;
}
