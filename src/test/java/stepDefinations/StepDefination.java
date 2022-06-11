package stepDefinations;

import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefination extends Base {
	 	@Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
	    }
	 
	 	@And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	        driver.get(strArg1);
	    }

	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	        LoginPage lp =new LoginPage(driver);
	        lp.getUsername().sendKeys(username);
	        lp.getPassword().sendKeys(password);
	        lp.getLogin().click();
	    }

	    @Then("^Verify that user is succesfully logged in $")
	    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	        HomePage hp=new HomePage(driver);
	        Assert.assertTrue(hp.gettext().isDisplayed());
	    }

	    @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

	}

