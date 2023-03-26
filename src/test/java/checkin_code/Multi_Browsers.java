package checkin_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Browsers {
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://flipkart.com");
		

	}

}
