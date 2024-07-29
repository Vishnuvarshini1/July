package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.gettyimages.in/");
	Thread.sleep(2000);
	WebElement editorial=driver.findElement(By.xpath("(//a[text()='Editorial'])[1]"));
	editorial.click();
	
}
}
