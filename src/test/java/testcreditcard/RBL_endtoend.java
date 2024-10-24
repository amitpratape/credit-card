package testcreditcard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.application;
import pages.customerpage;
import pages.loginpage;
import pages.telecallingpage;

public class RBL_endtoend {

	WebDriver driver = new ChromeDriver();
	application ap = new application(driver);
	customerpage cp = new customerpage(driver);
	loginpage lp = new loginpage(driver);
	telecallingpage tl = new telecallingpage(driver);
	

	// log in

	@Test(priority = 1)

	public void salesforceLogin() {
		lp.launchBrowser(driver);
		lp.setSalesforceLoginpageUsername();
		lp.setSalesforceLoginPassword();
		lp.clickSalseforcelofinBtn();

	}

	@Test(priority = 2)

	public void createCustomer() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		cp.createCustRecord(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cp.enterPan();
		cp.enterDOB();
		cp.enterMobile();
		cp.clickGenderDropdown();
		cp.clickGenderDropdownValue();
		cp.clickSalutationDropdown();
		cp.clickSalutationDropdownValue();
		cp.enterFirstName();
		cp.enterLastName();
		cp.enterMiddleName();
		cp.Save();
		cp.clickToRelated(driver);
		cp.clickToApplication(driver);
	}

	@Test(priority = 3)
	public void createApplication() {
		ap.clickAppNewBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ap.setApplicationRecordType();
		ap.clickAppNewBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ap.setapplicationstatus();
		ap.setCardLimit();
		ap.Setsegment();
		ap.setapplicationOfferexpiryDate();
		ap.SetApplicationLeadSource(driver);
		ap.setApplicationPartnerBank();
		ap.clickSaveApplicationBtn();
		cp.clickToApplication(driver);

	}

	@Test(priority = 4)
	public void doTelecalling() {
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		ap.clickeditCCApplicationBtn(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		tl.selectOffer();
		tl.clickMobileverified(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		tl.setDisposition(driver);
		tl.setSubDisposition(driver);
		tl.correncepincode();
		tl.ClickOnAuthonticationSaveButton(driver);

		// personal Section

		tl.checkPersonalSectionVisible(driver);
		tl.setmaritalstatus(driver);
		tl.setAdharDob(driver);
		tl.setemail(driver);
		tl.setaltmobno(driver);
		tl.ClickOnSavePersonalInformationSection(driver);
		
		
		// Address detailed section
		
		tl.check_ADDRESS_DETAILS_Section_Visible(driver);
		tl.ckick_to_manualEdit_toggle(driver);
		tl.enter_CORR_HOUSE_FLAT_NO(driver);
		tl.enter_CORR_BUILDING_SOCIETY_NAME(driver);
		tl.enter_CORR_STREET_LANDMARK_NAME(driver);
		tl.enter_CORRESPONDANCE_PINCODE();
		tl.Get_CORRESPONDANCE_CITY();
		tl.Get_CORRESPONDANCE_STATE();
		tl.Enter_Office_Company_Name();
		tl.Enter_OFFICE_BUILDING_NAME();
		tl.Enter_OFFICE_STREET_LANDMARK();
		tl.enter_OFFICE_PINCODE();
		tl.Get_OFFICE_CITY();
		tl.Get_OFFICE_STATE();
		tl.Click_Employment_Business();
		tl.Enter_COMPANY();
		tl.Enter_DESIGNATION();
		tl.Click_Preferred_location_for_delivery();
		tl.click_Save_address_section();
		tl.wait_till_bypassAQI(driver);
		
		
		
		
		
		

	}

}
