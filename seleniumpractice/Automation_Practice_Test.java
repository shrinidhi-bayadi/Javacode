package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 
 * Website:

https://testautomationpractice.blogspot.com/

Scenario
Launch the website.
Maximize the browser.
Enter:
Name: John
Email: john@test.com
Phone: 9876543210
Address: Florida
Select Male.
Select Monday, Wednesday, and Friday.
Select India from the Country dropdown.
Select any 2 colors from the Colors dropdown.
Select Cat from the Animals dropdown.
Scroll down to the Book Table.
Print:
Number of rows
Number of columns
Print the Book Name whose Author is Mukesh.
Print the Price of Master In Java.
Print the Book Names whose price is greater than or equal to 1000.
Print the highest-priced book.
Close the browser.
Concepts Covered
 */
public class Automation_Practice_Test {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("John");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("john@test.com");
		Thread.sleep(1000);

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9876543210");
		Thread.sleep(1000);

		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("florida");
		Thread.sleep(1000);

		WebElement male = driver.findElement(By.id("male"));
		male.click();
		Thread.sleep(1000);

		WebElement monday = driver.findElement(By.xpath("//input[@id='monday']"));
		monday.click();
		WebElement wednesday = driver.findElement(By.xpath("//input[@id='wednesday']"));
		wednesday.click();
		WebElement friday = driver.findElement(By.xpath("//input[@id='friday']"));
		friday.click();
		Thread.sleep(1000);

		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

		Select s1 = new Select(country);
		s1.selectByValue("india");
		Thread.sleep(1000);

		WebElement colours = driver.findElement(By.xpath("//select[@id='colors']"));

		Select s2 = new Select(colours);
		s2.selectByValue("red");
		s2.selectByValue("green");

		Thread.sleep(1000);

		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));

		Select s3 = new Select(animal);
		s3.selectByValue("cat");
		Thread.sleep(1000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));

		System.out.println("Number of rows-->" + rows.size());

		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));

		System.out.println("Number of rows-->" + col.size());

		List<WebElement> bname = driver.findElements(By.xpath("//td[text()='Mukesh']/preceding-sibling::td[1]"));

		System.out.println("Book name of Mukesh-->");
		for (int i = 0; i < bname.size(); i++) {
			System.out.println(bname.get(i).getText());
		}

		WebElement price = driver.findElement(By.xpath("//td[text()='Master In Java']/following-sibling::td[3]"));
		System.out.println("Master in Java price->" + price.getText());

		
		List<WebElement> b=driver.findElements(By.xpath("//td[text()>='1000']/preceding-sibling::td[3]"));
		System.out.println("Book price >=1000");
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}
		
		
		List<WebElement> bprice=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
		int size=bprice.size();
	int max=0;

	int second=0;
	List<WebElement> bookname=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));
	
	String maxbook="";
	String secondbook="";
	
	for(int i=0;i<size;i++)
	{
		int prices=Integer.parseInt(bprice.get(i).getText()) ;
		 
		 if(prices>max)
		 {
			second=max;
			secondbook=maxbook;
			max=prices;
			maxbook=bookname.get(i).getText();
		 }
		 
		 else if(prices>second&& prices<max)
		 {
			 second=prices;
			 secondbook=bookname.get(i).getText();
		 }
	}
		System.out.println("Highest price -->"+max+ " Book name "+maxbook);
		System.out.println("second price -->"+second+" second book"+secondbook);

	
		
		
		
	}
}
