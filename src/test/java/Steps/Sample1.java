package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample1 {

	@Given("regression scenario Step1 for Cogmento CRM")
	public void regression_scenario_step1_for_cogmento_crm() {
		System.out.println("regression scenario Step1 for Cogmento CRM");
	}

	@When("regression scenario Step2 for Cogmento CRM")
	public void regression_scenario_step2_for_cogmento_crm() {
		System.out.println("regression scenario Step2 for Cogmento CRM");
	}

	@Then("regression scenario Step3 for Cogmento CRM")
	public void regression_scenario_step3_for_cogmento_crm() {
		System.out.println("regression scenario Step3 for Cogmento CRM");
	}

	@Given("Sanity scenario Step1 for Cogmento CRM")
	public void sanity_scenario_step1_for_cogmento_crm() {
		System.out.println("Sanity scenario Step1 for Cogmento CRM");
	}

	@When("Sanity scenario Step2 for Cogmento CRM")
	public void sanity_scenario_step2_for_cogmento_crm() {
		System.out.println("Sanity scenario Step2 for Cogmento CRM");

	}

	@Then("Sanity scenario Step3 for Cogmento CRM")
	public void sanity_scenario_step3_for_cogmento_crm() {
		System.out.println("Sanity scenario Step3 for Cogmento CRM");

	}

}
