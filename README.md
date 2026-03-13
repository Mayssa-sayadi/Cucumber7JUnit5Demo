# Cucumber 7 + Selenium 4 + JUnit 5 — Automation Framework

This project is a UI test automation framework built using **Cucumber (BDD)**, **Selenium WebDriver**, and **JUnit 5 (JUnit Platform)**.

The goal of this framework is to provide a **clean, maintainable, and scalable architecture** that allows teams to write readable automated tests and execute them easily **locally or within a CI pipeline**.

---

## 🧪 Project Overview


The framework aims to:

- Write readable BDD scenarios using Gherkin **(.feature files)**

- Implement step definitions using **Cucumber with JUnit 5**

- Automate web user journeys using **Selenium WebDriver 4**

- Maintain a clear separation of responsibilities through a simple architecture:

  **Actions**– business logic and web interactions

  **Locators** – centralized element selectors

  **Hooks** – browser setup and teardown (test lifecycle management)

  **Utils** – helper methods and configuration utilities

---

## 🛠️ Tech Stack

The framework is built with the following technologies:

- **Cucumber**: `7.14.0`
- **Java**: `21`
- **JUnit Jupiter**: `5.10.1`
- **Maven**: `3.10.0`
- **Selenium**: `4.15.0`
---

## 📁 Structure of project
```
src
├─ main
│ └─ java
│ └─ com.example
│ ├─ actions
│ │ ├─ HomePageActions.java
│ │ ├─ LoginPageActions.java
│ │ └─ ForgotPasswordActions.java
│ ├─ locators
│ │ ├─ HomePageLocators.java
│ │ ├─ LoginPageLocators.java
│ │ └─ ForgotPasswordLocators.java
│ └─ utils
│ ├─ ConfigFileReader.java
│ └─ HelperClass.java
│
└─ test
├─ java
│ └─ com.example
│ ├─ definitions
│ │ ├─ Hooks.java
│ │ └─ LoginPageDefinitions.java
│ └─ runner
│ └─ CucumberRunnerTests.java
│
└─ resources
├─ features
│ └─ LoginPage.feature
└─ junit-platform.properties
```
---
## 🧩 Framework Components



* **actions/** : contains the business logic methods (e.g., `login(username, password)`) that are called by the Step Definitions.

* **locators/** : centralizes all element selectors (`id`, `xpath`, `css`) to avoid duplication and make maintenance easier.

* **utils/** :

  **ConfigFileReader** – reads configuration values such as `url`, `browser`, `timeouts`, etc.

  **HelperClass** – shared utility methods used across the framework (driver management, waits, navigation, depending on the implementation).

* **definitions/** :

  **Hooks** – uses `@Before` / `@After` annotations to start and close the browser, capture screenshots on failure, and manage test lifecycle events.

  **LoginPageDefinitions** – maps **Gherkin steps** to Java code (Cucumber step definitions).

* **runner/** : JUnit 5 class that launches the Cucumber tests (`CucumberRunnerTests`).

* **features/** : contains the BDD scenarios written in Gherkin (e.g., `LoginPage.feature`).

* **junit-platform.properties** : configuration file for test execution through JUnit Platform (glue paths, plugins, tags, and other Cucumber settings).

---
## ⚙️ Prerequisites

Before running the tests, make sure the following tools are installed:

* Java 21

* Maven
  
You can verify the installed versions using:
```
java -version
mvn -version
```
---
## ▶️ Test Execution

1) Run the full test suite (recommended)

This command runs the full Maven lifecycle (clean + verify).
It is ideal for executing the entire test suite and generating reports through the standard Maven lifecycle.
```
mvn clean verify
```
---
2) Run the full test suite (faster for local execution)

This command executes tests during the test phase, which is faster for local runs.
Use it when you want to quickly validate tests without running the full verify lifecycle.
```
mvn clean test
```
---

3) Run only @smoke scenarios

This command runs only scenarios tagged with @smoke.
It is useful for a quick validation after a change (sanity check).
```
mvn clean verify -Dcucumber.filter.tags="@smoke"
```
---
4) Run @regression scenarios excluding @wip

This command runs all scenarios tagged with @regression but excludes those tagged @wip (Work In Progress).
Useful when you want to execute the full regression suite while ignoring tests that are still under development.
```
mvn clean verify -Dcucumber.filter.tags="@regression and not @wip
```
---
