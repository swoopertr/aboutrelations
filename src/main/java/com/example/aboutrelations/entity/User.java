package com.example.aboutrelations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String email;
    private int passwordhash;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @ManyToOne
    @JoinColumn(name="roleid")
    private Role role;

    @OneToOne
    @JoinColumn(name = "phoneid")
    private SinanPhoneNumber sinanPhoneNumber;

    @OneToOne
    @JoinColumn(name = "hobbiesid")
    private ElifHobbies elifHobbies;

    @OneToOne
    @JoinColumn(name = "jobid")
    private GokalpTable gokalpTable;

    @ManyToMany
    @JoinTable(name = "user_course",
    joinColumns = @JoinColumn(name = "userid"),
    inverseJoinColumns = @JoinColumn(name = "courseid"))
    private List<Course> courses;



}
