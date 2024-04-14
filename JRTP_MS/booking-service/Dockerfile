FROM openjdk:17-jdk-slim

ARG JAR_FILE=./target/booking-service.jar

ADD ${JAR_FILE} bookingservice.jar

ENTRYPOINT ["java", "-jar", "bookingservice.jar"]
