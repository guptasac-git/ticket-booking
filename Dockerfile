FROM adoptopenjdk/openjdk11:alpine-jre
#FROM openjdk:17-alpine

LABEL author="Sachin Gupta <sachintrue@gmail.com>"

# Refer to Maven build -> finalName
ARG JAR_FILE=target/ticket-booking-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

EXPOSE 3003

COPY ${JAR_FILE} ticket-booking.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","ticket-booking.jar"]