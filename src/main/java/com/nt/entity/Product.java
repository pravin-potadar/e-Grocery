package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255)
    private String name;

    @Column(length = 100)
    private String brand;

    @Column(length = 500)
    private String description;

    private double price;
    private double discount;
    private int stock;

    private String unitType;
    private int unitNum;
    private String status;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    private LocalDate createdDate;
    private LocalTime createdTime;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;
}
