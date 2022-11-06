package com.binar.challenge4.testing;

import com.binar.challenge4.entity.FilmEntity;
import com.binar.challenge4.repository.FilmRepository;
import com.binar.challenge4.service.impl.FilmServiceImpl;
import com.binar.challenge4.testing.dummy.DummyFilmEntity;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

 class TestFilmServiceImpl {

    @Mock
    FilmRepository filmRepository ;

    @InjectMocks
    FilmServiceImpl filmService;

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    @DisplayName("Mengecek apakah bisa mengambil data film dari id")
    void tesMengambilFilmId() {
        FilmEntity film = new FilmEntity();
        film.setNtCode(1L);
        film.setFilmCode("1");
        film.setFilmName("Lord of the Ring");
        film.setFilmStatus("Active");
        film.setFilmDuration("2 hours 45 minutes");
        film.setGenre("Action");
        Mockito.when(filmRepository.findById(1L)).thenReturn(Optional.of(film));
    }

    @Test
    @DisplayName("Making sure we get all the film")
    void testFindAllFilm() {
        List<FilmEntity> filmEntities= DummyFilmEntity.Dummy1();
        Mockito.when(filmRepository.findAll())
                .thenReturn(filmEntities);

        var realValue = filmService.findallfilm();

        Assertions.assertEquals(1,realValue.size());
        Assertions.assertEquals("Lord of the Ring",realValue.get(0).getFilmName());

    }

    @Test
    @DisplayName("Making sure that we can update the film")
    void testUpdaterFilm(){
//        List<FilmEntity> filmEntities=DummyFilmEntity.Dummy1();
        FilmEntity film = new FilmEntity();
        film.setNtCode(1L);
        film.setFilmCode("1");
        film.setFilmName("Lord of the Ring");
        film.setFilmStatus("Active");
        film.setFilmDuration("2 hours 45 minutes");
        film.setGenre("Action");
        Mockito.when(filmRepository.findById(1L)).thenReturn(Optional.of(film));

        Mockito.when(filmRepository.saveAndFlush(film)).thenReturn(film);

        var realValue = filmService.updaterFilm(1L, film);
        Assertions.assertEquals("1",realValue.getFilmCode());
        Assertions.assertEquals("Lord of the Ring",realValue.getFilmName());
        Assertions.assertNotNull(realValue);
    }

    @Test
    @DisplayName("Mengecek apakah file terdelete")
    public void testDeleteFilm() {
        FilmEntity film = new FilmEntity();
        film.setNtCode(1L);
        film.setFilmCode("1");
        film.setFilmName("Lord of the Ring");
        film.setFilmStatus("Active");
        film.setFilmDuration("2 hours 45 minutes");
        film.setGenre("Action");
        Mockito.when(filmRepository.findById(1L)).thenReturn(Optional.of(film));
        Mockito.doNothing().when(filmRepository).deleteById(1L);
        filmService.deleteFilm(1L);
        Mockito.verify(filmRepository).deleteById(1L);
    }

}
