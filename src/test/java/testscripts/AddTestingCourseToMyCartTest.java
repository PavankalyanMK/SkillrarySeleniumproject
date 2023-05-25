package testscripts;

import genericlibraries.BaseClass;
import org.testng.asserts.SoftAssert;

public class AddTestingCourseToMyCartTest extends BaseClass{
	
	public void addPythonToMyCart()
	{
		SoftAssert soft = new SoftAssert();
            home.clickGearsTab();
            home.clickSkillraryDemoApp();
          	web.handleChildBrowser();
          	
          	soft.assertTrue(dempApp.getLogoText().contains("ECommerce"));
          	
          	dempApp.selectCategory(web, 1);
          	soft.assertEquals(testing.getPageHeader(), "Testing");
          	
          	web.scrollToElement(testing.getPythonImage());
          	web.dragAndDropElement(testing.getPythonImage(), testing.getMycart());
          	
          	web.scrollToElement(testing.getFacebookIcon());
          	
          	testing.clickFacebook();
          	
          	soft.assertAll();
}
}
