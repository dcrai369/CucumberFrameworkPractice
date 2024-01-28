package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.Utility;

public class Hooks {
	//WebDriver driver;

//	@Before()
//	public void setup() {
//		 driver=new ChromeDriver();
//		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//	@After()
//	public void tearDonwn(ITestResult result) throws IOException{
//		if(result.getStatus()==ITestResult.FAILURE) {
//			captureScreenHot(result.getName());
//		}
//		driver.quit();
//	}
////	
//	private void captureScreenHot(String testName) throws IOException 
//	{
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		
//		//destination wjhere to store
//		
//        String destination = "screenshots/" + testName + "_failure.png";
//        File fd=new File(destination);
//        
//        FileUtils.copyDirectory(source, fd);
//
//	}
}
