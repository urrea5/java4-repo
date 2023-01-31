FROM amazoncorretto:19.0.1
ENV PATH=${PATH}:${JAVA_HOME}/bin
COPY target/java4-0.0.1-SNAPSHOT.jar /temp/app.t5u
EXPOSE 8080
ENTRYPOINT ["java","-jar","temp/app.jar"]
