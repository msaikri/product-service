package com.codemindsinfo.productservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter@Setter
public class ProductDto {

    private String id;
    private String productName;
    private BigDecimal price;
    private String description;
}
