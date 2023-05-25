package genericlibraries;

import org.openqa.selenium.WebDriver;

import pomclass.SeleniumTrainingPage;
import pomclass.SkillraryDemoAppPage;
import pomclass.SkillraryHomePage;
import pomclass.TestingPage;

public class BaseClass {
	
	//@BeforeSuite
	//@Beforetest
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	
	protected SkillraryHomePage home;
	protected SkillraryDemoAppPage dempApp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected ContactUsPage contact;
	
	home.ChooseEnglish();
	
	//@BeforeClass
	
	public void  classConfig()
	{
		 property = new PropertiesUtility();
		 excel = new ExcelUtility();
		 web = new WebDriverUtility();
		 property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		 
		 excel.excelInit(IConstantPath.EXCEL_PATH);
		
		 driver=web.launchBrowser(property.readData("browser"));
		 
		 web.maximizeBrowser();
		 web.navigateToApp(property.readData("url"));
		 web.waitUntilElementFound(Long.parseLong(property.readData("time")));
		 
		 home = new SkillraryHomePage(driver);
		 demoApp = new SkillraryDemoAppPage(driver);
		 selenium = new SeleniumTrainingPage(driver);
		 testing = new TestingPage(driver);
		 contact = new ContactUsPage(driver);
		 
	}
	//@BeforeMethod
	
	public void methodConfig() {
		
	}
	//@AfterMethod
	
	public void methodTearDown()
	{
		
	}
	//@AfterMethod
	public void classTearDown()
	{
		web.quitAllWindow();
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
