package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://www.flipkart.com");
	Thread.sleep(2000);
	Actions mouseaction = new Actions(driver);
	WebElement furtinure= driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	mouseaction.click(furtinure).build().perform();
	Thread.sleep(2000);
//	WebElement chair= driver.findElement(By.xpath("//a[text()='Furniture']"));)
WebElement chair=driver.findElement(By.xpath("//a[text()='Furniture']"));
	mouseaction.click(chair).build().perform();
	WebElement show=driver.findElement(By.xpath("//span[text()='Show 12 more']"));
	mouseaction.click(show).build().perform();
	WebElement chairs=driver.findElement(By.xpath("//a[text()='Chairs']"));
	mouseaction.click(chairs).build().perform();
	
	//WebElement roomchair=driver.findElement(By.xpath("//a[text()='Gaming Chair']"));
//	mouseaction.click(roomchair).build().perform();
//	WebElement chair1= driver.findElement(By.xpath("(//a[text()='HOMESTIC Plastic Mesh Damroo Seating Stool|Both Sided S...']"));
//	mouseaction.click(chair1).build().perform();
}
}
//--------//a[text()='Furniture']