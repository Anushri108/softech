@EndToEndTesting
Feature: Test Orange hRM Application
	#@Regression or not @SystemTesting or @Sanity"
	
	#true || true || false
  @Regression
  Scenario: Test Regression Scenario
    Given regression scenario Step1
    When regression scenario Step2
    Then regression scenario Step3

	#false || true || true
  @Sanity
  Scenario: Test Sanity Scenario
    Given Sanity scenario Step1
    When Sanity scenario Step2
    Then Sanity scenario Step3

	#false || false || false
  @SystemTesting
  Scenario: Test SystemTesting Scenario
    Given SystemTesting scenario Step1
    When SystemTesting scenario Step2
    Then SystemTesting scenario Step3

	#false || true || false
  @Login
  Scenario: Test Login Scenario
    Given Login scenario Step1
    When Login scenario Step2
    Then Login scenario Step3
