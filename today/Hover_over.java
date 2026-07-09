package today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Prime hoverover
public class Hover_over {
public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(5000);

WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));

Actions a1=new Actions(driver);
a1.moveToElement(prime).perform();
Thread.sleep(2000);



}
}
