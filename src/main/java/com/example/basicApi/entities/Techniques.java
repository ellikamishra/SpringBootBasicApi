package com.example.basicApi.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "mitre123")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Techniques {
    @Id
    private String id;
    private String description;
    private String tactic;
    private String techniquename;
}
