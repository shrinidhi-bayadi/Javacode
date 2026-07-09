package module5;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * TestNG Cross Browser and Parallel Execution

Website: https://www.amazon.in

Create five TestNG test cases to perform the following:

1)Search for "Shoes", select the 3rd option from the autosuggestion list,
click on the 3rd product, and add it to the cart.
2)Search for "Laptop".
3)Search for "Mobile".
4)Print the page title.
5)Print the current URL.

Run all test cases on Chrome and Edge ,firefox using Cross Browser Testing 
and Parallel Execution through testng.xml.
 */
public class Assignment_158_Tc2 extends Amazon_BaseTest{

	@Test
	
	public void searchLaptop()
	{
		
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("Laptop"+Keys.ENTER);
		
		
		
	}
	
}
