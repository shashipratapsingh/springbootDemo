package com.SpringTest.Test.Controller;

import com.SpringTest.Test.Entities.StudentRegistration;
import com.SpringTest.Test.Repository.StudentRepository;
import com.SpringTest.Test.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public StudentRegistration addStudent(@RequestBody StudentRegistration studentRegistration)
    {
        return this.studentService.addStudent(studentRegistration);
    }
}
