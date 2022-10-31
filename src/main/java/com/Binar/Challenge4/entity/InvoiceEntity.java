//package com.Binar.Challenge4.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.time.DateTimeException;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@Table(name= "nt_Invoice")
//public class InvoiceEntity implements Serializable {
//    @Id
//    @Column(name = "nt_id")
//    private String id;
//    @Column(name = "username")
//    private long username;
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "username", insertable = false,updatable = false)
//    private UserEntity user;
//
//    @Column(name = "Film_Name")
//    private String film_name;
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name="Film_Name", insertable = false,updatable = false)
//    private FilmEntity film;
//
//    @Column(name = "seat_number")
//    private String seat_code;
//    @Column(name = "Schedule_ID")
//    private String schedule_id;
//    @Column(name = "studio")
//    private String studio_id;
//    @Column(name = "Ticket_Price")
//    private String ticket_price;
//
//
//
//}
