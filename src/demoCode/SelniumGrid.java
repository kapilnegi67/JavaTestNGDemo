package demoCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelniumGrid {
	WebDriver driver;
	Platform platform;
	String nodeUrl;
	
	@Parameters({"portNo"})
	@BeforeTest()
	public void setDriver(String portNo) throws MalformedURLException
	{
		if(portNo.equalsIgnoreCase("5555"))
		{
			nodeUrl = "http://192.168.1.6:5555/wd/hub";
			System.out.println("Running Test on firefox browser");
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			caps.setBrowserName("firefox");
			caps.setPlatform(Platform.MAC);

			driver = new RemoteWebDriver(new URL(nodeUrl), caps);
		}
		else if (portNo.equalsIgnoreCase("5556")) {
			nodeUrl = "http://192.168.1.6:5556/wd/hub";
			System.out.println("Running Test on chrome browser");
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.MAC);

			driver = new RemoteWebDriver(new URL(nodeUrl), caps);
			
		}
		else {
			System.out.println("No node is running on the port : " + portNo);
		}
	}
	
	@Test
	public void getWebsite() {
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
