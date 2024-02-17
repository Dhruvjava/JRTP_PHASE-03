FROM openjdk:17-alpine

ARG JAR_FILE=target/payment-service.jar

ADD ${JAR_FILE} paymentservice.jar

ENTRYPOINT ["java", "-jar", "paymentservice.jar"]
