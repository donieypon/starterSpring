package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Data access layer

// type: student
// id: Long (student id is of type long)
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // find user by email
    //    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
