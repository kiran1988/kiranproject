package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststeps {
	
	static WebDriver driver=null;
	@Given("^launch the application$")
	public void launch_the_application() throws Exception {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	    
	}

	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String username, String password) throws Exception {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	    
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Exception {
	    driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
	}

	@Then("^page should be displayed facebook home page$")
	public void page_should_be_displayed_facebook_home_page() throws Exception {
	   
System.out.println("welcome to facebook home page");
}
}