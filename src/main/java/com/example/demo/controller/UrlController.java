package com.example.demo.controller;


import com.example.demo.domain.Url;
import com.example.demo.service.UrlService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UrlController {

    private final UrlService urlService;

    @CrossOrigin
    @PostMapping("/url")
    public ResponseEntity<?> save(@RequestBody Url url){

        System.out.println("Name : " + url.getName());
        System.out.println("Password : "  +url.getUrl());

        String userId = "tk";

        return new ResponseEntity<>(urlService.create(url,userId), HttpStatus.CREATED);

    }

}
