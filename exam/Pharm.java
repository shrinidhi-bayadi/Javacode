package exam;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 Automate below Scenerio
1. Launch https://pharmeasy.in/
2. Search PCM
3. Click on 3rd option
4. From the list of search result click on 3rd product
5. Select the quantity as 2
6. Click on View cart
After automating push your file to your github repo
*
 */

public class Pharm
{
	public static void main(String[] args)
	{

ChromeDriver driver = new ChromeDriver();



driver.get("https://pharmeasy.in/");



driver.manage().window().maximize();

WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));

WebElement search= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Search']")));

search.click();


WebElement PCM= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search medicines/Healthcare products']")));

PCM.sendKeys("pcm");


List<WebElement> third_option=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'typeahead-lib-MedicineSearchItem-module_medicineName__7wskX')]")));

third_option.get(2).click();





List<WebElement> third_product=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='ProductCard_medicineUnitContainer__m2_zO']/descendant::h1")));

third_product.get(4).click();



WebElement addToCart= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'CartButtonWrapper_cartButton__LcXLh')]/button/span[text()='Add to Cart']")));

addToCart.click();





WebElement quantity= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']/div/span[text()='2']")));

quantity.click();





WebElement viewCart= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Cart']")));

viewCart.click();


driver.quit();
}
}