package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1a {
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
}
}
