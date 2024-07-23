package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	//To launch the url
	driver.get("https://www.facebook.com/");
	//To maximize the window
	driver.manage().window().maximize();
	//to locate an element using id locator
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("vishnu");
	// Thread is used to wait the system mechanism for a specific time period

	Thread.sleep(2000);
	//to locate an element using name locator
	WebElement passWord=driver.findElement(By.name("pass"));
	passWord.sendKeys("@123ljh");
	Thread.sleep(2000);
	//to clear the userName element
	userName.clear();
	Thread.sleep(2000);
	//to clear the passWord element
	passWord.clear();
	Thread.sleep(2000);
	//to locate an element using name locator
	WebElement LoginBtn=driver.findElement(By.name("login"));
	Thread.sleep(2000);
	//Used to click the login Button
	LoginBtn.click();
	Thread.sleep(2000);
	//to locate an element using linktext locator
	//WebElement FrgtPswd=driver.findElement(By.linkText("Forgotten password?"));
	//forgotten password element is used to click
	//FrgtPswd.click();
	//to locate an element using partiallinktext locator
	WebElement element=driver.findElement(By.partialLinkText("Forgotten"));
	element.click();
}
}
