package com.SpringTest.Test.Service;


import com.SpringTest.Test.Entities.ManegerEntity;
import com.SpringTest.Test.Service.impl.ManagerServiceImpl;
import org.springframework.stereotype.Service;


public interface ManegerService{
    public ManegerEntity addManager(ManegerEntity manegerEntity);

}
