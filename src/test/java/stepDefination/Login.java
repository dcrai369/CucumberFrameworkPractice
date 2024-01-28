package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Hooks{

	WebDriver driver;
	@Given("User launch the application")
	public void user_launch_the_application() {
	   // driver=new ChromeDriver();
	   // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Before()
	public void setup() {
		 driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@After()
	public void tearDon(){
		driver.quit();
		
	}
	@SuppressWarnings("deprecation")
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
