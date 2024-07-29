package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//to load url
	driver.get("https://en.wikipedia.org/wiki/Selenium");
	Thread.sleep(2000);
	WebElement atomicnumber=driver.findElement(By.xpath("//a[text()='atomic number']"));
	//click the element
	atomicnumber.click();
	Thread.sleep(2000);
	//get to window
	String swindow=driver.getWindowHandle();
	//switch to window
	Thread.sleep(2000);
	driver.switchTo().window(swindow);
	//find the element 
	WebElement chargenumber=driver.findElement(By.xpath("//a[text()='charge number']"));
	//click the element
	Thread.sleep(2000);
	chargenumber.click();

}
}
