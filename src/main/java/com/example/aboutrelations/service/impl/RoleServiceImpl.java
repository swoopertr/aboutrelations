package com.example.aboutrelations.service.impl;

import com.example.aboutrelations.dto.AddressDto;
import com.example.aboutrelations.dto.CourseDto;
import com.example.aboutrelations.dto.RoleDto;
import com.example.aboutrelations.dto.UserDto;
import com.example.aboutrelations.entity.Course;
import com.example.aboutrelations.entity.Role;
import com.example.aboutrelations.entity.User;
import com.example.aboutrelations.mapper.SinanPhoneNumberMapper;
import com.example.aboutrelations.mapper.UserMapper;
import com.example.aboutrelations.repository.IRoleRepo;
import com.example.aboutrelations.service.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class RoleServiceImpl implements IRoleService {

    private IRoleRepo roleRepo;


    @Override
    public RoleDto getById(int id) {
        Role role = roleRepo.getById(id);
        return null;
    }

    @Override
    public List<UserDto> getUsers(int roleid) {
        Role role = roleRepo.getById(roleid);

        List<User> users = role.getUsers();
        List<UserDto> result = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);

            List<Course> userCourses = user.getCourses();
            List<CourseDto> courseDtos = new ArrayList<>();
            for (int j = 0; j < userCourses.size(); j++) {
                Course course = userCourses.get(j);
                courseDtos.add(new CourseDto(course.getName()));
            }

            UserDto tmp = UserMapper.EntityToDto(user);
            result.add(tmp);
        }
        return result;
    }
}
