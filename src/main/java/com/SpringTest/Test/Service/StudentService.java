package com.SpringTest.Test.Service;

import com.SpringTest.Test.Entities.StudentRegistration;
import com.SpringTest.Test.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public StudentRegistration addStudent(StudentRegistration studentRegistration)
    {
        return this.studentRepository.save(studentRegistration);
    }
}
