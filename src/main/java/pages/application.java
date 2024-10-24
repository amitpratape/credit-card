package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.ls.LSOutput;

public class application {

	// @FindBy(xpath = "(//button[@name='New' and @type='button'])[1]")
	// private WebElement appnewbtn;

	@FindBy(xpath = "//li[@data-target-selection-name='sfdc:StandardButton.Application__c.New']//button[@name='New'][normalize-space()='New']")
	private WebElement appnewbtn;

	@FindBy(xpath = "(label[for='0127R000000ifoFQAQ'] div[class='changeRecordTypeOptionRightColumn'])")
	private WebElement recordType;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextbtn;

	@FindBy(xpath = "//button[@aria-label='Disposition']")
	private WebElement disposition;

	@FindBy(xpath = "//button[@aria-label='Sub Disposition']")
	private WebElement subdisposition;

	@FindBy(xpath = "//button[@aria-label='Application Status']")
	private WebElement appstatus;

	@FindBy(xpath = "//input[@name='Card_Limit__c']")
	private WebElement cardLimit;

	@FindBy(xpath = "//lightning-base-combobox-item[@data-value='Open']")
	private WebElement appstatusValue;

	@FindBy(xpath = "//input[@name='Offer_Expriy_Date__c']")
	private WebElement offerexpiry;

	@FindBy(xpath = "//button[@aria-label='Lead Source']")
	private WebElement leadsource;

	@FindBy(xpath = "//span[text()='Outbound']")
	private WebElement leadsourceoutbound;

	@FindBy(xpath = "//button[@aria-label='Partner Bank']")
	private WebElement partnerbank;

	@FindBy(xpath = "//span[text()='RBL']")
	private WebElement partnerbankRBL;

	@FindBy(xpath = "//input[@placeholder='Search Credit Card Segment Masters...']")
	private WebElement segment;

	@FindBy(xpath = "//strong[text()='EYL1']")
	private WebElement segmentValue;

	@FindBy(xpath = "//button[@name='SaveEdit']")
	private WebElement saveappbtn;

	@FindBy(xpath = "//slot[contains(text(),'BFLCA')]")
	public WebElement appno;

	@FindBy(xpath = "//button[@aria-label='Search']")
	private WebElement searchapp;

	@FindBy(xpath = ("//a[text()='Edit CC Application']"))
	private WebElement editCCApplication;

	public application(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickAppNewBtn() {
		try {
			appnewbtn.click();
		} catch (Exception e) {
			System.out.println(e);
		}

		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("arguments[0].click()", appnewbtn);
	}

	public void selectRecordType() {
		recordType.click();
	}

	public void setApplicationRecordType() {

		nextbtn.click();
	}

	public void setapplicationstatus() {
		// editappstatus.click();
		// editappstatus.sendKeys("Open");
		appstatus.click();
		appstatusValue.click();
	}

	public void setCardLimit() {
		cardLimit.sendKeys("50000");
	}

	public void setapplicationOfferexpiryDate() {
		offerexpiry.sendKeys("10/11/2025");
	}

	public void SetApplicationLeadSource(WebDriver driver) {
		// leadsource.click();
		// leadsourceoutbound.click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", leadsource);
		js.executeScript("arguments[0].click();", leadsourceoutbound);
	}

	public void setApplicationPartnerBank() {
		partnerbank.click();
		partnerbankRBL.click();

	}

	public void Setsegment() {
		segment.sendKeys("EYL1");
		segmentValue.click();
	}

	public void clickSaveApplicationBtn() {

		saveappbtn.click();
	}

	public void Openapp() throws InterruptedException {
		String appnum = appno.getText();
		System.out.println(appnum);
		Thread.sleep(3000);
		searchapp.sendKeys(appnum);
		searchapp.submit();

	}

	public void clickeditCCApplicationBtn(WebDriver driver) {
		try {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", editCCApplication);

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
