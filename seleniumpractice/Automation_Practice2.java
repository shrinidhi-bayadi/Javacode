package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * https://testautomationpractice.blogspot.com/
 * 
 * Website

https://testautomationpractice.blogspot.com/

Scenario
Launch the website.
Maximize the browser.
Print the page title.
Form Automation
Enter the following details:
Name: Shrinidhi
Email: shrinidhi@test.com
Phone: 9876543210
Address: Florida
Select:
Female
Tuesday and Thursday
Select India from the Country dropdown.
Select Green and Blue from the Colors multi-select dropdown.
Select Dog from the Animals dropdown.
Select date fir date picker 1
Dynamic Table
Print the total number of rows.
Print the total number of columns.
Print the process name having the highest CPU (%).
Print the Memory (MB) used by Firefox.
Print the Network (Mbps) used by Chrome.
Iframe

Switch to the first iframe.
Enter your name.
Return to the main page.
Alerts
Click the Alert button.
Accept the alert.
Browser Information
Print:
Current URL
Title
Close the browser.
 */
public class Automation_Practice2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		String title = driver.getTitle();
		System.out.println("Title of page-->" + title);

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("shrinidhi");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shrinidhi@test.com");
		Thread.sleep(1000);

		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys("9876543210");
		Thread.sleep(1000);

		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("florida");
		Thread.sleep(1000);

		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		Thread.sleep(1000);

		WebElement tuesday = driver.findElement(By.id("tuesday"));
		tuesday.click();
		Thread.sleep(2000);
		WebElement thursday = driver.findElement(By.id("thursday"));
		thursday.click();
		Thread.sleep(1000);

		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

		Select s1 = new Select(country);
		s1.selectByValue("india");
		Thread.sleep(1000);

		WebElement colour = driver.findElement(By.xpath("//select[@id='colors']"));

		Select s2 = new Select(colour);
		s2.selectByValue("green");
		Thread.sleep(1000);

		s2.selectByValue("blue");
		Thread.sleep(1000);

		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));

		Select s3 = new Select(animal);
		s3.selectByValue("dog");
		Thread.sleep(1000);

		WebElement datepicker1 = driver.findElement(By.id("datepicker"));
		datepicker1.click();
		Thread.sleep(2000);

		WebElement date1 = driver.findElement(By.xpath("//a[text()='29']"));
		date1.click();
		Thread.sleep(1000);

		// dynamic table

		List<WebElement> row = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		System.out.println("Number of rows-->" + row.size());

		List<WebElement> col = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
		System.out.println("Number of columns-->" + col.size());

		WebElement memory = driver.findElement(By.xpath("//td[text()='Firefox']/following-sibling::td[1]"));

		System.out.println("Memory firefox-->" + memory.getText());

		WebElement network = driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::td[4]"));
		System.out.println("memory of chrome-->" + network.getText());

		// Print the process name having the highest CPU (%).
		double max = 0;
		List<WebElement> cpu = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr/td[4]"));
		List<WebElement> pname = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr/td[1]"));
		String n = "";
		for (int i = 0; i < cpu.size(); i++) {
			double cnum = Double.parseDouble(cpu.get(i).getText().replace("%", ""));
			if (cnum > max) {
				max = cnum;
				n = pname.get(i).getText();
			}
		}

		System.out.println("Max xpu-->" + max + " pname-->" + n);

	}
}
