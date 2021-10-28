FROM openjdk:8
ADD target\jenkins-app2-0.0.1-SNAPSHOT.jar jenkins-app2-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","jenkins-app2-0.0.1-SNAPSHOT.jar"]