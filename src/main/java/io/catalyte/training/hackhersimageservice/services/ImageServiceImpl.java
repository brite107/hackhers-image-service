package io.catalyte.training.hackhersimageservice.services;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.exceptions.ServiceUnavailable;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * service class which implements ImageService interface
 */
@Service
public class ImageServiceImpl implements ImageService {

  @Autowired
  ImageRepository imageRepository;

  /**
   * Gets images from the database
   *
   * @param image an optional sample to query against
   * @return a list of matching customers
   */
  @Override
  public List<Image> queryImages(Image image) throws Exception {
    try {
      if (image.isEmpty()) {
        return imageRepository.findAll();
      } else {
        Example<Image> imageExample = Example.of(image);
        return imageRepository.findAll(imageExample);
      }
    } catch (Exception e) {
      throw new ServiceUnavailable(e);
    }
  }
}
