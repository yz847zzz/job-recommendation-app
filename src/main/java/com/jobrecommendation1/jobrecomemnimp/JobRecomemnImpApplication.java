package com.jobrecommendation1.jobrecomemnimp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.jobrecommendation1.jobrecomemnimp.model") // Ensures entities are scanned
public class JobRecomemnImpApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobRecomemnImpApplication.class, args);
    }
}
