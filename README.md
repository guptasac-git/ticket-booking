<h1 align="center">🛍️ Metro train booking system 🛒 </h1>

It's compiled and tested on JDK 17

### To Get Started ⚡

- Clone the `ticket-booking` repository using git:

```bash
git clone 

cd ticket-booking
```

Build using 

```bash
mvn clean compile install
```

after that run below command to build docker image

```bash
docker build -t guptasac/ticket-booking:1.0 -f Dockerfile .
```

- Run the backend application with this command:

```bash
docker run -d -p 3002:3002 -t guptasac/ticket-booking:1.0
```

- For pushing in docker hub

```bash
docker push guptasac/ticket-booking:1.0
```


- You can also run this application using maven

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
```


- Now the node server will be running at `http://localhost:8080/api/v1/metro/routes` (for server side development)


