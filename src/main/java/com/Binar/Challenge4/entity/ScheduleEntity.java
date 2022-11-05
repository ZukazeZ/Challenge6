package com.binar.challenge4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "nt_Schedule")
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_id")
    private long scheduleId;
    @Column(name = "film_Code")
    private String filmCode;
    @Column(name = "Show_date")
    private String showDate;
    @Column(name = "Hour_start")
    private String startHour;
    @Column(name = "Hour_end")
    private String endHour;
    @Column(name = "Ticket_Price")
    private String ticketPrice;

}
