package revise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class google_links {
	
	/*Write a Selenium program to open Google.com and perform the
	 following operations using the TagName locator (a tag):

	Print the text of the second link on the page.
	Print the text of all links present on the page.
*/

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("second link-->"+links.get(1).getText());
		System.out.println("All link ");
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		for(WebElement i:links)
		{
			if(!i.getText().isEmpty())
			{
			System.out.println(i.getText()+"--->"+i.getAttribute("href"));
		}
		}
	}
}
