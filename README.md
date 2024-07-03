<!-- PROJECT LOGO -->
<div align="center">
  <h1 align="center">Advanced Automation Java</h1>
  <p align="center">Automation of email verification</p>
</div>

<!-- TABLE OF CONTENTS -->
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#built-with">Built With</a></li>
    <li><a href="#prerequisites">Prerequisites</a></li>
    <li><a href="#installation">Installation</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#implementation-details">Implementation Details</a></li>
    <li><a href="#useful-documentation">Useful Documentation</a></li>
  </ol>

## About The Project
The project focuses on the implementation of Automation of Email Verification.
Create an utility to automate email verification. Your utility should connect to the email server and check if a message has been received.

## Built With
* Programming Language: Java
* Frameworks: Carina, TestNG
* Reporting Tools: Zebrunner

## Prerequisites
- [ ] Install Java +11
- [ ] Download chromedriver and selenium server standalone
- [ ] Install Jenkins

## Installation
- [ ] Download chromedriver for your Chrome browser version, save it in Downloads.
- [ ] Download selenium-server-standalone-3.141.59.jar, save it in Downloads.
- [ ] Clone the repo.
- [ ] Run selenium standalone opening a new terminal in Downloads and run this command: java -jar selenium-server-standalone-3.141.59.jar
- [ ] Modify the -config.properties file with browser-name and version.
- [ ] Add a _testdata.properties file with TestRail's credentials data (testRailUrl, testRailUsername, testRailPassword).

## Usage
- [ ] Run tests from testng.xml files to create automatically a test run in TestRail.

## Implementation details
### Study case: Jakarta Mail
- The Jakarta Mail API provides a platform-independent and protocol-independent framework to build mail and messaging applications.
1. Set up your project: To include it in your project, add the **jakarta.mail-api** maven dependency to the pom file.
2. Configure Email Server Settings: create a configuration class or properties file (named _email.properties) to store different email server settings.
3. Create a Mail Utility Class: implement methods to send emails using different email servers.
## Useful Documentation

* [Carina](https://zebrunner.github.io/carina/)
* [Selenium Github Example](https://github.com/SeleniumHQ/seleniumhq.github.io/tree/trunk/examples)
* [TestRail](https://support.gurock.com/hc/en-us)
* [TestNG](https://testng.org/doc/documentation-main.html)

