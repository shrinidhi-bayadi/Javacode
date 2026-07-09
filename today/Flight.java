package today;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flight {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(7000);

		Actions a = new Actions(driver);

		// One Way
		driver.findElement(By.name("radio-646")).click();
		Thread.sleep(1000);

		// Close chatbot
		driver.findElement(By.id("chat-bot-message-close")).click();
		Thread.sleep(1000);

		// From
		WebElement from = driver.findElement(
				By.xpath("//span[contains(@id,'select2-From')]"));
		from.click();
		Thread.sleep(1000);

		a.sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .perform();

		Thread.sleep(1000);

		// To
		WebElement to = driver.findElement(
				By.xpath("//span[contains(@id,'select2-To')]"));
		to.click();
		Thread.sleep(1000);

		a.sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .perform();

		Thread.sleep(1000);
		
		WebElement depart = driver.findElement(By.name("Departon"));
		depart.click();
		Thread.sleep(1000);
		depart.sendKeys("01/05/2025");
		
		Actions a1 = new Actions(driver);
		
		WebElement adult = driver.findElement(
				By.xpath("//span[contains(@id,'select2-Adults')]"));

		adult.click();
		Thread.sleep(1000);

		a1.sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .perform();
		
		WebElement child = driver.findElement(
				By.xpath("//span[contains(@id,'select2-Children')]"));

		child.click();
		Thread.sleep(1000);

		a1.sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .perform();
		
		WebElement infant = driver.findElement(
				By.xpath("//span[contains(@id,'select2-Infants')]"));

		infant.click();
		Thread.sleep(1000);

		a1.sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .perform();
		
		WebElement se=driver.findElement(By.xpath("//input[@value='Search flights']"));
		se.click();
		
	}
}