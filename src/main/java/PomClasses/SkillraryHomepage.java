package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {

	// Declaration
	
	@FindBy(xpath ="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath ="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	//intiialisation
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
			/**
			 * This method returns the skillrary  home page logo
			 * @return
			 */
			public WebElement getLogo() {
				return logo;
			}
			
			/**
			 * This method is used to click on Gears Tab
			 */
			public void clickGearsTab() {
				gearsTab.click();
			}
			/**
			 *  This method is used to click on skillrary demo app link

			 */
			public void clickSkillraryDemoApp() {
				skillraryDemoAppLink.click();
			}

}
