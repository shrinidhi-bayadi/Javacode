package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Write a Selenium program to count all <input> tags 
 *present on the JSAM webpage
  (HTML link shared on whatsapp .please check)
 */
public class Assignment_113 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> e1=driver.findElements(By.tagName("input"));
		int size=e1.size();
		System.out.println("count input tag-->"+size);

		driver.quit();
	}
	
	}