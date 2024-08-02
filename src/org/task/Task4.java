package org.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.shopclues.com/wholesale.html ");
	WebElement sports=driver.findElement(By.xpath("//label[text()='Sports & Health ']"));
	Actions action= new Actions(driver);
	action.moveToElement(sports).click().build().perform();
	action.click().build().perform();
	WebElement weight=driver.findElement(By.xpath("//span[text()='Phenak India Foot Bomb 1 Box With 4 Balls With Outer Bo']"));
	action.moveToElement(weight).click().build().perform();
	action.click().build().perform();
	Set<String> windowHandles = driver.getWindowHandles();
	//get the size of the windows
	int size = windowHandles.size();
	System.out.println(size);
	List<String> windows=new ArrayList<String>(windowHandles);
	String window1=windows.get(0);
	String window2=windows.get(1);
	String window3=windows.get(2);
	driver.switchTo().window(window3);
	WebElement button=driver.findElement(By.xpath("//button[@id='add_cart']"));
	button.click();
	WebElement cart=driver.findElement(By.xpath("//a[@class='cart_ic']"));
	action.moveToElement(cart).click().build().perform();
	WebElement viewcart=driver.findElement(By.xpath("//a[text()='View Cart']"));
	action.moveToElement(viewcart).click().build().perform();
	action.click().build().perform();
	WebElement price=driver.findElement(By.xpath("//td[text()='399']"));
	System.out.println(price.getText());
	
}
}
