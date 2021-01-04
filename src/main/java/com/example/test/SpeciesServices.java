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
//We create this class for the purpose of extensibility in future.
public class SpeciesServices {
    //we inject an instance of Species Repository via private field using @Autowired
    @Autowired
    private SpeciesRepository repository;
    //Retrieve All Elements From the Species Table
    public List<Species> listAll() {
        return repository.findAll();
    }

    //Save the Species Member
    public void save(Species species) {
        repository.save(species);
    }

    //Search for particular Species ID
    public Species get(int specID) {
        return repository.findById(specID).get();
    }

    //DELETE THE Species MEMBER
    public void delete(int specID) {
        repository.deleteById(specID);
    }

}
