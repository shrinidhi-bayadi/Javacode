package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Website:

https://www.saucedemo.com/

Scenario:
Launch the website.
Login using:
Username: standard_user
Password: secret_sauce
Sort the products by Price (High to Low).
Click the 2nd product.
Print the Product Name.
Print the Product Price.
Click Add to Cart.
Open the shopping cart.

Verify the product name in the cart and print:

Product added successfully

if the names match.

Click Checkout.
Enter:
First Name: John
Last Name: Smith
Zip Code: 33543
Click Continue.
Print:
Payment Information
Shipping Information
Total Price
Click Finish.
Print the success message.
Logout.
 */
public class SauceDemo {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	Thread.sleep(1000);
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	Thread.sleep(1000);

	WebElement login=driver.findElement(By.id("login-button"));
	login.click();
	Thread.sleep(3000);

	WebElement filter=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	Thread.sleep(2000);

	Select s1=new Select(filter);
	s1.selectByContainsVisibleText("Price (high to low)");
	
	Thread.sleep(1000);

	WebElement product=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[2]"));
	product.click();
	Thread.sleep(2000);

	WebElement productname=driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']"));
	String ep=productname.getText();
	System.out.println("productname-->"+ep);
	
	
	WebElement price=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
	System.out.println("price-->"+price.getText());
	
	WebElement addtocart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
	addtocart.click();
	Thread.sleep(2000);

	WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	cart.click();
	Thread.sleep(2000);

	
	WebElement actualproduct=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	String ap=actualproduct.getText();
	System.out.println("Actual product-->"+ap);
	if(ep.equals(ap))
	{
		System.out.println("Product name is correct");
	WebElement checkout=driver.findElement(By.xpath("//button[text()='Checkout']"));
	checkout.click();
	Thread.sleep(2000);
	
	WebElement fname=driver.findElement(By.name("firstName"));
	fname.sendKeys("John");
	Thread.sleep(1000);
	
	WebElement lname=driver.findElement(By.name("lastName"));
	lname.sendKeys("Smith");
	Thread.sleep(1000);

	
	WebElement zip=driver.findElement(By.name("postalCode"));
	zip.sendKeys("33543");
	Thread.sleep(1000);
	
	WebElement cont=driver.findElement(By.name("continue"));
	cont.click();
	Thread.sleep(3000);
	
	WebElement pay=driver.findElement(By.xpath("//div[@data-test='payment-info-value']"));
System.out.println("Payment info-->"+pay.getText());


WebElement shipping=driver.findElement(By.xpath("//div[@data-test='shipping-info-value']"));
System.out.println("Shipping info-->"+shipping.getText());

WebElement total=driver.findElement(By.xpath("//div[@class='summary_total_label']"));
System.out.println("Total price info-->"+total.getText());


WebElement finish=driver.findElement(By.id("finish"));
finish.click();
Thread.sleep(2000);

WebElement suc=driver.findElement(By.xpath("//h2"));
System.out.println("msg-->"+suc.getText());
Thread.sleep(2000);

WebElement e=driver.findElement(By.id("react-burger-menu-btn"));
e.click();
Thread.sleep(2000);

WebElement logout=driver.findElement(By.id("logout_sidebar_link"));

logout.click();


	}
	else
	{
		System.out.println("Expected prodcut name is different than actual product");
	}
	
	
}
}
