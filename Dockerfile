# Start with a lightweight base image
FROM ubuntu:20.04

# Update package list and install dependencies
RUN apt-get update -y && apt-get upgrade -y && \
    apt-get install -y openjdk-17-jdk maven && \
    apt-get clean

# Create a working directory
WORKDIR /app

# Copy all files to the container
COPY . .

# Build the application
RUN mvn clean package

# Move the generated JAR file to the working directory
RUN mv target/portfolio-with-spring-0.0.1-SNAPSHOT.jar /app/portfolio-with-spring.jar

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/portfolio-with-spring.jar"]
