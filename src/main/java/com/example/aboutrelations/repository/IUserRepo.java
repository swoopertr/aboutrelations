package com.example.aboutrelations.repository;

import com.example.aboutrelations.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
}
