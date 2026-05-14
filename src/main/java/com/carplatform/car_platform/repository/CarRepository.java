package com.carplatform.car_platform.repository;

import com.carplatform.car_platform.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findBySellerId(Long sellerId);
    List<Car> findByBrandContainingIgnoreCase(String brand);
    List<Car> findByBrandContainingIgnoreCaseAndLocationIgnoreCase(String brand, String location);
    List<Car> findByLocationIgnoreCase(String location);
}