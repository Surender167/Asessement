package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();

	}

	@Given(": I will open the broswer")
	public void i_will_open_the_broswer() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("handled popups");
		System.out.println("chrome browser opened successfully");

	}

	@When(": Iam navigating to facebookpage")
	public void iam_navigating_to_facebookpage() {

		driver.navigate().to("https://www.facebook.com/");
		System.out.println("hits on fb url succesfully");

	}

	@SuppressWarnings("deprecation")
	@When(": I will enter \"(.*)\" & \"(.*)\"$")
	public void i_will_enter(String username, String password) throws Exception {

		driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@id='pass'])")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("user name and password entered successfully");

	}

	@SuppressWarnings("deprecation")
	@Then(": Click on login button")
	public void click_on_login_button() throws Exception {

		driver.findElement(By.xpath("(//button[@name='login'])")).click();
		System.out.println("clicked on login button");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}

	@SuppressWarnings("deprecation")
	@When(": Click on profile logo")
	public void click_on_profile_logo() {

		driver.findElement(By.xpath("(//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb'])[2]/..")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		System.out.println("click on profilepicture logo");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

	}

	@SuppressWarnings("deprecation")
	@When(": Refresh the browser")
	public void refresh_the_browser() throws Exception {
		driver.navigate().refresh();
		System.out.println("refresh page");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	@When(": click on signout option")
	public void click_on_signout_option() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='j83agx80 l9j0dhe7'])/..")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@SuppressWarnings("deprecation")
	@Then(": Facebook should signout successfull")
	public void facebook_should_signout_successfull() {
		driver.findElement(By.xpath("(//div[@class='qzhwtbm6 knvmm38d'])[10]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("facebook singed out succesfully");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.quit();
	}
}
