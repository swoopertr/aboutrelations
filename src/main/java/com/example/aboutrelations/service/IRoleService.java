package com.example.aboutrelations.service;

import com.example.aboutrelations.dto.RoleDto;
import com.example.aboutrelations.dto.UserDto;

import java.util.List;

public interface IRoleService {
    RoleDto getById(int id);
    List<UserDto> getUsers(int roleid);
}
