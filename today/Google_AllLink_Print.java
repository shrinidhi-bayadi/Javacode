package today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AllLink_Print {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int count=links.size();
		System.out.println("Print all linktext");
		for(int i=0;i<count;i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		driver.quit();
	}
}
