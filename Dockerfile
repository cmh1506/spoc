FROM openjdk:11.0.1-jre
#ARG JAR_FILE=target/*.jar
COPY target/spoc-0.0.1-SNAPSHOT.war app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
