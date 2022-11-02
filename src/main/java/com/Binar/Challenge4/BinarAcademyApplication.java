package com.Binar.Challenge4;

import com.Binar.Challenge4.entity.RoleEntity;
import com.Binar.Challenge4.entity.UserEntity;
import com.Binar.Challenge4.service.UserService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
