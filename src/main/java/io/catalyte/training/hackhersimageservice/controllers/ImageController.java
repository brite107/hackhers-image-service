package io.catalyte.training.hackhersimageservice.controllers;

import static io.catalyte.training.hackhersimageservice.constants.StringConstants.CONTEXT_IMAGES;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.services.ImageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * holds crud methods for the image entity
 */
@RestController
@RequestMapping(CONTEXT_IMAGES)
public class ImageController {

  @Autowired
  ImageService imageService;

  /**
   * gives me all images if I pass a null image or images matching an example with non-null
   * image
   *
   * @param image image object which can have null or non-null fields, returns status 200
   * @return List of images
   * @throws Exception
   */
  @GetMapping
  @ApiOperation("Gets all images, or all images matching an example with image fields")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "OK", response = Image.class)
  })
  public ResponseEntity<List<Image>> queryImages(Image image) throws Exception {

    return new ResponseEntity<>(imageService.queryImages(image), HttpStatus.OK);

  }

  /**
   * Gets image by id.
   *
   * @param id the id from the path variable
   * @return the image with said id
   */
  @GetMapping(value = "/{id}")
  @ApiOperation("Finds an image by it's Id")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "OK", response = Image.class),
      @ApiResponse(code = 404, message = "NOT FOUND")
  })
  public ResponseEntity<byte[]> getImageById(@PathVariable Long id) throws Exception {

    return ResponseEntity
        .ok()
        .contentType(MediaType.IMAGE_JPEG)
        .body(imageService.getImageById(id));

  }

  @GetMapping(value = "/MenBasketballShoe",
      produces = MediaType.IMAGE_JPEG_VALUE)
  public ResponseEntity<byte[]> getImage() throws IOException {

    var imgFile = new ClassPathResource("image/MenBasketballShoe.jpg");
    byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

    return ResponseEntity
        .ok()
        .contentType(MediaType.IMAGE_JPEG)
        .body(bytes);
  }

}
