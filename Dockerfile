FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar /
ENTRYPOINT ["java","-jar","/logs-study-0.0.1-SNAPSHOT.jar"]