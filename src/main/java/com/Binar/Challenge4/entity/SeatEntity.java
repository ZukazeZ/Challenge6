package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "nt_Seat")
public class SeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Studio ID")
    private long studio_id;
    @Column(name = "Seat Code")
    private String seat_code;
    @Column(name = "Seat Number")
    private String seat_number;

}
