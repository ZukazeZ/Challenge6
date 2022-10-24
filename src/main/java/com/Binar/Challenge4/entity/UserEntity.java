package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
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
    private int age;

//   @OneToMany(targetEntity = BookingEntity.class,cascade = CascadeType.ALL)
//   @JoinColumn(name="entitasUB",referencedColumnName = "id")
//   private List<BookingEntity> UserBooking;

}
