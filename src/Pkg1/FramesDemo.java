package Pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //Switching to frame using WebElement
		//driver.switchTo().frame(0); //Switching to frame using index
		//driver.switchTo().frame("frameid"); //Switching to frame using frameid
		
		
		driver.findElement(By.id("draggable")).click(); //Clicking on element inside frame using WebElement
		
		
		
		Actions a=new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		
		// To switch out of frame , driver.switchTo().defaultContent() is used
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
