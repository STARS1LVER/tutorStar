package com.tutorstar.TutorStar.controller;


import com.tutorstar.TutorStar.dto.UserDto;
import com.tutorstar.TutorStar.dto.UserMapper;
import com.tutorstar.TutorStar.entity.User;
import com.tutorstar.TutorStar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    public List<UserDto> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users.stream()
                .map(UserMapper.INSTANCE::userToUserDto)
                .collect( Collectors.toList());

    }





}
