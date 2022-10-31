package com.Binar.Challenge4.entity;

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
    private long user_id;
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

    public UserEntity(String username, String email, String password,Long age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }


//   @OneToMany(targetEntity = BookingEntity.class,cascade = CascadeType.ALL)
//   @JoinColumn(name="entitasUB",referencedColumnName = "id")
//   private List<BookingEntity> UserBooking;

}
