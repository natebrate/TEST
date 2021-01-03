package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface speciesRepository extends JpaRepository<Species, Integer> {
}
