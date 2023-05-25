package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	//Declaration
		@FindBy(xpath="//a[@class='navbar-brand']")
		private WebElement logo;
		
		@FindBy (id="course")
		private WebElement courseTab;
		
		@FindBy(xpath = "//span/a[text()='Selenium Training']")
		private WebElement seleniumTrainingLink;
		
		@FindBy(name = "addresstype")
		private WebElement categoryDD;
		
		@FindBy(xpath = "//a[text()='Contact Us']")
		private WebElement contactUsLink;
		
		//Initialization
		public SkillraryDemoAppPage(WebDriver driver)
		{
			PageFactory .initElements(driver, this);
		}
		//Utilization
		public String getLogoText()
		{
			return logo.getText();
		}
		public void mouseHoverToCourse(WebDriverUtility web)
		{
			web.mouseOver(courseTab);
		}
	    public void clickSeleniumTraining()
	    {
	    	seleniumTrainingLink.click();
	    }
	    public void selectCategory(WebDriverUtility web, int index)
	    {
	    	web.dropdown(categoryDD, index);
	    }
	    public WebElement getContactUs()
	    {
	    	return contactUsLink;
	    }
	    public void ClickContactUs()
	    {
	    	contactUsLink.click();
	    }
	    }

