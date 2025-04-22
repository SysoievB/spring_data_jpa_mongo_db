package com.spring_data_jpa_mongo_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class SpringDataJpaMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);
    }

}
