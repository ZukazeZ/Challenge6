package com.Binar.Challenge4.service.impl;

import com.Binar.Challenge4.entity.RoleEntity;
import com.Binar.Challenge4.entity.UserEntity;
import com.Binar.Challenge4.repository.RoleRepository;
import com.Binar.Challenge4.repository.UserRepository;
import com.Binar.Challenge4.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor @Slf4j
public class UserServiceImpl implements UserService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;



    @Override
    public List<UserEntity> findalluser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public UserEntity updaterUser(Long id,UserEntity userEntity) {
        log.info("Updating user information to the database");
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

    @Override
    public RoleEntity saveRole(RoleEntity roleEntity) {
        log.info("Saving new role {} to the database",roleEntity.getName());
        return roleRepository.save(roleEntity);
    }

    @Override
    public UserEntity getUser(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public void addRoletoUser(String username, String roleName) {
        log.info("adding role {} to user {}",roleName,username);
        UserEntity user = userRepository.findByUsername(username);
        RoleEntity role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }


}
