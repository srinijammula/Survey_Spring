FROM openjdk:17
EXPOSE 8080
ADD /target/Survey_Spring-0.0.1-SNAPSHOT.jar Survey_Spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Survey_Spring-0.0.1-SNAPSHOT.jar"]
