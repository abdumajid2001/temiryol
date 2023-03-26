FROM openjdk:17
ADD target/temiryol-0.0.1-SNAPSHOT.jar temiryol.jar
ENTRYPOINT ["java","-jar", "/temiryol.jar"]
