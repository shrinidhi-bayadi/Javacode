package module5;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Amazon_BaseTest {

	public static WebDriver driver;
	@Parameters("browser")
	
	@BeforeMethod
	
	public void launchBrowser(String browserName)
	{
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		
		if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	
		
	}
	
	@AfterMethod
	
	public void quitBrowser()
	
	{
		driver.quit();
	}
}
