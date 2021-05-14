package com.example.basicApi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.basicApi.entities.Techniques;
import com.example.basicApi.repository.TechRepository;
@RestController
public class TechController {
    @Autowired
    private TechRepository techRepository;
    @GetMapping("/count")
    public long CountAll(){
        return techRepository.count();
    }
    @GetMapping("/findAll")
    public Iterable<Techniques> findAllTechniques(){
        return techRepository.findAll();
    }

    @GetMapping("/findid/{id}")
    public List<Techniques> findid(@PathVariable String id){
        return techRepository.findByid(id);
    }

//    @GetMapping("/findTech/{TechniqueName}")
//    public List<Techniques> findTech(@PathVariable String TechniqueName){
//        return techRepository.findByTechniqueName(TechniqueName);
//    }
}
