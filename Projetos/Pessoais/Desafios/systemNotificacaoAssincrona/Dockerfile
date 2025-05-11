# Etapa 1: build com Maven + Java 21
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: runtime com JDK 21
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/systemNotificacaoAssincrona-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
