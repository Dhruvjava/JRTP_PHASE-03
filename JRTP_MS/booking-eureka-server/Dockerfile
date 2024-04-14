FROM openjdk:17
ARG  JAR_FILE=./target/booking-eureka-server.jar

ADD ${JAR_FILE} bookingeurekaserver.jar
ENTRYPOINT ["java", "-jar", "bookingeurekaserver.jar"]
