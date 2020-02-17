package com.golie.popenhavn.api;

import java.util.ArrayList;

import com.golie.popenhavn.JPAConfiguration;
import com.golie.popenhavn.entity.Image;
import com.golie.popenhavn.services.ImageService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/image")
public class ImageApi {

    @GetMapping
    public ArrayList<Image> getImages() {
        ArrayList<Image> list = new ArrayList<>();

        try {

            AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
            ImageService imageService = context.getBean(ImageService.class);

            for (Image image : imageService.findAll()) {
                list.add(image);
            }
            context.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    @PostMapping()
    public String insertImage() {
        return "Image inserted";
    }
}