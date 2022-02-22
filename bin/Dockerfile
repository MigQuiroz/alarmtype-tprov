FROM openjdk:11
VOLUME /tmp
EXPOSE 8084
ARG JAR_FILE=target/alarmtype-tprov-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} alarmtype-tprov.jar
ENTRYPOINT ["java","-jar","alarmtype-tprov.jar"]
