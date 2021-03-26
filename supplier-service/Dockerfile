FROM gradle:jdk11 as builder
WORKDIR /app
COPY . /app
RUN gradle build
FROM adoptopenjdk/openjdk11:alpine-slim
COPY --from=builder /app/build/libs/*.jar /app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar --spring.profiles.active=docker"]
