package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.leafground.com/alert.xhtml");
	Thread.sleep(2000);
	WebElement confirmalerts=driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
	confirmalerts.click();
	Thread.sleep(2000);
	Alert confirmalert=driver.switchTo().alert();
	Thread.sleep(2000);
	confirmalert.dismiss();
	
	
	
	
	
}
}
