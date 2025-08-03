package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverSetup;
import utils.ScreenshotUtil;
import utils.WaitUtil;
import utils.WindowHandle;

public class CartPage 
{
public static WebDriver driver;
		public DriverSetup setup;
		public ScreenshotUtil screenshot;
		public WaitUtil wait;
		public WindowHandle window;
		public CartPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements( driver , this);
			screenshot = new ScreenshotUtil(driver);
			window = new WindowHandle(driver);
			wait = new WaitUtil(driver);
		}
		
		@FindBy(xpath="//a[@class='_3RX0a-' and @title='Cart']")
		public WebElement cartbtn;
		
		@FindBy(xpath="//div[@class='-XmWnM']/div[1]")
		public WebElement cartElmt;
		
		public void clickCartBtn()
		{
			wait.clickElement(cartbtn);
			//window.windowHandle();
		}
		
		public String getCartElmt()
		{
			wait.waitForVisibility(cartElmt);
			screenshot.captureScreenshot("CartItems.png");
			return wait.getText(cartElmt);
		}
	}