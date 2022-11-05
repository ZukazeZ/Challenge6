package com.binar.challenge4.entity;

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
    private long reservationId;
    @Column(name = "price")
    private long price;
    @Column(name = "seat_number")
    private String seatCode;
    @Column(name = "Time_ofreservation")
    private Date timeOfReservation;
    @Column(name = "Schedule_ID")
    private String scheduleId;
    @Column(name = "studio")
    private String studioId;



}
