
# AutomationMasterFramework

**AutomationMasterFramework** is an automation framework designed to run tests across multiple platforms. It integrates Appium, Selenium, and other essential libraries to facilitate UI testing, web services testing, and more. The framework follows best practices to ensure test stability, maintainability, and scalability.

## Prerequisites

Before starting with this project, make sure you have the following installed:

- Java 11 or higher
- Maven 3.6.3 or higher
- Android SDK / iOS SDK (for mobile testing with Appium)
- An IDE like IntelliJ IDEA or Eclipse

## Technologies Used

This project relies on the following technologies and dependencies:

| Dependency                | Version         | Description                                                                 |
|---------------------------|-----------------|-----------------------------------------------------------------------------|
| **owner**                  | 1.0.12          | For managing property-based configurations                                  |
| **appium-java**            | 8.3.0           | For mobile application automation                                           |
| **ExtentReports**          | 5.0.8           | Library to generate detailed HTML test reports                              |
| **RestAssured**            | 5.2.0           | Framework for REST web service testing                                      |
| **Jackson**                | 2.13.1          | Library for processing JSON                                                 |
| **AssertJ Core**           | 3.21.0          | Library for fluent assertions in tests                                      |
| **WebDriverManager**       | 5.0.3           | Automatically manages browser drivers                                       |
| **Selenium**               | 3.141.59        | For web browser automation                                                  |
| **Lombok**                 | 1.18.20         | Library to reduce boilerplate code in Java                                  |
| **JavaFaker**              | 1.0.2           | Generates fake data for testing                                             |
| **Awaitility**             | 4.1.1           | Allows conditional waits in tests                                           |
| **NoException**            | 1.7.1           | Simplifies exception handling                                               |
| **Fixture Factory**        | 3.1.0           | Dynamic generation of test objects                                          |
| **Reflection**             | 0.10.2          | Enables runtime reflection operations                                       |
| **JUnit Jupiter**          | 5.8.2           | Unit testing framework in Java (part of JUnit 5)                            |

## Project Structure

The project follows the standard Maven structure with the following key directories:

```
AutomationMasterFramework/
│
├── src/
│   ├── main/
│   │   ├── java/              # Main framework source code
│   │   └── resources/         # Resource and configuration files
│   └── test/
│       ├── java/              # Test classes
│       └── resources/         # Test configurations
│
├── pom.xml                    # Maven configuration file with project dependencies
└── README.md                  # Project documentation
```

## Configuration

### Environment Configuration
Framework environment configurations are handled via `.properties` files, located in `src/test/resources/`. You can define parameters like:

- System under test (SUT) base URL
- Default timeout settings
- Appium/Selenium configurations

### Dependency Management

The project uses Maven as the dependency management tool. Dependencies are defined in the `pom.xml` file. To install all required dependencies, run the following command in the project’s root directory:

```bash
mvn clean install
```

## Running Tests

Tests can be executed via Maven. Use the following command to run all tests:

```bash
mvn test
```

If you want to run specific tests or include execution profiles, you can configure different profiles in the `pom.xml` file.
