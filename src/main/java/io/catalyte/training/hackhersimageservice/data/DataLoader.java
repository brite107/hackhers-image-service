package io.catalyte.training.hackhersimageservice.data;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * dataloader loads data in the database when the application is run
 */
@Component
public class DataLoader implements CommandLineRunner {

  @Autowired
  private ImageRepository imageRepository;

  private Image image1;
  private Image image2;
  private Image image3;
  private Image image4;
  private Image image5;

  /**
   * class which loads the images
   * @param args
   * @throws Exception
   */
  @Override
  public void run(String... args) throws Exception {
    loadImages();
  }

  private void loadImages() {

    image1 = imageRepository.save(new Image("Shoe", "Basketball", "Men", "src/main/resources/image/MenBasketballShoe.jpg"));
    image2 = imageRepository.save(new Image("Shoe", "Basketball", "Men", "src/main/resources/image/MenBasketballShoe.jpg"));
    image3 = imageRepository.save(new Image("Shoe", "Basketball", "Men", "src/main/resources/image/MenBasketballShoe.jpg"));
    image4 = imageRepository.save(new Image("Shoe", "Basketball", "Men", "src/main/resources/image/MenBasketballShoe.jpg"));
    image5 = imageRepository.save(new Image("Shoe", "Basketball", "Men", "src/main/resources/image/MenBasketballShoe.jpg"));

  }
}
