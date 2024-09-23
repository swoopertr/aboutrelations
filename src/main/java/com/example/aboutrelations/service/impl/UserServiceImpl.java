package com.example.aboutrelations.service.impl;

import com.example.aboutrelations.dto.AddressDto;
import com.example.aboutrelations.dto.CourseDto;
import com.example.aboutrelations.dto.SinanPhoneNumberDto;
import com.example.aboutrelations.dto.UserDto;
import com.example.aboutrelations.entity.Course;
import com.example.aboutrelations.entity.User;
import com.example.aboutrelations.mapper.SinanPhoneNumberMapper;
import com.example.aboutrelations.mapper.UserMapper;
import com.example.aboutrelations.repository.IUserRepo;
import com.example.aboutrelations.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Component
public class UserServiceImpl implements IUserService {

    private IUserRepo userRepo;

    @Override
    public UserDto getById(int id) {
        User user = userRepo.getById(id);
        return UserMapper.EntityToDto(user);
    }
}
