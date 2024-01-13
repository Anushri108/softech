@EndToEndTesting @AllScenario
Feature: Test Cogmento CRM
		#@Regression or not @SystemTesting or @Sanity"
		
		#true || true || false
  @Regression
  Scenario: Test Regression Scenario
    Given regression scenario Step1 for Cogmento CRM
    When regression scenario Step2 for Cogmento CRM
    Then regression scenario Step3 for Cogmento CRM

	#false || true || true
  @Sanity
  Scenario: Test Sanity Scenario
    Given Sanity scenario Step1 for Cogmento CRM
    When Sanity scenario Step2 for Cogmento CRM
    Then Sanity scenario Step3 for Cogmento CRM
