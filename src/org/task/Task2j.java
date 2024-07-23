package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2j {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://adactinhotelapp.com/");
	Thread.sleep(2000);
	WebElement username=driver.findElement(By.id("username"));
	Thread.sleep(2000);
	
	username.sendKeys("vvv");
	System.out.println(username.getText());
	Thread.sleep(2000);
	WebElement pswd=driver.findElement(By.id("password"));
	Thread.sleep(2000);
	pswd.sendKeys("#mk123");

}
}
