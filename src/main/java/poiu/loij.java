package poiu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loij {
	private static WebElement name;
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.className("_2d0B4z")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.className("L0z3pu")).click();
	List<WebElement>phoneNames=driver.findElements(By.className("_4eR01T"));
	for(WebElement name:phoneNames);
	{
		String text=name.getText();
		System.out.println(text);
	}
	Thread.sleep(3000);
    driver.close();
  
    
	}

}


}
