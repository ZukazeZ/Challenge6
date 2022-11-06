package com.binar.challenge4.testing;

import com.binar.challenge4.entity.UserEntity;
import com.binar.challenge4.repository.UserRepository;
import com.binar.challenge4.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

 class TestUserServiceImpl {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

//    public TestUserServiceImpl(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Mengecek apakah bisa mengambil data user dari id")
    void tesMengambilUserId(){
        UserEntity users = new UserEntity();
        users.setUserId(1L);
        users.setUsername("Nico");
        users.setPassword("NicoNii");
        users.setEmail("Niconico@gmail.com");
        users.setAge(20L);
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(users));
    }

    @Test
    @DisplayName("Making sure we get all the user")
    void testFindAllUser() {
        userService.findalluser();
        Mockito.verify(userRepository).findAll();
    }



//    private final PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("Making sure we can create user id")
    void testSaveUser() {
        UserEntity users = new UserEntity();
        users.setUserId(1L);
        users.setUsername("Nico");
        users.setPassword("NicoNiiii");
        users.setEmail("Niconico@gmail.com");
        users.setAge(20L);
        Mockito.when(userRepository.save(users)).thenReturn(users);

    }

    @Test
    @DisplayName("Making sure we can update user id")
    void testUpdaterUser() {
        UserEntity users = new UserEntity();
        users.setUserId(1L);
        users.setUsername("Nico");
        users.setPassword("NicoNiiii");
        users.setEmail("Niconico@gmail.com");
        users.setAge(20L);
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(users));

        Mockito.when(userRepository.saveAndFlush(users)).thenReturn(users);
        var realValue = userService.updaterUser(1L, users);
        Assertions.assertEquals(1L,realValue.getUserId());
        Assertions.assertEquals("Nico",realValue.getUsername());
        Assertions.assertNotNull(realValue);
    }


    @Test
    @DisplayName("Making sure we can delete user id")
    void testDeleteUser() {
        UserEntity users = new UserEntity();
        users.setUserId(1L);
        users.setUsername("Nico");
        users.setPassword("NicoNiiii");
        users.setEmail("Niconico@gmail.com");
        users.setAge(20L);
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(users));
        Mockito.doNothing().when(userRepository).deleteById(1L);
        userService.deleteUser(1L);
        Mockito.verify(userRepository).deleteById(1L);
    }
}
