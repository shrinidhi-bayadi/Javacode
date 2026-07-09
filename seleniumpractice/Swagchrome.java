
package seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Swagchrome {

	public static void main(String[] args) throws InterruptedException {
		
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("--incognito");


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(4000);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(4000);
		WebElement login=driver.findElement(By.xpath("//input[@name='login-button']"));
		login.click();
		Thread.sleep(4000);
		//driver.quit();
		
		
	}
	}


