package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("input-email")).sendKeys("jatin260400@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("jsc260400");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed());//true
		Thread.sleep(2000);

		driver.findElement(By.name("search")).sendKeys("iPhone");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='fa fa-search']/parent::button")).click();
		

		System.out.println(driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).isDisplayed()); // true
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());

		WebElement quanityField = driver.findElement(By.name("quantity"));
		Thread.sleep(2000);

		quanityField.clear();
		Thread.sleep(2000);

		quanityField.sendKeys("2");
		Thread.sleep(2000);

		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(5000);
		driver.quit();

		

	}

}
