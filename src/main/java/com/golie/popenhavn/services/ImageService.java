package com.golie.popenhavn.services;

import com.golie.popenhavn.entity.Image;

public interface ImageService {
    public Iterable<Image> findAll();

    //insert single image
    public Image save(Image image);
    //insert multiple images
    public Iterable<Image> save(Iterable<Image> images);
}