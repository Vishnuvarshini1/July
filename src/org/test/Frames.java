package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	Thread.sleep(2000);
	List<WebElement> framecount=driver.findElements(By.tagName("frame"));
	int size=framecount.size();
	System.out.println(size);
	//witch to frame using id or name
	driver.switchTo().frame("login_page");
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(2000);
	login.sendKeys("vishnu");
	
}
}
