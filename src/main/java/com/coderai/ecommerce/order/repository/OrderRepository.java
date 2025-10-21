package com.coderai.ecommerce.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderai.ecommerce.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // TODO: add query methods
}
