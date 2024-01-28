package stepDefination;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Utility;

public class Login {

	WebDriver driver;
	Scenario scenario;
	@Before()
	public void setup() {
		 driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	 @After
	    public void tearDown(Scenario scenario) {
		 String scenarioName="";
	        if (scenario.isFailed()) {
	            // Take screenshot and embed it in the Cucumber report
	        	 TakesScreenshot ts = (TakesScreenshot) driver;

		            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
		            scenario.attach(screenshotBytes, "image/png", scenarioName+ "_screenshot");;
	        }

	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    private void captureScreenshot(String scenarioName) {
	        try {
	            TakesScreenshot ts = (TakesScreenshot) driver;

	            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshotBytes, "image/png", scenarioName + "_screenshot");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	@Given("User launch the application")
	public void user_launch_the_application() {
	   // driver=new ChromeDriver();
	   // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("User launch the application and failed test")
	public void user_launch_the_applicationfailed() {
	   // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Assert.assertTrue(false);
	}

//	@BeforeMethod()
//	public void setup(Scenario scenario) {
//		 driver=new ChromeDriver();
//		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//	@AfterMethod()
//	public void tearDon() throws IOException{
//		
//		driver.quit();
//	}
	
	
	@Given("User enter username and password")
	public void user_enter_username(DataTable datatable) throws InterruptedException {
		List<List<String>> userRegistration=datatable.asLists(String.class);

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions
		        .visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys(userRegistration.get(0).get(0));
		 wait.until(ExpectedConditions
			     .visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys(userRegistration.get(0).get(0));
	  
	}

	@Given("User enter username and password as Maps")
	public void user_enter_username_as_Maps(DataTable usercredentialsAsMaps) throws InterruptedException {
		
  
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions
			     .visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys(Keys.F5);
		 Thread.sleep(4000);

		 List<Map<String,String>> asMaps=usercredentialsAsMaps.asMaps(String.class,String.class);

		 wait.until(ExpectedConditions
			        .visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys(asMaps.get(1).get("usernameCol"));

	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	}

	@Then("User verify Page title")
	public void user_verify_page_title() {
	   
	}



}
