package today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to count the number of links present on google.com
public class NumberofLinks_Google {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int link=links.size();
	System.out.println("Number of links -->"+link);
	
	driver.quit();
}
}
