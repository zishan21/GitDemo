package stepDefinitions;



import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class step_search extends Base{
	//public WebDriver driver;
	@Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		
	    //driver = Base.getDriver();
		getDriver();
		
        
    }

    @When("^User searched for \"([^\"]*)\" Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	
    	driver.findElement(By.className("search-keyword")).click();
    	driver.findElement(By.className("search-keyword")).sendKeys(strArg1);
    	Thread.sleep(5000);

        
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4")).isDisplayed();
        
     
    }
    
    

   
    

    @Then("^verify selected \"([^\"]*)\" items are displayed in Check out page$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    	
        
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	driver.findElement(By.className("increment")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
    	Thread.sleep(5000);
    	
    }


}
