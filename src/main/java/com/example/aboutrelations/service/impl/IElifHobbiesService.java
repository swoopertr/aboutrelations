package com.example.aboutrelations.service.impl;

import com.example.aboutrelations.dto.ElifHobbiesDto;

import java.util.List;

public interface IElifHobbiesService {
    ElifHobbiesDto getHobbiesById(int id);
    List<ElifHobbiesDto> getAllHobbies();

}
