package org.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_1 {
	public static TakesScreenshot ts;
	public static void getScreenShot(String name) throws IOException {
	File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\varshini\\vishnu\\Screenshot" +name);
	FileUtils.copyFile(ScreenshotAs, destination);
	}
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	Thread.sleep(2000);
	search.sendKeys("iphone");
	Thread.sleep(2000);
	Robot keyboardaction=new Robot();
	keyboardaction.keyPress(KeyEvent.VK_ENTER);
	keyboardaction.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	WebElement iphone=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']"));
	Thread.sleep(2000);
	iphone.click();
	//switch to window
	Set<String>windowhandles=driver.getWindowHandles();
	int size=windowhandles.size();
	System.out.println(size);
	List<String>window=new ArrayList<>(windowhandles); 
	String childwindow=window.get(0);
	Thread.sleep(2000);
	driver.switchTo().window(childwindow);
	
	//casting for takescreenshot
	ts=(TakesScreenshot)driver;
	Screenshot_1.getScreenShot("iphone.jpeg");
	

}
}
