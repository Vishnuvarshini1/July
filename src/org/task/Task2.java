package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	WebElement From=driver.findElement(By.id("src"));
	Thread.sleep(2000);
	From.sendKeys("Coimbatore");
	Thread.sleep(2000);
	WebElement To=driver.findElement(By.id("dest"));
	To.sendKeys("Trichy");
	
}
}
