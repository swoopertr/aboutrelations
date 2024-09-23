package com.example.aboutrelations.mapper;

import com.example.aboutrelations.dto.ElifHobbiesDto;
import com.example.aboutrelations.entity.ElifHobbies;

public class ElifHobbiesMapper {
    public static ElifHobbiesDto EntityToDto(ElifHobbies elifHobbies){
      return new ElifHobbiesDto(elifHobbies.getHobbies_name());
    }
}
