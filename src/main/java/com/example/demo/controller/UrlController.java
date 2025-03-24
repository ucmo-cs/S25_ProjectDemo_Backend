package com.example.demo.controller;


import com.example.demo.domain.Url;
import com.example.demo.service.UrlService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")
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



    @CrossOrigin
    @GetMapping("/urls")
    public ResponseEntity<?> findAllurls(){

        String userId = "tk";
        System.out.println("FindAllUrls By Name : " + userId);
        return new ResponseEntity<>(urlService.findAll(userId), HttpStatus.OK);

    }
}
