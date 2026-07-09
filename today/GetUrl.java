package today;
//url,title,browser id
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");

	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	String title=driver.getTitle();
	System.out.println("Title of page-->"+title);
	String url=driver.getCurrentUrl();
	System.out.println("Current url-->"+url);
	String browserid=driver.getWindowHandle();
	System.out.println("browser id-->"+browserid);
	driver.close();
}
}
