package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Repository for the Species Table

JpaRepository defines standard CRUD methods, plus JPA-specific operations
 */
@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

}
