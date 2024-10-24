package org.pack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Users\\Hp\\.eclipse\\SeleniumProject\\driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.redbus.in");
	  
	   WebElement id = driver.findElement(By.id("autoSuggestContainer"));
	  String id1 = id.getText();
	  System.out.println("id1");
	  
	  
	  

}
}