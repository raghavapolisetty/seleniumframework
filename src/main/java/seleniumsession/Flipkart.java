package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	
	static WebDriver driver;
	
	@BeforeTest
	public   void openbrowser()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumsession\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		System.out.println("opened");
		System.out.println(driver.getTitle());
		
	}
	
	
	@Test
	public void launch()
	{
		System.out.println("launched");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
