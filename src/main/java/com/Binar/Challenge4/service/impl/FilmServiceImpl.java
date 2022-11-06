package com.binar.challenge4.service.impl;

import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.repository.FilmRepository;
import com.binar.challenge4.service.FilmService;
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
    public FilmEntity findById(Long id) {
        Optional<FilmEntity> search = filmRepository.findById(id);
        if(search.isPresent()) {
            logger.info("updated!");
            return search.get();
        }
        else{
            logger.error("No such movie existed");
            return null;
        }

    }

    @Override
    public FilmEntity saveFilm(FilmEntity filmDto) {
        return filmRepository.save(filmDto);
    }


    @Override
    public FilmEntity updaterFilm(Long id, FilmEntity filmEntity) {
        FilmEntity film = findById(id);
        if (film != null) {
            logger.info("Updating");
            film.setFilmName(filmEntity.getFilmName());
            film.setFilmStatus(filmEntity.getFilmStatus());
            film.setFilmDuration(filmEntity.getFilmDuration());
            film.setGenre(filmEntity.getGenre());
            filmRepository.saveAndFlush(film);
        }
        return film;
    }


    public String deleteFilm(Long id) {
        filmRepository.deleteById(id);
        return "Film Has Been Deleted";
    }
}
