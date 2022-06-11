package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Checkout;
import pageObjects.Remove;
import resources.Base;

public class StepDefination4 extends Base {
	  @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		  driver =initializeDriver();
	    }

	    @When("^User clicks on add to cart button$")
	    public void user_clicks_on_add_to_cart_button() throws Throwable {
	    	Remove  a = new Remove(driver);
	    	a.getAddItem().click();
	        throw new PendingException();
	    }

	    @When("^User click on Remove$")
	    public void user_click_on_remove() throws Throwable {
	    	Remove  a = new Remove(driver);
	    	a.getRemove().click();
	        throw new PendingException();
	    }

	    @Then("^Item should be added in the cart$")
	    public void item_should_be_added_in_the_cart() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Item should be removed from thre cart$")
	    public void item_should_be_removed_from_thre_cart() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	 driver.get(strArg1);
	        throw new PendingException();
	    }

	    @And("^Enter (.+) and (.+)$")
	    public void enter_and(String username, String password) throws Throwable {
	    	Remove  a = new Remove(driver);
	        a.getUsername().sendKeys(username);
	        a.getPassword().sendKeys(password);
	        throw new PendingException();
	    }

	    @And("^click on login $")
	    public void click_on_login() throws Throwable {
	    	Remove  a = new Remove(driver);
	    	 a.getLogin().click();
	        throw new PendingException();
	    }

	    @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

}
