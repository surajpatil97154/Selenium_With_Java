package parallelTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
	/*
	To Start Hub -
	C:\<go to selenium server dir>java -jar selenium-server-4.27.0.jar hub 

	To Start Node no same machine-
	C:\<go to selenium server dir>java -jar selenium-server-4.27.0.jar node --detect-drivers true

	To Start Node on different machine if hub is using default port 4444-
	C:\<go to selenium server dir>java -jar selenium-server-4.27.0.jar node --hub http://<ip of hub machine>:4444/
	
	
	*/
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser" , "hubURL"})
	public void setup(String browser, String hubURL) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		if(browser.equals("chrome")) {
		cap.setBrowserName("chrome");
		}else if(browser.equals("firefox")) {
			cap.setBrowserName("firefox");
		}
		
		driver  = new RemoteWebDriver(new URL(hubURL),cap);
		
	}
	
	@Test
	public void testMethod() throws MalformedURLException {
		driver.get("https://www.flipkart.com/");
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}

