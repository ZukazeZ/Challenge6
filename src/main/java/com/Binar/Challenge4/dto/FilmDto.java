package com.binar.challenge4.dto;

import com.binar.challenge4.entity.FilmEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class FilmDto extends FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ntCode;
    private String filmCode;
    private String filmName;
    private String filmStatus;
    private String filmDuration;
    private String genre;

}
