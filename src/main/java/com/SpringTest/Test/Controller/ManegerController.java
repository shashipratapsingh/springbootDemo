package com.SpringTest.Test.Controller;


import com.SpringTest.Test.Dto.ManagerDto;
import com.SpringTest.Test.Entities.ManegerEntity;
import com.SpringTest.Test.Repository.ManegerRepository;
import com.SpringTest.Test.Service.ManegerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Manager")
public class ManegerController {
    @Autowired
    private ManegerService manegerService;
    @Autowired
    private ModelMapper modelMapper;
    @PostMapping("/addManager")
    public ManegerEntity addManager(@RequestBody ManagerDto managerDto)  {
        return manegerService.addManager(modelMapper.map(managerDto, ManegerEntity.class));
    }

  /*  @PostMapping("/addManager")
    public ResponseEntity addManager1(@RequestBody ManagerDto managerDto) {
        ManegerEntity manegerEntity = modelMapper.map(managerDto, ManegerEntity.class);
        ManegerEntity sss = manegerService.addManager(manegerEntity);
         return ResponseEntity.ok(new HttpStatus<sss>("ok"));
        //  return new ResponseEntity<String>("added Data", (HttpStatus) manegerEntity, HttpStatus.CREATED);


    }*/


    fsfasdfasdsdfdfasdfasdfsadf



}
