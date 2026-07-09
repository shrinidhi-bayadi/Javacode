package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 Website: https://www.saucedemo.com/

Create a BaseTest class.
Use @BeforeMethod to:
Launch Chrome.
Maximize the browser.
Open the SauceDemo application.
Use @AfterMethod to quit the browser.

TestNG Concept: @Test(priority = )
Create a class Assignment_157 that extends BaseTest.

Write separate @Test methods to perform the following:

@Test(priority = 1) – Launch the application and log in using valid credentials.
@Test(priority = 2) – print the page title
@Test(priority = 3) – print the current url
 */
public class Assignment_157 extends BaseTest {

	@Test(priority = 1)

	public void login() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

	}

	@Test(priority = 2)

	public void titleMethod() {
		String title = driver.getTitle();

		System.out.println("Title-->" + title);

	}

	@Test(priority = 3)

	public void urlMethod() {

		String url = driver.getCurrentUrl();
		System.out.println("Current url-->" + url);

	}
}
