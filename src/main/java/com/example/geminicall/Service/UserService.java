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
        // 1️⃣ Get request from user
        String userRequest = user.getRequest();

        // 2️⃣ Hard-coded response (later replace with Gemini API)
        String hardCodedResponse =
                "This is a hardcoded response from GeminiCall backend.";

        // 3️⃣ Set response manually
        user.setResponse(hardCodedResponse);

        // 4️⃣ Save request + response in DB
        return repository.save(user);
    }
}