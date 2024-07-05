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
```
  url=https://sendtestemail.com/
  capabilities.browserName=chrome
  capabilities.browserVersion=126.0.6478.127
  selenium_url=http://localhost:4444/wd/hub
```
## Usage
- [ ] Run tests from testng.xml files to create automatically a test run in TestRail.

## Implementation details
### Study case: Jakarta Mail
- The Jakarta Mail API provides a platform-independent and protocol-independent framework to build mail and messaging applications.
- IMAP (Internet Message Access Protocol) is used to access and manage email messages on a mail server. IMAP allows you to manage your emails directly on the server, enabling you to access your emails from multiple devices.
- To integrate IMAP using Jakarta Mail API, you need to follow these steps:
1. Add Jakarta Mail dependency to your project: add the **jakarta.mail-api** and **jakarta.mail** maven dependencies to the pom file.
2. Configure IMAP server settings: create a configuration class or properties file (_email.properties) to store different email server settings.
```
#================= IMAP server configuration ==================#
   mail.imap.host=imap-mail.outlook.com
   mail.imap.auth=true
   mail.imap.port=993
   mail.imap.tls.enable=true
#==============================================================#
```
3. Create a utility class to connect to the IMAP server and read emails.: implement methods to send emails using different email servers.
4. Integrate the utility class with the previous task to verify the received email.
## Useful Documentation

* [Carina](https://zebrunner.github.io/carina/)
* [Selenium Github Example](https://github.com/SeleniumHQ/seleniumhq.github.io/tree/trunk/examples)
* [TestRail](https://support.gurock.com/hc/en-us)
* [TestNG](https://testng.org/doc/documentation-main.html)

