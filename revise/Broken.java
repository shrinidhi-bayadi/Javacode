package revise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.naming.MalformedLinkException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Website: https://testautomationpractice.blogspot.com/

Scenario

Write a Selenium program to perform the following:

Launch Chrome browser.
Navigate to https://testautomationpractice.blogspot.com/.
Maximize the browser.
Print the page title.
Scroll down to the Broken Links section.
Find all the links present in the Broken Links section only.
Extract the href attribute of each hyperlink to get url.
Verify every URL using HttpURLConnection.
Print "The Link is Valid" if the response code is 200.
Otherwise, print the response message and response code for the broken link.
 */
public class Broken {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	String title=driver.getTitle();
	System.out.println("Page titile --->"+title);
	
	List<WebElement> links=driver.findElements(By.xpath("//div[@id='broken-links']/a"));
	int count=links.size();
	System.out.println("total number of links-->"+count);
	
	
	for(int i=0;i<count;i++)
	{
		String url=links.get(i).getAttribute("href");
		System.out.println(url);
		
		verifyUrl(url);
	}
}

public static void verifyUrl(String url) throws IOException
{
	try
	{
	URL u1=new URL(url);
	HttpURLConnection c1=(HttpURLConnection) u1.openConnection();
	
	if(c1.getResponseCode()==200)
	{
		System.out.println("link is valid");
	}
	
	else
	{
		System.out.println("Link is not valid   "+c1.getResponseCode()+"-->"+c1.getResponseMessage());
	}
	
	
}
	catch(MalformedURLException e1) 
	{
		System.out.println("invalid url");
	}
}
}

