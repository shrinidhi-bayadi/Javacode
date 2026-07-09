
package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Pc {



	
		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://pharmeasy.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement searchbutton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
			searchbutton.click();

			WebElement search = driver.findElement(By.xpath("//input"));
			search.sendKeys("PCM");

			Thread.sleep(2000);
			
			//auto suggestion choose 3rd option
			List<WebElement> auto = driver
					.findElements(By.xpath("//div[@class='typeahead-lib-Typeahead-module_result__tF-Yj']"));

			auto.get(2).click();

			Thread.sleep(2000);
	//click on 3rd product
			List<WebElement> option = driver.findElements(
					By.xpath("//div[@class='LHS_container__sXYjF Search_fullWidthLHS__LIkF0']/descendant::h1"));

			option.get(3).click();
			Thread.sleep(3000);


			WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
			addtocart.click();
			WebElement qty = driver.findElement(By.xpath("//span[text()='2']"));
			

			Actions a1 = new Actions(driver);
			a1.moveToElement(qty).perform();

			qty.click();

			WebElement viewcart = driver.findElement(By.xpath("//a[text()='View Cart']"));
			viewcart.click();
			Thread.sleep(5000);
			driver.quit();

		}
	}
