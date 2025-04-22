package com.spring_data_jpa_mongo_db.repo;

import com.spring_data_jpa_mongo_db.documents.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepo extends MongoRepository<Long, Article> {
}
