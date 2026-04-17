package com.carplatform.car_platform.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@DiscriminatorValue("SELLER")
@Getter @Setter @NoArgsConstructor
public class Seller extends User {

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Car> cars;

    @Override
    public String getDashboard() {
        return "seller-dashboard";
    }
}