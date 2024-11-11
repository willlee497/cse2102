# Spring Boot Application

This is a simple Spring Boot application that serves a quiz with questions and answers using Thymeleaf templates and REST APIs. Users can access different features like checking password quality, validating emails, and taking a quiz.

## Features

- REST API to provide quiz questions in JSON format.
- Thymeleaf templates to render the user interface.
- AJAX integration to dynamically load quiz questions from REST APIs.
- Password quality check and email validation.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.6+
- Internet connection to fetch dependencies

## Project Structure

- `src/main/java` - Contains Java source files for controllers and models.
- `src/main/resources/templates` - Thymeleaf HTML templates (for UI).
- `src/main/resources/static/css` - CSS files for styling.
- `pom.xml` - Maven configuration file.

## Getting Started

### 1. Clone the Repository

```sh
$ git clone <repository-url>
$ cd <repository-folder>
```

### 2. Build the Project

Use Maven to build the project and download dependencies.

```sh
$ ./mvnw clean install
```

### 3. Run the Application

To run the Spring Boot application:

```sh
$ ./mvnw spring-boot:run
```

## Directory Structure

- **Controllers**: Handles requests and responses between the UI and backend logic.
  - `QuizController.java` - REST API endpoint for quiz questions.
  - `WebController.java` - Handles rendering Thymeleaf pages.
- **Templates**: Thymeleaf HTML files located in `src/main/resources/templates/`.
  - `home.html` - The home page.
  - `password.html` - Password quality check page.
  - `email.html` - Email validation page.
  - `quiz.html` - Quiz questions page.
- **Static Resources**: CSS files for styling the UI, located in `src/main/resources/static/css/`.


## Technologies Used

- **Spring Boot**: Backend framework to manage controllers and services.
- **Thymeleaf**: Templating engine for rendering UI.
- **AJAX & jQuery**: Used to fetch quiz data from the REST endpoint and display it on the page.
- **Bootstrap**: For styling the web pages.

## Running Tests

To run the unit tests:

```sh
$ ./mvnw test
```
