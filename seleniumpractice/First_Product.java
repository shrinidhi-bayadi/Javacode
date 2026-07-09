package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to click on the 1st product after searching on amazon
public class First_Product {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(3000);
	
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	Thread.sleep(3000);
	list.get(0).click();
	
}
}
