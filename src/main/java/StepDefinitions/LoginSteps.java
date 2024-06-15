package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;

	@Given("^User is on Application Home Page$")
	public void user_is_on_Application_Home_Page() {		
		// Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		System.out.println("Edge driver launched");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Application Page Title is FREE CRM$")
	public void application_Page_Title_is_FREE_CRM() {
		// Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"divUsername\"]/span")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"divPassword\"]/span")).sendKeys("admin123");
		

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		// Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}

	@When("^USer navigate to user Profile Page$")
	public void user_navigate_to_user_Profile_Page(){
		// Write code here that turns the phrase above into concrete actions
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Given("^User is on Application home Page$")
	public void user_is_on_Application_home_Page()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^User clicks on Sign-up Page$")
	public void user_clicks_on_Sign_up_Page()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^User fills the sign-up form$")
	public void user_fills_the_sign_up_form()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^user clicks the submit button$")
	public void user_clicks_the_submit_button()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^Display already registered message$")
	public void display_already_registered_message()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^Navigate to reset password page$")
	public void navigate_to_reset_password_page()  {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
