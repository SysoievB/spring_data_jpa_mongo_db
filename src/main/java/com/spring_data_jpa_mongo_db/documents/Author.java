package com.spring_data_jpa_mongo_db.documents;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "authors")
public class Author {

    @Id
    Long id;
    String name;
    @Indexed(unique = true)
    String email;
    @Field(name = "article_count")
    Integer articleCount;
    Boolean active;
    @DBRef(lazy = true)
    List<Article> articles;

}
