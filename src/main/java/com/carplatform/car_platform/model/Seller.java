package com.carplatform.car_platform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@DiscriminatorValue("SELLER")
@Getter @Setter @NoArgsConstructor
public class Seller extends User {

    @JsonIgnore
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;

    @JsonProperty("carCount")
    public int getCarCount() {
        return cars != null ? cars.size() : 0;
    }

    @Override
    public String getDashboard() {
        return "seller-dashboard";
    }
}

//test
