package org.pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  Thread.sleep(3000);
	   File screen = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File("C:\\Users\\Hp\\Desktop\\ss\\in.png"));

	
	
		
	//private static void takesScreenshot(WebDriver driver,String ss ) throws IOException {
		
	 // TakesScreenshot ts = (TakesScreenshot) driver;
	//	File screen = ts.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screen,new File("C:\\Users\\Hp\\Desktop\\ss"+ss));
	
	//public static void main(String[] args)
	//	System.setProperty("webdriver.chrome.driver",
	//	"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");

       //  WebDriver driver = new ChromeDriver();

         // driver.get("https://www.instagram.com/");
         // takescreenshot
          
          
		
	}
	
		
		
	}
	

