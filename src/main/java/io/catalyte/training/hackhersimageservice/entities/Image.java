package io.catalyte.training.hackhersimageservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Blob;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * image entity and all of its field
 */
@Entity
@Table(name = "image")
//@ApiModel(description = "All details about the image")
public class Image {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @ApiModelProperty(notes = GENERATED_ID)
  private Long id;

  private String productId;

//  @NotBlank(message = "type" + REQUIRED_FIELD)
//  @ApiModelProperty(notes = "the image type")
  private String type;

  private String category;

  private String demographic;

  private String imageFileName;

  public Image() {
  }

  public Image(String productId, String type, String category, String demographic,
      String imageFileName) {
    this.type = type;
    this.productId = productId;
    this.category = category;
    this.demographic = demographic;
    this.imageFileName = imageFileName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDemographic() {
    return demographic;
  }

  public void setDemographic(String demographic) {
    this.demographic = demographic;
  }

  public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }

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
        && Objects.equals(productId, image.productId) && Objects
        .equals(category, image.category) && Objects.equals(demographic, image.demographic)
        && Objects.equals(imageFileName, image.imageFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, productId, category, demographic, imageFileName);
  }

  @JsonIgnore
  public boolean isEmpty() {
    return Objects.isNull(id) &&
        Objects.isNull(type) &&
        Objects.isNull(productId) &&
        Objects.isNull(category) &&
        Objects.isNull(demographic) &&
        Objects.isNull(imageFileName);
  }
}
