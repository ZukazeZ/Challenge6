package com.binar.challenge4.dto;

import com.binar.challenge4.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class UserDto extends UserEntity {

}
