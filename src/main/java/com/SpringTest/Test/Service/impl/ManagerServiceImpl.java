package com.SpringTest.Test.Service.impl;

import com.SpringTest.Test.Entities.ManegerEntity;
import com.SpringTest.Test.Repository.ManegerRepository;
import com.SpringTest.Test.Service.ManegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManegerService {

    @Autowired
    private ManegerRepository manegerRepository;
    public ManegerEntity addManager(ManegerEntity manegerEntity)
    {
        return manegerRepository.save(manegerEntity);
    }
}
