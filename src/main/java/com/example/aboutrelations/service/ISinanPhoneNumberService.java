package com.example.aboutrelations.service;

import com.example.aboutrelations.dto.SinanPhoneNumberDto;
import com.example.aboutrelations.entity.SinanPhoneNumber;

import java.util.List;

public interface ISinanPhoneNumberService {

    SinanPhoneNumberDto getPhoneNumberById(int id);
    List<SinanPhoneNumberDto> getAllPhoneNumbers();
}
