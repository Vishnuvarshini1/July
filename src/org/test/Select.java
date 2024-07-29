package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
public Select(WebElement selectdropdown) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
	Thread.sleep(2000);
	WebElement selectdropdown=driver.findElement(By.xpath("//select[@name='day']"));
	Thread.sleep(2000);
	//pass the selectdropdown to selct class
	Select dropDownSelect=new Select(selectdropdown);
	//to check dropdown is multiple




}
}
