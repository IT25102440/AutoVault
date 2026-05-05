package com.carplatform.car_platform.service;

import com.carplatform.car_platform.dto.CarDTO;
import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.repository.CarRepository;
import com.carplatform.car_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;

    @Value("${file.upload-dir}")
    private String uploadDir;

    //get all car listings
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    //get one car by ID
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found: " + id));
    }

    //get all cars belonging to a specific seller
    public List<Car> getCarsBySeller(Long sellerId) {
        return carRepository.findBySellerId(sellerId);
    }

    //search cars by brand name
    public List<Car> searchByBrand(String brand) {
        return carRepository.findByBrandContainingIgnoreCase(brand);
    }

    //add a new car listing with an image
    public Car addCar(CarDTO dto, MultipartFile image, Long sellerId) throws IOException {
        User seller = userRepository.findById(sellerId)
                .orElseThrow(() -> new RuntimeException("Seller not found"));

        Car car = new Car();
        car.setBrand(dto.getBrand());
        car.setModel(dto.getModel());
        car.setYear(dto.getYear());
        car.setPrice(dto.getPrice());
        car.setMileage(dto.getMileage());
        car.setLocation(dto.getLocation());
        car.setSeller(seller);

        //file handling — save image to disk
        if (image != null && !image.isEmpty()) {
            String filename = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            Files.copy(image.getInputStream(), uploadPath.resolve(filename));
            car.setImagePath(filename);
        }

        return carRepository.save(car);
    }

    //update an existing car listing
    public Car updateCar(Long id, CarDTO dto, MultipartFile image) throws IOException {
        Car car = getCarById(id);
        car.updateDetails(dto.getBrand(), dto.getModel(), dto.getYear(),
                dto.getPrice(), dto.getMileage(), dto.getLocation());

        //replace image if a new one is uploaded
        if (image != null && !image.isEmpty()) {
            String filename = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            Files.copy(image.getInputStream(), uploadPath.resolve(filename));
            car.setImagePath(filename);
        }

        return carRepository.save(car);
    }

    //delete a car listing
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}