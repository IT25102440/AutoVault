package com.carplatform.car_platform.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class CarDTO {
    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String location;
}