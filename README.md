## Random number generator tool web application.

This test project uses the following technologies:
- Java 21
- Spring Boot 3
- Spring Web
- junit5, mockito
- gradle
- jib
- junit5

### Development

1. Clone this repository.

2. Install Java 21, for example, using [SDKMan](https://sdkman.io/):
```
sdk install java 21.0.2-open
```

3. Build:
```
./geadlew build
```

4. Local run:
```
./gradlew bootRun
```

#### Using docker

1. Build docker image with jib:
```
./gradlew jibDockerBuild
```
2. Run docker image as a container:
```
docker run -p 8080:8080 random:0.0.1-SNAPSHOT
```

### Testing
```
curl http://localhost:8080/random
```

