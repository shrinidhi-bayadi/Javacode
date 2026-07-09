package today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Search {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement bot=driver.findElement(By.xpath("//span[@role='button']"));
		bot.click();
		Thread.sleep(2000);

		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("toys");
		Thread.sleep(3000);

		List<WebElement> auto=driver.findElements(By.xpath("//form/ul/li"));
		
		auto.get(0).click();
		
	}
}
