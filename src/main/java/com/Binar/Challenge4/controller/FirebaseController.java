package com.binar.challenge4.controller;

import com.binar.challenge4.entity.FirebaseEntity;
import com.binar.challenge4.firebase.service.FirebaseMessagingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation(summary="This is to send notification from firebase")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "Sended the data from firebase",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not Available",
                    content = @Content)
    })
    @RequestMapping("/send-notif")
    @ResponseBody
    public String sendNotification(@RequestBody FirebaseEntity note,
                                   @RequestParam String token)  {



        return firebaseService.sendNotification(note);
    }

}
