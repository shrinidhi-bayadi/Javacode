package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * Launch https://www.flipkart.com/
 
 Create 2 TestNG test cases to perform the following:
1)search toys 
2)search shoes

Run all test cases on Chrome and Edge ,firefox using Cross Browser Testing 
and Parallel Execution through testng.xml.
 */
public class Assignment_159_Tc1 extends Assignment_159_BaseTest {
@Test
	
	public void searchProduct()
	{
	
	try
	{
		WebElement bot=driver.findElement(By.xpath("//span[text()='✕']"));
		if(bot.isDisplayed())
		{
			bot.click();
		}
	}
	catch(Exception e)
	{
		System.out.println("pop up bot not present");
	}
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("toys"+Keys.ENTER);
		
		
		
		
	}
}
