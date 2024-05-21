# Student CRUD RestAPi

## Demo Video
https://github.com/Avinash4231/Dockernize-studentcrud-api-using-spring-boot/assets/119235391/ba3a9ce9-0a6d-45b5-8685-31cde5cd8740


#### Prerequisite

Installed: Docker, Java 1.8, Maven 3.x


## Introduction

 Crud Operation Spring Boot with Docker

#### Steps

##### Clone source code from git
```
$  git clone https://github.com/Avinash4231/Dockernize-studentcrud-api-using-spring-boot.git .
```
##### Build project with Maven
```
$ mvn clean install
#should be maven test closed (skip test)
#IntelijIDEA steps -> File -> Settings -> Build,Execituion.. -> Build Tools -> Maven -> Runner -> Properties -> Skip Test (Should be Checked)
```
##### Up docker-compose
```
$ docker-compose up -d
#If your spring boot exit(stopped)
#IntelijIDEA steps -> File -> Settings -> Build,Execituion.. -> Docker -> Unix Socket (Should be Checked)
```

##### Test application
for test the running docker image
```
$ docker image ls
```
for test the running docker container
```
$ docker container ps
```
for test the running docker-compose
```
$ docker-compose ps
```



​    
