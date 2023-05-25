package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.math.Quantiles;

import genericlibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id="add")
	private WebElement plusButton1;
	
	@FindBy(id="add")
	private WebElement plusButton;
	
	@FindBy(xpath = "//button[.='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//span[@class='message']")
	private WebElement message ;
	


public SeleniumTrainingPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String getPageHeader()
{
	return pageHeader.getText();
	
}

public void doubleClickPlusButton(WebDriverUtility web)
{
web.doubleClickElement(plusButton1);
}
public String getQuantity()

{
	return Quantity.getAttribute("value");
	
}

public void clickAddToCart()
{
	addToCartButton.click();
}
	
	
public String getMessage()
{
	return message.getText();
	
}
}

