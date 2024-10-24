package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphonee {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		
		 WebElement name = driver.findElement(By.name("field-keywords"));
		 name.click();
		 
		  WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		 s.sendKeys("iphone 14");
		 
		 WebElement ss = driver.findElement(By.id("nav-search-submit-button"));
		 ss.click();
		 
		 WebElement c = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][1]"));
		 
		 c.click();
		 
		 
		 
		 
		 
		 
		 
		
		 
		
	
		

}
}
