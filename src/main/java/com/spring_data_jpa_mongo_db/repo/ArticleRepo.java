package com.spring_data_jpa_mongo_db.repo;

import com.spring_data_jpa_mongo_db.documents.Article;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepo extends MongoRepository<Article, Long> {

    List<Article> findByTitle(String title);

    List<Article> findAllBy(TextCriteria criteria);
}
