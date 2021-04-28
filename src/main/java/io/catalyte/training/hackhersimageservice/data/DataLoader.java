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

    image1 = imageRepository.save(new Image("", "", "", "", "https://www.tibs.org.tw/images/default.jpg"));
    image2 = imageRepository.save(new Image("", "Shoe", "Soccer", "Women", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSunetQnLHq-4zWbi-GY8Sc2H0H79zQkoOa6YQtmGMhPmcuJVZhp2UvPsByqcMXuslewZI&usqp=CAU"));
    image3 = imageRepository.save(new Image("", "Sock", "", "Kids", "https://solidus-data-migrate.s3.amazonaws.com/spree/products/36317/large/KidsBestFriend-YouthCrewSocks-YC0045-JC0045-MODEL-FRONT.jpg?1598908106"));

  }
}
