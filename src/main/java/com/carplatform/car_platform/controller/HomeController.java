package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class HomeController {

    private final CarService carService;

    //get all car listings
    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    //get one car by ID
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    //search cars by brand
    @GetMapping("/search")
    public List<Car> searchByBrand(@RequestParam String brand) {
        return carService.searchByBrand(brand);
    }
}