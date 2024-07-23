package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3a {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.snapdeal.com/ ");
	WebElement search=driver.findElement(By.id("inputValEnter"));
	search.sendKeys("watch");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@title=\"HMCT Silver Metal Analog Men's Watch\"]")).click();
	
}
}
