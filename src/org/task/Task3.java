package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.className("gLFyf")).sendKeys("aiite");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='aiite academy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//cite[text()='https://aiiteacademy.com']")).click();
}
}
