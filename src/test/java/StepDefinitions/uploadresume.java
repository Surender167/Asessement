package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadresume {
	 
     public static WebDriver driver;

	@Given("user is on chrome browser of naukri application")
	public void user_is_on_chrome_browser_of_naukri_application() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}

	@When("user enters url of naukri application")
	public void user_enters_url_of_naukri_application() throws InterruptedException {
		
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
			}

	@When("user hits on search button of naukri application")
	public void user_hits_on_search_button_of_naukri_application() {
		
		System.out.println("user hits on search button of naukri application");
		
		
	}
	
	
	@When("user clicks on login button of naukri application")
	public void user_clicks_on_login_button_of_naukri_application() throws InterruptedException {
	   
		driver.findElement(By.xpath("(//div[.='Login'])[1]")).click();
   	Thread.sleep(2000);
	}
	
	@Then("user should see username and password")
	public void user_should_see_username_and_password() {
	 System.out.println("user should see username and password");  
	}


	@When("^user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_and(String username, String password) throws InterruptedException {
		
		
    	
    	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys(password);
		Thread.sleep(2000);
		
	}

//	@When("user enters the username and password")
//	public void user_enters_the_and(String username, String password) throws InterruptedException {
//		
//		driver.findElement(By.xpath("(//div[.='Login'])[1]")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(username);
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys(password);
//		Thread.sleep(2000);
//
//	}

	@When("hits on login button of naukri application")
	public void hits_on_login_button_of_naukri_application() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);

		
		
		}

	@Then("user should see the home page of naukri application")
	public void user_should_see_the_home_page_of_naukri_application() {
		
	 System.out.println("user should see the home page of naukri application");	
	}



}
