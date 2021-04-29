package io.catalyte.training.hackhersimageservice.services;

import io.catalyte.training.hackhersimageservice.entities.Image;
import java.util.List;

/**
 * image service interface with get methods for an image
 */
public interface ImageService {

  List<Image> queryImages(Image image) throws Exception;

  Image getImageById(Long id) throws Exception;
}
