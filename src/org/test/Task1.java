package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://gmail.com/");
	Thread.sleep(2000);
	driver.navigate().to("http://www.flipkart.com/");
}
}
