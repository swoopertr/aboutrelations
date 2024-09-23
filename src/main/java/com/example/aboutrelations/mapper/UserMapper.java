package com.example.aboutrelations.mapper;

import com.example.aboutrelations.dto.CourseDto;
import com.example.aboutrelations.dto.ElifHobbiesDto;
import com.example.aboutrelations.dto.UserDto;
import com.example.aboutrelations.entity.Course;
import com.example.aboutrelations.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

        public static UserDto EntityToDto(User user) {
            List<Course> courses = user.getCourses();
            List<CourseDto> courseDtos = new ArrayList<>();
            for (int i = 0; i < courses.size(); i++) {
                Course course = courses.get(i);
                courseDtos.add(new CourseDto(course.getName()));
            }

            return new UserDto(
                    user.getId(),
                    user.getUsername(),
                    user.getEmail(),
                    AddressMapper.EntityToDto(user.getAddress()),
                    courseDtos,
                    SinanPhoneNumberMapper.EntityToDto(user.getSinanPhoneNumber()),
                    ElifHobbiesMapper.EntityToDto(user.getElifHobbies()),
                    GokalpTableMapper.EntityToDto(user.getGokalpTable())
            );
            
        }
}
