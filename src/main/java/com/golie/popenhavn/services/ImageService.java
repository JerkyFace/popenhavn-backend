package com.golie.popenhavn.services;

import com.golie.popenhavn.entity.Image;

public interface ImageService {
    public Iterable<Image> findAll();
}