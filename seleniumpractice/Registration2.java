package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * https://grotechminds.com/automate-me/
 * Registartion Application
 * Enter Data 
 * quit
 * 
 */
public class Registration2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement registration=driver.findElement(By.xpath("//a[@href='https://grotechminds.com/registration/']"));
		Thread.sleep(3000);

        Actions a1 = new Actions(driver);
        a1.moveToElement(registration).pause(2000).click().perform();

		
	}
}
