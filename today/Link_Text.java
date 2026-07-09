package today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {
public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement about=driver.findElement(By.linkText("About"));
	
	about.click();
	Thread.sleep(2000);
	driver.quit();
	
	
}

}
