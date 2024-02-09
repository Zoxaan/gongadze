package com.example.demo12.controller;

import com.example.demo12.entity.UserEntity;
import com.example.demo12.repo.UserRepo;
import com.example.demo12.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
@GetMapping("")
    String mainPage(){return "index";}

    @GetMapping("/all")
        String findAllUser(Model model, UserEntity user){
model.addAttribute("users", userService.findAll());
return"user-list";
        }
        @GetMapping("/form-add")
    String getAddUserForm(){return "add-user";}

    @PostMapping("/save")
    String saveUser(UserEntity user){
    userService.save(user);
    return "redirect:/all";
    }
}
