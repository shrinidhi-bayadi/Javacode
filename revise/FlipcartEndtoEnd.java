package revise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Website:

https://www.flipkart.com/

Scenario
Launch Flipkart.
Maximize the browser.
Search for shoes.
Print the number of auto suggestions.
Print all auto suggestion texts.
Click the 1st auto suggestion.
Apply the Gender → Men filter.
Click the 2nd product from the results.
Switch to the new window/tab.
Print:
Product Name
Product Price
Click Add to Cart (login popup may appear—no need to log in).
Close the child window.
Switch back to the parent window.
Print the page title.
Close the browser.

 */
public class FlipcartEndtoEnd {
public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(5000);

WebElement bot=driver.findElement(By.xpath("//span[text()='✕']"));
bot.click();
Thread.sleep(2000);

WebElement search=driver.findElement(By.name("q"));
search.sendKeys("shoes for men");
Thread.sleep(4000);

List<WebElement> auto=driver.findElements(By.xpath("//ul/li"));
int count=auto.size();
System.out.println("Number of autosuggestion--->"+count);

System.out.println("auto suggestions--->");
for(int i=0;i<count;i++)
{
	System.out.println(auto.get(i).getText());
}

auto.get(2).click();

Thread.sleep(3000);

WebElement gender=driver.findElement(By.xpath("//div[text()='Gender']"));
gender.click();
Thread.sleep(3000);

WebElement check=driver.findElement(By.xpath("//div[text()='Men']/preceding-sibling::div[@class='ybaCDx']"));

check.click();
Thread.sleep(3000);

WebElement second=driver.findElement(By.xpath("//div[@class='nZIRY7']/div[2]"));
second.click();
Thread.sleep(3000);

Set<String> browserid=driver.getWindowHandles();

Iterator<String> i=browserid.iterator();
String pid=i.next();
String cid=i.next();
driver.switchTo().window(cid);
Thread.sleep(3000);

WebElement pname=driver.findElement(By.xpath("//h1"));
System.out.println("product name-->"+pname.getText());
WebElement price=driver.findElement(By.xpath("//div[@class='v1zwn21l v1zwn20 _1psv1zeb9 _1psv1ze0']"));
System.out.println("price -->"+price.getText());

WebElement addtocart=driver.findElement(By.xpath("(//div[@style='flex-direction: column; align-items: center; justify-content: center; opacity: 1;'])[1]"));
addtocart.click();
Thread.sleep(3000);
driver.close();
driver.switchTo().window(pid);
Thread.sleep(3000);

String title=driver.getTitle();
System.out.println("title-->"+title);
driver.close();
}
}
