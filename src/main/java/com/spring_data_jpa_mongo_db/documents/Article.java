package com.spring_data_jpa_mongo_db.documents;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "articles")
public class Article {

    @Id
    Long id;
    String title;
    @TextIndexed
    String text;
    @CreatedDate
    Instant createdAt;
}
