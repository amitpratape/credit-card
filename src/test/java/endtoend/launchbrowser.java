package endtoend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchbrowser {
	
	@Test
	
	public void name() {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://bflcdpc--movement.sandbox.lightning.force.com/lightning/r/Application__c/a0S9I0000015fMvUAI/view");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amit.pratape@bizsupporta.com.prod.movement");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bajaj@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		//String edit = "//a[@id='flexipage_tab3__item']";
		
		//driver.findElement(By.xpath("//a[@id='flexipage_tab3__item']")).isDisplayed();
	//	Actions action = new Actions(driver); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Edit CC Application")).sendKeys(Keys.RETURN);
		
	}	
		

	

	
}
