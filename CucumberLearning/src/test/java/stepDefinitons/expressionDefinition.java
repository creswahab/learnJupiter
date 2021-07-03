package stepDefinitons;

import cucumber.api.java.en.Given;

public class expressionDefinition {

	@Given("^I have (\\d+) laptops$")
	public void I_have_2_laptops(int count){
		System.out.println("Number of Laptops "+count);
	}
	
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float num) throws Throwable {
		System.out.println("My CGPA is  "+num);
	}
	
	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name1, String name2, String name3) {
	    System.out.println(name1+ " is elder to "+name2+ " and " + name3 );
	}

	
}
