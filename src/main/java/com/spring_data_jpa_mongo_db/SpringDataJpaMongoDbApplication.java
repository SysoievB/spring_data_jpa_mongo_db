package com.spring_data_jpa_mongo_db;

import com.spring_data_jpa_mongo_db.documents.Article;
import com.spring_data_jpa_mongo_db.documents.Author;
import com.spring_data_jpa_mongo_db.repo.ArticleRepo;
import com.spring_data_jpa_mongo_db.repo.AuthorRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.util.ArrayList;
import java.util.List;

@EnableMongoAuditing
@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataJpaMongoDbApplication implements CommandLineRunner {

    private final ArticleRepo articleRepo;
    private final AuthorRepo authorRepo;

    @PostConstruct
    public void init() {
        // --- Author 1 ---
        Author author1 = new Author(1L, "Alice", "alice@example.com", 0, true, new ArrayList<>());

        Article a1 = new Article(1L, "Mongo Intro", "MongoDB basics", null);
        Article a2 = new Article(2L, "Indexing in Mongo", "Speed up queries with indexes", null);
        Article a3 = new Article(3L, "Aggregation Framework", "Analytics with MongoDB", null);

        val articles1 = articleRepo.saveAll(List.of(a1, a2, a3));

        author1.setArticles(articles1);
        authorRepo.save(author1);

        // --- Author 2 ---
        Author author2 = new Author(2L, "Bob", "bob@example.com", 0, true, new ArrayList<>());

        Article b1 = new Article(4L, "Spring Boot with Mongo", "Integrate MongoDB easily", null);
        Article b2 = new Article(5L, "MongoTemplate Deep Dive", "When you need power", null);
        Article b3 = new Article(6L, "Text Search in Mongo", "Use text indexes for search", null);

        val articles2 = articleRepo.saveAll(List.of(b1, b2, b3));

        author2.setArticles(articles2);
        authorRepo.save(author2);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        authorRepo.findAll()
                .forEach(System.out::println);
    }
}
