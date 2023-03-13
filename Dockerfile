FROM openjdk:17
EXPOSE 8080
ADD target/spring-docker-k8s.jar spring-docker-k8s.jar
ENTRYPOINT ["java", "-jar", "spring-docker-k8s.jar"]