package endtoend;

import org.testng.annotations.Test;

public class Testng_CrossBrowserTesting1  extends Testng_CrossBrowserTesting{
	
	@Test
	public void open_chrome() {
		
		driver.get("https://www.flipkart.com");
		
	}

}
