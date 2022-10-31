package com.Binar.Challenge4;

import com.Binar.Challenge4.entity.RoleEntity;
import com.Binar.Challenge4.entity.UserEntity;
import com.Binar.Challenge4.service.UserService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
@Slf4j
@SpringBootApplication
@OpenAPIDefinition
public class BinarAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinarAcademyApplication.class, args);
	}
//	@Bean
//	PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
//	}

//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new RoleEntity(null,"ROLE_CUSTOMER"));
//			userService.saveRole(new RoleEntity(null,"ROLE_ADMIN"));
//
//			userService.saveUser(new UserEntity(1,"NiczRamli","password","Nicoramli@gmail.com",1,new ArrayList<>()));
//			userService.saveUser(new UserEntity(2,"Nico","admin","Nicoramli@gmail.com",2,new ArrayList<>()));
//			userService.addRoletoUser("NiczRamli","ROLE_CUSTOMER");
//			userService.addRoletoUser("Nico","ROLE_ADMIN");
//		};
//	}
}
