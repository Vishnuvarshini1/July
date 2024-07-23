package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//To locate an element using xpath in home page
	//driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	//to locate an element using child xpath
	//WebElement e1=driver.findElement(By.xpath("(//div[@class='bpjkJb']//child::span[5])"));
	//wait for specific time period
	//Thread.sleep(2000);
	//to click the element
	//e1.click();
	//To locate an element using preceding with text
	WebElement cart=driver.findElement(By.xpath("(//a[text()='Become a Seller']//preceding::a[2])"));
	cart.click();
}
}
