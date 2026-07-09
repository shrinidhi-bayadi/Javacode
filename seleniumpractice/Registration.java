package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * https://grotechminds.com/
 * click on Automate me
 * Registartion Application
 * Enter Data 
 * quit
 * 
 */
public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement automateme=driver.findElement(By.linkText("Automate me"));
		Thread.sleep(3000);
		System.out.println(automateme.getText());
		automateme.click();
		
		
	}
}
