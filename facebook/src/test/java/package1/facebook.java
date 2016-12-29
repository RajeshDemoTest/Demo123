package package1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebook {
	
	@Test
	public void test(){
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
		
	}

}
