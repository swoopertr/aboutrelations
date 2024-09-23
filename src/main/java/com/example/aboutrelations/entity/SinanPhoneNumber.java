package com.example.aboutrelations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sinan_phone_numbers")
public class SinanPhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String phone_number;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;

}
