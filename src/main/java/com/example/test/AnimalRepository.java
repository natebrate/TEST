package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Repository for the Animal Table

JpaRepository defines standard CRUD methods, plus JPA-specific operations
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
