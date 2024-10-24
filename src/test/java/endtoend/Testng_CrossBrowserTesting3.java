package endtoend;

import org.testng.annotations.Test;

public class Testng_CrossBrowserTesting3	extends Testng_CrossBrowserTesting {
	
	@Test
	private void open_edge() {
		driver.get("https://www.flipkart.com");

	}

}
