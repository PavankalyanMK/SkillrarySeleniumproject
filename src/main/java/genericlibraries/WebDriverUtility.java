package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contain all reusable methods to perform operations
 * on WebDriver 
 * @author Pavan 
 *
 */

public class WebDriverUtility {
	private WebDriver driver;

	/**
	 * This method is used to launch specified browser 
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) {
		switch(browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
			 break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default :
			System.out.println("Invalid Browser Info");
		}
		return driver;
	}
/**
 * This method is used to maximize the window 	
 */
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
/**
 * This method is used to navigate to specified application 	
 * @param url
 */
	public void navigateToApp(String url)
	{
		driver.get(url);
	}
/**
 * This method is used to wait until element or list of element is found 	
 * @param time
 */
	public void waitUntilElementFound(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS );
		
	}
	
/**
 * This method is used to wait until element is enable 	
 * @param time
 * @param element
 * @return
 */
	
	public WebElement explicitWait(long time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement explicitWait( WebElement element, long Time)
	{
		WebDriverWait wait = new WebDriverWait(driver,Time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean explicitWait(long time ,String title)
	{
	WebDriverWait wait = new WebDriverWait(driver,time);
	return wait.until(ExpectedConditions.titleContains(title));		
	}
	
	public void mouseOver( WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
	public void doubleClickElement( WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		
	}
	public void rightClick( WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		
	}
	public void dragAndDropElement( WebElement element, WebElement dest)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, dest).perform();
		
	}
	
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
		
	}
	
	public void switchToFrame(String idOrName)
	{
		driver.switchTo().frame(idOrName);

	}
	public void switchToFrame(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);

	}
	public void switchBackFromFrame()
	{
		driver.switchTo().defaultContent();
	}
	public void takesScreenshot()
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/screenshot.png");
		try
		{
			FileUtils.copyFile(src,dest);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
public void dropdown(WebElement element , int index)
{
	Select s = new Select(element);
	s.selectByIndex(index);
}
public void dropdown(WebElement element , String value)
{
	Select s = new Select(element);
	s.selectByValue(value);
}

/**
 * this method select an element from drop down using select by visible text
 * @param text
 * @param element
 */

public void dropDown(String text, WebElement element)
{
	 Select s =new Select(element);
	 s.selectByVisibleText(text);
}

/**
 * this method handles alert pop up
 * @param status
 */

public void handleAlert(String status)
{
	 Alert al =driver.switchTo().alert();
	 if(status.equalsIgnoreCase("ok"))
	 {
		al.accept(); 
	 }
	 else
	 {
		 al.dismiss();
	 }
}

/**
 * this method is used to switch to parent window
 */

public void switchToParentWindow()
{
	 String parentId = driver.getWindowHandle();
	 driver.switchTo().window(parentId);
}

/**
 * this method is used to switch child browser
 */

public void handleChildBrowser()
{
	 Set<String> set = driver.getWindowHandles();
	for (String id : set) 
	{
		driver.switchTo().window(id);
		
	}
}

/**
 * this method is used to close current tab or window
 */

public void closeCurrentTab()
{
	 driver.close();
}

/**
 * this method is used to close all tabs or windows
 */

public void quitAllWindow()
{
	 driver.quit();
}
}
