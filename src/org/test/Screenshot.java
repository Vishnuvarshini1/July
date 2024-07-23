package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static TakesScreenshot ts;
	public static void getScreenshot(String name) throws IOException {
	File screenshotAS=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\vishnu\\Screenshot\\"+name);
	FileUtils.copyFile(screenshotAS, destination);
	}
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// TO launch the browser
	driver.get("https://www.facebook.com/");
	ts=(TakesScreenshot)driver;
	Screenshot.getScreenshot("facebook.jpeg");
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("vishnu");
	Screenshot.getScreenshot("user.jpeg");
	
}
}
