package endtoend;

import org.testng.annotations.Test;

public class Testng_CrossBrowserTesting2 extends Testng_CrossBrowserTesting {
	
	@Test
	public void open_firefox() {
		
		driver.get("https://www.flipkart.com");
		
	}

}
