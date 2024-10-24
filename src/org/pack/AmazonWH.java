package org.pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonWH {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14",Keys.ENTER);
		String parent = driver.getWindowHandle();
		System.out.println("parent id"+parent);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black'][1]")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("allwindows"+allwindow);
		
		for(String n:allwindow) {
			if(!parent.equals(n)) {
				driver.switchTo().window(n);
				WebElement black = driver.findElement(By.id("productTitle"));
				String b = black.getText();
				System.out.println(b);
				
				driver.switchTo().window(parent);
				
		       
				
				driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Purple']")).click();
				List<String> li= new ArrayList();
				li.addAll(allwindow);
				
				String child2 = li.get(2);
				
				driver.switchTo().window(child2);
				WebElement purple = driver.findElement(By.id("productTitle"));
				String p = purple.getText();
				System.out.println(p);
				
				
				
				
				
				
				
			}
			
		}
		
		
		











		
		
		
		
				
	}

}
