
FROM maven:4.0.0

RUN evn clean package -DskipTests

FROM eclipse-temurin:8-jdk

COPY target/second-service-0.0.1-SNAPSHOT.jar second-service-1.0.0.jar

//EXPOSE 8080

ENTRYPOINT ["java", "-jar", "second-service-1.0.0.jar"]


