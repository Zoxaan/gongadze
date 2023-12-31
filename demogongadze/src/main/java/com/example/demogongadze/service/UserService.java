package com.example.demogongadze.service;

import com.example.demogongadze.entity.User;
import com.example.demogongadze.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User save (User user){
        return userRepo.save(user);
    }
    public  void delete(Long id){
        this.userRepo.deleteById(id);
    }
    public Optional<User> getById(Long id){
        return userRepo.findById(id);
    }
    public List<User> getALLusers(){
        return userRepo.findAll();
    }
}
