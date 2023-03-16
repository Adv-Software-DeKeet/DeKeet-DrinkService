FROM openjdk:19-jdk-alpine
MAINTAINER JoviSimons
COPY target/DrinkService-0.0.1-SNAPSHOT.jar DrinkService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DrinkService-0.0.1-SNAPSHOT.jar"]FROM openjdk:19-jdk-alpine