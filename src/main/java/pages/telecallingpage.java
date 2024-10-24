package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class telecallingpage {
	WebDriver driver;

	// offer section

	@FindBy(xpath = "(//th[@data-cell-value='CC30']/preceding-sibling::td//label)")
	private WebElement selectOffer;

	// AUTHONTICATION SECTION
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginbtn;

	@FindBy(xpath = "//lightning-formatted-text[text()='MOBILE VERIFIED']/ancestor::b/..//label")
	private WebElement mobileverified;

	@FindBy(xpath = "//lightning-formatted-text[text()='PAN VERIFIED']/ancestor::b/..//label")
	private WebElement panverified;

	@FindBy(xpath = "//button[@name='Disposition']")
	private WebElement disposition;

	@FindBy(xpath = "//span[text()='Interested']")
	private WebElement dispositionintrested;

	@FindBy(xpath = "//button[@name='Sub Disposition']")
	private WebElement subdisposition;

	@FindBy(xpath = "//div[@aria-label=\"Sub Disposition\"]//span[text()='Interested']")
	private WebElement subdispositionValue;

	@FindBy(xpath = "//input[@name='corr_pin']")
	private WebElement correspondancepin;

	@FindBy(xpath = "//button[text()='Save']/ancestor::lightning-button/..//button[@title='Save']")
	private WebElement saveauthonticationbtn;

	// PERSONAL INFORMATION

	@FindBy(xpath = "//button[@aria-label='Gender']")
	private WebElement gender;

	@FindBy(xpath = "//span[text()='Male']")
	private WebElement malevalue;

	@FindBy(xpath = "//button[@aria-label='Salutation']")
	private WebElement salutation;

	@FindBy(xpath = "//span[text()='Mr']")
	private WebElement mrvalue;

	@FindBy(xpath = "//button[@aria-label='Marital Status']")
	private WebElement maritalstatus;

	@FindBy(xpath = "//span[text()='Married']")
	private WebElement married;

	@FindBy(xpath = "//input[@name='DOB']")
	private WebElement dob;

	@FindBy(xpath = "//input[@name='Aadhar_DOB']")
	private WebElement AdharDob;

	@FindBy(xpath = "//input[@name='pan']")
	private WebElement pan;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='name_on_card']")
	private WebElement nameoncard;

	@FindBy(xpath = "//input[@name='Mobile_Number']")
	private WebElement mobileno;

	@FindBy(xpath = "//input[@name='altMobileNum']")
	private WebElement altMobileNum;

	@FindBy(xpath = "//lightning-formatted-text[text()='ALTERNATE MOBILE NUMBER']/ancestor::lightning-layout-item/../../following-sibling::div/descendant::button[text()='Save']")
	private WebElement savepersonalinfo;

	@FindBy(xpath = "//b[text()='PERSONAL INFORMATION']")
	private WebElement personalinfoSection;

	// Address detailed section

	@FindBy(xpath = "//b[text()='ADDRESS DETAILS']")
	private WebElement ADDRESS_DETAILS_Section;

	@FindBy(xpath = "//lightning-formatted-text[text()='Manual Edit']/following-sibling::lightning-input//span[@class='slds-checkbox_faux' and @part='indicator']")
	private WebElement manualEditToggle;

	@FindBy(xpath = "//lightning-formatted-text[text()='Bypass AQI']/following-sibling::lightning-input//span[@class='slds-checkbox_faux' and @part='indicator']")
	private WebElement bypassAQI;

	@FindBy(xpath = "//label[text()='Enter Pincode']/following-sibling::div//input")
	private WebElement enterPincode;

	@FindBy(xpath = "//label[text()='Search Address (Society / Building / Landmark Name)']/following-sibling::div//input")
	private WebElement searchAddress;

	@FindBy(xpath = "//lightning-formatted-text[text()='CORR. HOUSE/FLAT NO']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement CORR_HOUSE_FLAT_NO;

	@FindBy(xpath = "//lightning-formatted-text[text()='CORR. BUILDING/SOCIETY NAME']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement CORR_BUILDING_SOCIETY_NAME;

	@FindBy(xpath = "//lightning-formatted-text[text()='CORR. STREET/LANDMARK NAME']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement CORR_STREET_LANDMARK_NAME;

	@FindBy(xpath = "//lightning-formatted-text[text()='CORRESPONDANCE PINCODE']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement CORRESPONDANCE_PINCODE;

	@FindBy(xpath = "//lightning-formatted-text[text()='CORRESPONDANCE CITY']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement CORRESPONDANCE_CITY;

	@FindBy(xpath = "//label[text()='Corresponding State']/..//button[@aria-label='Corresponding State']")
	private WebElement CORRESPONDANCE_STATE;

	@FindBy(xpath = "//lightning-formatted-text[text()='Company Name']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement Office_Company_Name;

	@FindBy(xpath = "//lightning-formatted-text[text()='OFFICE BUILDING NAME']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement OFFICE_BUILDING_NAME;

	@FindBy(xpath = "//lightning-formatted-text[text()='OFFICE STREET/LANDMARK']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement OFFICE_STREET_LANDMARK;

	@FindBy(xpath = "//lightning-formatted-text[text()='OFFICE PINCODE']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement OFFICE_PINCODE;

	@FindBy(xpath = "//lightning-formatted-text[text()='OFFICE CITY']/../following-sibling::lightning-input/descendant::div//input")
	private WebElement OFFICE_CITY;

	@FindBy(xpath = "//lightning-formatted-text[text()='OFFICE STATE']/../following-sibling::lightning-combobox//span")
	private WebElement OFFICE_STATE;

	@FindBy(xpath = "//button[@aria-label='Employment/Business']")
	private WebElement Employment_Business;

	@FindBy(xpath = "//span[text()='Self Employed']")
	private WebElement Self_Employed;

	@FindBy(xpath = "//span[text()='Salaried']")
	private WebElement Salaried;

	@FindBy(xpath = "//lightning-formatted-text[text()='COMPANY']/../following-sibling::div//input")
	private WebElement COMPANY;

	@FindBy(xpath = "//span[text()='BAJAJ FINSERV']")
	private WebElement COMPANY_Value;

	@FindBy(xpath = "//lightning-formatted-text[text()='DESIGNATION']/../following-sibling::div//input")
	private WebElement DESIGNATION;

	@FindBy(xpath = "//span[text()='Software Engineer']")
	private WebElement DESIGNATION_Value;

	@FindBy(xpath = "//button[@aria-label='Preferred location for delivery']")
	private WebElement Preferred_location_for_delivery;

	@FindBy(xpath = "//span[text()='Residential']")
	private WebElement Preferred_location_for_delivery_Value;

	@FindBy(xpath = "//div[@class='section']//c-dbs-address-detail-section//div//button[@title='Save'][normalize-space()='Save']")
	private WebElement Save_address_section;

	public telecallingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logintelecaller() {
		loginbtn.click();
	}

	public void selectOffer() {
		selectOffer.click();
		System.out.println("CC30 offer is selected ");
	}

	public void clickMobileverified(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", mobileverified);

	}

	public void selectPanVerified(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", panverified);

	}

	public void setDisposition(WebDriver driver) {

		// disposition.click();
		// dispositionintrested.click();
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", disposition);
			js.executeScript("arguments[0].click()", dispositionintrested);

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public void setSubDisposition(WebDriver driver) {
		// subdisposition.click();
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", subdisposition);
			js.executeScript("arguments[0].click()", subdispositionValue);

		} catch (Exception e) {

			System.out.println(e);
		}
	}

//	public void setSubDispositionValue() {
//		subdispositionValue.click();
//
//	}

	public void correncepincode() {
		correspondancepin.clear();
		correspondancepin.sendKeys("411014");

	}

	public void ClickOnAuthonticationSaveButton(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		saveauthonticationbtn.isEnabled();

		saveauthonticationbtn.click();

	}

	// Personal Section

	public void checkPersonalSectionVisible(WebDriver driver) {

		try {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// boolean isdisplay = personalinfoSection.isDisplayed();
			if (personalinfoSection.isDisplayed()) {
				System.out.println("Personal Section is visible");
			}

			else {
				System.out.println("Personal Section is not visible");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void setgender(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		gender.click();
		malevalue.click();
	}

	public void setsalutation(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		salutation.click();
		mrvalue.click();
	}

	public void setmaritalstatus(WebDriver driver) {
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			maritalstatus.click();
			married.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setAdharDob(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		AdharDob.sendKeys("10-Dec-1992");
	}

	public void setpannumber(String pannumbr) {
		pan.sendKeys(pannumbr);
	}

	public void setemail(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		email.sendKeys("abhijit.sawant@bizsupporta.com");
	}

	public void setnameoncard() {
		nameoncard.sendKeys("");
	}

	public void setmobilenumber() {
		mobileno.sendKeys("8569854521");
	}

	public void setaltmobno(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		altMobileNum.sendKeys("8547858888");
	}

	public void ClickOnSavePersonalInformationSection(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		savepersonalinfo.click();
	}

	// Address detailed section

	public void check_ADDRESS_DETAILS_Section_Visible(WebDriver driver) {

		try {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// boolean isdisplay = ADDRESS_DETAILS_Section.isDisplayed();
			if (ADDRESS_DETAILS_Section.isDisplayed()) {
				System.out.println("Address Section is visible");
			}

			else {
				System.out.println("Address Section is not visible");
			}

		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

	public void ckick_to_manualEdit_toggle(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		manualEditToggle.click();
		
	}
	
	public void enter_CORR_HOUSE_FLAT_NO(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CORR_HOUSE_FLAT_NO.sendKeys("atmanagarkdk");
		
	}
	
	public void enter_CORR_BUILDING_SOCIETY_NAME(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CORR_BUILDING_SOCIETY_NAME.sendKeys("hjbsshbhbhbhb");
		
	}
	
	public void enter_CORR_STREET_LANDMARK_NAME(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CORR_STREET_LANDMARK_NAME.sendKeys("kjvhvgggcgv");
		
	}
	
	public void enter_CORRESPONDANCE_PINCODE() {
		CORRESPONDANCE_PINCODE.clear();
		CORRESPONDANCE_PINCODE.sendKeys("411014");
	}
	
	public void Get_CORRESPONDANCE_CITY() {
		CORRESPONDANCE_CITY.click();
		System.out.println("Get city name "+CORRESPONDANCE_CITY.getText()); 
	}
	
	public void Get_CORRESPONDANCE_STATE() {
		CORRESPONDANCE_STATE.click();
		System.out.println("Get state name "+CORRESPONDANCE_STATE.getText()); 
	}
	
	public void Enter_Office_Company_Name() {
		Office_Company_Name.sendKeys("hvbhdsbhdhc");
	}
	
	public void Enter_OFFICE_BUILDING_NAME() {
		OFFICE_BUILDING_NAME.sendKeys("fdsfdfdffdf");
	}
	
	public void Enter_OFFICE_STREET_LANDMARK() {
		OFFICE_STREET_LANDMARK.sendKeys("shbshbhsbhs");
	}
	
	public void enter_OFFICE_PINCODE() {
		OFFICE_PINCODE.clear();
		OFFICE_PINCODE.sendKeys("411014");
	}
	
	public void Get_OFFICE_CITY() {
		OFFICE_CITY.click();
		System.out.println("Get office city name "+OFFICE_CITY.getText()); 
	}
	
	public void Get_OFFICE_STATE() {
		OFFICE_STATE.click();
		System.out.println("Get office city name "+OFFICE_STATE.getText()); 
	}
	
	public void Click_Employment_Business() {
		try {
			Employment_Business.click();
			Salaried.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void Enter_COMPANY() {
		COMPANY.sendKeys("BAJAJ");
		COMPANY_Value.click();

	}
	
	public void Enter_DESIGNATION() {
		DESIGNATION.sendKeys("Software");
		DESIGNATION_Value.click();

	}
	
	public void Click_Preferred_location_for_delivery() {
		try {
			Preferred_location_for_delivery.click();
			Preferred_location_for_delivery_Value.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void click_Save_address_section() {
		Save_address_section.click();
	}
	
	 public void wait_till_bypassAQI(WebDriver driver) {
		 try {
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			wait.until(ExpectedCondition(elementToBeClickable(bypassAQI)));
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				if(bypassAQI.isEnabled())
				{
					bypassAQI.click();
					Save_address_section.click();
				}
		} catch (Exception e) {
			System.out.println(e);
		} 
		

		
	}

	private Object elementToBeClickable() {
		// TODO Auto-generated method stub
		return null;
	}

	private Function ExpectedCondition() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

