package com.binar.challenge4.repository;

import com.binar.challenge4.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDtoRepository extends JpaRepository<UserDto,Long> {
}
