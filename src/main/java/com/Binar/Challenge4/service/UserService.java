package com.Binar.Challenge4.service;

import com.Binar.Challenge4.entity.RoleEntity;
import com.Binar.Challenge4.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface UserService{

    List<UserEntity> findalluser();
    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity UserEntity);
    UserEntity updaterUser(Long id,UserEntity UserEntity);
    UserEntity getUser(String UserEntity);
    String deleteUser(Long id);
    RoleEntity saveRole(RoleEntity role);
    void addRoletoUser(String username, String roleName);

}
