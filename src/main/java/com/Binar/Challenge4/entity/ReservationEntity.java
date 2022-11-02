package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@Table(name= "nt_Reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_id")
    private long reservation_id;
    @Column(name = "price")
    private long price;
    @Column(name = "seat_number")
    private String seat_code;
    @Column(name = "Time_ofreservation")
    private Date time_of_reservation;
    @Column(name = "Schedule_ID")
    private String schedule_id;
    @Column(name = "studio")
    private String studio_id;



}
