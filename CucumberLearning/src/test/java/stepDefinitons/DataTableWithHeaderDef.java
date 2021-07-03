package stepDefinitons;

import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDef {
	WebDriver driver;
	
	@Given("^You should be on OrangeHRM login page$")
	public void you_should_be_on_OrangeHRM_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^the User enters below valid credentials from the DataTable$")
	public void the_User_enters_below_valid_credentials_from_the_DataTable(DataTable dataTable)   {
		
		List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class, String.class);
		String username = keyValuePair.get(0).get("UserName");
		String password = keyValuePair.get(0).get("PassWord");
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^clicks the login button and navigate to application$")
	public void clicks_the_login_button_and_navigate_to_application()  {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^You should be on Home Page and verify result as expected$")
	public void you_should_be_on_Home_Page_and_verify_result_as_expected()  {
		boolean status = driver.findElement(By.linkText("Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
