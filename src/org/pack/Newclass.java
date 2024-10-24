package org.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14",Keys.ENTER);
		
		WebElement a = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black'][1]"));
		String a1 = a.getText();
		
		System.out.println(a1);
		 
		
		List<WebElement> b = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		
		for(int i=0;i<=24;i++) {
			
			
			String ss = b.get(i).getText();
		
			System.out.println(ss);
			
		
		
			
		}
		
		
		
		
		
			
			
		
	
		
		
		

}

	

	

	
	}
