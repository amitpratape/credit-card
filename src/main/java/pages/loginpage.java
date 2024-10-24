package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='Login']")
	private WebElement login;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void launchBrowser(WebDriver driver) {
		driver.get("https://bflcdpc--movement.sandbox.lightning.force.com/lightning/o/Customer_Detail__c/list?filterName=__Recent");
		driver.manage().window().maximize();
	}

	

	public void setSalesforceLoginpageUsername() {
		// username.sendKeys("abhijit.sawant@bizsupporta.com.cardsuat");
		//	username.sendKeys("abhijit.sawant@bizsupporta.com.movement");
		username.sendKeys("amit.pratape@bizsupporta.com.prod.movement");

	}

	public void setSalesforceLoginPassword() {
		// password.sendKeys("Bajaj@123321");abhijit
		password.sendKeys("Bajaj@123");

	}

	public void clickSalseforcelofinBtn() {
		login.click();
	}

}
