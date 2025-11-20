 Spring Boot TODO Application

A simple and clean TODO application built using Spring Boot, Thymeleaf, Bootstrap, and Spring Data JPA.
This project allows users to add tasks, mark them as completed, and delete them.

 Features:
------------------------------------

 Add new tasks

 Mark tasks as completed

 Toggle completion status

 Delete tasks

 Simple and responsive UI using Bootstrap

 Persistent data using Spring Data JPA

 Tech Stack:
--------------------------------
Technology	Purpose
Java 17+	Programming language
Spring Boot	Backend framework
Spring MVC	Controller + View handling
Spring Data JPA	Database interactions
Thymeleaf	Frontend templating
Bootstrap 5	Styling + UI
H2 / MySQL	Database (configurable)

Project Structure
TodoApp
┣ src/main/java/com/example/TodoApp
┃ ┣ controllers      → web controllers
┃ ┣ models           → entity classes
┃ ┣ repository       → JPA repository
┃ ┗ services         → business logic
┣ src/main/resources
┃ ┣ templates        → Thymeleaf HTML pages
┃ ┗ application.properties
┗ pom.xml

How to Run the Application:
----------------------------------------
1.Clone the repository
   git clone https://github.com/Miryala-meghana/SpringBoot-Todo-App.git

2.Open the project in IntelliJ IDEA / Eclipse
3.Run the Spring Boot application

Using IntelliJ:

Open TodoAppApplication.java

Click Run

Or use terminal:

mvn spring-boot:run

4.Open the application in browser
   http://localhost:8080
