package endtoend;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

public class Testng_Listner_Class extends Testng_Listner_Demo implements ITestListener{
	//WebDriver driver =new ChromeDriver();
	public void onTestStart(ITestResult result) {
	   result.getName();
	  }
	
	public void onTestSuccess(ITestResult result) {
		result.getName();
		result.getClass();
	}
	
	public void onTestFailure(ITestResult result) {
	    
		try {	
			
			
			  result.getName();
			  result.getClass();
			//  captureScreenshots();
			   Date d = new Date();
			  String date = d.toString().replace(":", "_").replace(" ", "");
		        String path = "C:\\Users\\LENOVO\\Desktop\\Screenshots\\" + date + ".png";
		        System.out.println(date);
		        TakesScreenshot screenshot = ((TakesScreenshot) driver);
		        File source = screenshot.getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(source, new File(path));
			  
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void onTestSkipped(ITestResult result) {
	    // not implemented
		System.out.println("testcases skipped");
		throw new SkipException("this method has skipped");
	  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	  public void onTestFailedWithTimeout(ITestResult result) {
	   
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
	   * tag and calling all their Configuration methods.
	   *
	   * @param context The test context
	   */


	
	public void onStart(ITestContext context) {
	    // not implemented
		System.out.println("onstart method invoked");
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("onstart method invoked");
	  }

	


}
