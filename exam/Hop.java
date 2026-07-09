package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hop {
public static void main(String[] args) throws InterruptedException {
	

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.hopscotch.in/");
	Thread.sleep(3000);

	WebElement e1 = driver.findElement(By.xpath("(//span/a)[6]"));
	e1.click();
	Thread.sleep(3000);
	WebElement e2 = driver.findElement(By.xpath("//button[@aria-label='Sign in to your account']"));
	e2.click();
	Thread.sleep(2000);
	WebElement e3 = driver.findElement(By.xpath("//a[@class='css-1tg3gbc']"));
	e3.click();
	WebElement e4 = driver.findElement(By.xpath("//input[@type='text']"));
	e4.sendKeys("Abhishek");

	WebElement e5 = driver.findElement(By.xpath("//input[@type='email']"));
	e5.sendKeys("lokareabhishek@yahoo.com");

	WebElement e6 = driver.findElement(By.xpath("//input[@type='number']"));
	e6.sendKeys("123456789");

	WebElement e7 = driver.findElement(By.xpath("//button[@type='submit']"));
	e7.click();
}
}