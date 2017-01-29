package com.tanya.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by tanya on 1/15/17.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.tanya.bdd.steps",
        features = "classpath:cucumber/selenium.feature"
)
public class RunCalculatorTest {
}


