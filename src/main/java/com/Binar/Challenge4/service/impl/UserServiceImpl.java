package com.Binar.Challenge4.service.impl;

import com.Binar.Challenge4.entity.UserEntity;
import com.Binar.Challenge4.repository.UserRepository;
import com.Binar.Challenge4.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<UserEntity> findalluser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updaterUser(Long id,UserEntity userEntity) {
        UserEntity UserEntityFINDID=userRepository.findById(id).get();
        UserEntityFINDID.setUsername(userEntity.getUsername());
        UserEntityFINDID.setPassword(userEntity.getPassword());
        UserEntityFINDID.setEmail(userEntity.getEmail());
        UserEntityFINDID.setAge(userEntity.getAge());
        return userRepository.save(UserEntityFINDID);
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User Has Been Deleted";
    }
}
