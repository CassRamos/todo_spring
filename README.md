<h1 align="center"> To do API </h1>
<p align="center">
  <a href="#-tecnologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>
  <p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>
</p>

<br>

## 🚀 Tecnologies

A simple project using docker and swagger to test endpoints.

- Java & Spring Boot
- MySQL
- Docker
- Swagger 
- Git & Github 

 <br>

## 💻 Project

This project simulates a basic to-do API that allows users to manage their tasks. Users can create, read, update, and delete tasks, enabling efficient task organization and tracking.

<br>

## :memo: License


This project is under license from MIT

<br>

## Endpoints 
<p>All endpoints are provided by swagger when you run the application. </p>

<br>

<p> Simply input your username, password, and database name in the compose.yaml file, and copy these configurations into the application.properties file. </p>

### Docker
 
```sh
services:
  db:
    image: "mysql:latest"
    environment:
      - 'MYSQL_DATABASE=<yourDb>'
      - 'MYSQL_USER=<yourUser>'
      - 'MYSQL_PASSWORD=<yourPass>'
      - 'MYSQL_ROOT_PASSWORD=verySecret'
    ports:
      - '3306:3306'
```

<p> And run on terminal: </p>

```sh
  docker compose up -d
```

<br>

### Application.properties
```sh
    docker compose up -dspring.datasource.url=jdbc:mysql://localhost:3306/<yourDb>
    spring.datasource.username=<yourUser>
    spring.datasource.password=<yourPass>
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql:true
```

<br>

### Application.properties

<p> Swagger port: </p>

```sh
http://localhost:8080/swagger-ui/index.html
```
<br>

<p>Thanks for your attention, see you next time 💜</p>

