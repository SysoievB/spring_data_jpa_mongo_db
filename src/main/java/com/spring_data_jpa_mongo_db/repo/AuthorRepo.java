package com.spring_data_jpa_mongo_db.repo;

import com.spring_data_jpa_mongo_db.documents.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepo extends MongoRepository<Long, Author> {
}
