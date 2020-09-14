package Pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
///import org.sikuli.script.Screen;
import org.sikuli.script.Screen;

public class FileUploadDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	    String filepath = "C:\\Workspace\\FilesToUpload\\";
        String inputFilePath = "C:\\Workspace\\FilesToUpload\\";
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "FIleInputBox.PNG");
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        Pattern choosebtn= new Pattern(filepath+"Choose.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");

        // Click on Browse button and handle windows pop up using Sikuli
    //   driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
        s.click(choosebtn);
        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Choose.PNG");
        s.click(openButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("http://demo.automationtesting.in/Register.html");
//		
//		driver.findElement(By.id("imagesrc")).click();
		 
//        Thread.sleep(5000);
// 
//        Pattern fileNameInput = new Pattern("C:\\Workspace\\FilesToUpload\\FIleInputBox.PNG");
//        Pattern openButton = new Pattern("C:\\Workspace\\FilesToUpload\\OpenButton.PNG");
// 
//        Screen screen = new Screen();
//        screen.type(fileNameInput, "C:\\Workspace\\FilesToUpload\\OpenButton.PNG");
//        screen.click(openButton);
		
		
		
	}

}
