package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Automate below Scenerio
1. Launch https://pharmeasy.in/
2. Search PCM
3. Click on 3rd option
4. From the list of search result click on 3rd product
5. Select the quantity as 2
6. Click on View cart
After automating push your file to your github repo
*
*/
public class Pharmeasy {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new 
			ChromeDriver();
	driver.get("https://pharmeasy.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement searchbutton=driver.findElement(By.xpath("//button[@class='typeahead-lib-Typeahead-module_searchIcon__tYHFj']"));
	searchbutton.click();
	
	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
	search.sendKeys("PCM");
	Thread.sleep(2000);
	
	
	List<WebElement> auto=driver.findElements(By.xpath("//div[@class='typeahead-lib-Typeahead-module_result__tF-Yj']"));
auto.get(2).click();

Thread.sleep(2000);

List<WebElement> product=driver.findElements(By.xpath("//div[@class='ProductCard_nameLogoContainer__cxjxu']/h1"));

product.get(3).click();
Thread.sleep(1000);

WebElement addtocart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
addtocart.click();


//WebElement qty=driver.findElement(By.xpath("//div[@class='Select_listRoot__pGb__ QuantitySelector_menuItemsRoot__K_Z8v']/span[text()='2']"));
WebElement qty=driver.findElement(By.xpath("//div[@class='Select_listRoot__pGb__ QuantitySelector_menuItemsRoot__K_Z8v']/span[text()='2']"));

qty.click();

WebElement viewcart=driver.findElement(By.xpath("//a[text()='View Cart']"));
viewcart.click();


}
}
