package exam;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
/*
 * 
 * Automate this:
On the below website
https://www.ebay.com/
Search any product and click on 1st one.
Click on Add to cart
Click on Checkout 1 Item
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement search=driver.findElement(By.name("_nkw"));
	search.sendKeys("toys"+Keys.ENTER);
	Thread.sleep(2000);
	
	List<WebElement> auto=driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li"));
	Thread.sleep(2000);
	auto.get(0).click();
	
	Set<String> id=driver.getWindowHandles();
	Iterator<String> i=id.iterator();
	String pid=i.next();
	String cid=i.next();
	
	driver.switchTo().window(cid);
	
	Thread.sleep(2000);
	
	WebElement addtocart=driver.findElement(By.linkText("Add to cart"));
	
	addtocart.click();
	Thread.sleep(2000);

	
	WebElement checkout=driver.findElement(By.linkText("Checkout 1 item"));
	Thread.sleep(2000);

	checkout.click();
	
	// I am getting "I am not robot tab " screenshot attached. Cannot click on continue
	//google button.
	
	
}
}
