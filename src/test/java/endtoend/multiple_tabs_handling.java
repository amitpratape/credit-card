package endtoend;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class multiple_tabs_handling {
	
	@Test(enabled =true)
	public void HandleTabs()
	{	
		
		
		String URL = "https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIqbnnh-SzhwMVkKRmAh2C4AmpEAAYASAAEgJ5mfD_BwE_k_";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		List<WebElement> totalankerTag = 	driver.findElements(By.xpath("//div[text()='Get to Know Us']/..//a"));
		System.out.println(totalankerTag.size());
		String current_Tab = driver.getWindowHandle();
		
		for(int i=0; i<totalankerTag.size(); i++)
		{
			WebElement getlink_from_ankerTag = totalankerTag.get(i);
			String URL1 = getlink_from_ankerTag.getAttribute("href");
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(URL1);
			Set<String> windows = driver.getWindowHandles();
			driver.switchTo().window(current_Tab);
			
		}
		
	}
	
	@Test(enabled=false)
	public void handleTabs_by_iteerator() {
		
		String URL = "https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIqbnnh-SzhwMVkKRmAh2C4AmpEAAYASAAEgJ5mfD_BwE_k_";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		List<WebElement> totalankerTag = 	driver.findElements(By.xpath("//div[text()='Get to Know Us']/..//a"));
		System.out.println(totalankerTag.size());
		String current_Tab = driver.getWindowHandle();
		
		Iterator<WebElement> it = totalankerTag.iterator();
		
		while(it.hasNext()) {
			WebElement i =it.next();
//			String URL1=i.getAttribute("href");
//			driver.switchTo().newWindow(WindowType.TAB);
//			driver.get(URL1);
//			Set<String> handles = driver.getWindowHandles();
//			driver.switchTo().window(current_Tab);
			
			
	// using action class		
			Actions a = new Actions(driver); 
		    a.sendKeys(Keys.CONTROL);
			i.click();
			a.sendKeys(Keys.TAB);
			
				
			
			Set<String> winndow_Handles = driver.getWindowHandles();
			driver.switchTo().window(current_Tab);
		
			
		}
		
		
	}
}
