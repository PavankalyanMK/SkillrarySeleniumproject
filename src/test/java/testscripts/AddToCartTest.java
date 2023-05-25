package testscripts;

import genericlibraries.BaseClass;
import org.testng.asserts.SoftAssert;


public class AddToCartTest extends BaseClass {
	
	//@Test
	
	public void addTCartTest()
	{
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(dempApp.getLogoText().contains("ECommerce"));
		
		dempApp.mouseHoverToCourse(web);
		dempApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		
		int initialQuantity = Integer.parseInt(selenium.getQuantity());
		selenium.doubleClickPlusButton(web);
		int finalQuantity = Integer.parseInt(selenium.getQuantity());
		
		soft.assertEquals(finalQuantity, initialQuantity+1);
		
		selenium.clickAddToCart();
		web.handleAlert("ok");
		
		soft.assertEquals(selenium.getMessage(), "Item added to cart");
		
		soft.assertAll();
		
		
	}

}
