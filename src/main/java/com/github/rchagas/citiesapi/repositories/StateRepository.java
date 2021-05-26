package com.github.rchagas.citiesapi.repositories;

import com.github.rchagas.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
