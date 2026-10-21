package com.commerceflow.catalog.repository;

import com.commerceflow.catalog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository
        extends MongoRepository<Product, String> {
}