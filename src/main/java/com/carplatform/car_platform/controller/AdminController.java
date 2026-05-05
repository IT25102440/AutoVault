package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.CarService;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final CarService carService;
    private final UserService userService;

    //view all car listings
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    //delete any car listing
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted by admin");
    }

    //view all registered sellers
    @GetMapping("/sellers")
    public List<User> getAllSellers() {
        return userService.getAllSellers();
    }

    //delete a seller account
    @DeleteMapping("/sellers/{id}")
    public ResponseEntity<?> deleteSeller(@PathVariable Long id) {
        userService.deleteSeller(id);
        return ResponseEntity.ok("Seller deleted by admin");
    }
}