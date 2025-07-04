# 🧪 BlankFactor QA Automation Homework

This project contains an automated UI test for the [BlankFactor](http://blankfactor.com) website. The solution was developed using modern automation technologies with Java and follows the Screenplay Pattern for enhanced readability and maintainability.

---

## ✅ Technology Stack

- **Language:** Java 21
- **Build Tool:** Gradle
- **Test Framework:** Serenity BDD with Cucumber
- **WebDriver:** ChromeDriver
- **Design Pattern:** Screenplay Pattern

---

## 📁 Project Structure

```
src
├── main
│   └── java/com.hcdev.qa
│       ├── exceptions/
│       ├── interactions.actions/
│       │   ├── commons/                          → Reusable browser actions (open, click)
│       │   └── navigations/                      → Navigation tasks for specific sections
│       ├── model/
│       ├── questions/                            → Assertions and validations
│       ├── task/
│       ├── ui/                                   → Page object representations
│       │   ├── BlankFactorHomePage.java
│       │   └── RetirementAndWealthPage.java
│       └── util.waits/                           → Explicit wait utilities
│           └── ExplicitWait.java
│
├── test
│   └── java/com.hcdev.qa
│       ├── runners/
│       │   └── BlankFactorHomePageTestRunner.java
│       └── stepdefinitions/
│           └── BlankFactorHomePageStepDefinition.java
│
├── resources
│   ├── features/
│   │   └── blank-factor-home-page.feature        → Gherkin scenario
│   ├── webdriver/
│   │   ├── linux/chromedriver
│   │   └── windows/chromedriver.exe
│   ├── serenity.conf                             → Serenity configuration
│   ├── logback-test.xml                          → Logging configuration
│   └── junit-platform.properties
```

---

## 🧾 Automated Test Scenario (Gherkin)

```gherkin
@blank-factor-homework
Feature: Navigate to the BlankFactor homepage and perform specific interactions

  @blank-factor-homepage-interactions
  Scenario: Perform basic user interactions on the homepage
    Given the user navigates to the "Powering innovation in retirement services" section
    When the user proceeds to the Contact page
    Then the URL and page title are validated
```

---

## 🚀 How to Execute

Make sure Java 21 and a compatible version of Chrome are installed.

To run the automated test:

```bash
./gradlew clean test aggregate -DExecutionTypeSingle='@blank-factor-homework' -Denvironment=qa
```

### ✅ Notes:

- The `@blank-factor-homework` tag filters this specific test case.

---

## 📊 Serenity Report

After test execution, the Serenity HTML report is generated at:

```
target/site/serenity/index.html
```

Open the file in a browser to view detailed test execution results.

---

## 👨‍💻 Author

Harold Ceballo  
Senior QA Automation Engineer  
