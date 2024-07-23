package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//To Mazimize the window
	driver.manage().window().maximize();
	//Wait
	Thread.sleep(2000);
	//TO launch the url
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//To find element using xpath
	WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	//to pass input to username
	userName.sendKeys("vishnu");
	Thread.sleep(2000);
	System.out.println(userName.getText());
	//to find element using relative xpath
	WebElement passWord=driver.findElement(By.xpath("//input[@name='pass']"));
	//to pass input to password
	passWord.sendKeys("V123@pp");
	System.out.println(passWord.getText());
	// to find element using relative xpath by text
	WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Log in']"));
	//to click the loginbtn
	loginbtn.click();
	
	
}
}
