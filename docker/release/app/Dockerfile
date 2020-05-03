FROM alpine:3.7

RUN apk add openjdk11 --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community

ADD build/libs/juxta-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

EXPOSE 8080
