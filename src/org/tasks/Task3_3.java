package org.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_3 {
	//https://retail.onlinesbi.sbi/retail/login.htm
		
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		Thread.sleep(2000);
		login.click();
		WebElement login1=driver.findElement(By.xpath("//input[@title='Login']"));
		Thread.sleep(2000);
		login1.click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		
		}
}