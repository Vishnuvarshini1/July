package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_7 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.homedepot.com/");
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	WebElement allbtn=driver.findElement(By.xpath("//button[text()='All']"));
	Thread.sleep(2000);
	action.click(allbtn).build().perform();
	Thread.sleep(2000);
	WebElement heating=driver.findElement(By.xpath("//div[text()='Heating & Cooling']"));
	action.click(heating).build().perform();
	Thread.sleep(2000);


}
}
