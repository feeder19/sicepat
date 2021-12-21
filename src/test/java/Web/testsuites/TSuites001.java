package Web.testsuites;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Web\\scenario",
        glue={"Web/steps"},
       // plugin = {"json:target/cucumber.json"})
       // plugin = {"pretty", "html:target/cucumber-html-report"})
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TSuites001  {

    }



