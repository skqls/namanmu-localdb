package com.example.namanmu.domain.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Cacheable(value = "student", key = "#id")
    public Student findStudentById(String id){

        return studentRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }


}