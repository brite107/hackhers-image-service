package io.catalyte.training.hackhersimageservice.services;

import io.catalyte.training.hackhersimageservice.entities.Image;
import java.util.List;

public interface ImageService {

  List<byte[]> queryImages(Image image) throws Exception;

  byte[] getImageById(Long id) throws Exception;
}
