#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# Add the application's jar to the image
COPY target/spring_data_jpa_mongo_db-0.0.1-SNAPSHOT.jar spring_data_jpa_mongo_db-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "spring_data_jpa_mongo_db-0.0.1-SNAPSHOT.jar"]

# Expose the application port
EXPOSE 8080
# for build --> docker build -t spring_data_jpa_mongo_db .
# for run --> docker run -d --rm -p 8080:8080 --name spring_data_jpa_mongo_db spring_data_jpa_mongo_db