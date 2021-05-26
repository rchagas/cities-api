package com.github.rchagas.citiesapi.resources;

import com.github.rchagas.citiesapi.entities.State;
import com.github.rchagas.citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

  @Autowired
  private StateRepository repository;

  @GetMapping
  public Page<State> states (Pageable page) { return repository.findAll(page); }

  @GetMapping ("/{id}")
  public State getOne (@PathVariable Long id){
	Optional<State> optional = repository.findById(id);
	return optional.get();
  }
}
