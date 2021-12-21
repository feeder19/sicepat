package Web.testsuites;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Web\\scenario",
        glue={"Web/steps"},
        plugin = {"pretty", "html:target/cucumber-html-report"})


public class TSuites001  {

    }



