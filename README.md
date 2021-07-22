# songr-

# LAB 11
## Architecture
The programing languages used to build this project are Java, HTML and CSS.

## Overview

 in this project, I Used the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf and Devtools dependencies. 
 First  I downloaded the zip file and extract the directory it contains. then added it to my repo, and statrted.

## Methods

in HelloController Class 

First I used @Controller  to implement Web Application, its annotation indicates that a particular class serves the role of a controller.

#### I used @GetMapping to put the routes 

### Routes 

#### /hello 
[http://localhost:8080/hello](http://localhost:8080/hello)

 - String helloWorld() it Return hello.html  in /hello route to show Hello World 

#### capitalize/{id}
[http://localhost:8080/capitalize/hello](http://localhost:8080/capitalize/hello)

 -  String capitalize() I used the @PathVariable annotation to extract the templated part of the URI, represented by the variable {id} and make the id toUpperCase.
 

 #### /
[http://localhost:8080/](http://localhost:8080/)
 -  In root route its return index.html by defulte and its return h1 and image tage with a little CSS.

#### /albums 
[http://localhost:8080/albums](http://localhost:8080/albums)

 - String albums () it have one parameter Model to return an array that contains three albums, and then displayed  those three on the page .

 - In all pages you can see the navbar and this have all links to all pages.


## LAB 12 :

#### /addYourAlbum 
[http://localhost:8080/addYourAlbum](http://localhost:8080/addYourAlbum)

- I used **@GetMapping** in  public String addYourAlbum()  that will take us to rout /addYourAlbum that take to newAlbums.html having input form in action route /albums and method post 
I used required="required" to cant submit with out fill it out and dont git an error.

#### /albums 
[http://localhost:8080/albums](http://localhost:8080/albums)

- after fill the form and submite it will take the action in this form to route albums that will have **@PostMapping** to take a data and fill it in album.html.

#### Git start the DataBase :
I wrote this commands to start it in terminal Ubuntu
- sudo service postgresql
- sudo service postgresql start
- sudo -i -u postgres
- psql
- \connect "the name of my data base" (maryam)
- \dt to have the table of list of relation 
- select * from "the name of relation " (album) to have all data what the user input in the albums form 
![image](/img/2021-07-22.png)

#### In build Gradel in dependencies i have this commands 
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	runtimeOnly('org.postgresql:postgresql')
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'

### In application propartise I have this and i git the data of my data type by using **\conninfo** command to have the user name, data base name and the route.

spring.datasource.url=jdbc:postgresql://localhost:5432/maryam
spring.datasource.username=postgres
spring.datasource.password=m55555
spring.jpa.database=POSTGRESQL
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect

