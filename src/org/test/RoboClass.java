package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RoboClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	//use action class
	Actions mouseaction=new Actions(driver);
	//to find the webelement
	WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
	Thread.sleep(2000);
	mouseaction.contextClick(gmail).build().perform();
	//create a Robo class
	Robot kA=new Robot();
	Thread.sleep(2000);
	for(int i=1;i<=3;i++) {
//keyboard actionto perform press and release operation kA--keyboardaction
		kA.keyPress(KeyEvent.VK_DOWN);
		kA.keyRelease(KeyEvent.VK_DOWN);
		
	}
	Thread.sleep(2000);
	kA.keyPress(KeyEvent.VK_ENTER);
	kA.keyRelease(KeyEvent.VK_ENTER);	
	
}
}
