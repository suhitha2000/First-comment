package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://adactinhotelapp.com/");
		
		//WebElement user = driver.findElement(By.id("username"));
		
	//	user.sendKeys("suhithak");
		
	//	WebElement pass = driver.findElement(By.id("password"));
	//	pass.sendKeys("suhi123");
		
	//	WebElement pass1 = driver.findElement(By.id("login"));
	//	pass1.click();
		
		//driver.navigate().to("https://adactinhotelapp.com/");
		
		//Thread.sleep(2000);
		
		driver.navigate().to("https://www.redbus.in/");
		
		//Thread.sleep(2000);
		
		//driver.navigate().back();
		
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		Dimension d = new Dimension(400,4000);
		
	    
		driver.manage().window().setSize(d);
		
		Point p = new Point(250,250);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
				
	}

}
