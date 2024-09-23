package com.example.aboutrelations.service.impl;

import com.example.aboutrelations.dto.AddressDto;
import com.example.aboutrelations.entity.Address;
import com.example.aboutrelations.repository.IAddressRepo;
import com.example.aboutrelations.service.IAddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Component
public class AddressServiceImpl implements IAddressService {

    private IAddressRepo addressRepo;

    @Override
    public AddressDto getById(int id) {
        Address address = addressRepo.getById(id);
        AddressDto result = new AddressDto(address.getFulladdress());
        return result;
    }
}
