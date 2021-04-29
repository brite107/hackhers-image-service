package io.catalyte.training.hackhersimageservice.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import io.catalyte.training.hackhersimageservice.entities.Image;
import io.catalyte.training.hackhersimageservice.repositories.ImageRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ImageServiceImplTest {

  @Mock
  ImageRepository mockImageRepository;

  @InjectMocks
  ImageServiceImpl mockImageServiceImpl;

  List<Image> imageList = new ArrayList<>();

  Image imageOne = new Image();

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    imageOne.setId(1L);
    imageOne.setDemographic("Kids");
    imageOne.setType("");
    imageOne.setCategory("");
    imageOne.setProductId("");

    imageList.add(imageOne);

    //when statements for happy paths
//    when()
  }

  @Test
  public void queryImages() {
  }

  @Test
  public void getImageById() {
  }
}