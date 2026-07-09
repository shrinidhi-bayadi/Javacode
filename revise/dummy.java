package revise;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
/*
 WAP  to go to   https://www.amazon.in/
 search "shoes"
After searching the product on Amazon
Click on the checkbox of Campus Brand.
			
 */

public class dummy {
	
	        public static void main(String[] args) throws InterruptedException 
	        {
	                ChromeDriver driver=new ChromeDriver();
	              driver.get("https://www.amazon.in/");
	              driver.manage().window().maximize();
	              Thread.sleep(5000);
	              
	              
	              WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	              
	              search.sendKeys("shoes"+Keys.ENTER);
	              Thread.sleep(5000);
	              
	             WebElement item=driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::span[text()='Campus']/ancestor::span[@class='a-list-item']/descendant::i"));
	              
	              item.click();

	         
	       
	              
	             

	             
	               
	                }
	}