package com.binar.challenge4.service.impl;

import com.binar.challenge4.dto.FilmDto;
import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.repository.FilmDtoRepository;
import com.binar.challenge4.repository.FilmRepository;
import com.binar.challenge4.security.AuthEntryPointJwt;
import com.binar.challenge4.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<FilmEntity> findById(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public FilmEntity saveFilm(FilmDto filmDto) {
        return filmRepository.save(filmDto);
    }


    @Override
    public FilmEntity updaterFilm(Long id, FilmDto filmEntity) {
//        if(filmRepository.existsById(id)) {
            FilmEntity findId = filmRepository.findById(id).get();

            findId.setFilmName(filmEntity.getFilmName());
            findId.setFilmStatus(filmEntity.getFilmStatus());
            findId.setFilmDuration(filmEntity.getFilmDuration());
            findId.setGenre(filmEntity.getGenre());
            return filmRepository.save(findId);
        }
//        else {
//            logger.error("No such film exist here");
//            return null;
//        }



    public String deleteFilm(Long id) {
        filmRepository.deleteById(id);
        return "Film Has Been Deleted";
    }
}
