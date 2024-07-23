package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(2000);
		user.sendKeys("vishnu");
		Thread.sleep(2000);
		String attribute=user.getAttribute("name");
		String attribute2=user.getAttribute("value");
		System.out.println(attribute);
		System.out.println(attribute2);
	}
}
