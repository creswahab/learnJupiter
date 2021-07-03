package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExampleDef {
	
@Given("^Student should finished High School$")
public void student_should_finished_High_School() throws Throwable {
	   System.out.println("Student should finished High School");
}

@Given("^Student should finished High Secondary$")
public void student_should_finished_High_Secondary() throws Throwable {
	   System.out.println("Student should finished High Secondary");
}

	
@Given("^Student applied for Medical Course$")
public void student_applied_for_Medical_Course() throws Throwable {
	   System.out.println("Student applied for Medical Course");
}


@When("^Student should write entrance exam$")
public void student_should_write_entrance_exam() throws Throwable {
   System.out.println("Student should write entrance exam");
}

@Then("^Student has to join Medical College$")
public void student_has_to_join_Medical_College() throws Throwable {
    System.out.println("Student has to join Medical College");
}

@Given("^Student applied for Engineering Course$")
public void student_applied_for_Engineering_Course() throws Throwable {
   System.out.println("Student applied for Engineering Course");
}

@When("^Student should have eligible cut-off$")
public void student_should_have_eligible_cut_off() throws Throwable {
    System.out.println("Student should have eligible cut-off");
}

@Then("^Student has to join Engineering College$")
public void student_has_to_join_Engineering_College() throws Throwable {
   System.out.println("Student has to join Engineering College");
}
}
