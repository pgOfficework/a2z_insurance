FROM openjdk:17-alpine
ADD target/*.jar app.jar
ENTRYPOINT ["sh","-c","java -jar /app.jar"]