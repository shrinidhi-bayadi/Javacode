package today;

//Electronics right click

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);

	WebElement ele=driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	
	Actions a1=new Actions(driver);
	a1.contextClick(ele).perform();
	Thread.sleep(2000);
	
}
}
	