package com.binar.challenge4.service;

import com.binar.challenge4.entity.RoleEntity;
import com.binar.challenge4.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface UserService{

    List<UserEntity> findalluser();
    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updaterUser(Long id,UserEntity userEntity);
    UserEntity getUser(String userEntity);
    String deleteUser(Long id);
    RoleEntity saveRole(RoleEntity role);
    void addRoletoUser(String username, String roleName);

}
