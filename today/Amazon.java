package today;
/*
 *  
 	
WAP to login to amazon.in or amazon.com based on your region->
search a prodouct->add it to wishlist->
add it to cart->Reach payment page ->
Select Credit card option and enter your card details

*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void login(ChromeDriver driver) throws InterruptedException {
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("bnidhib8@gmail.com");
		WebElement continue_button = driver.findElement(By.xpath("//input[@type='submit']"));
		continue_button.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Shop123$$");
		// password
		WebElement submit = driver.findElement(By.id("signInSubmit"));
		submit.click();

	}

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(

				"https://www.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		//this will call login method which contains user name and password
		login(driver);

		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("dress" + Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//a/h2"));
		list.get(5).click();
		Thread.sleep(9000);

		WebElement wish = driver.findElement(By.xpath("//i[@class='lists-framework-unfilled-heart-icon']"));
		wish.click();
		Thread.sleep(8000);

		WebElement hello = driver.findElement(By.xpath("//span[text()='Hello, Shrinidhi']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hello);

		Thread.sleep(3000);
		WebElement shoppinglist = driver.findElement(By.linkText("Shopping List"));

		shoppinglist.click();
		Thread.sleep(3000);

		WebElement addtocart = driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));

		addtocart.click();
		Thread.sleep(3000);

		WebElement cart = driver.findElement(By.id("nav-cart-count"));
		cart.click();
		Thread.sleep(4000);

		WebElement proceed = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
		proceed.click();
		Thread.sleep(3000);

		WebElement delivery = driver.findElement(By.id("checkout-primary-continue-button-id"));

		delivery.click();
		Thread.sleep(3000);

		WebElement card = driver
				.findElement(By.xpath("(//span[@class='pmts-instrument-selector']/div/label/input)[1]"));
		card.click();
		Thread.sleep(3000);

		WebElement usethis = driver.findElement(By.id("checkout-secondary-continue-button-id"));
		usethis.click();
		Thread.sleep(3000);

	}
}
