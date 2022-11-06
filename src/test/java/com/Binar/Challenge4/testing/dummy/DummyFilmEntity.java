package com.binar.challenge4.testing.dummy;

import com.binar.challenge4.entity.FilmEntity;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class DummyFilmEntity {


    public static List<FilmEntity> Dummy1(){
        List<FilmEntity> Dummy1 = new ArrayList<>();
        FilmEntity film = new FilmEntity();
        film.setFilmCode("1");
        film.setFilmName("Lord of the Ring");
        film.setFilmStatus("Active");
        film.setFilmDuration("2 hours 45 minutes");
        film.setGenre("Action");
        Dummy1.add(film);
        return Dummy1;
    }




}
