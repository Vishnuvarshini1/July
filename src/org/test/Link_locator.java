package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_locator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	// To maximize the window
	driver.manage().window().maximize();
	// to load url
	driver.get("https://en.wikipedia.org/wiki/Indonesia");
	// Thread is used to wait the system mechanism for a specific time period
	Thread.sleep(2000);
	//to locate an element using linktext locator
	//WebElement indonesia = driver.findElement(By.linkText("Indonesia (disambiguation)"));
	Thread.sleep(2000);
	//forgotten password element is used to click
	//indonesia.click();
	//to locate an element using Partiallinktext locator
	WebElement archipalego = driver.findElement(By.partialLinkText("archipelago"));
	//to click archipalego
	archipalego.click();

}
}
