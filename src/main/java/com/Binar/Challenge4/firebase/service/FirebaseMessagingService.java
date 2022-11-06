package com.binar.challenge4.firebase.service;

import com.binar.challenge4.entity.FirebaseEntity;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Service;

@Service
public class FirebaseMessagingService {

    public String sendNotification(FirebaseEntity note) {
        Notification notification = Notification
                .builder()
                .setTitle(note.getSubject())
                .setBody(note.getContent())
                .setImage(note.getImage())
                .build();

        return notification+"Message sudah di output";
    }
}
