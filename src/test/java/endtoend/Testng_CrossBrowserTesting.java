package endtoend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testng_CrossBrowserTesting {

	WebDriver driver;

	
	@Test
	@Parameters({"nameofBrowser"})

	public void with_Chrome(String BrowserName) {

		if (BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
			//driver.get("https://www.flipkart.com");
		}

		if (BrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
			//driver.get("https://www.flipkart.com");
		}

		if (BrowserName.equals("edge")) {
			driver = new EdgeDriver();
			//driver.get("https://www.flipkart.com");
		}

	}

}
