package com.malhar_agency.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malhar_agency.entities.Image;
@Repository
public interface IImageDao extends JpaRepository<Image, Long> {

}
