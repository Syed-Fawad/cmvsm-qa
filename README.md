java-cucumber-Maven
A sample project of Cucumber java using POM design pattern

Instructions
Clone the repo: 

Git:

$ git clone https://github.com/Syed-Fawad/cmvsm-qa.git

Prerequisites
In order to run this tests, Selenium will need to be able to drive a browser installed to your system.

(TODO after testing on Windows)

Verify installation
Use Maven
Open a command window and run:

mvn test
This runs Cucumber features using Cucumber's JUnit runner. The @RunWith(Cucumber.class) annotation on the RunCukesTest class tells JUnit to kick off Cucumber.

Using Maven:

mvn -Dcucumber.options="..." test
Using Ant:

JAVA_OPTIONS='-Dcucumber.options="..."' ant runcukes
Let's look at some things you can do with cucumber.options. Try this:

-Dcucumber.options="--help"
That should list all the available options.
