package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
SERVICES FOR THE ANIMAL TABLE
 */
@Service
@Transactional

//We create this class for the purpose of extensibility in future.
public class AnimalServices {

    //we inject an instance of AnimalRepository via private field using @Autowired
    @Autowired
    private AnimalRepository repo;

    //Retrieve All Elements From the Animal Table
    public List<Animal> listAll() {
        return repo.findAll();
    }

    //Save the Animal Member
    public void save(Animal animal) {
        repo.save(animal);
    }

    //Search for particular AnimalID
    public Animal get(long animalID) {
        return repo.findById(animalID).get();
    }

    //DELETE THE Animal MEMBER
    public void delete(long animalID) {
        repo.deleteById(animalID);
    }



}
