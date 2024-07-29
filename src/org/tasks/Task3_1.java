package org.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	WebElement Btn=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	Thread.sleep(2000);
	//to open the alert box this element is found
	Btn.click();
	// switch to alert
	Thread.sleep(2000);
	Alert simple=driver.switchTo().alert();
	//to click the ok buttn
	Thread.sleep(3000);
	simple.accept();
	Thread.sleep(2000);
	//to find element of confirm alert
	WebElement cnfrmalert=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	Thread.sleep(2000);
	cnfrmalert.click();
	Thread.sleep(3000);
	WebElement Btn2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	Thread.sleep(2000);
	//to open the alert box this element is found
	Btn2.click();
	Thread.sleep(2000);
	Alert confirm=driver.switchTo().alert();
	Thread.sleep(2000);
	confirm.dismiss();
	WebElement promptalert=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	Thread.sleep(2000);
	promptalert.click();
	Thread.sleep(3000);
	WebElement Btn3=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	Thread.sleep(2000);
	//to open the alert box this element is found
	Btn3.click();
	Thread.sleep(2000);
	Alert prompt=driver.switchTo().alert();
	Thread.sleep(2000);
	prompt.sendKeys("Testing");
	Thread.sleep(2000);
	prompt.accept();
}
}
