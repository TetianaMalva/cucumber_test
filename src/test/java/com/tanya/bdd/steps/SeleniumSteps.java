package com.tanya.bdd.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSteps {

    private WebDriver driver;

    @Before
    public void createWebDriver() {
        driver = new FirefoxDriver();
    }

    @Given("^I have a webdriver$")
    public void i_have_a_webdriver() throws Throwable {
        Assert.assertNotNull(driver);
    }

    @When("^I open web page (.*)$")
    public void i_open_web_page_http_google_com(final String url) throws Throwable {
        driver.get(url);
    }

    @Then("^page title is (.*)$")
    public void page_title_is_Google(final String title) throws Throwable {
        Assert.assertEquals(driver.getTitle(), title);
        Assert.fail("Test fail");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}