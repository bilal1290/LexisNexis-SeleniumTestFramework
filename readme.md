This document outlines the test automation approach for LexisNexis Risk Solutions website (https://risk.lexisnexis.co.uk/).

**Technologies**
Programming Languages: _Java_
Test Automation Framework: _Selenium_
BDD Framework: _Cucumber_
Reporting Tools: _TestNG (or JUnit), Serenity BDD (Optional)_
**Test Scenarios**
The test scenarios will be written in a user-centric, Gherkin format using Cucumber. This ensures readability and maintainability of the tests.
TestNG Report is generated by running RiskDecisions.java
LoomVideo: https://www.loom.com/share/2ed03b0149ec438bb88b1c8b41c4cc61

Creating a LexisNexis Risk Solutions Test with Selenium, Java & Cucumber
This guide outlines the steps for creating a test script using Selenium, Java, and Cucumber to verify elements on the LexisNexis Risk Solutions website (https://risk.lexisnexis.co.uk/).

**Prerequisites:**

* Java Development Kit (JDK) installed (version 8 or higher)
* IDE (e.g., Eclipse) with Maven plugin
* Selenium WebDriver libraries (specific version depends on your chosen browser driver)
* Cucumber libraries

#### **Steps:**

**Project Setup:**

* Create a new Maven project in your IDE.
* Add necessary dependencies for Selenium, Cucumber, and your chosen reporting tool (TestNG or JUnit) to your pom.xml file.

#### **Feature File Creation:**

1. Create a folder named src/test/resources/features.
2. Inside the features folder, create a file named lexisnexis_risk_solutions.feature.
3. Add your test scenario in Gherkin syntax to this file. (Refer to the example scenario in the Readme explanation above).
4. Step Definition File Creation:

Create a folder named src/test/java/step_definitions.
* Inside the step_definitions folder, create a class named LexisNexisRiskSolutionsSteps.java.
* Annotate this class with @cucumber.api.java.en.Given, @cucumber.api.java.en.When, @cucumber.api.java.en.Then, and @cucumber.api.java.en.And based on your scenario steps.
* Implement methods for each step that interact with the website using Selenium WebDriver.
* Test Runner Class (Optional):

**Create a class named LexisNexisRiskSolutionsTestRunner.java (optional but recommended).**
* Annotate this class with @RunWith(Cucumber.class) and @CucumberOptions.
* Use @CucumberOptions to specify the location of your feature files and step definition package.
Implementing Steps:

Inside your LexisNexisRiskSolutionsSteps.java class, create methods for each step in your scenario.
Use Selenium WebDriver methods within these steps to interact with the website. 

#### **Examples include:**

`driver.get("https://risk.lexisnexis.co.uk/") - Navigate to the URL
WebElement element = driver.findElement(By.xpath("//h2[text()='Transform Your Risk Decision Making']")) - Find an element using XPath
element.click() - Click on an element
List<WebElement> elements = driver.findElements(By.cssSelector(".industry-link")) `- Find a list of elements using CSS selector
Assertions (e.g., JUnit assertions) to verify element presence, text content, etc.
**Handling Popups:**

Implement logic to handle popups like "Accept cookies" before interacting with the main content. You can use explicit waits or try/catch blocks to handle unexpected popups.

**Running the Test:**

Compile your project (using Maven commands in your terminal).
If using a Test Runner class, run it as a JUnit test or use a dedicated Cucumber runner tool.