package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	
	public static void takeScreenshot(WebDriver driver,String screenshot_Name) {
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File Destination = new File("./Screenshots/"+screenshot_Name+".png");
			FileUtils.copyFile(source, Destination);
			System.out.println("Screenshot taken");
	       
		} catch (Exception e) {
			
			System.out.println("exception while taking screenshot"+e.getMessage());
		} 
	}

}
