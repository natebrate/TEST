package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/*
SERVICES FOR THE SPECIES TABLE
 */
@Service
@Transactional
public class SpeciesServices {
    //we inject an instance of Species Repository via private field using @Autowired
    @Autowired
    private SpeciesRepository repo;
    //Retrieve All Elements From the Species Table
    public List<Species> listAll() {
        return repo.findAll();
    }

    //Save the Species Member
    public void save(Species species) {
        repo.save(species);
    }

    //Search for particular Species ID
    public Species get(int SpecID) {
        return repo.findById(SpecID).get();
    }

    //DELETE THE Species MEMBER
    public void delete(int SpecID) {
        repo.deleteById(SpecID);
    }

}
