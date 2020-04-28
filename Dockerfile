FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/spring-angular-app.jar spring-angular-app.jar
ENTRYPOINT ["java", "-jar", "spring-angular-app.jar"]
