# Use an official Java runtime as a base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/Scientific_Calculator-1.0-SNAPSHOT.jar calculator.jar

# Run the Java application
CMD ["java", "-jar", "calculator.jar"]
