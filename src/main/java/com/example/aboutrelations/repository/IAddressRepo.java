package com.example.aboutrelations.repository;

import com.example.aboutrelations.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
