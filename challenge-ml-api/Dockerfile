FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD ./target/challenge-ml-api-0.0.1-SNAPSHOT.jar challenge-ml-api.jar
ENTRYPOINT [ "java", "-jar", "/challenge-ml-api.jar" ]