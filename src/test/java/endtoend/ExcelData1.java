package endtoend;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData1 {

	public void launchBrowser(WebDriver driver) {
		driver.get(
				"https://bflcdpc--movement.sandbox.lightning.force.com/lightning/o/Customer_Detail__c/list?filterName=__Recent");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			ExcelData1 exl = new ExcelData1();
			exl.launchBrowser(driver);
			WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

			try (FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Screenshots\\practice stuff\\Login_data.xlsx");
					XSSFWorkbook workbook = new XSSFWorkbook(file)
							) 
			{
				    XSSFSheet sheet = workbook.getSheet("Credential");

				for (int i = 1; i <= sheet.getLastRowNum(); i++) 
				{
					XSSFRow cell_data = sheet.getRow(i);
					String Username_Value = cell_data.getCell(0).getStringCellValue();
					String Password_Value = cell_data.getCell(1).getStringCellValue();
					username.sendKeys(Username_Value);
					password.sendKeys(Password_Value);
					
				}
				
			} // Automatically closes resources
			
			//driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
