package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUspage {
	
	@FindBy(xpath="//img[contains(@class, 'contacts')]")
	private WebElement pageLogo;
	
	@FindBy(name ="name")
	private WebElement fullNameTF;
	
	@FindBy(name="sender")
	private WebElement emailTF;
	
	@FindBy(name ="sunject")
	private WebElement subjectTF;
	
	
	@FindBy(name="message ")
	private WebElement messageTextArea;
	
	@FindBy(xpath = "//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	public ContactUspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
public WebElement getPageLogo()
{
	return pageLogo;
}

public void sendDetails(String fullname, String email,String subject, String message )
{
	fullNameTF.sendKeys(fullname);
	emailTF.sendKeys(email);
	subjectTF.sendKeys(subject);
	messageTextArea.sendKeys(message);
	sendUsMailButton.click();
}
}
