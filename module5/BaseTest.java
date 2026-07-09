package module5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
ChromeDriver driver;
@BeforeMethod

public void launchBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
}

@AfterMethod

public void quitBrowser()
{
	driver.quit();
}
}
