package today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("india");
	Thread.sleep(2000);

	List<WebElement> auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	Thread.sleep(2000);

	int count=auto.size();
	System.out.println("No of autosuggestion  -->"+count);
	
	auto.get(0).click();
}
}
