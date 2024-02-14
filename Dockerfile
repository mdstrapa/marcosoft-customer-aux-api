# Use a lightweight JDK image as the base image for runtime
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled application JAR file from the previous stage
COPY target/marcosoft-customer-aux-api-0.0.1-SNAPSHOT.jar ./app.jar

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]