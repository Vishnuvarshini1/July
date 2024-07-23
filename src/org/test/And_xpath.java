package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class And_xpath {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	WebElement dish=driver.findElement(By.xpath("//img[@width='144' and @alt='restaurants curated for biryani']"));
	//or xpath---instead of and give or anyone of attribute can be true
	dish.click();
}
}
