package Pkg1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RealTime {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		RealTime rl= new RealTime();
	//	rl.checkLinks();
		
		rl.dragdrop();
		
	}	
	
	
	
	public void dragdrop()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.diagrams.net/");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
//		Actions dragdrop = new Actions(driver);
		WebElement object1 = driver.findElement(By.xpath("//div[@class='geSidebarContainer']//div//a[1]//*[local-name()='svg']//*[name()='g']//*[name()='g']//*[name()='g' and contains(@transform,'translate(')]//*[name()='rect' and contains(@x,'1.44')]"));
		WebElement canvas = driver.findElement(By.xpath("//div[@class='geDiagramContainer geDiagramBackdrop']"));
//		dragdrop.dragAndDrop(object1, canvas);
//		dragdrop.build().perform();
		
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(object1).build().perform();
		builder.moveToElement(canvas,200,200).build().perform();
		//builder.moveByOffset(200, 200).build().perform();
		builder.release().build().perform();
		
		
		
	}
	
	
	
	public void checkLinks()
	{

		// TODO Auto-generated method stub
		
/*		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Count of links on the webpage
		
		int linkscount=driver.findElements(By.tagName("a")).size();
		System.out.println(linkscount);
		
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));// limiting the scope to footer driver
		
		int footerlinkscount=footerdriver.findElements(By.tagName("a")).size();// total links on the footer
		
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int count=columndriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//Click on each  link and check if pages are opening in a seperate tab
		for(int i=1;i<count;i++ )
		{
			String clicklink=Keys.chord(Keys.CONTROL, Keys.ENTER); //Ctrl+click event 
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			
			Thread.sleep(5000);
			
			
		}// opens all tabs
		
	// switch to tabs and get the title
		Set<String> tab= driver.getWindowHandles();
		Iterator<String> it =tab.iterator();
		
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}*/
	
	// Check links count in google and click each link and open in seperate tab
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-gpu");
	driver=new ChromeDriver(options);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//driver.findElement(By.name("q")).sendKeys("test"+Keys.ENTER);
	
	int linkscount= driver.findElements(By.tagName("a")).size();
	System.out.println(linkscount);
	
	for(int i=0;i<linkscount;i++)
	{
		String clicklinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElements(By.tagName("a")).get(i).sendKeys(clicklinks);
		//Thread.sleep(2000);
		
	}
	
	Set<String> tabs=driver.getWindowHandles();
	Iterator<String> it=tabs.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
	}
	
	
	}
	

}
