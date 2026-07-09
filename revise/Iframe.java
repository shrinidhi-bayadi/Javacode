package revise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Website: https://demo.automationtesting.in/Frames.html

Practical Question – Single Iframe + Nested Iframe
Part A – Single Iframe
Launch Chrome.
Open the website.
Maximize browser.
Click Single Iframe.
Switch to the iframe.
Enter text: Shrinidhi iframe practice.
Switch back using defaultContent().
Part B – Iframe inside Iframe
Click Iframe with in an Iframe.
Switch to the outer iframe.
Switch to the inner iframe.
Enter text: Nested iframe completed.
Use parentFrame().
Then use defaultContent().
Print: Iframe practical completed.
Close browser.
*/

public class Iframe {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		System.out.println("pagetitle-->" + driver.getTitle());

		WebElement singleiframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		Thread.sleep(2000);

		driver.switchTo().frame(singleiframe);
		Thread.sleep(2000);

		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("shrinishi");

		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		
		WebElement nested=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		nested.click();
		Thread.sleep(2000);

		WebElement n=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(n);
		
		WebElement demo=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(demo);
		WebElement input2 = driver.findElement(By.xpath("//input[@type='text']"));
		input2.sendKeys("Nested iframe completed");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		System.out.println("frame practical completed");
		
		//driver.quit();
		
	}
}
