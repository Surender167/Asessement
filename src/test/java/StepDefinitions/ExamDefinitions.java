package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamDefinitions {
	WebDriver driver;
	@Given("the user is on browser")
	public void the_user_is_on_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("user enters amazon website on browser")
	public void user_enters_amazon_website_on_browser() {
		driver.get("https://www.amazon.com");

//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")); 
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("https://www.amazon.com");   
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
	}

	@When("^user enters the\\\"(.*)\\\"$")
	public void user_login_by_entering_username_and_password() {
    
      driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click() ; 		
      
	   
	}}
//
//	@When("user clicks the login button")
//	public void user_clicks_the_login_button() {
//	    
//	}
//
//	@Then("user should see the homepage")
//	public void user_should_see_the_homepage() {
//	    
//	}
//
//	@Then("user should see the user name displayed on the homepage")
//	public void user_should_see_the_user_name_displayed_on_the_homepage() {
//	   
//	}
//
//	@Then("user should see the search button on home page")
//	public void user_should_see_the_search_button_on_home_page() {
//	   
//	}
//
//	@When("user clicks on any product on homepage")
//	public void user_clicks_on_any_product_on_homepage() {
//	    
//	}
//
//	@Then("User should be redirected to product specification page")
//	public void user_should_be_redirected_to_product_specification_page() {
//	    
//	}
//
//	@When("user clicks on user name displayed on home page")
//	public void user_clicks_on_user_name_displayed_on_home_page() {
//	    
//	}
//
//	@Then("user profile should be displayed")
//	public void user_profile_should_be_displayed() {
//	    
//	}
//
//}

