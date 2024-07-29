package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.leafground.com/checkbox.xhtml");
	WebElement checkBox=driver.findElement(By.xpath("//label[text()='Javascript']"));
	Thread.sleep(2000);
	checkBox.click();
	WebElement csharp=driver.findElement(By.xpath("//label[text()='C-Sharp']"));
	Thread.sleep(2000);
	csharp.click();
	WebElement java=driver.findElement(By.xpath("//label[text()='Java']"));
	Thread.sleep(2000);
	java.click();
	
	
}
}
