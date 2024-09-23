package com.example.aboutrelations.mapper;

import com.example.aboutrelations.dto.SinanPhoneNumberDto;
import com.example.aboutrelations.entity.SinanPhoneNumber;

public class SinanPhoneNumberMapper {

    public static SinanPhoneNumberDto EntityToDto(SinanPhoneNumber sinanPhoneNumber) {

        return new SinanPhoneNumberDto(sinanPhoneNumber.getPhone_number());
    }
}
