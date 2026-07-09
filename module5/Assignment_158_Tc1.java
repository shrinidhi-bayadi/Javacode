package module5;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * Website: https://www.amazon.in

Create five TestNG test cases to perform the following:

1)Search for "Shoes".
2)Search for "Laptop".
3)Search for "Mobile".
4)Print the page title.
5)Print the current URL.

Run all test cases on Chrome and Edge using
Cross Browser Testing and Parallel Execution through testng.xml.
 */
public class Assignment_158_Tc1 extends Amazon_BaseTest{

	@Test
	
	public void searchShoes()
	{
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("shoes");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		try
		{
		List<WebElement >auto=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		auto.get(2).click();
		
		List<WebElement> produlist=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		produlist.get(2).click();
		
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("handle");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Set<String> bid=driver.getWindowHandles();
		
		Iterator<String> i=bid.iterator();
		String pid=i.next();
		String cid=i.next();
		driver.switchTo().window(cid);
		
		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		
	}
	
}
