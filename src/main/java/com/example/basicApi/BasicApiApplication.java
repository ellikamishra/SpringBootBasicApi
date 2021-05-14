package com.example.basicApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.basicApi.entities.Techniques;
import com.example.basicApi.repository.TechRepository;

@SpringBootApplication

public class BasicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApiApplication.class, args);
	}

}
