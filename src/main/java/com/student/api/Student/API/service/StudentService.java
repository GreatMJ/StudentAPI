package com.student.api.Student.API.service;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.saveStudent(student);
    }

    public Student getStudentById(String id){
        return studentRepository.getStudentById(id);
    }

    public void updateStudentResultById(String id,int marks){
        studentRepository.updateStudentResultById(id,marks);
    }
}
