package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2c {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	Thread.sleep(2000);
	WebElement user=driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
	user.sendKeys("vishnu");
	Thread.sleep(2000);
	WebElement arrow=driver.findElement(By.className("goahead"));
	Thread.sleep(2000);
	arrow.click();
	WebElement passwd=driver.findElement(By.className("login-input-password"));
	Thread.sleep(2000);
	passwd.sendKeys("123&&okj");
	
}
}
