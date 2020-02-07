package com.app.codeshopdemo.ecommerce.repository;

import com.app.codeshopdemo.ecommerce.model.OrderProduct;
import com.app.codeshopdemo.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}

