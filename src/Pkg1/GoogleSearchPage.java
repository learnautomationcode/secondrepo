package Pkg1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchPage {
	
	static WebDriver driver;
	@Test
	public  void test1() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
//		List<WebElement> listitem=driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']"));
//		
//		System.out.println(listitem.size());
//		for (int i = 0; i < listitem.size(); i++) {			
//			
//				String text=listitem.get(i).getText();
//				
//				if(text.equals("testbook"))
//				{
//					listitem.get(i).click();
//				}
//			
//		}
		
		
		String searchcriteria=" tutorial";
		
		String searchlist="//b[contains(text(),'"+searchcriteria+"')]/parent::span//ancestor::li[@class='sbct']/parent::ul//following-sibling::div[@class='tfB0Bf']/center/input[@class='gNO89b']";
		
		
		WebElement searchclick=driver.findElement(By.xpath(searchlist));
		
		WebElement searchtext=driver.findElement(By.xpath("//b[contains(text(),'"+searchcriteria+"')]"));
		String text=searchtext.getText();
		
		if(text.contains(searchcriteria.trim()))
		{
			driver.findElement(By.name("q")).sendKeys(" "+text);
			
			searchclick.click();
		}	
	}
	

}
