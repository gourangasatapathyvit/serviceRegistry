FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} serviceRegistry.jar
ENTRYPOINT ["java","-jar","/serviceRegistry.jar"]
EXPOSE 8761