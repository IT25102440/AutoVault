package com.carplatform.car_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ADMIN")
@Getter @Setter @NoArgsConstructor
public class Admin extends User {

    @Override
    public String getDashboard() {
        return "admin-dashboard";
    }
}