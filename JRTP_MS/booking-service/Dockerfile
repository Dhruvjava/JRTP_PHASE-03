FROM openjdk:17-alpine

ARG JAR_FILE=target/booking-service.jar

ADD ${JAR_FILE} bookingservice.jar

ENTRYPOINT ["java", "-jar", "bookingservice.jar"]
