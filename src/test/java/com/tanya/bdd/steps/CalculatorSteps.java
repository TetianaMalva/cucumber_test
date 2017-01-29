package com.tanya.bdd.steps;

import com.tanya.bdd.calculator.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by tanya on 1/15/17.
 */
public class CalculatorSteps {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(result, calculator.getResult());
    }

    @When("^I subtract (\\d+) and (\\d+)$")
    public void i_subtract_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.subtract(arg1, arg2);
    }

    @When("^I multiply (\\d+) and (\\d+)$")
    public void multiply_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.multiply(arg1, arg2);
    }
}