package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAsk3_4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(2000);
		btn.click();
		WebElement close=driver.findElement(By.xpath("//img[@alt='close Modal']"));
		Thread.sleep(2000);
		close.click();
	}
}