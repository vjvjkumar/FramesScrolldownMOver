package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverEventsVJ {
	
	@Test
	public void mouseoverevents() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://marutisuzuki.com");
		Thread.sleep(2000);
		
		WebElement MouseOverMO = driver.findElement(By.linkText("SHOWROOM"));
		
		//now creating an object for Actions as below to execute further
		Actions act = new Actions(driver);
				
		act.moveToElement(MouseOverMO).build().perform(); // register the syntax in mind
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='see_all']/ul/li[13]/a/span[1]/img")).click();
		
		
	}

}
