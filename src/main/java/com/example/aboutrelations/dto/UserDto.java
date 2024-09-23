package com.example.aboutrelations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserDto {
    private int id;
    private String username;
    private String email;

    private AddressDto address;
    private List<CourseDto> courses;

    private SinanPhoneNumberDto sinanPhoneNumber;
    private ElifHobbiesDto elifHobbiesDto;
    private GokalpTableDto gokalpTableDto;


}
