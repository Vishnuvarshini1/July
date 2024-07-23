package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2e {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://netbanking.hdfcbank.com/");
	Thread.sleep(2000);
	WebElement userId=driver.findElement(By.xpath("//input[@type='text']"));
	//Thread.sleep(2000);
	userId.sendKeys("varshini");

}
}
