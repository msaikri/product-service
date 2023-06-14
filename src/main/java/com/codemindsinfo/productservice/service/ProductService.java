package com.codemindsinfo.productservice.service;

import com.codemindsinfo.productservice.model.ProductRequest;
import com.codemindsinfo.productservice.model.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<ProductResponse> getProducts();
    void createProduct(ProductRequest productRequest);
}
