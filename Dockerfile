#FROM maven:3.9.4-eclipse-temurin-20-alpine

#WORKDIR /virtual-threads
#COPY . .
#RUN mvn clean install

#CMD mvn spring-boot:run

#
# Build stage
#
FROM maven:3.9.4-eclipse-temurin-20-alpine AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app/target/virtual-threads.jar"]