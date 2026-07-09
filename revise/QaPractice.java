package revise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

/*

Website: https://demoqa.com/browser-windows

Part A – Browser & Window Handling
Launch Chrome.
Open the website.
Maximize the browser.
Print the page title.
Click New Window.
Switch to the new window.
Print the heading displayed.
Close the new window.
Switch back to the parent window.
Part B – Elements

Go to Text Box and enter:

Full Name: Shrinidhi
Email: shrinidhi@test.com
Current Address: Florida
Permanent Address: USA

Click Submit.

Part C – Check Box
Click Check Box.
Expand all.
Select Desktop.
Print success message.
Part D – Radio Button
Click Radio Button.
Select Yes.
Print selected message.
Part E – Web Tables
Click Web Tables.
Print total rows.
Click Add.
Add new person details.
Search added person.
Print searched row text.
Part F – Buttons / Actions
Click Buttons.
Double click button.
Right click button.
Normal click button.
Print all messages.
Part G – Links
Click Links.
Print all link texts.
Click Home.
Switch to new tab.
Print child title.
Close child tab.
Switch back.
Part H – Broken Links
Click Broken Links - Images.
Click broken link.
Print page title or URL.
Navigate back.
Part I – Verification

Print final URL and title.
Close browser using quit().
Print:

 */
public class QaPractice {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	System.out.println("title-->"+driver.getTitle());
	
	WebElement newwindow=driver.findElement(By.id("windowButton"));
	newwindow.click();
	Thread.sleep(4000);

	Set<String> bid=driver.getWindowHandles();
	Iterator<String> i=bid.iterator();
	String pid=i.next();
	String cid=i.next();
	
	driver.switchTo().window(cid);
	Thread.sleep(2000);
	
	WebElement heading=driver.findElement(By.id("sampleHeading"));
	
	String h=heading.getText();
	
	System.out.println("Heading-->"+h);
	
	driver.close();
	driver.switchTo().window(pid);
	
	WebElement ele=driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
	ele.click();
	Thread.sleep(2000);

	WebElement text=driver.findElement(By.xpath("//span[text()='Text Box']"));
	text.click();
	Thread.sleep(2000);

	WebElement fullname=driver.findElement(By.id("userName"));
	fullname.sendKeys("shrini");
	Thread.sleep(1000);
	
	WebElement email=driver.findElement(By.id("userEmail"));
	email.sendKeys("shrini@test.com");
	Thread.sleep(1000);
	
	
	WebElement address=driver.findElement(By.id("currentAddress"));
	address.sendKeys("florida");
	Thread.sleep(1000);
	
	WebElement perm=driver.findElement(By.id("permanentAddress"));
	perm.sendKeys("florida wesley");
	Thread.sleep(2000);
	
	WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
	submit.click();
	Thread.sleep(2000);

	
	WebElement check=driver.findElement(By.xpath("//span[text()='Check Box']"));
	check.click();
	Thread.sleep(2000);

	WebElement d=driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
	d.click();
	Thread.sleep(2000);
	
	WebElement tick=driver.findElement(By.xpath("//span[text()='Desktop']/ancestor::div[@role='treeitem']/descendant::span[@aria-label='Select Desktop']"));
	tick.click();
	
	WebElement result=driver.findElement(By.xpath("//div[@id='result']"));
	System.out.println(result.getText());
	
	WebElement radio=driver.findElement(By.xpath("//span[text()='Radio Button']"));
	radio.click();
	Thread.sleep(2000);
	
	WebElement yes=driver.findElement(By.id("yesRadio"));
	yes.click();
	Thread.sleep(2000);

	WebElement msg1=driver.findElement(By.xpath("//p[@class='mt-3']"));

	String s1=msg1.getText();
	System.out.println(s1);
	
	WebElement table=driver.findElement(By.xpath("//span[text()='Web Tables']"));
	table.click();
	Thread.sleep(1000);
	
	List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
	
	int count=row.size();
	System.out.println("total number of rows="+count);
	
	WebElement add=driver.findElement(By.id("addNewRecordButton"));
	add.click();
	Thread.sleep(1000);


	
	WebElement fname1=driver.findElement(By.id("firstName"));
	fname1.sendKeys("baya");
	Thread.sleep(1000);

	WebElement lname=driver.findElement(By.id("lastName"));
	lname.sendKeys("shrini");
	Thread.sleep(1000);
	WebElement eml=driver.findElement(By.id("userEmail"));
	eml.sendKeys("shrini@test.com");
	Thread.sleep(1000);
	WebElement age=driver.findElement(By.id("age"));
	age.sendKeys("19");
	Thread.sleep(1000);
	
	WebElement sal=driver.findElement(By.id("salary"));
	sal.sendKeys("456789");
	Thread.sleep(1000);
	
	
	WebElement dept=driver.findElement(By.id("department"));
	dept.sendKeys("sales");
	Thread.sleep(1000);
	
	WebElement sub=driver.findElement(By.id("submit"));
	sub.click();
	Thread.sleep(1000);

	WebElement buttons=driver.findElement(By.xpath("//span[text()='Buttons']"));
	
	buttons.click();
	Thread.sleep(1000);

	WebElement dc=driver.findElement(By.id("doubleClickBtn"));
	Actions a1=new Actions(driver);
	a1.doubleClick(dc).perform();
	Thread.sleep(1000);

	WebElement rc=driver.findElement(By.id("rightClickBtn"));
	Actions a2=new Actions(driver);
	a2.contextClick(rc).perform();
	Thread.sleep(1000);
	
	
	WebElement clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));

	clickme.click();
	Thread.sleep(1000);

	WebElement links=driver.findElement(By.xpath("//span[text()='Links']"));
	links.click();
	Thread.sleep(1000);

	List<WebElement> l=driver.findElements(By.tagName("a"));
	for(int j=0;j<l.size();j++)
	{
		System.out.println(l.get(j).getText());
	}
	
	WebElement home=driver.findElement(By.xpath("//a[@id='simpleLink']"));
	home.click();
	Thread.sleep(1000);

	Set<String> bid1=driver.getWindowHandles();
	Iterator<String> i1=bid1.iterator();
	
	String p=i1.next();
	String c=i1.next();
	driver.switchTo().window(c);
	Thread.sleep(3000);

	String ctitle=driver.getTitle();
	System.out.println("child titile-->"+ctitle);
	driver.close();
	
	driver.switchTo().window(p);
	Thread.sleep(1000);

	WebElement broken=driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
	broken.click();
	Thread.sleep(1000);

	List<WebElement> blink=driver.findElements(By.tagName("a"));
	
	for(int m=0;m<blink.size();m++)
	{
		String url=blink.get(m).getAttribute("href");
		System.out.println(url);
		verifyUrl(url);
	}
	
	WebElement af=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
	af.click();
	Thread.sleep(1000);

	WebElement frames=driver.findElement(By.xpath("//span[text()='Frames']"));
	frames.click();
	Thread.sleep(1000);
	  // Print title
    System.out.println("Title --> " + driver.getTitle());

    // Print heading outside iframe
    WebElement heading1 = driver.findElement(By.xpath("//h1[text()='Frames']"));
    System.out.println("Page Heading --> " + heading1.getText());

    // Count total iframes
    List<WebElement> frames1 = driver.findElements(By.tagName("iframe"));
    System.out.println("Total Iframes --> " + frames1.size());

    // Switch to Frame 1
    WebElement frame1 = driver.findElement(By.id("frame1"));
    driver.switchTo().frame(frame1);

    // Print heading inside iframe
    WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
    System.out.println("Frame 1 Heading --> " + sampleHeading.getText());

    // Back to main page
    driver.switchTo().defaultContent();

    // Switch to Frame 2
    WebElement frame2 = driver.findElement(By.id("frame2"));
    driver.switchTo().frame(frame2);

    // Print heading inside second iframe
    WebElement sampleHeading2 = driver.findElement(By.id("sampleHeading"));
    System.out.println("Frame 2 Heading --> " + sampleHeading2.getText());

    // Back to main page
    driver.switchTo().defaultContent();
	System.out.println("Current url-->"+driver.getCurrentUrl());
	System.out.println("Page titile--->"+driver.getTitle());
	
	
	driver.quit();
	
}

public static void verifyUrl(String url) throws IOException
{
	try
	{
		URL u1=new URL(url);
		HttpURLConnection c1=(HttpURLConnection)u1.openConnection();
		if(c1.getResponseCode()==200)
		{
			System.out.println("Url is valid");
		}
		else
		{
			System.out.println("url is not valid  "+c1.getResponseCode()+"-->"+c1.getResponseMessage());
		}
	}
	catch(MalformedURLException e)
	{
		System.out.println("Invalid url");
	}
}
}
