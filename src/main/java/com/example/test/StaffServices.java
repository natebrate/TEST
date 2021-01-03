package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffServices {

    @Autowired
    private StaffRepository repo;

    //Retrieve All Elements From the Staff Table
    public List<Staff> listAll() {
        return repo.findAll();
    }

    //Save the Staff Member
    public void save(Staff staff) {
        repo.save(staff);
    }

    public Staff get(long StaffID) {
        return repo.findById(StaffID).get();
    }

    // DELETE THE STAFF MEMBER
    public void delete(long StaffID) {
        repo.deleteById(StaffID);
    }
}
