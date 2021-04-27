package io.catalyte.training.hackhersimageservice.services;

import static io.catalyte.training.hackhersimageservice.constants.StringConstants.BAD_REQUEST_IMAGE_NOT_FOUND;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.exceptions.ResourceNotFound;
import io.catalyte.training.hackhersimageservice.exceptions.ServiceUnavailable;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Example;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

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
  public List<byte[]> queryImages(Image image) throws Exception {
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
  public byte[] getImageById(Long id) {

    try {
      Image image = imageRepository.findById(id).orElse(null);
      var imgFile = new ClassPathResource(image.getImageFileName());
//      var imgFile = new ClassPathResource("image/default-image.jpg");
      byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

      if (bytes != null) {
        return bytes;
      }
    } catch (Exception e) {
      throw new ServiceUnavailable(e);
    }

    throw new ResourceNotFound(BAD_REQUEST_IMAGE_NOT_FOUND);

  }
}
