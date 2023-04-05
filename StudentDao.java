package com.demojpa.demo.dao;

import com.demojpa.demo.entity.Student;
import com.demojpa.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        Student student1=studentRepository.save(student); //insert into db
        return student1;
    }

    public List<Student> retrieveStudents(){
        return studentRepository.findAll();
    }

    public List<Student> findByFNameAndLName(String firstName,String lastName){
        return studentRepository.findByFirstNameAndLastName(firstName,lastName);
    }
}
