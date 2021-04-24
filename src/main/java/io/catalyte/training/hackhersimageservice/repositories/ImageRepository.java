package io.catalyte.training.hackhersimageservice.repositories;

import io.catalyte.training.hackhersimageservice.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
