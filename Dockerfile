# FROM openjdk:19-jdk-alpine3.16 as build

# WORKDIR /app

# COPY target/online-learning-platform-0.0.1-SNAPSHOT.jar app.jar
# online-learning-platform-0.0.1-SNAPSHOT.jar
# EXPOSE 8080

# CMD ["java","-jar","app.jar"]

# #docker build -t app .
# #docker tag app:latest bnthach/app
# #docker login
# #docker push bnthach/app:latest
# Stage 1: Build jar file
FROM openjdk:19-jdk-alpine3.16 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run app
FROM openjdk:19-jdk-alpine3.16
WORKDIR /app
COPY --from=build /app/target/online-learning-platform-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
