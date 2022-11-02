package com.Binar.Challenge4.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "nt_booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_id")
    private long booking_id;
    @Column(name = "id_user")
    private String user_id;
    @Column(name = "total_seat")
    private String total_seat;
    @Column(name = "seat_number")
    private String seat_code;
    @Column(name = "booking_status")
    private String booking_status;
    @Column(name = "studio")
    private String studio_id;
}
