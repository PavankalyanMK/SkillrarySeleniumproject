package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	//Declaration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id = "Python")
	private WebElement pythonImage;
	
	@FindBy(id = "cartArea")
	private WebElement myCart;
	
	@FindBy(xpath = "//ul/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public WebElement getPythonImage()
	{
		return pythonImage;
	}
	
	public WebElement getMycart()
	{
		return myCart;
		
	}
	
	public WebElement getFacebookIcon()
	{
		return facebookIcon;
	}
	
	public void clickFacebook()
	{
		facebookIcon.click();
	}
}
