package stepDefinitons;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginDefinition {
	WebDriver driver;
	
	@Given("^User is on login page$")
	public void User_is_on_login_page(){
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	@When("^the User enters valid UserName and Password$")
	public void the_User_enters_valid_UserName_and_Password() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^User should be navigated to Home Page$")
	public void user_should_be_navigated_to_Home_Page() {
		boolean status = driver.findElement(By.linkText("Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
