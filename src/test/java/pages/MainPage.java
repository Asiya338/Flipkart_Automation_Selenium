package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtil;
import utils.ScreenshotUtil;

public class MainPage 
{
	public static WebDriver driver;
	public ScreenshotUtil screenshot;
	public WaitUtil wait;
	
	public MainPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements( driver , this);
		screenshot = new ScreenshotUtil(driver);
		wait = new WaitUtil(driver);
	}
	
	@FindBy(xpath="//form/div/div[@class='_2SmNnR']/input")
	public WebElement searchTooltip;
	
	@FindBy(xpath="//a[@class='_1ch8e_']/div/div/div/div/img[@alt='Electronics']")
	public WebElement electronicsElmt;
	
	public String getTooltip()
	{
		screenshot.captureScreenshot("MainPage.png");
		return wait.getAttribute(searchTooltip);
	}
	
	public void clickElectronics()
	{
		wait.waitForVisibility(electronicsElmt);
	}
	
	public String getElectronics()
	{
		return driver.getTitle();
	}
	
}
