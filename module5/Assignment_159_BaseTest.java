package module5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Assignment_159_BaseTest {

	public static WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeMethod
	
	public void launchBroswer(String browsername)
	{
		
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	
	public void quitBrowser()
	{
		driver.quit();
		
	}
	
	
	
	
}
