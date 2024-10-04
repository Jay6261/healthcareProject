Cura Healthcare Service Test Automation
This repository contains an automation testing project written in Java using Selenium WebDriver and TestNG to test the CURA Healthcare Service, an appointment booking website for health checkups.



|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- pagesobjects
|   |   |   |   |-- BookingPage.java
|   |   |   |   |-- ConfirmationPage.java
|   |   |   |   |-- ...
|   |   |-- resources
|   |-- test
|       |-- java
|       |   |-- Test
|       |   |   |-- AppointmentBookingTestCases.java
|       |   |   |-- LoginTestCases.java
|       |   |-- TestComponents
|       |       |-- BaseTest.java
|-- .gitignore
|-- .project
|-- README.md
|-- extentreports.html
|-- pom.xml





Prerequisites
To run the automation tests in this project, you'll need to have the following software installed on your machine:

Java Development Kit (JDK) version used: Java 21
Apache Maven
Selenium WebDriver
TestNG


I've created a total of 6 test cases which are as follows:

Test Case No.	Test Case Description	Status
01	Login with incorrect username and correct password	Pass 

02	Login with the correct username and incorrect password	Pass

03	Login with incorrect username and incorrect password	Pass

04	Login without entering username or password	Pass

05	Login with the correct username and correct password	Pass

06	Complete the appointment process by providing information and verifying the details on the confirmation page	Pass
