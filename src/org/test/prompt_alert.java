package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_alert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.leafground.com/alert.xhtml");
	WebElement promptalert=driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
	promptalert.click();
	Alert promptAlert= driver.switchTo().alert();
	Thread.sleep(2000);
	promptAlert.sendKeys("vishnu");
	Thread.sleep(2000);
	promptAlert.accept();
}
}
