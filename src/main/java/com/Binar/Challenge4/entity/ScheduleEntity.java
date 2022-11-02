package com.Binar.Challenge4.entity;

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
    private long schedule_id;
    @Column(name = "film_Code")
    private String film_code;
    @Column(name = "Show_date")
    private String show_date;
    @Column(name = "Hour_start")
    private String start_hour;
    @Column(name = "Hour_end")
    private String end_hour;
    @Column(name = "Ticket_Price")
    private String ticket_price;

}
