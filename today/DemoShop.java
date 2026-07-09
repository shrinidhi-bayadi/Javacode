package today;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

//		WebElement reg=driver.findElement(By.linkText("Register"));
//		reg.click();
//		Thread.sleep(2000);
//
//		WebElement gender = driver.findElement(By.id("gender-female"));
//		gender.click();
//		Thread.sleep(2000);
//
//		WebElement fname = driver.findElement(By.id("FirstName"));
//		fname.sendKeys("Shri");
//
//		Thread.sleep(2000);
//
//		WebElement lname = driver.findElement(By.name("LastName"));
//		lname.sendKeys("B");
//
//		Thread.sleep(2000);
//WebElement email=driver.findElement(By.id("Email"));
//email.sendKeys("shrinidhibayadi@gmail.com");
//Thread.sleep(2000);
//
//		WebElement password = driver.findElement(By.name("Password"));
//		password.sendKeys("123@gms");
//		Thread.sleep(2000);
//
//		WebElement conpass = driver.findElement(By.id("ConfirmPassword"));
//		conpass.sendKeys("123@gms");
//
//		WebElement register = driver.findElement(By.id("register-button"));
//		register.click();
//
//		Thread.sleep(2000);
//		
//		WebElement conti=driver.findElement(By.xpath("//input[@value='Continue']"));
//		conti.click();
		
		
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(3000);
		
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("shrinidhibayadi@gmail.com");
		Thread.sleep(3000);
		

		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("123@gms");
		Thread.sleep(3000);
		
		WebElement rem=driver.findElement(By.id("RememberMe"));
		
		if(!rem.isSelected())
		{
			rem.click();
		}

		WebElement loginb=driver.findElement(By.xpath("//input[@value='Log in']"));
		loginb.click();
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		search.sendKeys("computer"+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> comp=driver.findElements(By.xpath("//div[@class='product-item']"));
		comp.get(2).click();
		Thread.sleep(2000);

		WebElement addtocart=driver.findElement(By.id("add-to-cart-button-74"));
		addtocart.click();
		Thread.sleep(2000);



	}
}
