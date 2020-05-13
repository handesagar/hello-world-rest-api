FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8081
ADD target/*.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -Dspring.profiles.active=dev -jar /app.jar