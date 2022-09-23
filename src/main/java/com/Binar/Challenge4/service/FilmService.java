package com.Binar.Challenge4.service;

import com.Binar.Challenge4.entity.FilmEntity;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<FilmEntity> findallfilm();
    Optional<FilmEntity> findById(Long id);
    FilmEntity savefilm(FilmEntity filmEntity);
    FilmEntity updaterFilm(Long id, FilmEntity filmEntity);
    String deleteFilm(Long id);
}
