package Web.steps.login;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BL001 extends Web.config.env_target {

    protected String url = tfile.getProperty("url");
    protected String username = tfile.getProperty("username");
    protected String password = tfile.getProperty("password");


    @Given("^user is on homepage$")
    public void user_is_on_homepage()throws Throwable {
        driver.get(url);
        }
    @When("^user navigates to Login Page$")
       public void user_navigates_to_Login_Page() throws Throwable  {
        Thread.sleep(2000);
        }
        @When("^user enters username and Password$")
        public void user_enters_username_and_Password$() throws Throwable {
            Thread.sleep(1000);
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("btnLogin")).click();
        }
    @Then("^success message is displayed$")
        public void success_message_is_displayed() throws Throwable {
            Thread.sleep(2000);
            driver.findElement(By.className("MuiButton-label")).click();
        }


    public BL001() throws IOException {
    }
}
