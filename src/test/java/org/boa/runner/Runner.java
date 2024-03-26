package org.boa.runner;
/**
 * Initial configurations.
 */
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "org.boa"
        //tags = {"@acceptance"},
        //format = {
        //        "pretty",
        //        "html:target/cucumber-reports/cucumber-pretty",
        //        "json:target/cucumber-reports/CucumberTestReport.json",
        //        "rerun:target/cucumber-reports/rerun.txt"
        )
/**
 * Runner.java
 * Class to run tests.
 */
public class Runner {

}