# Stage 1: Build the application with Maven
FROM maven:3.8.1-openjdk-17-slim AS build
COPY . .
RUN mvn clean package
# Stage 2: Create a minimal JRE image
FROM openjdk:17-slim
ARG JAR_FILE=target/*.jar
COPY --from=build /target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]