package endtoend;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testng_Listner_Demo {

     WebDriver driver = new ChromeDriver();
   // private Date d = new Date();

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        driver.manage().window().maximize();
    }

    public void setSalesforceLoginPageUsername() {
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("amit.pratape@bizsupporta.com.prod.movement");
    }

    public void setSalesforceLoginPassword() {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Bajaj@123");
    }

    public void clickSalesforceLoginBtn() {
        WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
        login.click();
    }

    public void verifyTitle() {
        String expectedTitle = "Home | Salesforce";
        String actualTitle = driver.getTitle();
        // Add assertions or logging here
        
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void captureScreenshots() throws IOException{
//        String date = d.toString().replace(":", "_").replace(" ", "");
//        String path = "C:\\Users\\LENOVO\\Desktop\\Screenshots\\" + date + ".png";
//        System.out.println(date);
//        TakesScreenshot screenshot = ((TakesScreenshot) driver);
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(source, new File(path));
    }
}
