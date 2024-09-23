package com.example.aboutrelations.mapper;

import com.example.aboutrelations.dto.AddressDto;
import com.example.aboutrelations.entity.Address;

public class AddressMapper {

    public static AddressDto EntityToDto (Address address) {

        return new AddressDto(address.getFulladdress());
    }
}
