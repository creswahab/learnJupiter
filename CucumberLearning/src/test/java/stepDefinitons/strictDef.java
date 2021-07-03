package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class strictDef {
	WebDriver driver;
	
	@Given("^user is moving to google\\.co\\.in$")
	public void user_is_moving_to_google_co_in() throws Throwable {
		driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}

	@When("^user is typing search term \"([^\"]*)\"$")
	public void user_is_typing_search_term(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys("India");
	}

	/*@When("^press enter key$")
	public void press_enter_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}*/

	@Then("^Verify the output$")
	public void verify_the_output() throws Throwable {
		boolean status =driver.findElement(By.partialLinkText("India")).isDisplayed();
		if (status) {
			System.out.println("Results are displayed");
		}
	}


}
