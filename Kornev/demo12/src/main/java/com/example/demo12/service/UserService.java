package com.example.demo12.service;

import com.example.demo12.entity.UserEntity;
import com.example.demo12.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public List<UserEntity> findAll(){return  userRepo.findAll();}

    public void save (UserEntity user){
        user.setName(user.getName());
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        userRepo.save(user);
    }

}
