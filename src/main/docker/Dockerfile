FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD microservice-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]