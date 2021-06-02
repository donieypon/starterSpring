package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Data access layer

// type: student
// id: Long (student id is of type long)
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
