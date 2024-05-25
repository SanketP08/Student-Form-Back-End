package com.CodeWithSanket.StudentsForm.Service;

import com.CodeWithSanket.StudentsForm.Model.Student;
import com.CodeWithSanket.StudentsForm.StudentsFormApplication;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
