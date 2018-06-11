# RainairTest
This automation project automates a booking up to a declined payment on https://www.ryanair.com/ie/en/
## Using following technologies stack
* Java 8
* Maven - to build a project
* JUnit - to run automation tests
* Cucumber - to use BDD
* Cucumber html reporter plugin
* Log4j - for logging
  
## Getting Started  
Software to be pre-installed : 
* JDK 8 - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Maven - latest version here https://maven.apache.org/download.cgi
```
note that both tools should be set to environment variables      
```
## Running autotests from IntelliJ IDEA IDE
1. Clone this repository
2. Open File -> New -> Project from Existing Source -> Select ../RainairTest/pom.xml -> Click 'Next' every prompt
3. Go to RainairTest/src/test/java/test_runners/FlightsBookingTest.java -> click rmb -> click 'Run...' in context menu to execute all existing tests.

## Running autotests from command line or terminal
1. Open directory: RainairTest/ 
2. In command line execute:
* ```mvn test``` - exetutes all tests inside RainairTest/src/test/java/test_runners/ with default browser set in config file
* ```mvn -Dbrowser=chrome test``` - executes test in chrome browser
* ```mvn test -Dcucumber.options="--tags @flights_booking"``` - to run specific tags

## BDD
Tests are developed using BDD approach, which brings benefits of using DSL specification stories called 'Features', so basically it's aimed to write human-readable scenarios to involve non-technical people in process of automation
```
btw I prefer writing low level scenario steps(as I did in this project) to make them independent, reusable and relaible as much as I can
however bdd scenario style depens on a team agreement, because again BDD is aimed to cover the whole team needs,not only for automation engineers 
```
## Framework structure
* Programming lang – Java 8
* Type of framework – BDD
* Page Object – Separate class for every web-page, that hold all functionality and members of that web-page using PageFactory pattern
* Test base class: Deals with all the common functions used by all the pages, responsible for test launch, for reports,pre-cond post-cond, web-driver init, loading configs etc. 
* Packages: I have separate packages for Pages, Test steps and any other framework layer
* Utility Functions: The code which is repetitive in nature such as waits, scroll actions, property loader, logging etc.
* Property File: This file (config.properties) stores the information that remains static throughout the framework such as browser specific information, application URL, user data etc.
* Test Data: Is stored in resources and passed through feature file scenarios
* VCS: Git

## Test layers
* Pages(web-pages and elements)
* Test steps(logic implementation)
* Test launch(runners)
* Test data(feature files)

## Locators strategy
as you can notice from page object i like css locators

## Tests support cross-platform-browser testing
 * Windows: 
      * Chrome
      * FireFox
 * MacOS:
      * Chrome
      * FireFox

Default browser is FireFox. To change browser, go to config.properties file and set 'browser_name = chrome'. Or override this property from cmd/terminal using:
```
maven -Dbrowser='browser name' test
```
## Results reporting
Every steps is logged by log4j. It prints all actions perfomed by user to console output and stores all logs in:
```
RainairTest/target/logs      
```
Cucumber genarates simple html reports using html-report-plugin.To browse cucumber reports, go to:
```
RainairTest/target/cucumber-reports/***Test      
```
Find a file with extension *** .html and open in any browser

P.S. There are many opportunities to add any other convenient reporter tool to this project

## Code design
 For more detailed information about code design, please refer to in-code documentation
