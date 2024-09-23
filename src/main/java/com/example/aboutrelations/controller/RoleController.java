package com.example.aboutrelations.controller;

import com.example.aboutrelations.dto.UserDto;
import com.example.aboutrelations.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping({"","/"})
    public String ok(){
        return "ok";
    }

    @GetMapping("/{roleid}/users")
    public List<UserDto> getUsersByRoleId(@PathVariable int roleid){
        List<UserDto> users = roleService.getUsers(roleid);
        return users;
    }
}

