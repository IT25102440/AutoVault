package com.carplatform.car_platform.service;

import com.carplatform.car_platform.dto.UserDTO;
import com.carplatform.car_platform.model.Seller;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    //register a new Seller account
    public User registerSeller(UserDTO dto) {
        Seller seller = new Seller();
        seller.setName(dto.getName());
        seller.setEmail(dto.getEmail());
        seller.setPassword(passwordEncoder.encode(dto.getPassword()));
        return userRepository.save(seller);
    }

    //find a user by their email address (used by Spring Security during login)
    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found: " + email));
    }

    //get all users who are Sellers (for admin dashboard)
    public List<User> getAllSellers() {
        return userRepository.findAll()
                .stream()
                .filter(u -> u instanceof Seller)
                .toList();
    }

    //delete a seller by ID (admin action)
    public void deleteSeller(Long id) {
        userRepository.deleteById(id);
    }
}