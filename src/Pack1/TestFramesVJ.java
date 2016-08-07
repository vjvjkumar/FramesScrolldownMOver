package Pack1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFramesVJ {

	@Test
	public void TestFrames (){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://sites.google.com/site/appsscripttutorial/user-interface/list-box");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		// finding frames on the site
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//html/body/div[1]/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/a")).click();
		
	}
}
