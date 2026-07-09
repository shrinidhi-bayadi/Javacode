package seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Go to 
 * https://grotechminds.com/registration/
 * Fill all details except file upload on Registration Application
 * Enter Data 
 * quit
 * 
 */
public class Registration_Correct2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		WebElement firstname = driver.findElement(By.id("fname"));
        firstname.sendKeys("Shrinidhi");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Bayadi");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("bnidhib8@gmail.com");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		Thread.sleep(1000);

		WebElement gender = driver.findElement(By.id("Female"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement skill = driver.findElement(By.id("select2-Skills-container"));
		skill.click();
		Thread.sleep(1000);
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.ARROW_DOWN);
		a1.sendKeys(Keys.ARROW_DOWN);
		a1.sendKeys(Keys.ENTER).perform();

		WebElement country = driver.findElement(By.id("select2-Country-container"));
		country.click();
		Thread.sleep(1000);
		Actions a2 = new Actions(driver);
		a2.sendKeys(Keys.ARROW_DOWN);
		a2.sendKeys(Keys.ARROW_DOWN);
		a2.sendKeys(Keys.ENTER).perform();

		WebElement religion = driver.findElement(By.id("select2-Relegion-container"));
		religion.click();
		Thread.sleep(1000);
		Actions a3 = new Actions(driver);
		a3.sendKeys(Keys.ARROW_DOWN);
		a3.sendKeys(Keys.ENTER).perform();

		WebElement tech = driver.findElement(By.id("select2-technicalskills-container"));
		tech.click();
		Thread.sleep(1000);
		Actions a4 = new Actions(driver);
		a4.sendKeys(Keys.ARROW_DOWN);
		a4.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		WebElement nontech = driver.findElement(By.id("select2-nontechnicalskills-container"));
		nontech.click();
		Thread.sleep(1000);
		Actions a5 = new Actions(driver);
		a5.sendKeys(Keys.ARROW_DOWN);
		a5.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		WebElement present_address = driver.findElement(By.id("Present-Address"));
		present_address.sendKeys("Abc Layout bangalore -998989");
		Thread.sleep(1000);
		
		WebElement perm_address = driver.findElement(By.name("Permanent-Address"));
		perm_address.sendKeys("Abc Layout bangalore -998989");
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='Pincode']"));
		pin.sendKeys("12345");
		Thread.sleep(1000);

		WebElement reloacte = driver.findElement(By.id("relocate"));
		reloacte.click();
		Thread.sleep(3000);
		
		driver.quit();

	}
}
