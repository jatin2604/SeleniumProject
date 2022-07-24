package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjcts.AccountPage;
import pageobjcts.LandingPage;
import pageobjcts.LoginPage;

public class LoginTest extends Base {
	
private static final boolean False = false;

private static final boolean FALSE = false;

Logger log;
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		log = LogManager.getLogger(LoginTest.class.getName());
		
		driver = initializeBrowser();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
		
	}
	
	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String expectedResult) throws IOException, InterruptedException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		log.debug("Clicked on My Account dropdown");
		landingPage.loginOption().click();
		log.debug("Clicked on login option");
		
		Thread.sleep(3000);
					
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		log.debug("Email addressed got entered");
		loginPage.passwordField().sendKeys(password);
		log.debug("Password got entered");
		loginPage.loginButton().click();
		log.debug("Clicked on Login Button");
		
		AccountPage accountPage = new AccountPage(driver);
		
		String acutualResult = null;
		
		try {
			
			if(accountPage.editYourAccountInformation().isDisplayed()) {
			   log.debug("User got logged in");
			   acutualResult = "Success";
			}
			
		}catch(Exception e) {
			log.debug("User didn't log in");
			acutualResult = "Failure";
			
		}
		
		if(acutualResult.equals(expectedResult)) {
			
			log.info("Login Test got passed");
			
		}else {
			
			log.error("Login Test got failed");
		}

		 
	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
		log.debug("Browser got closed");
		
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data = {{"jatin260400@gmail.com","260400","Success"}};
		
		return data;
		
	}
	
		
	}

