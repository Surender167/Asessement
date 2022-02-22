package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class products {
	public static WebDriver driver;

	@Given(": User is on the chrome browser")
	public void user_is_on_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When(": user enters url")
	public void user_enters_url() {

		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();

	}

	@Then(": user should see username and password text box")
	public void user_should_see_username_and_password_text_box() {

		System.out.println("user should see username and password text box");
	}

	@When(": username enters username and password")
	public void username_enters_username_and_password() throws Throwable {

		driver.findElement(By.id("email")).sendKeys("surenderreddy71@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwd")).sendKeys("Surender5850@");
		Thread.sleep(3000);

	}

	@And(": Clicks on sign in button")
	public void clicks_on_sign_in_button() {
		driver.findElement(By.xpath("//i[@class='icon-lock left']/..")).click();

	}

	@Then(": user should see the home page of products")
	public void user_should_see_the_home_page_of_products() {
		boolean cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']")).isDisplayed();
        if(cart==true)
        {
            System.out.println("given user on homepage");
        }
        else
        {
            System.out.println("given user is not on homepage");
        }
	}
//	@After
//	public void closeBrowser() throws Exception {
//		driver.close();
//	}
}
