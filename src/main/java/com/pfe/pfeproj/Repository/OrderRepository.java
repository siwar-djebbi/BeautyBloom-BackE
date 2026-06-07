package com.pfe.pfeproj.Repository;

import com.pfe.pfeproj.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}