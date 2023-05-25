package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;
/**
 * This class contains elements and respective
 * @author Abhishek
 *
 */
public class SeleniumTrainingPage {

	//Declaration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id = "add")
	private WebElement plusButton;
	
	@FindBy(id = "quantity")
	private WebElement quantity;
	
	@FindBy(xpath = "//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="//div[@class='callout callout-success']/span" )
	private WebElement Messaage;
	
	//Initilization
	
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * 
	 * @return
	 */
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public void doubleClickPlusButton(WebDriverUtility web)
	{
		web.doubleClickOnElement(plusButton);
	}
	
	/**
	 * This method is used to click on  to get the quantity of added items
	 * @return
	 */
	
	public String getQuantity()
	{
		return quantity.getAttribute("value");
	}
	
	/**
	 * This method is used to click on add to cart button
	 */
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
	
	/**
	 * This method is used to get the text on item added message
	 * @return
	 */
	
	public String getMessage()
	{
		return Messaage.getText();
	}
}
