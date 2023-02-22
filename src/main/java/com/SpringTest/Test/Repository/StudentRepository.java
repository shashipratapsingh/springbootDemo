package com.SpringTest.Test.Repository;

import com.SpringTest.Test.Entities.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentRegistration,Integer> {
}
