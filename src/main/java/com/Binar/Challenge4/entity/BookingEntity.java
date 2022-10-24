package com.Binar.Challenge4.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name= "nt_booking")
public class bookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_id")
    private long booking_id;
    @Column(name = "id user")
    private String user_id;
    @Column(name = "total seat")
    private String total_seat;
    @Column(name = "seat number")
    private String seat_code;
    @Column(name = "booking status")
    private String booking_status;
    @Column(name = "studio")
    private String studio_id;

}
