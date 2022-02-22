package handsonscreenshot;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.utility;

public class Banklogin {

	public static WebDriver driver;

	@Test
	public void bank_Screenshot() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/V1/index.php");
//		User ID :	mngr381403
//		Password :	myvUgEm
		driver.findElement(By.name("uid")).sendKeys("mngr381403");
		driver.findElement(By.name("password")).sendKeys("myvUgEm");

		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='New Customer']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/bank_Screenshot.png");
		FileUtils.copyFile(source, destination);

	}

	@AfterMethod
	public void teardown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus())
			;
		{
			utility.takeScreenshot(driver, result.getName());
		}
		driver.quit();
	}

}
