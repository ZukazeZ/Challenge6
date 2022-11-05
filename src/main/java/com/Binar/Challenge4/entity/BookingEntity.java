package com.binar.challenge4.entity;
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
    private long id;
    @Column(name = "id_user")
    private String userId;
    @Column(name = "total_seat")
    private String totalSeat;
    @Column(name = "seat_number")
    private String seatCode;
    @Column(name = "booking_status")
    private String bookingStatus;
    @Column(name = "studio")
    private String studioId;
}
