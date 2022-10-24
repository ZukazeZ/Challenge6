package com.Binar.Challenge4.dto;

import com.Binar.Challenge4.entity.FilmEntity;
import com.Binar.Challenge4.entity.ReservationEntity;
import com.Binar.Challenge4.entity.SeatEntity;
import com.Binar.Challenge4.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Invoice {
    @Autowired
    private UserEntity userEntity;
    @Autowired
    private FilmEntity filmEntity;
    @Autowired
    private ReservationEntity reservationEntity;
    @Autowired
    private SeatEntity seatEntity;


    private Invoice invoice;


    Long user_id;
    String Seat_Code;
    String Film_Name;
    String Hour_Start;


}
