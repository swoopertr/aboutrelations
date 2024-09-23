package com.example.aboutrelations.mapper;

import com.example.aboutrelations.dto.GokalpTableDto;
import com.example.aboutrelations.entity.GokalpTable;

public class GokalpTableMapper {

    public static GokalpTableDto EntityToDto(GokalpTable gokalpTable){

        return new GokalpTableDto(gokalpTable.getJob());
    }
}
