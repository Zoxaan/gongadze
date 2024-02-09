package com.example.demo12.repo;

import com.example.demo12.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepo extends JpaRepository <UserEntity , Long> {
}
