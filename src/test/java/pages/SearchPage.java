package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.FindBy;
import utils.ScreenshotUtil;
import utils.WaitUtil;

public class SearchPage 
{
	public static WebDriver driver;
	public ScreenshotUtil  screenshot;
	public WaitUtil wait;
	public static String searchItem=null;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements( driver ,this);
		screenshot = new ScreenshotUtil(driver);
		wait =  new WaitUtil(driver);
	}
	
	@FindBy(xpath="//input[contains(@title,'Search') or @name='q']")
	public WebElement searchElmt;

	@FindBy(xpath="//button[@type='submit' and descendant::*[name()='svg']]")
	public WebElement searchBtn;
	
	public void enterSearch(String search)
	{
		searchItem = search;
		wait.enterText(searchElmt, search);
	}
	
	public void clickSearch()
	{
		wait.clickElement(searchBtn);
		screenshot.captureScreenshot("search" + searchItem +".png");
	}
	
}
