package Pkg1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
		
		// To open Naukri.com with multiple windows
		  driver.get("https://www.naukri.com/");
		  Thread.sleep(2000);
		  // It will return the parent window name as a String
		  String parentWinID = driver.getWindowHandle();
		  System.out.println("Parent Win ID is: " + parentWinID);
		  // It returns no. of windows opened by WebDriver and will return Set of Strings
		  Set<String> allWinID = driver.getWindowHandles();
		  System.out.println("Total Window size:" +allWinID.size());
		  System.out.println("All win IDs are:");
		  for (String allIDs : allWinID) {
		   System.out.println(allIDs);
		  }
		  // Using Iterator to iterate with in windows
		  Iterator<String> itr = allWinID.iterator();
		  while (itr.hasNext()) {
		   String childWinID = itr.next();
		   // Compare whether the main window is not equal to child window. If not equal, we will close child windows.
		              if(!parentWinID.equalsIgnoreCase(childWinID)) {
		               driver.switchTo().window(childWinID);
		               System.out.println("Child URL is:"+driver.getCurrentUrl());
		               System.out.println("Child Win Title is:"+driver.getTitle());
		               Thread.sleep(2000);
		               driver.close();
		              }
		  }
		  // This is to switch to the main window
		  driver.switchTo().window(parentWinID);
		//  driver.quit();
		
		
		
		
//		
//		// open new tab through javascript executor
//				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//				driver=new ChromeDriver();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.get("https://accounts.google.com/signup");
//				
//				JavascriptExecutor js= (JavascriptExecutor) driver;
//				
//				js.executeScript("window.open()");
//				
//				
//				Set<String> s=driver.getWindowHandles();
//				Iterator<String> it=s.iterator();
//				String parent=it.next();
//				String child=it.next();
//				driver.switchTo().window(child);
//				driver.get("https://www.facebook.com");
//				
//		
		
		
		
		
		/*// open new tab through ctrl t
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://www.facebook.com");
		
		
		*/
		
		
		
				/*Swtich to child window and again back to parent window
				 * System.out.println(driver.getTitle());
				
				Set<String> ids=driver.getWindowHandles();// all ids are stored in Set using getWindowHandles() method;
				
				Iterator<String> it=ids.iterator();//Iterator is used to move to the first id in the set
				
				String parentid= it.next();// moves to the first id
				
				String child=it.next();// moves to the next immediate child
				driver.switchTo().window(child); //expects id in window parameter to switch to child
				System.out.println(driver.getTitle());
				driver.switchTo().window(parentid);// again switch to parent window
				System.out.println(driver.getTitle());
				
				*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
