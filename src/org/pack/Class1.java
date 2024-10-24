package org.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("suhithak");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("suhi123");
		
		WebElement pass1 = driver.findElement(By.id("login"));
		pass1.click();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement l = driver.findElement(By.id("location"));
		Select l1 = new Select(l);
		l1.selectByIndex(6);
		Thread.sleep(5000);
		
		WebElement h = driver.findElement(By.id("hotels"));
		Select h1 = new Select(h);
		h1.selectByValue("Hotel Sunshine");
	    Thread.sleep(5000);
		
		WebElement r = driver.findElement(By.name("room_type"));
		Select r1 = new Select(r);
		r1.selectByVisibleText("Standard");
		Thread.sleep(5000);
		
		WebElement n = driver.findElement(By.id("room_nos"));
		Select n1 = new Select(n);
		n1.selectByValue("3");
		Thread.sleep(5000);
		
		WebElement a = driver.findElement(By.id("adult_room"));
		Select a1 = new Select(a);
		a1.selectByIndex(3);
		Thread.sleep(5000);
		
		WebElement c = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
		Select c1 = new Select(c);
		c1.selectByValue("1");
		Thread.sleep(5000);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Suhitha");
		
		driver.findElement(By.id("last_name")).sendKeys("Kumaravel");
		
		
		driver.findElement(By.id("address")).sendKeys("Chennai");
		
		driver.findElement(By.id("cc_num")).sendKeys("123456789877654339887");
		
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select type = new Select(cc);
		type.selectByVisibleText("VISA");
		
		WebElement ex = driver.findElement(By.id("cc_exp_month"));
		Select exp = new Select(ex);
		exp.selectByValue("3");
		
		WebElement y = driver.findElement(By.id("cc_exp_year"));
		Select yr = new Select(y);
		yr.selectByVisibleText("2014");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("987654");
		
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("my_itinerary")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("ids[]")).click();
		
		driver.findElement(By.name("cancelall")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
