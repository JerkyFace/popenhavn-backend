package com.golie.popenhavn.api.Image;

import com.golie.popenhavn.Exceptions.ImageNotFoundException;
import com.golie.popenhavn.entity.Image;
import com.golie.popenhavn.services.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/image")
public class ImageApi {
    @Autowired
    ImageService imageService;

    @GetMapping
    public ResponseEntity<List<Image>> findAll() {
        return ResponseEntity.ok(imageService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable("id") Long id) throws ImageNotFoundException {
        Optional<Image> image = imageService.findById(id);
        if (!image.isPresent()) {
            String message = ResponseEntity.badRequest().build().toString();
            throw new ImageNotFoundException(message);
        }
        return ResponseEntity.ok(image.get());
    }
}