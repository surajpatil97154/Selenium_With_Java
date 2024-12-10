import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
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

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN11);
        cap.setBrowserName("MicrosoftEdge");
        cap.setPlatform(Platform.WIN11);

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:5555"),cap);
        driver.get("https://www.flipkart.com/");
        driver.close();

    }
}

