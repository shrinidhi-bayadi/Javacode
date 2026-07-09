package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Automate below Scenerio
1. Launch https://www.hopscotch.in/
2. Click on Account
3. Click on Sign in
4. Click on Join us
5. Enter Full name, Email id and Mobile No
6. Click on Send OTP
After automating upload your java file here
[If you wish to get job as a Automation Engineer do it yourself without any cheating ]
 */
public class Hopscotch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hopscotch.in/");
		driver.manage().window().maximize();
		Thread.sleep(8000);

		WebElement account = driver.findElement(By.xpath("//span[@ng-click='vm.goToAccountPage()']"));
		Thread.sleep(3000);
		account.click();

		WebElement signin = driver.findElement(By.xpath("//button[@aria-label='Sign in to your account']"));
		Thread.sleep(3000);

		signin.click();
		Thread.sleep(3000);
		WebElement joinus = driver.findElement(By.xpath("//a[text()='Join us']"));
		Thread.sleep(5000);
		joinus.click();
		Thread.sleep(3000);
		
		//element not interactable exception .till here it is working
		
		WebElement fullname = driver.findElement(By.xpath("//label[text()='Full Name']"));
		Thread.sleep(1000);
		fullname.sendKeys("Shrinidhi");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath("//label[text()='Email Address']"));
		email.sendKeys("bnidhib8@gmail.com");
		Thread.sleep(1000);

		WebElement mobile = driver.findElement(By.xpath("//label[text()='Mobile Number']"));
		mobile.sendKeys("1234567878");
		Thread.sleep(1000);

		WebElement otp = driver.findElement(By.linkText("Send otp"));
		otp.click();
		Thread.sleep(1000);

	}
}