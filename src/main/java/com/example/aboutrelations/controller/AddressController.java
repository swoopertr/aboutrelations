package com.example.aboutrelations.controller;

import com.example.aboutrelations.dto.AddressDto;
import com.example.aboutrelations.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @GetMapping({"","/"})
    public String ok(){
        return "ok";
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable int id){
        AddressDto result = addressService.getById(id);
        return result;
    }

}
