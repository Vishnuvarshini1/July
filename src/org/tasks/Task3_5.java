package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement id=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		id.sendKeys("vishnu");
		WebElement continuebtn=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		continuebtn.click();
		String window=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		Thread.sleep(2000);
		
		WebElement passWrd=driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(2000);
		passWrd.sendKeys("@123");
		
	}
	
}
