package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class goldsmiths_options {

	@Test
	public void goldsmiths () throws InterruptedException {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://goldsmiths.co.uk");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
}
	

