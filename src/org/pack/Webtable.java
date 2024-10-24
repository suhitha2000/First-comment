package org.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement trow = thead.findElement(By.tagName("tr"));
		List<WebElement> theads = trow.findElements(By.tagName("th"));
		for(int i=0;i<theads.size();i++) {
			WebElement data = theads.get(i);
			String text = data.getText();
			System.out.println(text);
			
		}
		
		WebElement body = table.findElement(By.tagName("tbody"));
		 List<WebElement> rows = body.findElements(By.tagName("tr"));
		 for(int i=0;i<rows.size();i++) {
			 WebElement allrows = rows.get(i);
			 List<WebElement> allc = allrows.findElements(By.tagName("td"));
			 for(int j=0;j<allc.size();j++) {
				 WebElement allabt = allc.get(j);
				 
				 System.out.println(allabt.getText());
			 }
			 
		 }

}
}