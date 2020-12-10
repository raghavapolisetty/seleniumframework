package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium {

	 static WebDriver driver;
	
		// TODO Auto-generated method stub

		@BeforeTest
		public static  void openbrowser()
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\seleniumsession\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			
			System.out.println("opened");
			System.out.println(driver.getTitle());
			
		}
		
		
		@Test
		public static void Insertdata() throws InterruptedException
		{
			Thread.sleep(1000);
		   WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		   Thread.sleep(1000);
		   search.sendKeys("clothes");
		   System.out.println("entered");
		}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		
		
		
		
	

}
