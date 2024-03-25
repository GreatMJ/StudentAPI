package com.student.api.Student.API.controller;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.service.ExamService;
import com.student.api.Student.API.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
@Autowired
    StudentService studentService;
@Autowired
    ExamService examService;

    @PostMapping("/student/upload/")
    public String uploadStudent(@RequestBody Student student){
         studentService.saveStudent(student);
         return "Student got saved";
    }
    @GetMapping("/student/detail/")
    public Student getStudentById(@RequestParam String id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/marks/update")
    public void updateMarks(@RequestParam String id,@RequestParam int marks){
         studentService.updateStudentResultById(id,marks);
    }

    @GetMapping("/student/marks")
    public Integer getStudentResultById(@RequestParam String id){
        return examService.getStudentResultById(id);
    }
}
