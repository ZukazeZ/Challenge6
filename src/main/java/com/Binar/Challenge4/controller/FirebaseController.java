package com.binar.challenge4.controller;

import com.binar.challenge4.entity.FirebaseEntity;
import com.binar.challenge4.firebase.service.FirebaseMessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@Service
public class FirebaseController {

    private final FirebaseMessagingService firebaseService;

    public FirebaseController(FirebaseMessagingService firebaseService){
        this.firebaseService = firebaseService;
    }

    @RequestMapping("/send-notif")
    @ResponseBody
    public String sendNotification(@RequestBody FirebaseEntity note,
                                   @RequestParam String token)  {



        return firebaseService.sendNotification(note);
    }

}
