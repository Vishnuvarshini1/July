package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.amazon.iN");
		Thread.sleep(2000);
		Actions mouseaction=new Actions(driver);
		Thread.sleep(2000);
		WebElement caterogy=driver.findElement(By.xpath("(//span[text()='All'])[2]"));
		
		mouseaction.click(caterogy).build().perform();
		Thread.sleep(2000);
		WebElement mobile=driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		Thread.sleep(2000);
		mouseaction.click(mobile).build().perform();
		Thread.sleep(2000);
		WebElement powerbank=driver.findElement(By.xpath("//a[text()='Power Banks']"));
		Thread.sleep(2000);
		mouseaction.click(powerbank).build().perform();
		
	
	
	}
}