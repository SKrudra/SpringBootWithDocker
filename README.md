# SpringBootWithDocker
Basic Example of SpringBoot App as a Docker Image. It contains rest endpoints that fetch/save data from/to a PostgreSQL DB.
Docker Compose is used to build both Docker images together to run as a project.

## Basic REST endpoint returning "Hello World!" from the SpringBoot server itself
1. Build the jar using `mvn clean package -DskipTests`
2. Build the Docker image using `docker build -t demo:1.0 .`
3. Run the Coker image using `docker run -p 8080:8080 demo:1.0`
4. Run the test.http test to verify the app is running and the /home endpoint is working.

## Adding PostgreSQL and Docker Compose to build the end-to-end integration
1. Build the jar using `mvn clean package -DskipTests`
2. Build the Docker images using `docker-compose up --build`
3. Run the students.http test to verify the app is running and the /students endpoint is returning a list of students from the DB.

### NOTE: 
* If `postgres` does not work in the connection string, use your local IP address; localhost or 127.0.0.1 will also not work.
* We are skipping the tests as unit testing is out of scope for this project.
