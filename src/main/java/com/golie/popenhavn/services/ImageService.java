package com.golie.popenhavn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.golie.popenhavn.entity.Image;
import com.golie.popenhavn.repositories.ImageRepository;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository;

    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    public Optional<Image> findById(Long id) {
        return imageRepository.findById(id);
    }

    public Image save(Image saved) {
        return imageRepository.save(saved);
    }

    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }
}