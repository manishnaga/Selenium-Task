package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employee extends Base {
	public static void main(String[] args) {
	WebDriver driver2=getDriver();
	loadUrl("https://www.facebook.com/");
	WebElement textuser=driver2.findElement(By.id("email"));
	Insert(textuser,"manishnaga@gmail.com");
	WebElement textpass=driver2.findElement(By.id("pass"));
	Insert(textpass,"manish");
	WebElement btnpass=driver2.findElement(By.id("u_0_2"));
	Clickmethod(btnpass);
	}
}
