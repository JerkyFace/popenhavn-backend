package com.golie.popenhavn.repositories;

import com.golie.popenhavn.entity.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("imageRepository")
public interface ImageRepository extends CrudRepository<Image, Integer> {

}