package com.carplatform.car_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@Getter @Setter @NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String location;
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    public void updateDetails(String brand, String model, int year,
                              double price, int mileage, String location) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.location = location;
    }
}