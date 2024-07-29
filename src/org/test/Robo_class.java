package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo_class {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.id("APjFqb"));
	Thread.sleep(2000);
	search.sendKeys("selenium");
	Robot keyboardAction=new Robot();
	Thread.sleep(2000);
	for(int i=1;i<=4;i++) {
	keyboardAction.keyPress(KeyEvent.VK_DOWN);
	keyboardAction.keyRelease(KeyEvent.VK_DOWN);
	}
	Thread.sleep(2000);
	keyboardAction.keyPress(KeyEvent.VK_ENTER);
	keyboardAction.keyRelease(KeyEvent.VK_ENTER);
}
}
