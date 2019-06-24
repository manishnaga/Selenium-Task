package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automation extends Base {
	public static void main(String[] args) {
		WebDriver driver1=getDriver();
		loadUrl("https://www.seleniumeasy.com/test/");
		WebElement inputform=driver1.findElement(By.xpath("//body/div/div[2]/nav/div/div[2]/ul/li/a[contains(text(),'Input')]"));
		Clickmethod(inputform);
		WebElement simpleform = driver1.findElement(By.xpath("//body/div/div[2]/nav/div/div[2]/ul//ul/li/a[text()='Simple Form Demo']"));
		Clickmethod(simpleform);
		WebElement simpleforminput=driver.findElement(By.xpath("//input[@id='user-message']"));
		Insert(simpleforminput,"manikandan");
		WebElement showmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));
		Clickmethod(showmsg);
		WebElement sum1 = driver.findElement(By.xpath("//input[@id='sum1']"));
		Insert(sum1,"12");
		WebElement sum2 = driver.findElement(By.xpath("//input[@id='sum2']"));
		Insert(sum2,"12");
		WebElement gettotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
		Clickmethod(gettotal);
		WebElement inputform1=driver1.findElement(By.xpath("//body/div/div[2]/nav/div/div[2]/ul/li/a[contains(text(),'Input')]"));
		Clickmethod(inputform1);
		WebElement checkbox = driver.findElement(By.xpath("//body/div/div[2]/nav/div/div[2]/ul//ul/li/a[text()='Checkbox Demo']"));
		Clickmethod(checkbox);
		WebElement isage = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		Clickmethod(isage);
		WebElement checkall = driver.findElement(By.xpath("//input[@value='Check All']"));
		Clickmethod(checkall);
		WebElement uncheckall = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
		Clickmethod(uncheckall);
	}

}
