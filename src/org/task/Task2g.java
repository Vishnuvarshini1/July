package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2g {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.snapdeal.com/login");
	Thread.sleep(2000);
	WebElement id=driver.findElement(By.id("userName"));
	Thread.sleep(2000);
	id.sendKeys("9876572528");
}
}
