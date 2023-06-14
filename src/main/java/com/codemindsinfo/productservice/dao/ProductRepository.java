package com.codemindsinfo.productservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.codemindsinfo.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
