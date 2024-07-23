package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	Actions action=new Actions(driver);
	action.contextClick().build().perform();
	Thread.sleep(3000);
	WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
	action.moveToElement(gmail).click().build().perform();
	Thread.sleep(2000);
	WebElement signIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
	Thread.sleep(2000);
	action.doubleClick(signIn).build().perform();
	
	
}
}
