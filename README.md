# SDET Automation Framework

## Project Goal

Build an enterprise-level automation framework covering:

* Web UI automation
* API automation
* Backend validation
* CI/CD integration
* AI-assisted development using GitHub Copilot

---

# Technology Stack

* Java 21
* Maven
* Selenium WebDriver 4.25.0
* TestNG 7.11.0
* REST Assured
* Extent Reports
* Eclipse IDE
* GitHub
* GitHub Copilot

---

# Current Framework Status

## Completed ✅

### Project Setup

* Maven project setup
* Package structure created
* TestNG integration
* DriverFactory implementation
* BaseTest implementation
* Chrome browser execution

---

## UI Automation ✅

Completed:

* LoginTest created
* Page Object Model started
* Login page automation working
* First automated UI test passed

Current UI structure:

```
com.demo.sdet

├── pages
│    ├── LoginPage
│    └── DashboardPage
│
├── tests
│    └── LoginTest
```

---

# API Automation ✅

REST Assured framework created.

Completed:

* API package structure
* Routes management
* API endpoint classes
* Payload classes
* User CRUD API automation

Current API structure:

```
com.demo.sdet

├── api
│
│   ├── endpoints
│   │    ├── Routes.java
│   │    └── UserEndPoints.java
│   │
│   ├── payloads
│   │    └── UserPayload.java
│   │
│   └── tests
│        └── UserTests.java
```

Implemented API operations:

* Create User
* Get User
* Update User
* Delete User

---

# Configuration Management ✅

Completed:

* config.properties
* ConfigReader.java

Current configuration includes:

* Browser selection
* Base URL
* Wait configuration
* API configuration values

---

# Reporting ✅

Extent Reports integrated.

Completed:

* ExtentManager.java
* ExtentTestManager.java
* TestListener.java
* Test execution reporting

Current report features:

* Test name
* Pass/Fail status
* Execution details

Note:

* Screenshot capture is currently used only for UI tests.
* API tests do not use Selenium screenshots.

---

# Current Test Execution

## UI Tests

Example:

```
LoginTest
    |
    Browser Launch
    |
    Login Validation
    |
    Test Result
```

---

## API Tests

Example:

```
UserTests

createUserTest
getUserTest
updateUserTest
deleteUserTest
```

Execution:

```
TestNG
   |
   v
REST Assured
   |
   v
API Response Validation
   |
   v
Extent Report
```

---

# Next Development Steps

## 1. Improve API Framework

Priority:

* API request specification
* Common headers management
* API request/response logging in Extent Report
* Better response validation utilities

---

## 2. Test Data Management

Future enhancement:

Move hardcoded test data:

```
userPayload.setUsername("testuser")
```

into external files:

```
src/test/resources

└── testdata
       └── users.json
```

---

## 3. Backend Validation

Add:

* Database connection utility
* SQL validation
* Backend data verification after API execution

---

## 4. CI/CD Integration

Implement:

* GitHub Actions workflow
* Maven test execution
* Automated report generation
* Build status tracking

---

## 5. AI-Assisted Development

Continue using:

* GitHub Copilot
* AI-assisted framework improvements
* Test generation assistance
* Code optimization

---

# Current Framework Structure

```
com.demo.sdet

├── api
│   ├── endpoints
│   ├── payloads
│   ├── tests
│   └── utils
│
├── config
│   └── ConfigReader.java
│
├── driver
│   └── DriverFactory.java
│
├── pages
│   ├── LoginPage.java
│   └── DashboardPage.java
│
├── reports
│   ├── ExtentManager.java
│   ├── ExtentTestManager.java
│   └── TestListener.java
│
├── tests
│   └── LoginTest.java
│
└── utils
```

---

# Development Notes

Last completed:

* REST Assured User CRUD automation
* API TestNG execution
* Extent Report integration
* Listener integration for API tests

Next session start:

1. Add API request/response logging into Extent Reports
2. Improve API framework utilities
3. Continue toward backend validation and CI/CD

---
