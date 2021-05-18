package com.github.luizedums.citiesapi.states.respository;

import com.github.luizedums.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
