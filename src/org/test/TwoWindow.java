package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//to load url
		driver.get("https://www.leafground.com/window.xhtml");
		Thread.sleep(2000);
		WebElement Open=driver.findElement(By.xpath("//span[text()='Open']"));
		//to click the element
		Thread.sleep(2000);
		Open.click();
		
		Set<String>windows=driver.getWindowHandles();
		int size=windows.size();
		System.out.println(size);
		//convert set to list for iteration to all windows
		List<String> list=new ArrayList<>(windows);
		String window1=list.get(0);
		String window2=list.get(1);
		//switch to window
		driver.switchTo().window(window2);
		//to find the element 
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		email.sendKeys("vishnu@gmail.com");
		driver.switchTo().window(window1);
		Thread.sleep(2000);
		Open.click();
	
	}
}