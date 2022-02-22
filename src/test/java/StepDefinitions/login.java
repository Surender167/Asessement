package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
public static	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	}

	@Given(": I will open the browser")
	public void i_am_opening_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When(": I am navigating to ecommerce website")
	public void i_am_navigating_to_shopping_website() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
	}

	@When(": I am entering the UserName & Password")
	public void i_am_entering_UserName_Password() {
		driver.findElement(By.id("ap_email")).sendKeys("Surenderreddy71@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Chinny2418@");
	}

	@When(": I am clicking on the login button")
	public void i_am_click_on_loginbutton() {
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then(": Home page should be displayed after login")
	public void home_page_should_be_displayed_after_login() {
		driver.findElement(By.id("nav-logo-sprites")).click();
	}

	@Then(": Home page should be displayed after login after that user name should be displayed on home page")
	public void home_page_should_be_displayed_after_login_and_user_name_should_be_displayed_on_home_page()
			throws Exception {
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	}

	@And(": I am click on products menu")
	public void i_am_click_on_products_menu() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One plus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// driver.findElement(By.xpath("//div[@id='nav-main']//a[3]")).click();
	}

	@Then(": Home page should be displayed after products also should be displayed on home page")
	public void home_page_should_be_displayed_after_products_should_be_displayed_on_home_page() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
	}

	@Then(": User should be ib logged and search funcionality present on home page")

	public void user_shouldbeloggedin_and_searchfunctionality_should_bepresent() {
		

		if (driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).isDisplayed())
			;
		System.out.println("User search button is displayed");
	}
//
//	@After
//	public void closeBrowser() throws Exception {
//		driver.close();
//	}

}