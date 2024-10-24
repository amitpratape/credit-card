package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerpage {
	@FindBy(xpath = "//div[@title='New']")
	private WebElement newButton;

	@FindBy(xpath = "//input[@name='PAN_Card_Number__c']")
	private WebElement panNumber;

	@FindBy(xpath = "//input[@name='Date_of_Birth__c']")
	private WebElement dob;

	@FindBy(xpath = "//input[@name='Mobile__c']")
	private WebElement mobile;

	@FindBy(xpath = "//button[@aria-label='Gender']")
	private WebElement Gender;

	@FindBy(xpath = "//span[@title='Male']")
	private WebElement GenderValue;

	@FindBy(xpath = "//button[@aria-label='Salutation']")
	private WebElement salutation;

	@FindBy(xpath = "//span[@title='Mr']")
	private WebElement salutationValue;

	@FindBy(xpath = "//input[@name='First_Name__c']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='Last_Name__c']")
	private WebElement lasttName;

	@FindBy(xpath = "//input[@name='Middle_Name__c']")
	private WebElement middleName;

	@FindBy(xpath = "//button[@name='SaveEdit']")
	private WebElement save;

	@FindBy(xpath = "//a[@data-label='Related']")
	private WebElement relatedTab;
	
	//@FindBy(xpath = "(//records-hoverable-link/descendant::a)[1]")
	@FindBy(xpath = "//table[@aria-label='Applications']/tbody/tr[@class='slds-hint-parent' and @role='row']")
	private WebElement application;

	public customerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createCustRecord(WebDriver driver) {
		newButton.click();

	}

	public void enterPan() {
		panNumber.sendKeys("DNIPP4242P");
	}

	public void enterDOB() {
		dob.sendKeys("10/12/1992");
	}

	public void enterMobile() {
		mobile.sendKeys("9521245120");
	}

	public void clickGenderDropdown() {
		Gender.click();
	}

	public void clickGenderDropdownValue() {
		GenderValue.click();
	}

	public void clickSalutationDropdown() {
		salutation.click();
	}

	public void clickSalutationDropdownValue() {
		salutationValue.click();
	}

	public void enterFirstName() {
		firstName.sendKeys("Akshay");
	}

	public void enterLastName() {
		lasttName.sendKeys("njdnjdcnj");
	}

	public void enterMiddleName() {
		middleName.sendKeys("hgftftfftf");
	}

	public void Save() {
		save.click();

	}

	public void clickToRelated(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		relatedTab.click();
	}
	
	public void clickToApplication(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Application = application.getAttribute("data-row-key-value");
		System.out.println("Application record Id -->"+Application);
		driver.get("https://bflcdpc--movement.sandbox.lightning.force.com/lightning/r/Application__c/" +Application+ "/view" );
	}
}