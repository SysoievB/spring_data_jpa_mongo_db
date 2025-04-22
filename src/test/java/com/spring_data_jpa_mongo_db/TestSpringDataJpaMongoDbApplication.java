package com.spring_data_jpa_mongo_db;

import org.springframework.boot.SpringApplication;

public class TestSpringDataJpaMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringDataJpaMongoDbApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
