package demoCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	@Test
	@Parameters({"username", "password"})
  public void guruLogintest(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

	ChromeOptions cc_options = new ChromeOptions();
	WebDriver driver=new ChromeDriver(cc_options);
	driver.get("http://demo.guru99.com/v4/");
	driver.findElement(By.name("uid")).clear();
	driver.findElement(By.name("uid")).sendKeys(username);
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("btnLogin")).click();
  }
}
