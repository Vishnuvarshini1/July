package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		List<WebElement> framecount=driver.findElements(By.tagName("iframe"));
		int size=framecount.size();
		System.out.println(size);
		Thread.sleep(2000);
		//to find the element of singleframe 
		WebElement singleframe=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		//switch to frame using webelement
		driver.switchTo().frame(singleframe);
		Thread.sleep(2000);
		//to find the webelement of textbox
		WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
		//send the input
		Thread.sleep(2000);
		textBox.sendKeys("FRAME");
		driver.switchTo().defaultContent();	
	}
}