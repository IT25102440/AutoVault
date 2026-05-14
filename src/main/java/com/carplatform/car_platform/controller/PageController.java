package com.carplatform.car_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "forward:/login/index.html";
    }

    @GetMapping("/register")
    public String register() {
        return "forward:/register/index.html";
    }

    @GetMapping("/car-detail")
    public String carDetail() {
        return "forward:/car-detail/index.html";
    }

    @GetMapping("/seller-dashboard")
    public String sellerDashboard() {
        return "forward:/seller-dashboard/index.html";
    }

    @GetMapping("/add-car")
    public String addCar() {
        return "forward:/add-car/index.html";
    }

    @GetMapping("/edit-car")
    public String editCar() {
        return "forward:/edit-car/index.html";
    }

    @GetMapping("/admin-dashboard")
    public String adminDashboard() {
        return "forward:/admin-dashboard/index.html";
    }
}
