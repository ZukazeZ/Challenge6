package com.binar.challenge4.service.impl;

import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.entity.RoleEntity;
import com.binar.challenge4.entity.UserEntity;
import com.binar.challenge4.repository.RoleRepository;
import com.binar.challenge4.repository.UserRepository;
import com.binar.challenge4.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import static com.binar.challenge4.service.FilmService.logger;

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
    public UserEntity findById(Long id) {
        Optional<UserEntity> search = userRepository.findById(id);
        if(search.isPresent()) {
            logger.info("updated!");
            return search.get();
        }
        else{
            logger.error("No such movie existed");
            return null;
        }
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public UserEntity updaterUser(Long id,UserEntity userEntity) {
        UserEntity user = findById(id);
        if (user != null) {
            user.setUsername(userEntity.getUsername());
            user.setPassword(userEntity.getPassword());
            user.setEmail(userEntity.getEmail());
            user.setAge(userEntity.getAge());
            userRepository.saveAndFlush(user);
        }
        return user;
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
