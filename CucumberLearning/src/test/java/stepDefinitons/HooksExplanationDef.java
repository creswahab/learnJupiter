package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksExplanationDef {

	@Given("^Thanos has an Infinity stone$")
	public void thanos_has_an_Infinity_stone() throws Throwable {
	   System.out.println("Thanos has an Infinity stone");
	}

	@When("^Thanos snaps his finger$")
	public void thanos_snaps_his_finger() throws Throwable {
	    System.out.println("Thanos snaps his finger");
	}

	@Then("^Half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
	    System.out.println("Half of the living things died");
	}

}
