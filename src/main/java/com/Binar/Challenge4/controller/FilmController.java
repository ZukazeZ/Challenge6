package com.Binar.Challenge4.controller;

import com.Binar.Challenge4.entity.FilmEntity;
import com.Binar.Challenge4.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public FilmEntity create(@RequestBody FilmEntity film){
        return filmService.savefilm(film);
    }
    @GetMapping("/getall")
    public List<FilmEntity> getall(){
        return filmService.findallfilm();
    }
    @PutMapping("/update/{id}")
    public FilmEntity update(@PathVariable Long id, @RequestBody FilmEntity film){
        return filmService.updaterFilm(id,film);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return filmService.deleteFilm(id);
    }


    @GetMapping("/test")
    public String testEndpoint(){
        return "JALAN GAK KAU";
    }


}
