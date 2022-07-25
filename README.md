#Selenium Project
This selenium project is written in Java and will serve as an example of implementing a Selenium test project with Selenium and TestNG. Everything is set up and tests can be added straight away. Used Testrunner is TestNG.  The Project will use Chrome Browser in Headless mode by default you can change the browser by just changing the browser in the properties file that I made to avoid hardcoding. it supports multiple browsers (Chrome, Firefox, Internet Explorer) as we used Selenium i.e Platform independent.
In this project, I performed tests on a dummy E-commerce site named "http://tutorialsninja.com/demo/" and implements several functionalities provided by selenium using TestNG Suit AND Several APIs also used in this project such as:
 Maven
 ExtentReport
 log4j
 cucumber
 POM (page object model)

##End to End Scenario:

  First, we login to the website if the credential matches it ill proceed otherwise throws an exception and takes a screenshot of a particular page and generates its logs, after login, it will choose the item to be purchased select it, and fill the desired quantity after successful transaction it will show a lightbox for it.

##Resources 
 
 1.PageObjects:- 3 classes are used for the landing page, login page, and account page by using simple java classes.
 
 2. resource:- Base class is used for opening or launching a web Browser using WebDriverManager.
	      The properties file is used (java concept) to avoid hard coding.
              log.xml file for creating logs of every event. 
  
 3. Utilities:- ExtentReport is used to generate a dynamic report of the test case.

 4. Tests:- A class is there to initiate the test case using TestNG Annotations.

As Selenium is blind by default so we use locators to locate the UI elements on a web page.

this project is a complete example of implementing several functionalities provided by Selenium and generating automation test cases.

 In Screenshots Folder Clip is available for this project and has several screenshots of the automation tests.




 
