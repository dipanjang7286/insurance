FROM openjdk
LABEL maintainer = insurance.in
ADD target/insurance-0.0.1-SNAPSHOT.jar insurance-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "insurance-0.0.1-SNAPSHOT.jar"]