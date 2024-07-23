package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2f {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.swiggy.com/");
	WebElement other=driver.findElement(By.xpath("//span[text()='Other']"));
	Thread.sleep(2000);
	other.click();
	Thread.sleep(2000);
	WebElement location=driver.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
	Thread.sleep(2000);
	location.sendKeys("chennai");
}
}
