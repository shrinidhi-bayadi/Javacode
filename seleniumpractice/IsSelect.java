package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsSelect {

        public static void main(String[] args) throws InterruptedException 
        {
                ChromeDriver driver=new ChromeDriver();
                driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html");
                driver.manage().window().maximize();
                Thread.sleep(5000);
                
                WebElement e1=         driver.findElement(By.id("123"));
                
                if(!e1.isSelected())
                {        
                        System.out.println("Since it is not selected, lets Click");
                        e1.click();
                }
                
        }
}
