package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil 
{	
	public static WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void waitForVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void clickElement(WebElement element)
	{
		waitForVisibility(element);
		element.click();
	}
	
	public static void enterText(WebElement element , String data)
	{
		waitForVisibility(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value = '';", element);
		element.sendKeys(data);
	}
	
	public static String getText(WebElement element)
	{
		waitForVisibility(element);
		return element.getText();
	}
	
	public static String getAttribute(WebElement element)
	{
		waitForVisibility(element);
		return element.getAttribute("title");
	}
	
	public static void implicitWait()
	{
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(15) );
	}
}
