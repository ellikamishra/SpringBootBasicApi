package com.example.basicApi.repository;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.basicApi.entities.Techniques;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;


public interface TechRepository extends ElasticsearchRepository<Techniques,String>{
    List<Techniques>findByid(String id);
//    List<Techniques>findByTechniqueName(String Techniquame);

}
