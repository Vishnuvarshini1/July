package org.task;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Screenshot;

public class Task5 {
	public static TakesScreenshot ts;
	public static void getScreenShot(String name) throws IOException {
		File Source=ts.getScreenshotAs(OutputType.FILE);
				File destination=new File ("C:\\varshini\\vishnu\\Screenshot"+name);
				FileUtils.copyFile(Source, destination);
	}
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Motorola");
	driver.findElement(By.xpath("//input[@Value=\"Go\"]")).click();
	WebElement phone1=driver.findElement(By.xpath("//span[text()='Motorola razr 50 ultra (Spring Green, 12GB RAM, 512GB Storage) | with moto buds+ | moto ai | 4.0\" external AMOLED display | Snapdragon 8s Gen 3 | 6.9\" AMOLED 165Hz display | 32MP selfie camera']"));
	phone1.click();
	Set<String> Windowhandle=driver.getWindowHandles();
	int size=Windowhandle.size();
	System.out.println(size);
	List<String> windows =new LinkedList<>(Windowhandle);
	String parentwin=windows.get(0);
	String childwin=windows.get(1);
	driver.switchTo().window(childwin);
	ts=(TakesScreenshot)driver;
	Task5.getScreenShot("phone1.jpg");
	driver.switchTo().window(parentwin);
	WebElement phone2=driver.findElement(By.xpath("//span[text()='Motorola G64 5G (Ice Lilac, 8GB RAM, 128GB Storage) | Expandable Upto 2TB | Upto 16GB RAM with RAM Boost | 50MP (OIS) + 8MP | 16MP Front Camera | MediaTek Dimensity 7025 Processor | 6000 mAh Battery']"));
	phone2.click();
	driver.switchTo().window(childwin);
	ts=(TakesScreenshot)driver;
	Task5.getScreenShot("phone2.jpg");
	driver.switchTo().window(parentwin);
	WebElement phone3=driver.findElement(By.xpath("//span[text()='Motorola Edge 50 Fusion 5G (Marshmallow Blue, 8GB RAM, 128GB Storage)']"));
	phone3.click();
	driver.switchTo().window(childwin);
	ts=(TakesScreenshot)driver;
	Task5.getScreenShot("phone3.jpg");
	driver.switchTo().window(parentwin);
	WebElement phone4=driver.findElement(By.xpath("//span[text()='Motorola g64 5G (Mint Green, 128 GB) (8 GB RAM)']"));
	phone4.click();
	driver.switchTo().window(childwin);
	ts=(TakesScreenshot)driver;
	Task5.getScreenShot("phone4.jpg");
}
}
