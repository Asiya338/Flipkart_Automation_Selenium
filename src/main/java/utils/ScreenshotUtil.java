package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class ScreenshotUtil 
{
	public static WebDriver driver;
	
	public ScreenshotUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void captureScreenshot(String name)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/";
		File dtn = new File(path + name);
		
		FileUtils.copyFile(src, dtn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
