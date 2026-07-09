package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
/*
Assignment: Iframe Handling

Website:
https://demo.automationtesting.in/Frames.html

Scenario:

1. Launch the website.
2. Maximize the browser.
3. Print the page title.

Part 1: Switch using WebElement
4. Locate the iFrame Demo using WebElement.
5. Switch to the iframe.
6. Enter your name in the textbox.
7. Return to the main page.

Part 2: Switch using Index
8. Switch to the same iframe using its index.
9. Print the heading available inside the iframe.
10. Return to the main page.

Part 3: Switch using ID/Name
11. Switch to the iframe using its id or name.
12. Enter another name in the textbox.
13. Return to the main page.

Part 4: Nested Iframe
14. Click on "Iframe with in an Iframe".
15. Switch to the parent iframe.
16. Print the heading available inside the parent iframe.
17. Switch to the child iframe.
18. Enter text in the textbox inside the child iframe.
19. Return to the default content.
20. Close the browser.
 */
public class Iframe_Practice {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title-->" + title);
		
		//iFrame Demo

		WebElement first_iframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));

		driver.switchTo().frame(first_iframe);

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));

		name.sendKeys("Shrinidhi");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
//iFrame Demo using index

		driver.switchTo().frame(0);
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("//h5"));

		System.out.println(text.getText());

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
//iFrame Demo using id 

		driver.switchTo().frame("singleframe");

		WebElement n = driver.findElement(By.xpath("//input[@type='text']"));
		n.sendKeys("Ram");

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
//click on iframe with an iframe
		WebElement nested = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		nested.click();
//first switch to parent iframe -->Nested iFrames

		WebElement parent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parent);
		Thread.sleep(2000);

		WebElement ntext = driver.findElement(By.xpath("//h5"));
		System.out.println(ntext.getText());
//swtich to child iframe--->iFrame Demo

		WebElement childframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(childframe);
		WebElement w = driver.findElement(By.xpath("//input[@type='text']"));

		w.sendKeys("DSDS");

	}
}
