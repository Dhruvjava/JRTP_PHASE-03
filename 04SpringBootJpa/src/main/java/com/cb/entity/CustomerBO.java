package com.cb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String department;

    private String city;

}
