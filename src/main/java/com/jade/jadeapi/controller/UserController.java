package com.jade.jadeapi.controller;

import com.jade.jadeapi.models.user.User;
import com.jade.jadeapi.models.user.UserRepository;
import com.jade.jadeapi.models.user.UserRequestDTO;
import com.jade.jadeapi.models.user.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<UserResponseDTO> getAll() {
        return repository.findAll().stream().map(UserResponseDTO::new).toList();
    }

    @PostMapping
    public void createUser(@RequestBody UserRequestDTO data) {
        repository.save(new User(data));
    }
}
