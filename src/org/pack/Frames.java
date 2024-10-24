package org.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
		
		
		
	}

}
