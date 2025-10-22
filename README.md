# SprintBootWithDocker
Basic Example of SpringBoot App as a Docker Image. It contains rest endpoints that fetches data from a PostgreSQL DB.
Docker compose is used to build the both the docker images together to run as a project.

## Basic REST endpoint returning Hello Word from the SpringBoot server itself
1. Build the jar using mvn clean package
2. Build the Docker image using `docker build -t demo:1.0 .`
3. Run the Coker image using `docker run -p 8080:8080 demo:1.0`
4. Run the test.http test to verify the app is running and the /home endpoint is working.

## Adding PostgreSQL and Docker compose to build the end-to-end integration
1. Build the jar using mvn clean package
2. Build the Docker images using `docker-compose up --build`
3. Run the students.http test to verify the app is running and the /students endpoint is returning list of students from the DB.

### NOTE: 
* If postgres does not work in the connection string, then use you local ip address; localhost or 127.0.0.1 will also not work.