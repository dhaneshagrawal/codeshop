package com.app.codeshopdemo.ecommerce.repository;

import com.app.codeshopdemo.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
