package io.catalyte.training.hackhersimageservice.entities;

import java.sql.Blob;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * image
 */
@Entity
@Table(name = "image")
//@ApiModel(description = "All details about the image")
public class Image {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @ApiModelProperty(notes = GENERATED_ID)
  private Long id;

//  @NotBlank(message = "type" + REQUIRED_FIELD)
//  @ApiModelProperty(notes = "the image type")
  private String type;

  private String category;

  private String demographic;

  private String imageFileName;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(id, image.id) && Objects.equals(type, image.type)
        && Objects.equals(category, image.category) && Objects
        .equals(demographic, image.demographic) && Objects
        .equals(imageFileName, image.imageFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, category, demographic, imageFileName);
  }

  public boolean isEmpty() {
    return Objects.isNull(id) &&
        Objects.isNull(type) &&
        Objects.isNull(category) &&
        Objects.isNull(demographic) &&
        Objects.isNull(imageFileName);
  }
}
