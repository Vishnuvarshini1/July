package org.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4_6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.shopclues.com/wholesale.html");
	Thread.sleep(2000);
	Actions mouseaction=new Actions(driver);
	Thread.sleep(2000);
	WebElement sports=driver.findElement(By.xpath("//label[text()='Sports & Health ']"));
	mouseaction.click(sports).build().perform();
	Thread.sleep(2000);
	WebElement product1=driver.findElement(By.xpath("(//span[@class='prod_name '])[1]"));
	mouseaction.click(product1).build().perform();
	Thread.sleep(2000);
	Set<String>windows=driver.getWindowHandles();
	List<String> list=new ArrayList<>(windows);
	int size=list.size();
	System.out.println(size);
	Thread.sleep(2000);
	String first=list.get(0);
	String second=list.get(1);
	driver.switchTo().window("second");
	//not switch to window 
	WebElement cart=driver.findElement(By.id("add_cart"));
	cart.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='cart_ic']")).click();
	
}
}
