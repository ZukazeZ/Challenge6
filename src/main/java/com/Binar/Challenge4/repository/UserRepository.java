package com.Binar.Challenge4.repository;

import com.Binar.Challenge4.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
