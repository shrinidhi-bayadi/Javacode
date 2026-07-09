package seleniumpractice;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Broken_links {

	        public static void main(String[] args) throws IOException {
	                  ChromeDriver driver=new ChromeDriver();
	          driver.get("https://www.google.com/");
	          driver.manage().window().maximize();
	          List<WebElement> e1=         driver.findElements(By.tagName("a"));
	          int count=        e1.size();
	          System.out.println(count);
	          for(int i=0;i<count;i++)
	          {
	          WebElement e2=        e1.get(i);
	          String url=        e2.getAttribute("href");
	          System.out.println(url);
	          verifyTheURL(url);
	        }
	}
	        static void verifyTheURL(String url) throws IOException
	        {
	                try {
	                URL u1=new URL(url);
	                HttpURLConnection c1=        (HttpURLConnection) u1.openConnection();
	                
	                if(c1.getResponseCode()==200)
	                {
	                        System.out.println("The Link is Valid");
	                }
	                else
	                {
	                        System.out.println("The link is not valid " +c1.getResponseMessage()+" " +c1.getResponseCode());
	                }
	                }
	                catch(MalformedURLException m1)
	                {
	                        System.out.println("Hanlded the exception");
	                }
	        }
}
