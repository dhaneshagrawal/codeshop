package com.app.codeshopdemo.ecommerce.repository;

import com.app.codeshopdemo.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
