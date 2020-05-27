package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^Validate browser$")
    public void validate_browser() throws Throwable {
		System.out.println("PreGiven");
    }

    @When("^browser is open$")
    public void browser_is_open() throws Throwable {
    	System.out.println("PreWhen");
    }

    @Then("^hit url$")
    public void hit_url() throws Throwable {
    	System.out.println("PreThen");
    }

    @And("^verify title$")
    public void verify_title() throws Throwable {
    	System.out.println("PreAnd");
    }

	
	 @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	       System.out.println("a");
	    }

	 	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1 + "and" + strArg2);
	    }

	    @Then("^Homa page is populated$")
	    public void homa_page_is_populated() throws Throwable {
	    	System.out.println("c");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	    }
	    
	    @When("^User signup with following details$")
	    public void user_signup_with_following_details(DataTable data) throws Throwable {
	    	List <List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0) + obj.get(0).get(1));
	        
	    }
	    
	    @When("^User login in to application with (.+) and (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
	    	System.out.println(username + "and" + password);
	    }



}
