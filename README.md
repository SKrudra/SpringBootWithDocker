# SprintBootWithDocker
Basic Example of SpringBoot App as a Docker Image

1. Build the jar using mvn clean package
2. Build the Docker image using `docker build -t demo:1.0 .`
3. Run the Coker image using `docker run -p 8080:8080 demo:1.0`
4. Run the test.http test to verify the app is running and the /home endpoint is working.