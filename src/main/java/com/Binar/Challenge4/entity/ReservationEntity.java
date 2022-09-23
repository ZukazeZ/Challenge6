package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.DateTimeException;
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
    @Column(name = "seat number")
    private String seat_code;
    @Column(name = "Time of reservation")
    private Date time_of_reservation;
    @Column(name = "Schedule ID")
    private String schedule_id;
    @Column(name = "studio")
    private String studio_id;

}
