package com.Binar.Challenge4.service.impl;

import com.Binar.Challenge4.entity.FilmEntity;
import com.Binar.Challenge4.repository.FilmRepository;
import com.Binar.Challenge4.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;


    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @Override
    public List<FilmEntity> findallfilm() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<FilmEntity> findById(Long user_id) {
        return filmRepository.findById(user_id);
    }

    @Override
    public FilmEntity savefilm(FilmEntity filmEntity) {
        return filmRepository.save(filmEntity);
    }

    @Override
    public FilmEntity updaterFilm(Long id, FilmEntity filmEntity) {
        FilmEntity FilmEntityFINDID=filmRepository.findById(id).get();
        FilmEntityFINDID.setFilm_name(filmEntity.getFilm_name());
        FilmEntityFINDID.setFilm_status(filmEntity.getFilm_status());
        FilmEntityFINDID.setFilm_duration(filmEntity.getFilm_duration());
        FilmEntityFINDID.setGenre(filmEntity.getGenre());
        return filmRepository.save(FilmEntityFINDID);
    }

    public String deleteFilm(Long id) {
        filmRepository.deleteById(id);
        return "Film Has Been Deleted";
    }
}
