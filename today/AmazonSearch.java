package today;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//search toys and click ok
public class AmazonSearch {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("toys"+Keys.ENTER);
	Thread.sleep(3000);

	driver.quit();
	
}
}
