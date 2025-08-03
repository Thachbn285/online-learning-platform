FROM openjdk:17-jdk-alpine

WORKDIR /myapp

COPY target/online-learning-platform-0.0.1-SNAPSHOT.jar myapp.jar

EXPOSE 8080

CMD ["java","-jar","myapp.jar"]

#docker build -t myapp .
#docker tag myapp:latest thachbn/myapp
#docker login
#docker push thachbn/myapp:latest

