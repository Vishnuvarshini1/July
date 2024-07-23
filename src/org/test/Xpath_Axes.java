package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//to locate an element using following sibling xpath with text
	WebElement element=driver.findElement(By.xpath("(//a[text()='Amazon miniTV']//following-sibling::a[3])"));
	Thread.sleep(2000);
	// to click the element
	element.click();
	//to locate an element using preceding xpath with text
	WebElement Service=driver.findElement(By.xpath("//a[text()='New Releases']//preceding-sibling::a[4]"));
	Thread.sleep(2000);
	Service.click();


}
}
