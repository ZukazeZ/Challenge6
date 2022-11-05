package com.binar.challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "nt_Seat")
public class SeatEntity {
    @Id
    @Column(name = "Studio_ID")
    private long studioId;
    @Column(name = "Seat_Code")
    private String seatCode;
    @Column(name = "Seat_Number")
    private String seatNumber;
}
