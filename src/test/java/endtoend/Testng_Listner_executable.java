package endtoend;

import org.testng.annotations.Test;

//@Listeners (Testng_Listner_Class.class)
public class Testng_Listner_executable extends Testng_Listner_Demo{
	
	Testng_Listner_Demo tld =new Testng_Listner_Demo();

	@Test(priority = 1)
	public void user_Login() {
		tld.launchBrowser();
	}
	
	@Test(dependsOnMethods = "user_Login" ,priority = 2 )
	public void username() {
		tld.setSalesforceLoginPageUsername();
	}
	
	@Test(dependsOnMethods = "username",priority = 3)
	public void password() {
		tld.setSalesforceLoginPassword();
	}
	
	@Test(dependsOnMethods = "password",priority = 4)
	public void clicled_On_login() {
		tld.clickSalesforceLoginBtn();
	}


}
