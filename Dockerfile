FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY school-service-0.0.1-SNAPSHOT.jar school-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/school-service-0.0.1-SNAPSHOT.jar"]