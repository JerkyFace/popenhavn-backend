package com.golie.popenhavn.api;

import java.util.ArrayList;

import com.golie.popenhavn.JPAConfiguration;
import com.golie.popenhavn.entity.Image;
import com.golie.popenhavn.services.ImageService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/image")
public class ImageApi {

    @GetMapping
    public ArrayList<Image> getImages() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
        ImageService imageService = context.getBean(ImageService.class);
        ArrayList<Image> list = new ArrayList<>();
        try {
            for (Image image : imageService.findAll()) {
                list.add(image);
            }
            context.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @PostMapping
    Image insertImage(@RequestParam("url") String url, @RequestParam("tags") String tags) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
        ImageService imageService = context.getBean(ImageService.class);
        Image image = new Image(url, tags);
        try {
            imageService.save(image);
            context.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return image;
    }
}