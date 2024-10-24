package endtoend;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		driver.manage().window().maximize();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:/Users/LENOVO/Desktop/Screenshots/abc.png");
		FileUtils.copyFile(src, Dest);

	}

}
