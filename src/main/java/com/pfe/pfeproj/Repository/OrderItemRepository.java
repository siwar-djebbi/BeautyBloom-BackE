package com.pfe.pfeproj.Repository;

import com.pfe.pfeproj.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}