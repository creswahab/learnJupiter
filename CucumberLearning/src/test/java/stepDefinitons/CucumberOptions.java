package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberOptions {
	WebDriver driver;
	
	@Given("^user is navigating to google\\.co\\.in$")
	public void user_is_navigating_to_google_co_in() throws Throwable {
		driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}

	@When("^user is entering the search term \"([^\"]*)\"$")
	public void user_is_entering_the_search_term(String arg1) throws Throwable {
		 driver.findElement(By.name("q")).sendKeys("India");
	}

	@When("^entering return key$")
	public void entering_return_key() throws Throwable {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^Verify the search result$")
	public void verify_the_search_result() throws Throwable {
		boolean status =driver.findElement(By.partialLinkText("India")).isDisplayed();
		if (status) {
			System.out.println("Results are displayed");
		}
	}
}
