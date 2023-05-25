package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement pagelogo;
	
	@FindBy(name = "name")
	private  WebElement FullnameTF;
	
	@FindBy(name = "sender")
	private WebElement emailTF;
	
	@FindBy(name = "subject")
	private WebElement subjectTF;
	
	@FindBy(name = "message")
	private WebElement messageTF;
	
	@FindBy(xpath = "//button[text()='Send us mail']")
	private WebElement sendUsButton;
	
	//Initialization
	
		public ContactUsPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
	//Utilization
		
		public WebElement getPagelogo()
		{
			return pagelogo;
		}
		
		public void sendDetails(CharSequence fullname, CharSequence email, CharSequence message, CharSequence subject)
		{
			FullnameTF.sendKeys(fullname);
			emailTF.sendKeys(email);
			subjectTF.sendKeys(subject);
			messageTF.sendKeys(message);
			sendUsButton.click();
		}
}
