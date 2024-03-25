package com.student.api.Student.API.repository;

import com.student.api.Student.API.models.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    private HashMap<String,Student> db=new HashMap<String, Student>();
    private  HashMap<String,Integer> resultDB=new HashMap<>();
    public void saveStudent(Student student){
        String id=student.getId();

        db.put(id,student);

    }

    public Student getStudentById(String id){
       Student student =db.get(id);
       return student;
    }

    public Integer getStudentResultById(String id){
        return resultDB.get(id);
    }

   public void updateStudentResultById(String id,int marks){
        resultDB.put(id,marks);
   }


}
