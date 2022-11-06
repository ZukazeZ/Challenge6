package com.binar.challenge4.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;
import static javax.persistence.FetchType.EAGER;


@Getter
@Setter
@Entity @Data @NoArgsConstructor @AllArgsConstructor
@Table(name= "nt_Username")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_id")
    private long userId;
    @Column(name = "name")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Long age;

    @ManyToMany(fetch = EAGER)
    private Collection<RoleEntity> roles = new ArrayList<>();


}
