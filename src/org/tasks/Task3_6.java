package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		Thread.sleep(2000);
		WebElement userid=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		userid.sendKeys("vishnu");
		WebElement arrow=driver.findElement(By.xpath("//span[@class='input-arrow']"));
		Thread.sleep(2000);
		arrow.click();
		WebElement pass=driver.findElement(By.xpath("(//input[@title='Password'])[1]"));
		Thread.sleep(2000);
		pass.sendKeys("@123#");
		
	
	}
}