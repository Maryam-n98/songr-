# songr-

### Architecture
The programing languages used to build this project are Java, HTML and CSS.

### Overview

 in this project, I Used the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf and Devtools dependencies. 
 First  I downloaded the zip file and extract the directory it contains. then added it to my repo, and statrted.

### Methods

in HelloController Class 

First I used @Controller  to implement Web Application, its annotation indicates that a particular class serves the role of a controller.

## I used @GetMapping to put the routes 

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





