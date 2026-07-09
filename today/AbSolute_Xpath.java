package today;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbSolute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bnidh/OneDrive/Desktop/learningHTML1.html\r\n");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement know=driver.findElement(By.xpath("/html/body/a"));
		know.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
