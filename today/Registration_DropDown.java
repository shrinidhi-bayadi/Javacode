package today;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Registration_DropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	
	
	WebElement gender=driver.findElement(By.id("select2-gender-container"));
	gender.click();
	Thread.sleep(2000);
	Actions a1=new Actions(driver);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ENTER).perform();


	
}
}
