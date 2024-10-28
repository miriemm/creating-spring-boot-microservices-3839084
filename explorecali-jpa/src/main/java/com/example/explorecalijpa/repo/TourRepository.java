package com.example.explorecalijpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {
  List<Tour> findAllByDifficulty(String difficulty);
  List<Tour> findAllByTourPackageCode(String code);
}