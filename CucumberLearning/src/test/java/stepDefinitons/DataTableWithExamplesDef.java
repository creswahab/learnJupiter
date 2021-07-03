package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExamplesDef {
	WebDriver driver;
	
	@Given("^The User is on OrangeHRM login page$")
	public void the_User_is_on_OrangeHRM_login_page()  {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^Enters the \"([^\"]*)\" and \"([^\"]*)\" in the application$")
	public void enters_the_and_in_the_application(String username, String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^click login button$")
	public void click_login_button()  {
		driver.findElement(By.id("btnLogin")).click();
	}
}
