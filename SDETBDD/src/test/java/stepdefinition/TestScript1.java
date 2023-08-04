package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1 {
	WebDriver driver;
	
	@Given("Open chrome browser and the url of the application")
	public void Open_chrome_browser_and_the_url_of_the_application() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.openmrs.org/openmrs/login.htm");
		System.out.println("Chrome browser and url of the application opened");
		
	}
	@When("Enter vaild Username, valid password")
	public void enter_vaild_username_valid_password() {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
	    System.out.println("Valid username and valid password id entered");
	}
	@When("Select location for this session")
	public void Select_location_for_this_session() {
		driver.findElement(By.xpath("//*[@id='sessionLocation']")).click();
		System.out.println("location of this session is selected ");
	}
	@When("Click on the Login button")
	public void Click_on_the_Login_button() {
		driver.findElement(By.id("loginButton")).click();
		System.out.println("login button clicked");
	}
	@Then("Login to the account")
	public void Login_to_the_account() {
		System.out.println("Account opened");
	}
	@When("Enter invaild Username, invalid password")
	public void enter_invaild_username_invalid_password() {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin1234");
		System.out.println("invalid username and invalid password id entered");
	}

	@Then("Error message to be displayed -Invalid details")
	public void error_message_to_be_displayed_invalid_details() {
		System.out.println("error message displayed-Invalid details");
	}
}
