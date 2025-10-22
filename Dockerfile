FROM openjdk:latest
ADD target/student-demo.jar student-demo.jar
ENTRYPOINT ["java", "-jar", "/student-demo.jar"]