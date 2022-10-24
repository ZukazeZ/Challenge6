package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "nt_Seat")
public class SeatEntity {
    @Id
    @Column(name = "Studio_ID")
    private long studio_id;
    @Column(name = "Seat_Code")
    private String seat_code;
    @Column(name = "Seat_Number")
    private String seat_number;
//    @OneToMany(targetEntity = ReservationEntity.class,cascade =CascadeType.ALL)
//    @JoinColumn(name = "EntitasBR",referencedColumnName = "id1")
//    private List<ReservationEntity> SeatReservasi;
}
