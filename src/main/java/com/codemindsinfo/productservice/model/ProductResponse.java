package com.codemindsinfo.productservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductResponse {

    private String id;
    private String productName;
    private BigDecimal price;
    private String description;
}
