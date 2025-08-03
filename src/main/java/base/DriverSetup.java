package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import base.ConfigReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup 
{
	public static WebDriver driver;
	public static ConfigReader reader;
	
	public WebDriver initializeBrowser()
	{
		try {
			reader = new ConfigReader();
			String browser = reader.getBrowser();
			int waittime = reader.getWaitTime();
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waittime));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}
	
	public void openApplication()
	{
		driver.get(reader.getBaseUrl());		
	}
	
	public void closeDriver()
	{
		if(driver != null)
		{
			driver.close();
		}
	}
	
	public void getTitle()
	{
		System.out.println("The title is  : " + driver.getTitle());
	}
}
