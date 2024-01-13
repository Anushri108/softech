package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {

	@Given("regression scenario Step1")
	public void regression_scenario_step1() {
		System.out.println("regression scenario Step1");
	}

	@When("regression scenario Step2")
	public void regression_scenario_step2() {
		System.out.println("regression scenario Step2");
	}

	@Then("regression scenario Step3")
	public void regression_scenario_step3() {
		System.out.println("regression scenario Step3");
	}

	@Given("Sanity scenario Step1")
	public void sanity_scenario_step1() {
		System.out.println("Sanity scenario Step1");
	}

	@When("Sanity scenario Step2")
	public void sanity_scenario_step2() {
		System.out.println("Sanity scenario Step2");
	}

	@Then("Sanity scenario Step3")
	public void sanity_scenario_step3() {
		System.out.println("Sanity scenario Step3");
	}

	@Given("SystemTesting scenario Step1")
	public void system_testing_scenario_step1() {
		System.out.println("System Testing scenario Step1");
	}

	@When("SystemTesting scenario Step2")
	public void system_testing_scenario_step2() {
		System.out.println("System Testing scenario Step2");

	}

	@Then("SystemTesting scenario Step3")
	public void system_testing_scenario_step3() {
		System.out.println("System Testing scenario Step3");

	}

	
	@Given("Login scenario Step1")
	public void login_scenario_step1() {
	    System.out.println("Login scenario Step1");
	}

	@When("Login scenario Step2")
	public void login_scenario_step2() {
	    System.out.println("Login scenario Step2");
	}

	@Then("Login scenario Step3")
	public void login_scenario_step3() {
	   System.out.println("Login scenario Step3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
