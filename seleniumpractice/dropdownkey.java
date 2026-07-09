package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownkey {

       public static void main(String[] args) throws InterruptedException 
       {
               ChromeDriver driver=new ChromeDriver();
               driver.get("https://www.amazon.in");
               driver.manage().window().maximize();
               Thread.sleep(3000);
               WebElement e1=        driver.findElement(By.id("searchDropdownBox"));
               
               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);
               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

               e1.sendKeys(Keys.ARROW_DOWN);
               Thread.sleep(1000);

       }
}