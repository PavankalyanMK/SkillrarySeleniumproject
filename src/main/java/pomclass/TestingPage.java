package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//Declaration
	@FindBy(xpath="//h1[@class = 'page-header']")
	private WebElement pageheader;
	
	@FindBy(id="Python")
	private WebElement pythonImage;
	
	@FindBy(id="cartArea")
	private WebElement mycart;
	
	@FindBy(xpath="//ul/decendant::[@class='fa fa=facebook']")
	private WebElement facebookIcon;
	
	
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader()
	{
		return pageheader.getText();
	}
public WebElement getPythonImage()
{
	return pythonImage;
}

public WebElement getMycart()
{
	return mycart;
	
}

public WebElement getFacebookIcon()
{
	return facebookIcon;
	
	
}
public void clickFacebook()
{
	facebookIcon.clear();
}
}
