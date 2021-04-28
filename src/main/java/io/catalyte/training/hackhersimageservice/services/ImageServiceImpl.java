package io.catalyte.training.hackhersimageservice.services;

import static io.catalyte.training.hackhersimageservice.constants.StringConstants.BAD_REQUEST_IMAGE_NOT_FOUND;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.exceptions.ResourceNotFound;
import io.catalyte.training.hackhersimageservice.exceptions.ServiceUnavailable;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import io.catalyte.training.hackhersimageservice.entities.Image;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
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
   * @return a list of matching images
   */
  @Override
  public List<Image> queryImages(Image image) throws Exception {
//    List<Image> imageObjects;
//    try {
//      if (image.isEmpty()) {
//        imageObjects = imageRepository.findAll();
//      } else {
//        Example<Image> imageExample = Example.of(image);
//        imageObjects = imageRepository.findAll(imageExample);
//      }
//      byte[] images;
//      imageObjects.forEach(imageObject -> {
//        var imgFile = new ClassPathResource(imageObject.getImageFileName());
//        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
//      });
//    } catch (Exception e) {
//      throw new ServiceUnavailable(e);
//    }

    return null;
  }

  /**
   * Gets a image by the image's id
   *
   * @param id the image's id
   * @return byte array of image with said id
   */
  public Image getImageById(Long id) {

    try {
      Image image = imageRepository.findById(id).orElse(null);
      if (image != null) {
        return image;
      }
    } catch (Exception e) {
      throw new ServiceUnavailable(e);
    }

    throw new ResourceNotFound(BAD_REQUEST_IMAGE_NOT_FOUND);

  }
}
