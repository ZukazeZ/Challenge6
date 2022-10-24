package com.Binar.Challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "nt_Studio")
public class StudioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Studio_ID")
    private long studio_id;
    @Column(name = "Studio_Name")
    private String studio_name;
//    @OneToMany(targetEntity = ReservationEntity.class,cascade =CascadeType.ALL)
//    @JoinColumn(name = "EntitasBR",referencedColumnName = "id1")
//    private List<SeatEntity> StudioSeat;
}
