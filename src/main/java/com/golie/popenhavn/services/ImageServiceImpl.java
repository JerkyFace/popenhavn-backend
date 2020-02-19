package com.golie.popenhavn.services;

import javax.transaction.Transactional;

import com.golie.popenhavn.entity.Image;
import com.golie.popenhavn.repositories.ImageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service("imageService")
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Iterable<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }
    
    @Override
    public Iterable<Image> save(Iterable<Image> images){
        return imageRepository.saveAll(images);
    }
}
