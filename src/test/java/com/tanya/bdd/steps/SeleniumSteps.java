package com.tanya.bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumSteps {

    @Given("^I have a webdriver$")
    public void i_have_a_webdriver() throws Throwable {

    }

    @When("^I open web page (.*)$")
    public void i_open_web_page_http_google_com(final String url) throws Throwable {
        System.out.println("Web URL: " + url);
    }

    @Then("^page title is (.*)$")
    public void page_title_is_Google(final String title) throws Throwable {
        System.out.println("Web page title: " + title);
    }

}
