package com.example.geminicall.Repository;

import com.example.geminicall.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {

}