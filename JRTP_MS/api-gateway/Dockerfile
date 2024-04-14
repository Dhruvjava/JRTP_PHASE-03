FROM openjdk:17

ARG JAR_FILE=.//target/api-gateway.jar

ADD ${JAR_FILE} apigateway.jar

ENTRYPOINT ["java", "-jar", "apigateway.jar"]
