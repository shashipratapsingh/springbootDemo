package com.SpringTest.Test.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="studentRegistration")
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentRegNo;
    private  String studentName;
    private String studentAddress;

   // @OneToMany
    //private StudentRegistration studentRegistration;
}
