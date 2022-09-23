package com.Binar.Challenge4.controller;

import com.Binar.Challenge4.entity.UserEntity;
import com.Binar.Challenge4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity create(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }
    @GetMapping("/getall")
    public List<UserEntity> getall(){
        return userService.findalluser();
    }
    @PutMapping("/update/{id}")
    public UserEntity update(@PathVariable Long id, @RequestBody UserEntity user){
        return userService.updaterUser(id,user);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return userService.deleteUser(id);
    }


    @GetMapping("/test")
    public String testEndpoint(){
        return "JALAN GAK KAU";
    }


}
