package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment_159_Tc2 extends Assignment_159_BaseTest{
	@Test
	
	public void searchShoes()
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
			System.out.println("bot not present");
		}
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shoes"+Keys.ENTER);
		}

}
