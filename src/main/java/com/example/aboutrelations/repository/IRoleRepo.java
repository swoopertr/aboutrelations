package com.example.aboutrelations.repository;

import com.example.aboutrelations.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Role, Integer> {
}