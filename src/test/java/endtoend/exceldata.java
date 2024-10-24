package endtoend;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceldata {

	public void launchBrowser(WebDriver driver) {
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Username_Value = " ";
		String Password_Value = " ";
		
		FileInputStream file = new FileInputStream(
				"C:\\Users\\LENOVO\\Desktop\\Screenshots\\practice stuff\\Login_data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Credential");

		int row_Count = sheet.getLastRowNum();
		int column_count = sheet.getRow(0).getLastCellNum();
		System.out.println("total row count " + row_Count);
		System.out.println("total column count " + column_count);

		for (int i = 1; i <= row_Count; i++) {
			XSSFRow cell_data = sheet.getRow(i);

			 Username_Value = cell_data.getCell(0).getStringCellValue();
			 Password_Value = cell_data.getCell(1).getStringCellValue();
			System.out.println(Username_Value);
			System.out.println(Password_Value);

		}

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://bflcdpc--movement.sandbox.lightning.force.com/lightning/o/Customer_Detail__c/list?filterName=__Recent");
		driver.manage().window().maximize();
		
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username_Value);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password_Value);
		 driver.findElement(By.xpath("//input[@id='Login']")).click();

		

	}

}
