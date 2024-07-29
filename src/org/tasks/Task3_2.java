package org.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	Thread.sleep(2000);
	WebElement frame=driver.findElement(By.tagName("frame"));
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	Thread.sleep(2000);
	login.click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	
	
}
}
