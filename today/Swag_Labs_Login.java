package today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Labs_Login {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	Thread.sleep(1000);
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	Thread.sleep(1000);
	
	WebElement login=driver.findElement(By.name("login-button"));
   login.click();
	Thread.sleep(1000);
}
}
