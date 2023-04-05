package com.demojpa.demo.controller;

import com.demojpa.demo.dao.StudentDao;
import com.demojpa.demo.entity.Student;
import com.demojpa.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;
    @PostMapping("/save")
    public Student saveStudentInfo(@RequestBody Student student){
        return studentDao.saveStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentDao.retrieveStudents();
    }

    @GetMapping("/getStudents/{firstName}/{lastName}")
    public List<Student> findByFNameAndLName(@PathVariable String firstName,
                                             @PathVariable String lastName){
        return studentDao.findByFNameAndLName(firstName,lastName);
    }
}
