package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2h {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	Thread.sleep(2000);
	login.sendKeys("vishnu");
	WebElement pswd=driver.findElement(By.xpath("//input[@aria-label='Password']"));
	Thread.sleep(2000);
	pswd.sendKeys("@123asp");
	
	
}
}
