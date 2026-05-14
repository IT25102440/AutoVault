package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.dto.CarDTO;
import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.CarService;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/seller")
@RequiredArgsConstructor
public class SellerController {

    private final CarService carService;
    private final UserService userService;

    //get all cars belonging to the logged in seller
    @GetMapping("/cars")
    public List<Car> getMyCars(Principal principal) {
        User seller = userService.findByEmail(principal.getName());
        return carService.getCarsBySeller(seller.getId());
    }

    //get a single car by ID, verifying it belongs to the logged-in seller
    @GetMapping("/cars/{id}")
    public ResponseEntity<?> getMyCarById(@PathVariable Long id, Principal principal) {
        User seller = userService.findByEmail(principal.getName());
        Car car = carService.getCarById(id);
        if (!car.getSeller().getId().equals(seller.getId())) {
            return ResponseEntity.status(403).body(Map.of("message", "You don't have permission to edit this car"));
        }
        return ResponseEntity.ok(car);
    }

    //add a new car listing
    @PostMapping("/cars")
    public ResponseEntity<?> addCar(
            @RequestPart("car") CarDTO dto,
            @RequestPart(value = "image", required = false) MultipartFile image,
            Principal principal) throws IOException {

        User seller = userService.findByEmail(principal.getName());
        Car newCar = carService.addCar(dto, image, seller.getId());
        return ResponseEntity.ok(newCar);
    }

    //edit an existing car listing
    @PutMapping("/cars/{id}")
    public ResponseEntity<?> updateCar(
            @PathVariable Long id,
            @RequestPart("car") CarDTO dto,
            @RequestPart(value = "image", required = false) MultipartFile image) throws IOException {

        Car updated = carService.updateCar(id, dto, image);
        return ResponseEntity.ok(updated);
    }

    //delete a car listing
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted successfully");
    }
}