package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.repository.CarRepository;
import com.carplatform.car_platform.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class HomeController {

    private final CarService carService;
    private final CarRepository carRepository;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Car>> searchCars(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String location) {

        if (brand != null && !brand.isEmpty() && location != null && !location.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByBrandContainingIgnoreCaseAndLocationIgnoreCase(brand, location));
        } else if (brand != null && !brand.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByBrandContainingIgnoreCase(brand));
        } else if (location != null && !location.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByLocationIgnoreCase(location));
        } else {
            return ResponseEntity.ok(carRepository.findAll());
        }
    }
}