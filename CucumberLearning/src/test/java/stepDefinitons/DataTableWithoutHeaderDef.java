package stepDefinitons;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDef {
	WebDriver driver;
	
	@Given("^You are on OrangeHRM login page$")
	public void you_are_on_OrangeHRM_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^the User enters below credentials$")
	public void the_User_enters_below_credentials(DataTable dataTable) {
		List<String> credentials = dataTable.asList(String.class);
		String userName = credentials.get(0);
		String passWord = credentials.get(1);
		
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(passWord);
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^You should Home Page and verify result$")
	public void you_should_Home_Page_and_verify_result() {
			boolean status = driver.findElement(By.linkText("Admin")).isDisplayed();
			Assert.assertTrue(status);
		}  

}
