# songr-

### Architecture
The programing languages used to build this project are Java, HTML and CSS.

### Overview

 in this project, I Used the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf and Devtools dependencies. 
 First  I downloaded the zip file and extract the directory it contains. then added it to my repo, and statrted.

### Methods

in HelloController Class 

First I used @Controller  to implement Web Application, its annotation indicates that a particular class serves the role of a controller.

then I used @GetMapping to put the routes 
 - String helloWorld() it Return hello.html  in /hello route to show Hello World 
 -  String capitalize()Its have @RequestParam to read a parameter and model.addAttribute to used the name as a query and defulte vale World if we havent a query, and it turnsed words into UPPER CASE. 
 -  In root route its return index.html by defulte and its return h1 and image tage with a little CSS.
 - String albums () it have one parameter Model to return an array that contains three albums, and then displayed  those three on the page .
 - In all pages you can see the navbar and this have all links to all pages.
 




