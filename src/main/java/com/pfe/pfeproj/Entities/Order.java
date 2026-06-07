package com.pfe.pfeproj.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String phone;

    private String address;

    private Double total;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;
}