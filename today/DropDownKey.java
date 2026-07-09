package today;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownKey {
public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement all=driver.findElement(By.id("searchDropdownBox"));
	all.click();
	Thread.sleep(3000);

	all.sendKeys(Keys.ARROW_DOWN);
	all.sendKeys(Keys.ARROW_DOWN);
	all.sendKeys(Keys.ENTER);

	
}

}