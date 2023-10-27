package com.example.demogongadze.repo;

import com.example.demogongadze.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
