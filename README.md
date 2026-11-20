# CURA Healthcare Service – Selenium Test Automation Framework

## Project Overview

This project focuses on automating the testing of the [CURA Healthcare Service](https://katalon-demo-cura.herokuapp.com/) web application using Selenium WebDriver and Java.

The project aims to validate key healthcare appointment management functionalities through automated test scripts while following the Page Object Model (POM) design pattern.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub
- Eclipse IDE

## Application Under Test

**Website:** https://katalon-demo-cura.herokuapp.com/

CURA Healthcare Service is a demo web application that allows users to log in, schedule healthcare appointments, and view their appointment history.

## Testing Scope

The project covers the following functionalities:

- **Login Testing:** Validate successful and unsuccessful login scenarios.
- **Appointment Booking:** Automate the appointment scheduling process.
- **Form Validation:** Verify input fields and mandatory field validations.
- **Appointment History:** Validate previously scheduled appointments.
- **Logout Testing:** Verify successful logout functionality.

## Framework Design

The project follows the Page Object Model (POM) to maintain a structured, reusable, and maintainable automation framework.

## Project Structure

```text
CURA-Healthcare-Automation/
│
├── src/
│   ├── main/java/
│   │   └── pages/
│   │
│   └── test/java/
│       ├── tests/
│       └── base/
│
├── pom.xml
└── README.md
```

## Test Execution

1. Clone the repository.
2. Import the project into Eclipse as a Maven project.
3. Allow Maven to download the required dependencies.
4. Execute the TestNG test classes.
5. Review the test execution results.

## Future Improvements

- Implement automated screenshot capture for failed tests.
- Integrate detailed test execution reports.
- Add cross-browser testing.
- Implement data-driven testing.
- Integrate the framework with a CI/CD pipeline.

## Author

Developed as a hands-on project to practice Selenium WebDriver automation testing and framework development.
