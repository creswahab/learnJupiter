package stepDefinitons;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginwithdataDefinition {
	WebDriver driver;
	
	@Given("^User is on OrangeHRM login page$")
	public void user_is_on_OrangeHRM_login_page()  {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^the User enters valid credentils \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_User_enters_valid_credentils_and(String userName, String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);

	}

	@When("^clicks on login button to navigate$")
	public void clicks_on_login_button_to_navigate(){
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^User should be navigated to Home Page and verify result$")
	public void user_should_be_navigated_to_Home_Page_and_verify_result() {
		boolean status = driver.findElement(By.linkText("Admin")).isDisplayed();
		Assert.assertTrue(status);
	}
}
