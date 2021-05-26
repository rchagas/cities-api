package com.github.rchagas.citiesapi.repositories;

import com.github.rchagas.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
