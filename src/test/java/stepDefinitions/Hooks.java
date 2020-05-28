package stepDefinitions;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	
	@After()
	public void after() {
		driver.quit();
		System.out.println("Driver quit successfully");
	}


}
