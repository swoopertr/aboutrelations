package com.example.aboutrelations.service;

import com.example.aboutrelations.dto.UserDto;

public interface IUserService {
    UserDto getById(int id);
}
