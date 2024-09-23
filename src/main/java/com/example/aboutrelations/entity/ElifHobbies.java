package com.example.aboutrelations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//oneToOne gibi bağlantıları entity de yapıyoruz

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "elifhobbies")
public class ElifHobbies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String hobbies_name;


}
