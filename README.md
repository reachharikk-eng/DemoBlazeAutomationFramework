# DemoBlaze Automation Framework

## Project Overview

This project is a Selenium TestNG Automation Framework developed for the DemoBlaze ecommerce web application.

The framework automates major ecommerce workflows including authentication, product validation, cart operations, and order placement.

The project is designed using the Page Object Model (POM) architecture for maintainability, scalability, and reusable automation execution.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Jenkins
* Extent Reports
* Git & GitHub

---

## Framework Features

* Page Object Model (POM)
* Reusable BasePage and BaseTest
* Explicit Wait Implementation
* Data-Driven Testing using DataProvider
* Alert Handling
* Screenshot Capture on Failure
* Extent HTML Reporting
* Jenkins CI Integration
* Cross Browser Support
* Configurable Test Execution

---

## Modules Automated

### Authentication Module

* Valid Login
* Invalid Login
* Logout
* Signup Validation

### Product Module

* Phones Category
* Laptops Category
* Monitors Category
* Product Details Validation

### Cart Module

* Add to Cart
* Multiple Product Validation
* Delete Product
* Total Price Validation

### Order Module

* Place Order
* Purchase Confirmation
* Order ID Validation

---

## Framework Structure

base/
pages/
tests/
utils/
listeners/
data/

---

## Reporting

The framework generates:

* Extent HTML Reports
* Automatic Screenshot Capture on Failure

---

## Jenkins Integration

The framework is integrated with Jenkins for Continuous Integration execution.

Workflow:
GitHub → Jenkins → Maven → TestNG → Reports

---

## How To Execute

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run testng.xml
4. View reports inside:
   reports/ExtentReport.html

---

## Author

Hari Karthik S
