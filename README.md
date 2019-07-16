# Ryanair Test Automation Framework
This project automates a booking up to a declined payment on https://www.ryanair.com/ie/en/ test scenario

## Table of Contents
* [Tech Stack](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#tech-stack-used)
* [Getting Started](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#getting-started)
* [Running from IntelliJ IDEA](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#running-autotests-from-IntelliJ-IDEA-IDE)
* [Running from command line](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#running-autotests-from-command-line-or-terminal)
* [BDD](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#bdd)
* [Framework Structure](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#framework-structure)
* [Test Layers](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#test-layers)
* [Supported Browsers](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#tests-support-cross-platform-browser-testing)
* [Results Reporting](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#results-reporting)
* [Code Design](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#code-design)
* [License](https://github.com/YuriyJurayev/fr_ryanair_test_cucumber_bdd#license)

## Tech Stack used
* Java 8 - coding
* Maven - project builder
* JUnit - runner
* Cucumber - BDD framework
* Cucumber html reporter plugin - test outcome reporter
* Log4j - logger
  
## Getting Started  
Software to be pre-installed : 
* JDK 8 - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Maven - latest version here https://maven.apache.org/download.cgi
```
note that both tools should be set to environment variables      
```
## Running autotests from IntelliJ IDEA IDE
1. Clone repository
```
git clone https://github.com/jurayev/fr-ryanair-test-cucumber-bdd
```
2. Open File -> New -> Project from Existing Source -> Select `../fr-ryanair-test-cucumber-bdd/pom.xml` -> Click 'Next' every prompt
3. Go to `fr-ryanair-test-cucumber-bdd/src/test/java/test_runners/FlightsBookingTest.java` -> click rmb -> click 'Run...' in context menu to execute all existing tests.

## Running autotests from command line or terminal
1. Clone repository
```
git clone https://github.com/jurayev/fr-ryanair-test-cucumber-bdd
```
2. Open directory: `fr-ryanair-test-cucumber-bdd/` 
3. In command line execute:
* ```mvn test``` - exetutes all tests inside `fr-ryanair-test-cucumber-bdd/src/test/java/test_runners/` with default browser set in config file
* ```mvn -Dbrowser=chrome test``` - executes test in chrome browser
* ```mvn test -Dcucumber.options="--tags @flights_booking"``` - to run specific tags

## BDD
Tests are developed using BDD approach, thanks to extremely powerfull Cucumber framework, which brings benefits of using DSL specification stories called 'Features', so basically it's aimed to write human-readable scenarios to involve non-technical people in process of automation

## Framework Structure
* Programming language – Java 8
* Type of framework – BDD
* Page Object – Separate class for every web-page, that hold all functionality and members of that web-page using PageFactory pattern
* Test base class: Deals with all the common functions used by all the pages, responsible for test launch, for reports,pre-cond post-cond, web-driver init, loading configs etc. 
* Packages: I have separate packages for Pages, Test steps and any other framework layer
* Utility Functions: The code which is repetitive in nature such as waits, scroll actions, property loader, logging etc.
* Property File: This file (config.properties) stores the information that remains static throughout the framework such as browser specific information, application URL, user data etc.
* Test Data: Is stored in resources and passed through feature file scenarios
* VCS: Git

## Test Layers
* Pages(web-pages and elements)
* Test steps(logic implementation)
* Test launch(runners)
* Test data(feature files)

## Tests support cross-platform browser testing
 * Windows: 
      * Chrome
      * FireFox
 * MacOS:
      * Chrome
      * FireFox

Default browser is FireFox. To change browser, go to config.properties file and set 'browser_name = chrome'. Or override this property from cmd/terminal using:
```
mvn -Dbrowser=browser_name test
```
P.S. Didn't have a chance to configure and test Safari browser, however Chrome and Firefox are supported on both platforms

## Results Reporting
Every step is logged by log4j. It prints all actions perfomed by scripts to console output and stores all logs in:
```
fr-ryanair-test-cucumber-bdd/target/logs      
```
Cucumber genarates simple html reports using html-report-plugin. To browse cucumber reports, go to:
```
fr-ryanair-test-cucumber-bdd/target/cucumber-reports/***Test      
```
Open a file with extension ```*****.html``` in any preferrable browser

P.S. There are many opportunities to add any other convenient reporter tool to this project

## Code Design
Project follows [Google Java](https://google.github.io/styleguide/javaguide.html) code style guide

For more detailed information about code design, please refer to in-code documentation

## License
Project is licensed under [MIT](https://github.com/jurayev/fr-ryanair-test-cucumber-bdd/blob/master/LICENSE.md)
