// Ensured clean separation between layers
package com.example.lendingsystem.repository;

import com.example.lendingsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
