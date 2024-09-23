package com.example.aboutrelations.controller;

import com.example.aboutrelations.dto.UserDto;
import com.example.aboutrelations.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping({"","/"})
    public String ok(){
        return "ok";
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable int id){
        UserDto userDto = userService.getById(id);
        return userDto;
    }

}
