package com.binar.challenge4.service;

import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.security.AuthEntryPointJwt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {
    List<FilmEntity> findallfilm();
    FilmEntity findById(Long id);
    Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);
    FilmEntity updaterFilm(Long id, FilmEntity filmEntity);
    String deleteFilm(Long id);
    FilmEntity saveFilm(FilmEntity filmDto);
}
