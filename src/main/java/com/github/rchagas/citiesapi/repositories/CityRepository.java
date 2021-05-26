package com.github.rchagas.citiesapi.repositories;

import com.github.rchagas.citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
