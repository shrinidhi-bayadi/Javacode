package today;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Chil_window {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement Remote=driver.findElement(By.linkText("Remote"));
	Remote.click();
	
	Thread.sleep(3000);
	
	Set<String> ids=driver.getWindowHandles();
	
	Iterator<String> i=ids.iterator();
	
	String pid=i.next();
	String cid=i.next();
	
	driver.switchTo().window(cid);
	
	Thread.sleep(3000);

	WebElement e=driver.findElement(By.linkText("Services"));
	e.click();
}


}
