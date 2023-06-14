package com.codemindsinfo.productservice.service;


import com.codemindsinfo.productservice.dao.ProductRepository;
import com.codemindsinfo.productservice.model.Product;
import com.codemindsinfo.productservice.model.ProductRequest;
import com.codemindsinfo.productservice.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> mapToProductResponse(product)).collect(Collectors.toList());
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .productName(product.getProductName())
                .description(product.getDescription())
                .price(product.getPrice())
                .id(product.getId())
                .build();
    }

    @Override
    public void createProduct(ProductRequest productRequest) {

        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
    }
}
