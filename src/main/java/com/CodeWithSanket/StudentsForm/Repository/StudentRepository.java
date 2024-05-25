package com.CodeWithSanket.StudentsForm.Repository;

import com.CodeWithSanket.StudentsForm.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
