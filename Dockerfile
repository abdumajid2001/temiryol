FROM eclipse-temurin:17-jdk-focal
ADD target/temiryol-0.0.1-SNAPSHOT.jar temiryol-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "temiryol-0.0.1-SNAPSHOT.jar"]
