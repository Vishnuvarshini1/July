package org.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo_1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get(" https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("vishnu");
	Robot keyboardaction= new Robot();
	//ctrl+ all
	keyboardaction.keyPress(KeyEvent.VK_A);
	keyboardaction.keyRelease(KeyEvent.VK_A);
	//copy the element
	keyboardaction.keyPress(KeyEvent.VK_COPY);
	keyboardaction.keyRelease(KeyEvent.VK_COPY);
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.id("pass"));
	keyboardaction.keyPress(KeyEvent.VK_PASTE);
	keyboardaction.keyRelease(KeyEvent.VK_PASTE);
	
	


}
}
