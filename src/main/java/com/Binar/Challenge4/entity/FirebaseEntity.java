package com.binar.challenge4.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Setter
@Getter
@Data
@Component
public class FirebaseEntity {

    private String subject;
    private String content;
    private Map<String,String> data;
    private String image;


}
