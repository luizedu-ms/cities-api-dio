package com.github.luizedums.citiesapi.countries.repository;

import com.github.luizedums.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
