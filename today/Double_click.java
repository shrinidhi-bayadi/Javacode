package today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//lastName double click on registation form
public class Double_click {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement lname=driver.findElement(By.id("lastName"));
	lname.sendKeys("Bayadi");
	Thread.sleep(2000);
	Actions a1=new Actions(driver);
	a1.doubleClick(lname).perform();
	Thread.sleep(2000);
	
	WebElement bot=driver.findElement(By.id("chat-bot-message-close"));
	Thread.sleep(2000);
	bot.click();
	//driver.quit();
	
}
}
