package com.binar.challenge4.service;

import com.binar.challenge4.dto.FilmDto;
import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.security.AuthEntryPointJwt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface FilmService {
    List<FilmEntity> findallfilm();
    Optional<FilmEntity> findById(Long id);
    Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);
    FilmEntity updaterFilm(Long id, FilmDto filmEntity);
    String deleteFilm(Long id);

    FilmEntity saveFilm(FilmDto filmDto);
}
