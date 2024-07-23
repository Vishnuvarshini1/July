package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//wait for specific period of time
	Thread.sleep(2000);
	//TO locate an element using css selector id
	WebElement user=driver.findElement(By.cssSelector("input#email"));
	user.sendKeys("vishnu");
	// by css selector attribute
	WebElement passWord=driver.findElement(By.cssSelector("input[type=password]"));
	Thread.sleep(2000);
	
	passWord.sendKeys("123#jhg");
	Thread.sleep(2000);
	WebElement loginbtn=driver.findElement(By.cssSelector("button.selected[type=submit]"));
	loginbtn.click();
}
}
