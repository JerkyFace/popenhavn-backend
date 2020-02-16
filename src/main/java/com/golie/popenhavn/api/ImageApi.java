package com.golie.popenhavn.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/image")
public class ImageApi{
    @GetMapping
    public String getImages(){
        return "Image requested";
    }

    @PostMapping()
    public String insertImage(){
        return "Image inserted";
    }
}