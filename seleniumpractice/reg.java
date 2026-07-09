package seleniumpractice;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class reg {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

FirefoxDriver driver = new FirefoxDriver();
driver.get("https://grotechminds.com/registration/");

driver.manage().window().maximize();

Thread.sleep(7000);

WebElement fname = driver.findElement(By.id("fname"));

fname.sendKeys("Tanmay");

WebElement lname = driver.findElement(By.name("lname"));

lname.sendKeys("Mohanty");

Thread.sleep(5000);

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("iamtmohanty@gmail.com");

Thread.sleep(1200);

WebElement pass = driver.findElement(By.name("password"));
pass.sendKeys("xyz@123");

Thread.sleep(1200);

WebElement radio = driver.findElement(By.id("male"));
radio.click();
Thread.sleep(1200);

WebElement bot = driver.findElement(By.id("chat-bot-message-close"));
bot.click();

WebElement skill = driver.findElement(By.id("select2-Skills-container"));
Thread.sleep(1200);
skill.click();

WebElement searchBox =
driver.findElement(By.xpath("//input[@class='select2-search__field']"));

Thread.sleep(1200);

searchBox.sendKeys("Technical");

Thread.sleep(2200);

searchBox.sendKeys(Keys.ENTER);

WebElement country = driver.findElement(By.id("select2-Country-container"));
country.click();
Thread.sleep(2200);

WebElement searchBoxC = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
searchBoxC.sendKeys("Ind");

Thread.sleep(2200);

searchBoxC.sendKeys(Keys.ENTER);

WebElement pa = driver.findElement(By.id("Present-Address"));
pa.sendKeys("Bhubaneswar-751024");

Thread.sleep(2200);

WebElement pea = driver.findElement(By.id("Permanent-Address"));
pea.sendKeys("Bhubaneswar-751024");

Thread.sleep(2200);

WebElement religion = driver.findElement(By.id("select2-Relegion-container"));
religion.click();

Thread.sleep(2200);

religion.sendKeys(Keys.ARROW_DOWN);
religion.sendKeys(Keys.ARROW_DOWN);

/*WebElement searchBoxR = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
searchBoxR.sendKeys("Hin");
Thread.sleep(2200);
searchBoxR.sendKeys(Keys.ENTER);
*/

WebElement pin = driver.findElement(By.id("Pincode"));
pin.sendKeys("751024");

driver.findElement(By.id("relocate")).click();

Thread.sleep(4200);




}

}