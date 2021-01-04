package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Repository for the Staff Table

JpaRepository defines standard CRUD methods, plus JPA-specific operations
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    /*
    As you can see, this interface extends the JpaRepository interface from Spring Data JPA.
    JpaRepository defines standard CRUD methods, plus JPA-specific operations.
    We don’t have to write implementation code because Spring Data JPA will generate necessary code at runtime,
    in form of proxy instances.

    So the purpose of writing the repository interface is to tell Spring Data JPA about the domain type (Staff) and ID type (long) to work with.
     */

}
