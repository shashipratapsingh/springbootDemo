package com.SpringTest.Test.Repository;


import com.SpringTest.Test.Entities.ManegerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManegerRepository extends JpaRepository<ManegerEntity,Integer> {
}
