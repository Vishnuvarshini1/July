package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.shopclues.com/wholesale.html");
	Thread.sleep(2000);
	Actions mouseaction=new Actions(driver);
	WebElement mobile=driver.findElement(By.xpath("//label[text()='Mobile & Laptop Accessories']"));
	Thread.sleep(2000);
	mouseaction.click(mobile).build().perform();
	Thread.sleep(2000);
	
	WebElement price=driver.findElement(By.xpath("//label[@for='1001 - 2500']"));
	Thread.sleep(2000);
	mouseaction.click(price).build().perform();
	
}
}
