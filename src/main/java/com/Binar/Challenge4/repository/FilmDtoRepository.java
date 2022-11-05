package com.binar.challenge4.repository;

import com.binar.challenge4.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDtoRepository extends JpaRepository<FilmEntity,Long> {

}
