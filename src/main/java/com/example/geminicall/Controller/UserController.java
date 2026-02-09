package com.example.geminicall.Controller;

import com.example.geminicall.Model.UserModel;
import com.example.geminicall.Service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping("/add-request")
    public UserModel addrequest(@RequestBody UserModel user) {
        return service.addrequest(user);
    }
}