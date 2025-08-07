FROM openjdk:19-jdk-alpine3.16

WORKDIR /app

COPY target/online-learning-platform-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java","-jar","app.jar"]

#docker build -t app .
#docker tag app:latest bnthach/app
#docker login
#docker push bnthach/app:latest

