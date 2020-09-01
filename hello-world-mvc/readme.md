# Hello World Rest API

### Building an Image

1. Build a Jar - /target/hello-world-rest-api.jar
2. Setup the Prerequisites for Running the JAR - openjdk:8-jdk-alpine
3. Copy the jar
4. Run the jar

### Docker Commands - Creating Image Manually

- docker run -dit openjdk:8-jdk-alpine
- docker container exec naughty_knuth ls /tmp
- docker container cp target/hello-world-rest-api.jar naughty_knuth:/tmp
- docker container exec naughty_knuth ls /tmp
- docker container commit naughty_knuth <dockerhubid>/hello-world-mvc:manual1
- docker run in28min/hello-world-mvc:manual1
- docker container ls
- docker container commit --change='CMD ["java","-jar","/tmp/hello-world-mvc.jar"]' naughty_knuth <dockerhubid>/hello-world-mvc:manual2
- docker run -p 8080:8080 <dockerhubid>/hello-world-mvc:manual2



## Docker File

### Basic
```
FROM openjdk:latest
EXPOSE 8080
ADD target/hello-world-rest-api.jar hello-world-rest-api.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world-rest-api.jar"]
```


## Build Docker Image
docker build -t <dockerhubid>/hello-world-mvc:latest


## Run Docker Image
docker run -p 8080:8080 <dockerhubid>/hello-world-mvc:latest

