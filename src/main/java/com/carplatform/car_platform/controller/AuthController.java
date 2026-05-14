package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.dto.UserDTO;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    // Register a new seller account
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDTO dto) {
        User newUser = userService.registerSeller(dto);
        return ResponseEntity.ok(Map.of(
                "message", "Registration successful",
                "id", newUser.getId(),
                "name", newUser.getName()
        ));
    }

    // Get currently logged in user info
    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser(Principal principal) {
        if (principal == null) {
            return ResponseEntity.status(401).body(Map.of("message", "Not logged in"));
        }
        User user = userService.findByEmail(principal.getName());
        String role = user.getDashboard().replace("-dashboard", "").toUpperCase();
        return ResponseEntity.ok(Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", role,
                "dashboard", user.getDashboard()
        ));
    }
}