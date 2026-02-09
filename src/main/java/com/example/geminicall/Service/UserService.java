package com.example.geminicall.Service;

import com.example.geminicall.Model.UserModel;
import com.example.geminicall.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository){
        this.repository = repository;
    }
    // Create
    public UserModel addrequest(UserModel user) {
        return repository.save(user);
    }
}