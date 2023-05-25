package testscripts;

import java.util.Map;

import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;
import pomclass.ContactUspage;

public class SendContactsDetailsTest extends BaseClass {
	
	public void sendContactDetailsTest() {
	SoftAssert soft = new SoftAssert();
    home.clickGearsTab();
    home.clickSkillraryDemoApp();
  	web.handleChildBrowser();
  	
  	soft.assertTrue(dempApp.getLogoText().contains("ECommerce"));
  	
  	web.scrollToElement(dempApp.getContactUs());
  	dempApp.ClickContactUs();
  	
  	soft.assertTrue(contact.getPageLogo().isDisplayed());
  	dempApp.ClickContactUs();
  	
  	Map<String, String> map= excel.readDataFromExcel("Sheet1");
  	contact.sendDetails(map.get("FullName"),map.get("Email"),map.get("subject"),map.get("message"));
  	
  	soft.assertAll();
  	
  	
  	
	}}

