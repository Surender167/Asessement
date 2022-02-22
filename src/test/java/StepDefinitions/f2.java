package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class f2 {
	public static	WebDriver driver;


	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");

		
		
			
	}
	
//
//	public static	WebDriver driver;
//
//	@Before
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//
//		//Add chrome switch to disable notification - "**--disable-notifications**"
//		options.addArguments("--disable-notifications");
//
//}
	
}



