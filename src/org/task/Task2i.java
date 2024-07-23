package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2i {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	WebElement FN=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	Thread.sleep(2000);
	FN.sendKeys("Vishnu");
	Thread.sleep(2000);
	WebElement LN=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Thread.sleep(2000);
	LN.sendKeys("Varshini");
	WebElement emailid=driver.findElement(By.xpath("//input[@type='email']"));
	Thread.sleep(2000);
	emailid.sendKeys("varshini@gmail.com");
	WebElement phno=driver.findElement(By.xpath("//input[@type='tel']"));
	Thread.sleep(2000);
	phno.sendKeys("8974532210");
	Thread.sleep(2000);
	WebElement password=driver.findElement(By.id("firstpassword"));
	password.sendKeys("@12nkfhkjh");
	Thread.sleep(2000);
	WebElement cnfrmpswd=driver.findElement(By.id("secondpassword"));
	Thread.sleep(2000);
	cnfrmpswd.sendKeys("@12nkfhkjh");

}
}
