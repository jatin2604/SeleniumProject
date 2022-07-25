#Selenium Project
This selenium project is written in Java and will serve an example of implementing a Selenium test project with Selenium and testNG. Everything is set up and tests can be added straight away. Used Testrunner is TestNG.  The Project will use Chrome Browser in Headless mode by default you can change the browser by just changing browser in properties file that I made to avoid hardcoding. it supports multiple Browsers (Chrome,Firefox,Internet Explorer) as we used Selenium i.e Platform independent.
In this project I performed tests on a dummy E-commerce site named "http://tutorialsninja.com/demo/" and implements several functionalities provided by selenium using testNG Suit AND Several API also used in this project such as:
 Maven
 ExtentReport
 log4j
 cucumber
 POM (page object model)

##End to End Scenario:

  First we login to the website if the credential matches it ill proceed otyherwise throws exception and takes a screenshot of a particular page and generates its logs, after login it will choose the item to purchased select it and fill the desired quantity after succsessfull transaction it will show a lightbox for it.

##Resources 
 
 1.PageObjects:- 3 classes are used for landingpage,loginpage and accountpage by using simple java classes.
 
 2.resource:- Base class is used for opening or launching web Browser using WebDriverManager.
	      Properties file is used (java concept) to avoid hard coding.
              log.xml file for creating logs of every event. 
  
 3.Utilities:- ExtentReport is used to generate a dynamic report of the testcase.

 4.Tests:- A class is ther to initiate the test case using TestNG Annotations.

As Selenium is blind by default so we use locators to locate the UI elements on a web page.

this project a complete example of implementing several functionalities provide by the Selenium and to generate automation testcases.

 In Screenshots Folder Clip is available for this project and have several screenshots of the automation tests.




 
