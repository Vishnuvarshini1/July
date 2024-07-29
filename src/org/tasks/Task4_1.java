package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		Thread.sleep(2000);
				
		WebElement debtdrag=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Thread.sleep(2000);
		WebElement creditdrop=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Thread.sleep(2000);
		action.dragAndDrop(debtdrag, creditdrop);
	
	
	}
}
