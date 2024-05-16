package com.example.ecommercebackend.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.SpringApplication;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;
    private String name;
}
