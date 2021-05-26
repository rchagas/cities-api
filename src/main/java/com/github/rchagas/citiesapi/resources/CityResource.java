package com.github.rchagas.citiesapi.resources;

import com.github.rchagas.citiesapi.entities.City;
import com.github.rchagas.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

  @Autowired
  private CityRepository repository;

  @GetMapping
  public Page<City> cities (Pageable page) { return repository.findAll(page); }

  @GetMapping("/{id}")
  public City getOne (@PathVariable Long id){
    Optional<City> optional = repository.findById(id);
    return optional.get();
  }
}
